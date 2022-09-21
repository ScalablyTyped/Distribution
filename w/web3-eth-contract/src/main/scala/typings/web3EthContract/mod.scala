package typings.web3EthContract

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.web3Core.mod.BlockNumber
import typings.web3Core.mod.Common
import typings.web3Core.mod.LogsOptions
import typings.web3Core.mod.PastLogsOptions
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import typings.web3Core.mod.provider
import typings.web3EthAccounts.mod.Accounts
import typings.web3EthContract.anon.Data
import typings.web3Utils.mod.AbiItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-contract", "Contract")
  @js.native
  open class Contract protected () extends StObject {
    def this(jsonInterface: js.Array[AbiItem]) = this()
    def this(jsonInterface: js.Array[AbiItem], address: String) = this()
    def this(jsonInterface: js.Array[AbiItem], address: String, options: ContractOptions) = this()
    def this(jsonInterface: js.Array[AbiItem], address: Unit, options: ContractOptions) = this()
    
    /* private */ var _address: String = js.native
    
    /* private */ var _jsonInterface: js.Array[AbiItem] = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: BlockNumber = js.native
    
    var defaultChain: chain = js.native
    
    var defaultCommon: Common = js.native
    
    var defaultHardfork: hardfork = js.native
    
    def deploy(options: DeployOptions): ContractSendMethod = js.native
    
    var events: Any = js.native
    
    def getPastEvents(event: String): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(event: String, callback: js.Function2[/* error */ js.Error, /* event */ EventData, Unit]): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(event: String, options: PastEventOptions): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(
      event: String,
      options: PastEventOptions,
      callback: js.Function2[/* error */ js.Error, /* event */ EventData, Unit]
    ): js.Promise[js.Array[EventData]] = js.native
    
    var handleRevert: Boolean = js.native
    
    var methods: Any = js.native
    
    def once(event: String, callback: js.Function2[/* error */ js.Error, /* event */ EventData, Unit]): Unit = js.native
    def once(
      event: String,
      options: EventOptions,
      callback: js.Function2[/* error */ js.Error, /* event */ EventData, Unit]
    ): Unit = js.native
    
    var options: Options = js.native
    
    var transactionBlockTimeout: Double = js.native
    
    var transactionConfirmationBlocks: Double = js.native
    
    var transactionPollingTimeout: Double = js.native
  }
  /* static members */
  object Contract {
    
    @JSImport("web3-eth-contract", "Contract")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setProvider(provider: provider): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setProvider(provider: provider, accounts: Accounts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProvider")(provider.asInstanceOf[js.Any], accounts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait CallOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var gas: js.UndefOr[Double] = js.undefined
    
    var gasPrice: js.UndefOr[String] = js.undefined
  }
  object CallOptions {
    
    inline def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    extension [Self <: CallOptions](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    }
  }
  
  trait ContractOptions extends StObject {
    
    // Contract code
    var data: js.UndefOr[String] = js.undefined
    
    // Sender to use for contract calls
    var from: js.UndefOr[String] = js.undefined
    
    // Gas to use for contract calls
    var gas: js.UndefOr[Double] = js.undefined
    
    // Gas price to use for contract calls
    var gasPrice: js.UndefOr[String] = js.undefined
  }
  object ContractOptions {
    
    inline def apply(): ContractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractOptions]
    }
    
    extension [Self <: ContractOptions](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    }
  }
  
  @js.native
  trait ContractSendMethod extends StObject {
    
    def call(): js.Promise[Any] = js.native
    def call(options: Unit, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): js.Promise[Any] = js.native
    def call(options: CallOptions): js.Promise[Any] = js.native
    def call(options: CallOptions, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): js.Promise[Any] = js.native
    
    def encodeABI(): String = js.native
    
    def estimateGas(): js.Promise[Double] = js.native
    def estimateGas(callback: js.Function2[/* err */ js.Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
    def estimateGas(options: EstimateGasOptions): js.Promise[Double] = js.native
    def estimateGas(options: EstimateGasOptions, callback: js.Function2[/* err */ js.Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
    
    def send(options: SendOptions): PromiEvent[Contract] = js.native
    def send(
      options: SendOptions,
      callback: js.Function2[/* err */ js.Error, /* transactionHash */ String, Unit]
    ): PromiEvent[Contract] = js.native
  }
  
  trait DeployOptions extends StObject {
    
    var arguments: js.UndefOr[js.Array[Any]] = js.undefined
    
    var data: String
  }
  object DeployOptions {
    
    inline def apply(data: String): DeployOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeployOptions]
    }
    
    extension [Self <: DeployOptions](x: Self) {
      
      inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait EstimateGasOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var gas: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double | String | ^] = js.undefined
  }
  object EstimateGasOptions {
    
    inline def apply(): EstimateGasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EstimateGasOptions]
    }
    
    extension [Self <: EstimateGasOptions](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait EventData extends StObject {
    
    var address: String
    
    var blockHash: String
    
    var blockNumber: Double
    
    var event: String
    
    var logIndex: Double
    
    var raw: Data
    
    var returnValues: StringDictionary[Any]
    
    var signature: String
    
    var transactionHash: String
    
    var transactionIndex: Double
  }
  object EventData {
    
    inline def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      event: String,
      logIndex: Double,
      raw: Data,
      returnValues: StringDictionary[Any],
      signature: String,
      transactionHash: String,
      transactionIndex: Double
    ): EventData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Data): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setReturnValues(value: StringDictionary[Any]): Self = StObject.set(x, "returnValues", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventOptions
    extends StObject
       with LogsOptions {
    
    var filter: js.UndefOr[Filter] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    extension [Self <: EventOptions](x: Self) {
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  type Filter = StringDictionary[Double | String | (js.Array[Double | String])]
  
  trait Options
    extends StObject
       with ContractOptions {
    
    var address: String
    
    var jsonInterface: js.Array[AbiItem]
  }
  object Options {
    
    inline def apply(address: String, jsonInterface: js.Array[AbiItem]): Options = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], jsonInterface = jsonInterface.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setJsonInterface(value: js.Array[AbiItem]): Self = StObject.set(x, "jsonInterface", value.asInstanceOf[js.Any])
      
      inline def setJsonInterfaceVarargs(value: AbiItem*): Self = StObject.set(x, "jsonInterface", js.Array(value*))
    }
  }
  
  trait PastEventOptions
    extends StObject
       with PastLogsOptions {
    
    var filter: js.UndefOr[Filter] = js.undefined
  }
  object PastEventOptions {
    
    inline def apply(): PastEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PastEventOptions]
    }
    
    extension [Self <: PastEventOptions](x: Self) {
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait SendOptions extends StObject {
    
    var from: String
    
    var gas: js.UndefOr[Double] = js.undefined
    
    var gasPrice: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double | String | ^] = js.undefined
  }
  object SendOptions {
    
    inline def apply(from: String): SendOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
