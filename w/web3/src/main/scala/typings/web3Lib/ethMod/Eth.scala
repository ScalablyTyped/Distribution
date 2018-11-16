package typings
package web3Lib.ethMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eth extends js.Object {
  var BatchRequest: ScalablyTyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest] = js.native
  var Contract: ScalablyTyped.runtime.Instantiable3[
    /* jsonInterface */ js.Array[js.Any], 
    /* address */ js.UndefOr[/* address */ java.lang.String], 
    /* options */ js.UndefOr[/* options */ web3Lib.ethContractMod.CustomOptions], 
    web3Lib.ethContractMod.default
  ] = js.native
  var Iban: web3Lib.ethTypesMod.Iban = js.native
  var abi: web3Lib.ethAbiMod.ABI = js.native
  var accounts: web3Lib.ethAccountsMod.Accounts = js.native
  var compile: web3Lib.Anon_Serpent = js.native
  var currentProvider: web3Lib.providersMod.Provider = js.native
  var defaultAccount: java.lang.String = js.native
  var defaultBlock: web3Lib.ethTypesMod.BlockType = js.native
  var givenProvider: web3Lib.providersMod.Provider = js.native
  var net: web3Lib.ethTypesMod.Net = js.native
  var personal: web3Lib.ethTypesMod.Personal = js.native
  def call(callObject: web3Lib.ethTypesMod.Tx): stdLib.Promise[java.lang.String] = js.native
  def call(callObject: web3Lib.ethTypesMod.Tx, defaultBloc: web3Lib.ethTypesMod.BlockType): stdLib.Promise[java.lang.String] = js.native
  def call(
    callObject: web3Lib.ethTypesMod.Tx,
    defaultBloc: web3Lib.ethTypesMod.BlockType,
    callBack: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[java.lang.String] = js.native
  def clearSubscriptions(): scala.Boolean = js.native
  def estimateGas(tx: web3Lib.ethTypesMod.Tx): stdLib.Promise[scala.Double] = js.native
  def estimateGas(tx: web3Lib.ethTypesMod.Tx, callback: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getAccounts(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getAccounts(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getBalance(address: java.lang.String): stdLib.Promise[_] = js.native
  def getBalance(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): stdLib.Promise[_] = js.native
  def getBalance(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[_]
  ): scala.Unit = js.native
  def getBlock(number: web3Lib.ethTypesMod.BlockType): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlock(number: web3Lib.ethTypesMod.BlockType, returnTransactionObjects: scala.Boolean): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlock(
    number: web3Lib.ethTypesMod.BlockType,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getBlockNumber(): stdLib.Promise[scala.Double] = js.native
  def getBlockNumber(callback: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: web3Lib.ethTypesMod.BlockType): stdLib.Promise[scala.Double] = js.native
  def getBlockTransactionCount(number: web3Lib.ethTypesMod.BlockType, cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: web3Lib.ethTypesMod.BlockType): stdLib.Promise[scala.Double] = js.native
  def getBlockUncleCount(number: web3Lib.ethTypesMod.BlockType, cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getCode(address: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def getCode(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): stdLib.Promise[java.lang.String] = js.native
  def getCode(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[java.lang.String] = js.native
  def getCoinbase(): stdLib.Promise[java.lang.String] = js.native
  def getCoinbase(cb: web3Lib.typesMod.Callback[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  def getCompilers(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getCompilers(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getGasPrice(): stdLib.Promise[scala.Double] = js.native
  def getGasPrice(cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getHashrate(): stdLib.Promise[scala.Double] = js.native
  def getHashrate(cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getPastLogs(options: web3Lib.Anon_FromBlock): stdLib.Promise[js.Array[web3Lib.typesMod.Log]] = js.native
  def getPastLogs(options: web3Lib.Anon_FromBlock, cb: web3Lib.typesMod.Callback[js.Array[web3Lib.typesMod.Log]]): stdLib.Promise[js.Array[web3Lib.typesMod.Log]] = js.native
  def getProtocolVersion(): stdLib.Promise[java.lang.String] = js.native
  def getProtocolVersion(cb: web3Lib.typesMod.Callback[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: js.Any): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: js.Any, defaultBlock: web3Lib.ethTypesMod.BlockType): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: js.Any,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: scala.Double): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(address: java.lang.String, position: scala.Double, defaultBlock: web3Lib.ethTypesMod.BlockType): stdLib.Promise[java.lang.String] = js.native
  def getStorageAt(
    address: java.lang.String,
    position: scala.Double,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[java.lang.String] = js.native
  def getTransaction(hash: java.lang.String): stdLib.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransaction(hash: java.lang.String, cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Transaction]): stdLib.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionCount(address: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def getTransactionCount(address: java.lang.String, defaultBlock: web3Lib.ethTypesMod.BlockType): stdLib.Promise[scala.Double] = js.native
  def getTransactionCount(
    address: java.lang.String,
    defaultBlock: web3Lib.ethTypesMod.BlockType,
    cb: web3Lib.typesMod.Callback[scala.Double]
  ): stdLib.Promise[scala.Double] = js.native
  def getTransactionFromBlock(block: web3Lib.ethTypesMod.BlockType, index: scala.Double): stdLib.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionFromBlock(
    block: web3Lib.ethTypesMod.BlockType,
    index: scala.Double,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Transaction]
  ): stdLib.Promise[web3Lib.ethTypesMod.Transaction] = js.native
  def getTransactionReceipt(hash: java.lang.String): stdLib.Promise[web3Lib.typesMod.TransactionReceipt] = js.native
  def getTransactionReceipt(hash: java.lang.String, cb: web3Lib.typesMod.Callback[web3Lib.typesMod.TransactionReceipt]): stdLib.Promise[web3Lib.typesMod.TransactionReceipt] = js.native
  def getUncle(blockHashOrBlockNumber: java.lang.String, uncleIndex: scala.Double): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: java.lang.String,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean
  ): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: java.lang.String,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType, uncleIndex: scala.Double): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean
  ): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getUncle(
    blockHashOrBlockNumber: web3Lib.ethTypesMod.BlockType,
    uncleIndex: scala.Double,
    returnTransactionObjects: scala.Boolean,
    cb: web3Lib.typesMod.Callback[web3Lib.ethTypesMod.Block]
  ): stdLib.Promise[web3Lib.ethTypesMod.Block] = js.native
  def getWork(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getWork(cb: web3Lib.typesMod.Callback[js.Array[java.lang.String]]): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def isMining(): stdLib.Promise[scala.Boolean] = js.native
  def isMining(cb: web3Lib.typesMod.Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
  def isSyncing(): stdLib.Promise[scala.Boolean] = js.native
  def isSyncing(cb: web3Lib.typesMod.Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
  def sendSignedTransaction(data: java.lang.String): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendSignedTransaction(data: java.lang.String, cb: web3Lib.typesMod.Callback[java.lang.String]): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendTransaction(tx: web3Lib.ethTypesMod.Tx): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def sendTransaction(tx: web3Lib.ethTypesMod.Tx, cb: web3Lib.typesMod.Callback[java.lang.String]): web3Lib.promiEventMod.PromiEvent[web3Lib.typesMod.TransactionReceipt] = js.native
  def setProvider(provider: web3Lib.providersMod.Provider): scala.Unit = js.native
  def sign(address: java.lang.String, dataToSign: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def sign(
    address: java.lang.String,
    dataToSign: java.lang.String,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[java.lang.String] = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx): stdLib.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx, address: java.lang.String): stdLib.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def signTransaction(
    tx: web3Lib.ethTypesMod.Tx,
    address: java.lang.String,
    cb: web3Lib.typesMod.Callback[java.lang.String]
  ): stdLib.Promise[web3Lib.typesMod.EncodedTransaction] = js.native
  def submitWork(nonce: java.lang.String, powHash: java.lang.String, digest: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def submitWork(
    nonce: java.lang.String,
    powHash: java.lang.String,
    digest: java.lang.String,
    cb: web3Lib.typesMod.Callback[scala.Boolean]
  ): stdLib.Promise[scala.Boolean] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: web3Lib.web3LibStrings.logs): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(`type`: web3Lib.web3LibStrings.logs, options: web3Lib.typesMod.Logs): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_logs(
    `type`: web3Lib.web3LibStrings.logs,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_ | web3Lib.typesMod.Log]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.typesMod.Log]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: web3Lib.web3LibStrings.newBlockHeaders): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: web3Lib.web3LibStrings.newBlockHeaders,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.BlockHeader]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: web3Lib.web3LibStrings.newBlockHeaders, options: web3Lib.typesMod.Logs): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: web3Lib.web3LibStrings.newBlockHeaders,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: web3Lib.web3LibStrings.pendingTransactions): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: web3Lib.web3LibStrings.pendingTransactions,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[web3Lib.ethTypesMod.Transaction]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: web3Lib.web3LibStrings.pendingTransactions, options: web3Lib.typesMod.Logs): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: web3Lib.web3LibStrings.pendingTransactions,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: web3Lib.web3LibStrings.syncing): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: web3Lib.web3LibStrings.syncing,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: web3Lib.web3LibStrings.syncing, options: web3Lib.typesMod.Logs): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  @JSName("subscribe")
  def subscribe_syncing(
    `type`: web3Lib.web3LibStrings.syncing,
    options: web3Lib.typesMod.Logs,
    callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[_]]
  ): stdLib.Promise[web3Lib.typesMod.Subscribe[_]] = js.native
  def unsubscribe(callBack: web3Lib.typesMod.Callback[scala.Boolean]): scala.Unit | scala.Boolean = js.native
}

