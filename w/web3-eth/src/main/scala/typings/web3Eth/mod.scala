package typings.web3Eth

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.bignumberJs.mod.BigNumber
import typings.bnJs.mod.^
import typings.node.netMod.Socket
import typings.std.Error
import typings.web3Core.mod.BlockNumber
import typings.web3Core.mod.Common
import typings.web3Core.mod.Extension
import typings.web3Core.mod.Log
import typings.web3Core.mod.LogsOptions
import typings.web3Core.mod.PastLogsOptions
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.Providers
import typings.web3Core.mod.RLPEncodedTransaction
import typings.web3Core.mod.Transaction
import typings.web3Core.mod.TransactionConfig
import typings.web3Core.mod.TransactionReceipt
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import typings.web3CoreSubscriptions.mod.Subscription
import typings.web3Eth.web3EthStrings.logs
import typings.web3Eth.web3EthStrings.newBlockHeaders
import typings.web3Eth.web3EthStrings.pendingTransactions
import typings.web3Eth.web3EthStrings.syncing
import typings.web3EthAbi.mod.AbiCoder
import typings.web3EthAccounts.mod.Accounts
import typings.web3EthContract.mod.ContractOptions
import typings.web3EthEns.mod.Ens
import typings.web3EthPersonal.mod.Personal
import typings.web3Net.mod.Network
import typings.web3Utils.mod.AbiItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth", "Eth")
  @js.native
  class Eth () extends StObject {
    def this(provider: typings.web3Core.mod.provider) = this()
    def this(provider: typings.web3Core.mod.provider, net: Socket) = this()
    
    var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest] = js.native
    
    var Contract: Instantiable3[
        /* jsonInterface */ js.Array[AbiItem] | AbiItem, 
        /* address */ js.UndefOr[String], 
        /* options */ js.UndefOr[ContractOptions], 
        typings.web3EthContract.mod.Contract
      ] = js.native
    
    var Iban: Instantiable1[/* iban */ String, typings.web3EthIban.mod.Iban] = js.native
    
    var abi: AbiCoder = js.native
    
    var accounts: Accounts = js.native
    
    def call(transactionConfig: TransactionConfig): js.Promise[String] = js.native
    def call(
      transactionConfig: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* data */ String, Unit]
    ): js.Promise[String] = js.native
    def call(transactionConfig: TransactionConfig, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def call(
      transactionConfig: TransactionConfig,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* data */ String, Unit]
    ): js.Promise[String] = js.native
    
    def clearSubscriptions(callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = js.native
    
    val currentProvider: typings.web3Core.mod.provider = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: BlockNumber = js.native
    
    var defaultChain: chain = js.native
    
    var defaultCommon: Common = js.native
    
    var defaultHardfork: hardfork = js.native
    
    var ens: Ens = js.native
    
    def estimateGas(transactionConfig: TransactionConfig): js.Promise[Double] = js.native
    def estimateGas(
      transactionConfig: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* gas */ Double, Unit]
    ): js.Promise[Double] = js.native
    
    def extend(`extension`: Extension): js.Any = js.native
    
    def getAccounts(): js.Promise[js.Array[String]] = js.native
    def getAccounts(callback: js.Function2[/* error */ Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
    
    def getBalance(address: String): js.Promise[String] = js.native
    def getBalance(address: String, callback: js.Function2[/* error */ Error, /* balance */ String, Unit]): js.Promise[String] = js.native
    def getBalance(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getBalance(
      address: String,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* balance */ String, Unit]
    ): js.Promise[String] = js.native
    
    def getBlock(blockHashOrBlockNumber: String): js.Promise[BlockTransactionString] = js.native
    def getBlock(
      blockHashOrBlockNumber: String,
      callback: js.Function2[/* error */ Error, /* block */ BlockTransactionString, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getBlock(blockHashOrBlockNumber: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getBlock(
      blockHashOrBlockNumber: String,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* block */ BlockTransactionObject, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getBlock(blockHashOrBlockNumber: BlockNumber): js.Promise[BlockTransactionString] = js.native
    def getBlock(
      blockHashOrBlockNumber: BlockNumber,
      callback: js.Function2[/* error */ Error, /* block */ BlockTransactionString, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getBlock(blockHashOrBlockNumber: BlockNumber, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getBlock(
      blockHashOrBlockNumber: BlockNumber,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* block */ BlockTransactionObject, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    
    def getBlockNumber(): js.Promise[Double] = js.native
    def getBlockNumber(callback: js.Function2[/* error */ Error, /* blockNumber */ Double, Unit]): js.Promise[Double] = js.native
    
    def getBlockTransactionCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
    def getBlockTransactionCount(
      blockHashOrBlockNumber: String,
      callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
    ): js.Promise[Double] = js.native
    def getBlockTransactionCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
    def getBlockTransactionCount(
      blockHashOrBlockNumber: BlockNumber,
      callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
    ): js.Promise[Double] = js.native
    
    def getBlockUncleCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
    def getBlockUncleCount(
      blockHashOrBlockNumber: String,
      callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
    ): js.Promise[Double] = js.native
    def getBlockUncleCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
    def getBlockUncleCount(
      blockHashOrBlockNumber: BlockNumber,
      callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
    ): js.Promise[Double] = js.native
    
    def getChainId(): js.Promise[Double] = js.native
    def getChainId(callback: js.Function2[/* error */ Error, /* version */ Double, Unit]): js.Promise[Double] = js.native
    
    def getCode(address: String): js.Promise[String] = js.native
    def getCode(address: String, callback: js.Function2[/* error */ Error, /* code */ String, Unit]): js.Promise[String] = js.native
    def getCode(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getCode(
      address: String,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* code */ String, Unit]
    ): js.Promise[String] = js.native
    
    def getCoinbase(): js.Promise[String] = js.native
    def getCoinbase(callback: js.Function2[/* error */ Error, /* coinbaseAddress */ String, Unit]): js.Promise[String] = js.native
    
    def getGasPrice(): js.Promise[String] = js.native
    def getGasPrice(callback: js.Function2[/* error */ Error, /* gasPrice */ String, Unit]): js.Promise[String] = js.native
    
    def getHashrate(): js.Promise[Double] = js.native
    def getHashrate(callback: js.Function2[/* error */ Error, /* hashes */ Double, Unit]): js.Promise[Double] = js.native
    
    def getNodeInfo(): js.Promise[String] = js.native
    def getNodeInfo(callback: js.Function2[/* error */ Error, /* version */ String, Unit]): js.Promise[String] = js.native
    
    def getPastLogs(options: PastLogsOptions): js.Promise[js.Array[Log]] = js.native
    def getPastLogs(
      options: PastLogsOptions,
      callback: js.Function2[/* error */ Error, /* logs */ js.Array[Log], Unit]
    ): js.Promise[js.Array[Log]] = js.native
    
    def getPendingTransactions(): js.Promise[js.Array[Transaction]] = js.native
    def getPendingTransactions(callback: js.Function2[/* error */ Error, /* result */ js.Array[Transaction], Unit]): js.Promise[js.Array[Transaction]] = js.native
    
    def getProof(address: String, storageKey: js.Array[BigNumber | Double | String | ^], blockNumber: BlockNumber): js.Promise[GetProof] = js.native
    def getProof(
      address: String,
      storageKey: js.Array[BigNumber | Double | String | ^],
      blockNumber: BlockNumber,
      callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
    ): js.Promise[GetProof] = js.native
    
    def getProtocolVersion(): js.Promise[String] = js.native
    def getProtocolVersion(callback: js.Function2[/* error */ Error, /* protocolVersion */ String, Unit]): js.Promise[String] = js.native
    
    def getStorageAt(address: String, position: String): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: String,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: String,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: Double): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: Double,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: Double, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: Double,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: BigNumber): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: BigNumber,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: BigNumber, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: BigNumber,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: ^): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: ^,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    def getStorageAt(address: String, position: ^, defaultBlock: BlockNumber): js.Promise[String] = js.native
    def getStorageAt(
      address: String,
      position: ^,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
    ): js.Promise[String] = js.native
    
    def getTransaction(transactionHash: String): js.Promise[Transaction] = js.native
    def getTransaction(
      transactionHash: String,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    
    def getTransactionCount(address: String): js.Promise[Double] = js.native
    def getTransactionCount(address: String, callback: js.Function2[/* error */ Error, /* count */ Double, Unit]): js.Promise[Double] = js.native
    def getTransactionCount(address: String, defaultBlock: BlockNumber): js.Promise[Double] = js.native
    def getTransactionCount(
      address: String,
      defaultBlock: BlockNumber,
      callback: js.Function2[/* error */ Error, /* count */ Double, Unit]
    ): js.Promise[Double] = js.native
    
    def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: String): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: String,
      indexNumber: String,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: Double): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: String,
      indexNumber: Double,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: ^): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: String,
      indexNumber: ^,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: String): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: BlockNumber,
      indexNumber: String,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: Double): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: BlockNumber,
      indexNumber: Double,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: ^): js.Promise[Transaction] = js.native
    def getTransactionFromBlock(
      blockHashOrBlockNumber: BlockNumber,
      indexNumber: ^,
      callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
    ): js.Promise[Transaction] = js.native
    
    def getTransactionReceipt(hash: String): js.Promise[TransactionReceipt] = js.native
    def getTransactionReceipt(
      hash: String,
      callback: js.Function2[/* error */ Error, /* transactionReceipt */ TransactionReceipt, Unit]
    ): js.Promise[TransactionReceipt] = js.native
    
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: String,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: String,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: Double,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: Double,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: ^,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: String, uncleIndex: ^, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: String,
      uncleIndex: ^,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: String,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: String,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: Double,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: Double,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: ^,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionString] = js.native
    def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
    def getUncle(
      blockHashOrBlockNumber: BlockNumber,
      uncleIndex: ^,
      returnTransactionObjects: Boolean,
      callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
    ): js.Promise[BlockTransactionObject] = js.native
    
    def getWork(): js.Promise[js.Array[String]] = js.native
    def getWork(callback: js.Function2[/* error */ Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
    
    val givenProvider: js.Any = js.native
    
    var handleRevert: Boolean = js.native
    
    def isMining(): js.Promise[Boolean] = js.native
    def isMining(callback: js.Function2[/* error */ Error, /* mining */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    def isSyncing(): js.Promise[Syncing | Boolean] = js.native
    def isSyncing(callback: js.Function2[/* error */ Error, /* syncing */ Syncing, Unit]): js.Promise[Syncing | Boolean] = js.native
    
    var net: Network = js.native
    
    var personal: Personal = js.native
    
    def requestAccounts(): js.Promise[js.Array[String]] = js.native
    def requestAccounts(callback: js.Function2[/* error */ Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
    
    def sendSignedTransaction(signedTransactionData: String): PromiEvent[TransactionReceipt] = js.native
    def sendSignedTransaction(signedTransactionData: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): PromiEvent[TransactionReceipt] = js.native
    
    def sendTransaction(transactionConfig: TransactionConfig): PromiEvent[TransactionReceipt] = js.native
    def sendTransaction(
      transactionConfig: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
    ): PromiEvent[TransactionReceipt] = js.native
    
    def setProvider(provider: typings.web3Core.mod.provider): Boolean = js.native
    
    def sign(dataToSign: String, address: String): js.Promise[String] = js.native
    def sign(
      dataToSign: String,
      address: String,
      callback: js.Function2[/* error */ Error, /* signature */ String, Unit]
    ): js.Promise[String] = js.native
    def sign(dataToSign: String, address: Double): js.Promise[String] = js.native
    def sign(
      dataToSign: String,
      address: Double,
      callback: js.Function2[/* error */ Error, /* signature */ String, Unit]
    ): js.Promise[String] = js.native
    
    def signTransaction(transactionConfig: TransactionConfig): js.Promise[RLPEncodedTransaction] = js.native
    def signTransaction(transactionConfig: TransactionConfig, address: String): js.Promise[RLPEncodedTransaction] = js.native
    def signTransaction(
      transactionConfig: TransactionConfig,
      address: String,
      callback: js.Function2[/* error */ Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
    ): js.Promise[RLPEncodedTransaction] = js.native
    def signTransaction(
      transactionConfig: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
    ): js.Promise[RLPEncodedTransaction] = js.native
    
    def submitWork(data: js.Tuple3[String, String, String]): js.Promise[Boolean] = js.native
    def submitWork(
      data: js.Tuple3[String, String, String],
      callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]
    ): js.Promise[Boolean] = js.native
    
    @JSName("subscribe")
    def subscribe_logs(`type`: logs, options: LogsOptions): Subscription[Log] = js.native
    @JSName("subscribe")
    def subscribe_logs(`type`: logs, options: LogsOptions, callback: js.Function2[/* error */ Error, /* log */ Log, Unit]): Subscription[Log] = js.native
    @JSName("subscribe")
    def subscribe_newBlockHeaders(`type`: newBlockHeaders): Subscription[BlockHeader] = js.native
    @JSName("subscribe")
    def subscribe_newBlockHeaders(
      `type`: newBlockHeaders,
      callback: js.Function2[/* error */ Error, /* blockHeader */ BlockHeader, Unit]
    ): Subscription[BlockHeader] = js.native
    @JSName("subscribe")
    def subscribe_pendingTransactions(`type`: pendingTransactions): Subscription[String] = js.native
    @JSName("subscribe")
    def subscribe_pendingTransactions(
      `type`: pendingTransactions,
      callback: js.Function2[/* error */ Error, /* transactionHash */ String, Unit]
    ): Subscription[String] = js.native
    @JSName("subscribe")
    def subscribe_syncing(`type`: syncing): Subscription[Syncing] = js.native
    @JSName("subscribe")
    def subscribe_syncing(`type`: syncing, callback: js.Function2[/* error */ Error, /* result */ Syncing, Unit]): Subscription[Syncing] = js.native
    
    var transactionBlockTimeout: Double = js.native
    
    var transactionConfirmationBlocks: Double = js.native
    
    var transactionPollingTimeout: Double = js.native
  }
  /* static members */
  object Eth {
    
    @JSImport("web3-eth", "Eth.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
    
    @JSImport("web3-eth", "Eth.providers")
    @js.native
    val providers: Providers = js.native
  }
  
  trait Block
    extends StObject
       with BlockTransactionBase {
    
    var transactions: js.Array[String | Transaction]
  }
  object Block {
    
    inline def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[String | Transaction],
      uncles: js.Array[String]
    ): Block = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setTransactions(value: js.Array[String | Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: (String | Transaction)*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  trait BlockHeader extends StObject {
    
    var extraData: String
    
    var gasLimit: Double
    
    var gasUsed: Double
    
    var hash: String
    
    var logsBloom: String
    
    var miner: String
    
    var nonce: String
    
    var number: Double
    
    var parentHash: String
    
    var receiptRoot: String
    
    var sha3Uncles: String
    
    var stateRoot: String
    
    var timestamp: Double | String
    
    var transactionRoot: String
  }
  object BlockHeader {
    
    inline def apply(
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      stateRoot: String,
      timestamp: Double | String,
      transactionRoot: String
    ): BlockHeader = {
      val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockHeader]
    }
    
    extension [Self <: BlockHeader](x: Self) {
      
      inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
      
      inline def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
      
      inline def setReceiptRoot(value: String): Self = StObject.set(x, "receiptRoot", value.asInstanceOf[js.Any])
      
      inline def setSha3Uncles(value: String): Self = StObject.set(x, "sha3Uncles", value.asInstanceOf[js.Any])
      
      inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double | String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTransactionRoot(value: String): Self = StObject.set(x, "transactionRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockTransactionBase
    extends StObject
       with BlockHeader {
    
    var difficulty: Double
    
    var size: Double
    
    var totalDifficulty: Double
    
    var uncles: js.Array[String]
  }
  object BlockTransactionBase {
    
    inline def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      uncles: js.Array[String]
    ): BlockTransactionBase = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionBase]
    }
    
    extension [Self <: BlockTransactionBase](x: Self) {
      
      inline def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTotalDifficulty(value: Double): Self = StObject.set(x, "totalDifficulty", value.asInstanceOf[js.Any])
      
      inline def setUncles(value: js.Array[String]): Self = StObject.set(x, "uncles", value.asInstanceOf[js.Any])
      
      inline def setUnclesVarargs(value: String*): Self = StObject.set(x, "uncles", js.Array(value :_*))
    }
  }
  
  trait BlockTransactionObject
    extends StObject
       with BlockTransactionBase {
    
    var transactions: js.Array[Transaction]
  }
  object BlockTransactionObject {
    
    inline def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[Transaction],
      uncles: js.Array[String]
    ): BlockTransactionObject = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionObject]
    }
    
    extension [Self <: BlockTransactionObject](x: Self) {
      
      inline def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  trait BlockTransactionString
    extends StObject
       with BlockTransactionBase {
    
    var transactions: js.Array[String]
  }
  object BlockTransactionString {
    
    inline def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[String],
      uncles: js.Array[String]
    ): BlockTransactionString = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionString]
    }
    
    extension [Self <: BlockTransactionString](x: Self) {
      
      inline def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  trait GetProof extends StObject {
    
    var accountProof: js.Array[String]
    
    var address: String
    
    var balance: String
    
    var codeHash: String
    
    var nonce: String
    
    var storageHash: String
    
    var storageProof: js.Array[StorageProof]
  }
  object GetProof {
    
    inline def apply(
      accountProof: js.Array[String],
      address: String,
      balance: String,
      codeHash: String,
      nonce: String,
      storageHash: String,
      storageProof: js.Array[StorageProof]
    ): GetProof = {
      val __obj = js.Dynamic.literal(accountProof = accountProof.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], codeHash = codeHash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], storageHash = storageHash.asInstanceOf[js.Any], storageProof = storageProof.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProof]
    }
    
    extension [Self <: GetProof](x: Self) {
      
      inline def setAccountProof(value: js.Array[String]): Self = StObject.set(x, "accountProof", value.asInstanceOf[js.Any])
      
      inline def setAccountProofVarargs(value: String*): Self = StObject.set(x, "accountProof", js.Array(value :_*))
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setCodeHash(value: String): Self = StObject.set(x, "codeHash", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setStorageHash(value: String): Self = StObject.set(x, "storageHash", value.asInstanceOf[js.Any])
      
      inline def setStorageProof(value: js.Array[StorageProof]): Self = StObject.set(x, "storageProof", value.asInstanceOf[js.Any])
      
      inline def setStorageProofVarargs(value: StorageProof*): Self = StObject.set(x, "storageProof", js.Array(value :_*))
    }
  }
  
  trait StorageProof extends StObject {
    
    var key: String
    
    var proof: js.Array[String]
    
    var value: String
  }
  object StorageProof {
    
    inline def apply(key: String, proof: js.Array[String], value: String): StorageProof = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], proof = proof.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageProof]
    }
    
    extension [Self <: StorageProof](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProof(value: js.Array[String]): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      inline def setProofVarargs(value: String*): Self = StObject.set(x, "proof", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Syncing extends StObject {
    
    var CurrentBlock: Double
    
    var HighestBlock: Double
    
    var KnownStates: Double
    
    var PulledStates: Double
    
    var StartingBlock: Double
  }
  object Syncing {
    
    inline def apply(
      CurrentBlock: Double,
      HighestBlock: Double,
      KnownStates: Double,
      PulledStates: Double,
      StartingBlock: Double
    ): Syncing = {
      val __obj = js.Dynamic.literal(CurrentBlock = CurrentBlock.asInstanceOf[js.Any], HighestBlock = HighestBlock.asInstanceOf[js.Any], KnownStates = KnownStates.asInstanceOf[js.Any], PulledStates = PulledStates.asInstanceOf[js.Any], StartingBlock = StartingBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Syncing]
    }
    
    extension [Self <: Syncing](x: Self) {
      
      inline def setCurrentBlock(value: Double): Self = StObject.set(x, "CurrentBlock", value.asInstanceOf[js.Any])
      
      inline def setHighestBlock(value: Double): Self = StObject.set(x, "HighestBlock", value.asInstanceOf[js.Any])
      
      inline def setKnownStates(value: Double): Self = StObject.set(x, "KnownStates", value.asInstanceOf[js.Any])
      
      inline def setPulledStates(value: Double): Self = StObject.set(x, "PulledStates", value.asInstanceOf[js.Any])
      
      inline def setStartingBlock(value: Double): Self = StObject.set(x, "StartingBlock", value.asInstanceOf[js.Any])
    }
  }
}
