package typings.web3DashEth.web3DashEthMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.Common
import typings.web3DashCore.web3DashCoreMod.Extension
import typings.web3DashCore.web3DashCoreMod.Log
import typings.web3DashCore.web3DashCoreMod.PromiEvent
import typings.web3DashCore.web3DashCoreMod.Providers
import typings.web3DashCore.web3DashCoreMod.RLPEncodedTransaction
import typings.web3DashCore.web3DashCoreMod.Transaction
import typings.web3DashCore.web3DashCoreMod.TransactionConfig
import typings.web3DashCore.web3DashCoreMod.TransactionReceipt
import typings.web3DashCore.web3DashCoreMod.chain
import typings.web3DashCore.web3DashCoreMod.hardfork
import typings.web3DashCore.web3DashCoreMod.provider
import typings.web3DashCoreDashSubscriptions.web3DashCoreDashSubscriptionsMod.Subscription
import typings.web3DashEth.web3DashEthStrings.earliest
import typings.web3DashEth.web3DashEthStrings.latest
import typings.web3DashEth.web3DashEthStrings.logs
import typings.web3DashEth.web3DashEthStrings.newBlockHeaders
import typings.web3DashEth.web3DashEthStrings.pendingTransactions
import typings.web3DashEth.web3DashEthStrings.syncing
import typings.web3DashEthDashAbi.web3DashEthDashAbiMod.AbiCoder
import typings.web3DashEthDashAccounts.web3DashEthDashAccountsMod.Accounts
import typings.web3DashEthDashContract.web3DashEthDashContractMod.ContractOptions
import typings.web3DashEthDashEns.web3DashEthDashEnsMod.Ens
import typings.web3DashEthDashPersonal.web3DashEthDashPersonalMod.Personal
import typings.web3DashNet.web3DashNetMod.Network
import typings.web3DashUtils.web3DashUtilsMod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth", "Eth")
@js.native
class Eth protected () extends js.Object {
  def this(currentProvider: provider) = this()
  var BatchRequest: Instantiable0[typings.web3DashCore.web3DashCoreMod.BatchRequest] = js.native
  var Contract: Instantiable3[
    /* jsonInterface */ js.Array[AbiItem] | AbiItem, 
    js.UndefOr[/* address */ String], 
    js.UndefOr[/* options */ ContractOptions], 
    typings.web3DashEthDashContract.web3DashEthDashContractMod.Contract
  ] = js.native
  var Iban: Instantiable1[/* iban */ String, typings.web3DashEthDashIban.web3DashEthDashIbanMod.Iban] = js.native
  var abi: AbiCoder = js.native
  var accounts: Accounts = js.native
  val currentProvider: provider = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  var defaultChain: chain = js.native
  var defaultCommon: Common = js.native
  var defaultHardfork: hardfork = js.native
  var ens: Ens = js.native
  val givenProvider: js.Any = js.native
  var net: Network = js.native
  var personal: Personal = js.native
  var transactionBlockTimeout: Double = js.native
  var transactionConfirmationBlocks: Double = js.native
  var transactionPollingTimeout: Double = js.native
  def call(transactionConfig: TransactionConfig): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def call(transactionConfig: TransactionConfig, defaultBlock: String): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    defaultBlock: String,
    callback: js.Function2[/* error */ Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def call(transactionConfig: TransactionConfig, defaultBlock: Double): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    defaultBlock: Double,
    callback: js.Function2[/* error */ Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def clearSubscriptions(callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = js.native
  def estimateGas(transactionConfig: TransactionConfig): js.Promise[Double] = js.native
  def estimateGas(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* gas */ Double, Unit]
  ): js.Promise[Double] = js.native
  def extend(extension: Extension): js.Any = js.native
  def getAccounts(): js.Promise[js.Array[String]] = js.native
  def getAccounts(callback: js.Function2[/* error */ Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  def getBalance(address: String): js.Promise[String] = js.native
  def getBalance(address: String, callback: js.Function2[/* error */ Error, /* balance */ String, Unit]): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: String): js.Promise[String] = js.native
  def getBalance(
    address: String,
    defaultBlock: String,
    callback: js.Function2[/* error */ Error, /* balance */ String, Unit]
  ): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: Double): js.Promise[String] = js.native
  def getBalance(
    address: String,
    defaultBlock: Double,
    callback: js.Function2[/* error */ Error, /* balance */ String, Unit]
  ): js.Promise[String] = js.native
  def getBlock(blockHashOrBlockNumber: String): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockNumber: String, callback: js.Function2[/* error */ Error, /* block */ Block, Unit]): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockNumber: String, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getBlock(
    blockHashOrBlockNumber: String,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ Error, /* block */ Block, Unit]
  ): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockNumber: Double): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockNumber: Double, callback: js.Function2[/* error */ Error, /* block */ Block, Unit]): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockNumber: Double, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getBlock(
    blockHashOrBlockNumber: Double,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ Error, /* block */ Block, Unit]
  ): js.Promise[Block] = js.native
  def getBlockNumber(): js.Promise[Double] = js.native
  def getBlockNumber(callback: js.Function2[/* error */ Error, /* blockNumber */ Double, Unit]): js.Promise[Double] = js.native
  def getBlockTransactionCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockTransactionCount(blockHashOrBlockNumber: Double): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: Double,
    callback: js.Function2[/* error */ Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getChainId(): js.Promise[Double] = js.native
  def getChainId(callback: js.Function2[/* error */ Error, /* version */ Double, Unit]): js.Promise[Double] = js.native
  def getCode(address: String): js.Promise[String] = js.native
  def getCode(address: String, callback: js.Function2[/* error */ Error, /* code */ String, Unit]): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: String): js.Promise[String] = js.native
  def getCode(
    address: String,
    defaultBlock: String,
    callback: js.Function2[/* error */ Error, /* code */ String, Unit]
  ): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: Double): js.Promise[String] = js.native
  def getCode(
    address: String,
    defaultBlock: Double,
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
  def getProof(address: String, storageKey: js.Array[String], blockNumber: String): js.Promise[GetProof] = js.native
  def getProof(
    address: String,
    storageKey: js.Array[String],
    blockNumber: String,
    callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  def getProof(address: String, storageKey: js.Array[String], blockNumber: Double): js.Promise[GetProof] = js.native
  def getProof(
    address: String,
    storageKey: js.Array[String],
    blockNumber: Double,
    callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  @JSName("getProof")
  def getProof_earliest(address: String, storageKey: js.Array[String], blockNumber: earliest): js.Promise[GetProof] = js.native
  @JSName("getProof")
  def getProof_earliest(
    address: String,
    storageKey: js.Array[String],
    blockNumber: earliest,
    callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  @JSName("getProof")
  def getProof_latest(address: String, storageKey: js.Array[String], blockNumber: latest): js.Promise[GetProof] = js.native
  @JSName("getProof")
  def getProof_latest(
    address: String,
    storageKey: js.Array[String],
    blockNumber: latest,
    callback: js.Function2[/* error */ Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  def getProtocolVersion(): js.Promise[String] = js.native
  def getProtocolVersion(callback: js.Function2[/* error */ Error, /* protocolVersion */ String, Unit]): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: String): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    defaultBlock: String,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: Double): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    defaultBlock: Double,
    callback: js.Function2[/* error */ Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getTransaction(transactionHash: String): js.Promise[Transaction] = js.native
  def getTransaction(
    transactionHash: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionCount(address: String): js.Promise[Double] = js.native
  def getTransactionCount(address: String, callback: js.Function2[/* error */ Error, /* count */ Double, Unit]): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: String): js.Promise[Double] = js.native
  def getTransactionCount(
    address: String,
    defaultBlock: String,
    callback: js.Function2[/* error */ Error, /* count */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: Double): js.Promise[Double] = js.native
  def getTransactionCount(
    address: String,
    defaultBlock: Double,
    callback: js.Function2[/* error */ Error, /* count */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getTransactionFromBlock(hashStringOrNumber: String, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    hashStringOrNumber: String,
    indexNumber: Double,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(hashStringOrNumber: Double, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    hashStringOrNumber: Double,
    indexNumber: Double,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionReceipt(hash: String): js.Promise[TransactionReceipt] = js.native
  def getTransactionReceipt(
    hash: String,
    callback: js.Function2[/* error */ Error, /* transactionReceipt */ TransactionReceipt, Unit]
  ): js.Promise[TransactionReceipt] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: Double, uncleIndex: Double): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: Double,
    uncleIndex: Double,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: Double, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: Double,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ Error, /* uncle */ js.Any, Unit]
  ): js.Promise[Block] = js.native
  def getWork(): js.Promise[js.Array[String]] = js.native
  def getWork(callback: js.Function2[/* error */ Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  def isMining(): js.Promise[Boolean] = js.native
  def isMining(callback: js.Function2[/* error */ Error, /* mining */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def isSyncing(): js.Promise[Syncing | Boolean] = js.native
  def isSyncing(callback: js.Function2[/* error */ Error, /* syncing */ Syncing, Unit]): js.Promise[Syncing | Boolean] = js.native
  def sendSignedTransaction(signedTransactionData: String): PromiEvent[TransactionReceipt] = js.native
  def sendSignedTransaction(signedTransactionData: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(transactionConfig: TransactionConfig): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
  ): PromiEvent[TransactionReceipt] = js.native
  def setProvider(provider: provider): Boolean = js.native
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
  def subscribe_logs(`type`: logs): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_logs(
    `type`: logs,
    options: Null,
    callback: js.Function2[/* error */ Error, /* item */ Log | Syncing | BlockHeader | String, Unit]
  ): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: LogsOptions): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_logs(
    `type`: logs,
    options: LogsOptions,
    callback: js.Function2[/* error */ Error, BlockHeader | (/* log */ Log) | String | Syncing, Unit]
  ): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: newBlockHeaders,
    options: Null,
    callback: js.Function2[/* error */ Error, BlockHeader | Log | String | Syncing, Unit]
  ): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders, options: LogsOptions): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: newBlockHeaders,
    options: LogsOptions,
    callback: js.Function2[/* error */ Error, /* item */ Log | Syncing | BlockHeader | String, Unit]
  ): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: pendingTransactions,
    options: Null,
    callback: js.Function2[
      /* error */ Error, 
      BlockHeader | Log | (/* transactionHash */ String) | Syncing, 
      Unit
    ]
  ): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions, options: LogsOptions): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: pendingTransactions,
    options: LogsOptions,
    callback: js.Function2[/* error */ Error, /* item */ Log | Syncing | BlockHeader | String, Unit]
  ): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing): Subscription[Syncing] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: syncing,
    options: Null,
    callback: js.Function2[/* error */ Error, BlockHeader | Log | String | (/* result */ Syncing), Unit]
  ): Subscription[Syncing] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, options: LogsOptions): Subscription[Log | BlockHeader | Syncing | String] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: syncing,
    options: LogsOptions,
    callback: js.Function2[/* error */ Error, /* item */ Log | Syncing | BlockHeader | String, Unit]
  ): Subscription[Log | BlockHeader | Syncing | String] = js.native
}

/* static members */
@JSImport("web3-eth", "Eth")
@js.native
object Eth extends js.Object {
  val providers: Providers = js.native
}

