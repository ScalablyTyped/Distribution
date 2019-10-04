package typings.web3.ethMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.web3.Anon_Address
import typings.web3.Anon_Callback
import typings.web3.ethAbiMod.ABI
import typings.web3.ethAccountsMod.Accounts
import typings.web3.ethContractMod.CustomOptions
import typings.web3.ethContractMod.default
import typings.web3.ethTypesMod.Block
import typings.web3.ethTypesMod.BlockHeader
import typings.web3.ethTypesMod.BlockType
import typings.web3.ethTypesMod.Net
import typings.web3.ethTypesMod.Personal
import typings.web3.ethTypesMod.Transaction
import typings.web3.ethTypesMod.Tx
import typings.web3.promiEventMod.PromiEvent
import typings.web3.providersMod.Provider
import typings.web3.typesMod.Callback
import typings.web3.typesMod.EncodedTransaction
import typings.web3.typesMod.Log
import typings.web3.typesMod.Logs
import typings.web3.typesMod.Subscribe
import typings.web3.typesMod.TransactionReceipt
import typings.web3.web3Strings.logs
import typings.web3.web3Strings.newBlockHeaders
import typings.web3.web3Strings.pendingTransactions
import typings.web3.web3Strings.syncing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eth extends js.Object {
  var BatchRequest: Instantiable0[typings.web3.ethTypesMod.BatchRequest] = js.native
  var Contract: Instantiable3[
    /* jsonInterface */ js.Array[js.Any], 
    js.UndefOr[/* address */ String], 
    js.UndefOr[/* options */ CustomOptions], 
    default
  ] = js.native
  var Iban: typings.web3.ethTypesMod.Iban = js.native
  var abi: ABI = js.native
  var accounts: Accounts = js.native
  var compile: Anon_Callback = js.native
  var currentProvider: Provider = js.native
  var defaultAccount: String = js.native
  var defaultBlock: BlockType = js.native
  var givenProvider: Provider = js.native
  var net: Net = js.native
  var personal: Personal = js.native
  def call(callObject: Tx): js.Promise[String] = js.native
  def call(callObject: Tx, defaultBloc: BlockType): js.Promise[String] = js.native
  def call(callObject: Tx, defaultBloc: BlockType, callBack: Callback[String]): js.Promise[String] = js.native
  def clearSubscriptions(): Boolean = js.native
  def estimateGas(tx: Tx): js.Promise[Double] = js.native
  def estimateGas(tx: Tx, callback: Callback[Double]): js.Promise[Double] = js.native
  def getAccounts(): js.Promise[js.Array[String]] = js.native
  def getAccounts(cb: Callback[js.Array[String]]): js.Promise[js.Array[String]] = js.native
  def getBalance(address: String): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: BlockType): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: BlockType, cb: Callback[String]): Unit = js.native
  def getBlock(number: BlockType): js.Promise[Block] = js.native
  def getBlock(number: BlockType, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getBlock(number: BlockType, returnTransactionObjects: Boolean, cb: Callback[Block]): js.Promise[Block] = js.native
  def getBlockNumber(): js.Promise[Double] = js.native
  def getBlockNumber(callback: Callback[Double]): js.Promise[Double] = js.native
  def getBlockTransactionCount(number: String): js.Promise[Double] = js.native
  def getBlockTransactionCount(number: String, cb: Callback[Double]): js.Promise[Double] = js.native
  def getBlockTransactionCount(number: BlockType): js.Promise[Double] = js.native
  def getBlockTransactionCount(number: BlockType, cb: Callback[Double]): js.Promise[Double] = js.native
  def getBlockUncleCount(number: String): js.Promise[Double] = js.native
  def getBlockUncleCount(number: String, cb: Callback[Double]): js.Promise[Double] = js.native
  def getBlockUncleCount(number: BlockType): js.Promise[Double] = js.native
  def getBlockUncleCount(number: BlockType, cb: Callback[Double]): js.Promise[Double] = js.native
  def getCode(address: String): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: BlockType): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: BlockType, cb: Callback[String]): js.Promise[String] = js.native
  def getCoinbase(): js.Promise[String] = js.native
  def getCoinbase(cb: Callback[String]): js.Promise[String] = js.native
  def getCompilers(): js.Promise[js.Array[String]] = js.native
  def getCompilers(cb: Callback[js.Array[String]]): js.Promise[js.Array[String]] = js.native
  def getGasPrice(): js.Promise[Double] = js.native
  def getGasPrice(cb: Callback[Double]): js.Promise[Double] = js.native
  def getHashrate(): js.Promise[Double] = js.native
  def getHashrate(cb: Callback[Double]): js.Promise[Double] = js.native
  def getPastLogs(options: Anon_Address): js.Promise[js.Array[Log]] = js.native
  def getPastLogs(options: Anon_Address, cb: Callback[js.Array[Log]]): js.Promise[js.Array[Log]] = js.native
  def getProtocolVersion(): js.Promise[String] = js.native
  def getProtocolVersion(cb: Callback[String]): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    defaultBlock: BlockType
  ): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    defaultBlock: BlockType,
    cb: Callback[String]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: BlockType): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: BlockType, cb: Callback[String]): js.Promise[String] = js.native
  def getTransaction(hash: String): js.Promise[Transaction] = js.native
  def getTransaction(hash: String, cb: Callback[Transaction]): js.Promise[Transaction] = js.native
  def getTransactionCount(address: String): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: BlockType): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: BlockType, cb: Callback[Double]): js.Promise[Double] = js.native
  def getTransactionFromBlock(block: BlockType, index: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(block: BlockType, index: Double, cb: Callback[Transaction]): js.Promise[Transaction] = js.native
  def getTransactionReceipt(hash: String): js.Promise[TransactionReceipt] = js.native
  def getTransactionReceipt(hash: String, cb: Callback[TransactionReceipt]): js.Promise[TransactionReceipt] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    cb: Callback[Block]
  ): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: BlockType, uncleIndex: Double): js.Promise[Block] = js.native
  def getUncle(blockHashOrBlockNumber: BlockType, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockType,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    cb: Callback[Block]
  ): js.Promise[Block] = js.native
  def getWork(): js.Promise[js.Array[String]] = js.native
  def getWork(cb: Callback[js.Array[String]]): js.Promise[js.Array[String]] = js.native
  def isMining(): js.Promise[Boolean] = js.native
  def isMining(cb: Callback[Boolean]): js.Promise[Boolean] = js.native
  def isSyncing(): js.Promise[Boolean] = js.native
  def isSyncing(cb: Callback[Boolean]): js.Promise[Boolean] = js.native
  def sendSignedTransaction(data: String): PromiEvent[TransactionReceipt] = js.native
  def sendSignedTransaction(data: String, cb: Callback[String]): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(tx: Tx): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(tx: Tx, cb: Callback[String]): PromiEvent[TransactionReceipt] = js.native
  def setProvider(provider: Provider): Unit = js.native
  def sign(address: String, dataToSign: String): js.Promise[String] = js.native
  def sign(address: String, dataToSign: String, cb: Callback[String]): js.Promise[String] = js.native
  def signTransaction(tx: Tx): js.Promise[EncodedTransaction] = js.native
  def signTransaction(tx: Tx, address: String): js.Promise[EncodedTransaction] = js.native
  def signTransaction(tx: Tx, address: String, cb: Callback[String]): js.Promise[EncodedTransaction] = js.native
  def submitWork(nonce: String, powHash: String, digest: String): js.Promise[Boolean] = js.native
  def submitWork(nonce: String, powHash: String, digest: String, cb: Callback[Boolean]): js.Promise[Boolean] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs): js.Promise[Subscribe[Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: Logs): js.Promise[Subscribe[Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: Logs, callback: Callback[_ | Log]): js.Promise[Subscribe[Log]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders): js.Promise[Subscribe[BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders, callback: Callback[BlockHeader]): js.Promise[Subscribe[BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders, options: Logs): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders, options: Logs, callback: Callback[_]): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions): js.Promise[Subscribe[Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions, callback: Callback[Transaction]): js.Promise[Subscribe[Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions, options: Logs): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions, options: Logs, callback: Callback[_]): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, callback: Callback[_]): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, options: Logs): js.Promise[Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, options: Logs, callback: Callback[_]): js.Promise[Subscribe[_]] = js.native
  def unsubscribe(callBack: Callback[Boolean]): Unit | Boolean = js.native
}

