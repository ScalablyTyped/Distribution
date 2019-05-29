package typings
package web3Lib.ethMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eth extends js.Object {
  var BatchRequest: org.scalablytyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest] = js.native
  var Contract: org.scalablytyped.runtime.Instantiable3[
    /* jsonInterface */ js.Array[js.Any], 
    js.UndefOr[/* address */ java.lang.String], 
    js.UndefOr[/* options */ web3Lib.ethContractMod.CustomOptions], 
    web3Lib.ethContractMod.default
  ] = js.native
  var Iban: web3Lib.ethTypesMod.Iban = js.native
  var abi: web3Lib.ethAbiMod.ABI = js.native
  var accounts: web3Lib.ethAccountsMod.Accounts = js.native
  var compile: web3Lib.Anon_Callback = js.native
  var currentProvider: web3Lib.providersMod.Provider = js.native
  var defaultAccount: java.lang.String = js.native
  var defaultBlock: web3Lib.ethTypesMod.BlockType = js.native
  var givenProvider: web3Lib.providersMod.Provider = js.native
  var net: web3Lib.ethTypesMod.Net = js.native
  var personal: web3Lib.ethTypesMod.Personal = js.native
  def call(callObject: web3Lib.ethTypesMod.Tx): js.Promise[java.lang.String] = js.native
  def call(callObject: web3Lib.ethTypesMod.Tx, defaultBloc: web3Lib.ethTypesMod.BlockType): js.Promise[java.lang.String] = js.native
  def call(
    callObject: web3Lib.ethTypesMod.Tx,
    defaultBloc: web3Lib.ethTypesMod.BlockType,
    callBack: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def clearSubscriptions(): scala.Boolean = js.native
  def estimateGas(tx: web3Lib.ethTypesMod.Tx): js.Promise[scala.Double] = js.native
  def estimateGas(tx: web3Lib.ethTypesMod.Tx, callback: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getAccounts(): js.Promise[js.Array[java.lang.String]] = js.native
  def getAccounts(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): js.Promise[js.Array[java.lang.String]] = js.native
  def getBalance(address: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBalance(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): js.Promise[java.lang.String] = js.native
  def getBalance(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): scala.Unit = js.native
  def getBlock(number: web3Lib.ethTypesMod.BlockType): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlock(number: web3Lib.ethTypesMod.BlockType, returnTransactionObjects: scala.Boolean): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlock(
    number: web3Lib.ethTypesMod.BlockType,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlockNumber(): js.Promise[scala.Double] = js.native
  def getBlockNumber(callback: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: java.lang.String): js.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: web3Lib.ethTypesMod.BlockType): js.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: web3Lib.ethTypesMod.BlockType, cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: java.lang.String): js.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: web3Lib.ethTypesMod.BlockType): js.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: web3Lib.ethTypesMod.BlockType, cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getCode(address: java.lang.String): js.Promise[java.lang.String] = js.native
  def getCode(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): js.Promise[java.lang.String] = js.native
  def getCode(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def getCoinbase(): js.Promise[java.lang.String] = js.native
  def getCoinbase(cb: web3Lib.typesMod.Callback[java.lang.String]): js.Promise[java.lang.String] = js.native
  def getCompilers(): js.Promise[js.Array[java.lang.String]] = js.native
  def getCompilers(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): js.Promise[js.Array[java.lang.String]] = js.native
  def getGasPrice(): js.Promise[scala.Double] = js.native
  def getGasPrice(cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getHashrate(): js.Promise[scala.Double] = js.native
  def getHashrate(cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getPastLogs(options: web3Lib.Anon_Address): js.Promise[js.Array[web3Lib.typesMod.Log]] = js.native
  def getPastLogs(options: web3Lib.Anon_Address, cb: web3Lib.typesMod.Callback[js.Array[web3Lib.typesMod.Log]]): js.Promise[js.Array[web3Lib.typesMod.Log]] = js.native
  def getProtocolVersion(): js.Promise[java.lang.String] = js.native
  def getProtocolVersion(cb: web3Lib.typesMod.Callback[java.lang.String]): js.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): js.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    defaultBlock: web3Lib.ethTypesMod.BlockType
  ): js.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: scala.Double): js.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: scala.Double, defaultBlock: web3Lib.ethTypesMod.BlockType): js.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: scala.Double,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def getTransaction(hash: java.lang.String): js.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransaction(hash: java.lang.String, cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Transaction]): js.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionCount(address: java.lang.String): js.Promise[scala.Double] = js.native
  def getTransactionCount(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): js.Promise[scala.Double] = js.native
  def getTransactionCount(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[scala.Double]
  ): js.Promise[scala.Double] = js.native
  def getTransactionFromBlock(block: web3Lib.ethTypesMod.BlockType, index: scala.Double): js.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionFromBlock(
    block: web3Lib.ethTypesMod.BlockType,
    index: scala.Double,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Transaction]
  ): js.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionReceipt(hash: java.lang.String): js.Promise[web3Lib.typesMod.TransactionReceipt] = js.native
  def getTransactionReceipt(hash: java.lang.String, cb: web3Lib.typesMod.Callback[web3Lib.typesMod.TransactionReceipt]): js.Promise[web3Lib.typesMod.TransactionReceipt] = js.native
  def getUncle(blockHashOrBlockNumber: java.lang.String, uncleIndex: scala.Double): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: java.lang.String,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean
  ): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: java.lang.String,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType, uncleIndex: scala.Double): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean
  ): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): js.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getWork(): js.Promise[js.Array[java.lang.String]] = js.native
  def getWork(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): js.Promise[js.Array[java.lang.String]] = js.native
  def isMining(): js.Promise[scala.Boolean] = js.native
  def isMining(cb: web3Lib.typesMod.Callback[scala.Boolean]): js.Promise[scala.Boolean] = js.native
  def isSyncing(): js.Promise[scala.Boolean] = js.native
  def isSyncing(cb: web3Lib.typesMod.Callback[scala.Boolean]): js.Promise[scala.Boolean] = js.native
  def sendSignedTransaction(data: java.lang.String): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendSignedTransaction(data: java.lang.String, cb: web3Lib.typesMod.Callback[java.lang.String]): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendTransaction(tx: web3Lib.ethTypesMod.Tx): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendTransaction(tx: web3Lib.ethTypesMod.Tx, cb: web3Lib.typesMod.Callback[java.lang.String]): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def setProvider(provider: web3Lib.providersMod.Provider): scala.Unit = js.native
  def sign(address: java.lang.String, dataToSign: java.lang.String): js.Promise[java.lang.String] = js.native
  def sign(
    address: java.lang.String,
    dataToSign: java.lang.String,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx): js.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx, address: java.lang.String): js.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def signTransaction(
    tx: web3Lib.ethTypesMod.Tx,
    address: java.lang.String,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): js.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def submitWork(nonce: java.lang.String, powHash: java.lang.String, digest: java.lang.String): js.Promise[scala.Boolean] = js.native
  def submitWork(
    nonce: java.lang.String,
    powHash: java.lang.String,
    digest: java.lang.String,
    cb: web3Lib.typesMod.Callback[scala.Boolean]
  ): js.Promise[scala.Boolean] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: web3Lib.web3LibStrings.logs): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: web3Lib.web3LibStrings.logs, options: web3Lib.typesMod.Logs): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(
    `type`: web3Lib.web3LibStrings.logs,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_ | web3Lib.typesMod.Log]]
  ): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: web3Lib.web3LibStrings.newBlockHeaders): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: web3Lib.web3LibStrings.newBlockHeaders,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]]
  ): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: web3Lib.web3LibStrings.newBlockHeaders, options: web3Lib.typesMod.Logs): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: web3Lib.web3LibStrings.newBlockHeaders,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: web3Lib.web3LibStrings.pendingTransactions): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: web3Lib.web3LibStrings.pendingTransactions,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]]
  ): js.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: web3Lib.web3LibStrings.pendingTransactions, options: web3Lib.typesMod.Logs): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: web3Lib.web3LibStrings.pendingTransactions,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: web3Lib.web3LibStrings.syncing): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: web3Lib.web3LibStrings.syncing,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: web3Lib.web3LibStrings.syncing, options: web3Lib.typesMod.Logs): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: web3Lib.web3LibStrings.syncing,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): js.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  def unsubscribe(callBack: web3Lib.typesMod.Callback[scala.Boolean]): scala.Unit | scala.Boolean = js.native
}

