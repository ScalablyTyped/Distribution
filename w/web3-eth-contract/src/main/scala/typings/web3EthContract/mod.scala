package typings.web3EthContract

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.std.Error
import typings.web3Core.mod.BlockNumber
import typings.web3Core.mod.Common
import typings.web3Core.mod.LogsOptions
import typings.web3Core.mod.PastLogsOptions
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import typings.web3EthContract.anon.Data
import typings.web3Utils.mod.AbiItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-contract", "Contract")
  @js.native
  class Contract protected () extends StObject {
    def this(jsonInterface: js.Array[AbiItem]) = this()
    def this(jsonInterface: js.Array[AbiItem], address: String) = this()
    def this(jsonInterface: js.Array[AbiItem], address: js.UndefOr[scala.Nothing], options: ContractOptions) = this()
    def this(jsonInterface: js.Array[AbiItem], address: String, options: ContractOptions) = this()
    
    var _address: String = js.native
    
    var _jsonInterface: js.Array[AbiItem] = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: BlockNumber = js.native
    
    var defaultChain: chain = js.native
    
    var defaultCommon: Common = js.native
    
    var defaultHardfork: hardfork = js.native
    
    def deploy(options: DeployOptions): ContractSendMethod = js.native
    
    var events: js.Any = js.native
    
    def getPastEvents(event: String): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(event: String, options: PastEventOptions): js.Promise[js.Array[EventData]] = js.native
    def getPastEvents(
      event: String,
      options: PastEventOptions,
      callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
    ): js.Promise[js.Array[EventData]] = js.native
    
    var handleRevert: Boolean = js.native
    
    var methods: js.Any = js.native
    
    def once(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): Unit = js.native
    def once(
      event: String,
      options: EventOptions,
      callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
    ): Unit = js.native
    
    var options: Options = js.native
    
    var transactionBlockTimeout: Double = js.native
    
    var transactionConfirmationBlocks: Double = js.native
    
    var transactionPollingTimeout: Double = js.native
  }
  
  @js.native
  trait CallOptions extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var gas: js.UndefOr[Double] = js.native
    
    var gasPrice: js.UndefOr[String] = js.native
  }
  object CallOptions {
    
    @scala.inline
    def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    @scala.inline
    implicit class CallOptionsMutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    }
  }
  
  @js.native
  trait ContractOptions extends StObject {
    
    // Contract code
    var data: js.UndefOr[String] = js.native
    
    // Sender to use for contract calls
    var from: js.UndefOr[String] = js.native
    
    // Gas to use for contract calls
    var gas: js.UndefOr[Double] = js.native
    
    // Gas price to use for contract calls
    var gasPrice: js.UndefOr[String] = js.native
  }
  object ContractOptions {
    
    @scala.inline
    def apply(): ContractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractOptions]
    }
    
    @scala.inline
    implicit class ContractOptionsMutableBuilder[Self <: ContractOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    }
  }
  
  @js.native
  trait ContractSendMethod extends StObject {
    
    def call(): js.Promise[_] = js.native
    def call(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
    ): js.Promise[_] = js.native
    def call(options: CallOptions): js.Promise[_] = js.native
    def call(options: CallOptions, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): js.Promise[_] = js.native
    
    def encodeABI(): String = js.native
    
    def estimateGas(): js.Promise[Double] = js.native
    def estimateGas(callback: js.Function2[/* err */ Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
    def estimateGas(options: EstimateGasOptions): js.Promise[Double] = js.native
    def estimateGas(options: EstimateGasOptions, callback: js.Function2[/* err */ Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
    
    def send(options: SendOptions): PromiEvent[Contract] = js.native
    def send(options: SendOptions, callback: js.Function2[/* err */ Error, /* transactionHash */ String, Unit]): PromiEvent[Contract] = js.native
  }
  
  @js.native
  trait DeployOptions extends StObject {
    
    var arguments: js.UndefOr[js.Array[_]] = js.native
    
    var data: String = js.native
  }
  object DeployOptions {
    
    @scala.inline
    def apply(data: String): DeployOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeployOptions]
    }
    
    @scala.inline
    implicit class DeployOptionsMutableBuilder[Self <: DeployOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EstimateGasOptions extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var gas: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double | String | ^] = js.native
  }
  object EstimateGasOptions {
    
    @scala.inline
    def apply(): EstimateGasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EstimateGasOptions]
    }
    
    @scala.inline
    implicit class EstimateGasOptionsMutableBuilder[Self <: EstimateGasOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait EventData extends StObject {
    
    var address: String = js.native
    
    var blockHash: String = js.native
    
    var blockNumber: Double = js.native
    
    var event: String = js.native
    
    var logIndex: Double = js.native
    
    var raw: Data = js.native
    
    var returnValues: StringDictionary[js.Any] = js.native
    
    var signature: String = js.native
    
    var transactionHash: String = js.native
    
    var transactionIndex: Double = js.native
  }
  object EventData {
    
    @scala.inline
    def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      event: String,
      logIndex: Double,
      raw: Data,
      returnValues: StringDictionary[js.Any],
      signature: String,
      transactionHash: String,
      transactionIndex: Double
    ): EventData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Data): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "returnValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventOptions extends LogsOptions {
    
    var filter: js.UndefOr[Filter] = js.native
  }
  object EventOptions {
    
    @scala.inline
    def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit class EventOptionsMutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  type Filter = StringDictionary[Double | String | (js.Array[Double | String])]
  
  @js.native
  trait Options extends ContractOptions {
    
    var address: String = js.native
    
    var jsonInterface: js.Array[AbiItem] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(address: String, jsonInterface: js.Array[AbiItem]): Options = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], jsonInterface = jsonInterface.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonInterface(value: js.Array[AbiItem]): Self = StObject.set(x, "jsonInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonInterfaceVarargs(value: AbiItem*): Self = StObject.set(x, "jsonInterface", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PastEventOptions extends PastLogsOptions {
    
    var filter: js.UndefOr[Filter] = js.native
  }
  object PastEventOptions {
    
    @scala.inline
    def apply(): PastEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PastEventOptions]
    }
    
    @scala.inline
    implicit class PastEventOptionsMutableBuilder[Self <: PastEventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  @js.native
  trait SendOptions extends StObject {
    
    var from: String = js.native
    
    var gas: js.UndefOr[Double] = js.native
    
    var gasPrice: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double | String | ^] = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(from: String): SendOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
