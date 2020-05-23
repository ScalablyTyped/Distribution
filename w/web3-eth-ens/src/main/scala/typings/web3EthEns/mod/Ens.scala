package typings.web3EthEns.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.TransactionConfig
import typings.web3Core.mod.TransactionReceipt
import typings.web3CoreHelpers.mod.TransactionRevertInstructionError
import typings.web3EthContract.mod.Contract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-ens", "Ens")
@js.native
class Ens protected () extends js.Object {
  def this(eth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eth */ js.Any) = this()
  var registry: Registry = js.native
  var registryAddress: String | Null = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getAddress(name: String): js.Promise[String] = js.native
  def getAddress(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getAddress(name: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getContent(name: String): js.Promise[String] = js.native
  def getContent(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getContent(name: String, callback: js.Function2[/* error */ Error, /* contentHash */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getContenthash(name: String): js.Promise[ContentHash] = js.native
  def getContenthash(name: String, callback: js.Function1[/* value */ ContentHash, Unit]): js.Promise[ContentHash] = js.native
  def getContenthash(name: String, callback: js.Function2[/* error */ Error, /* contenthash */ ContentHash, Unit]): js.Promise[ContentHash] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getMultihash(name: String): js.Promise[String] = js.native
  def getMultihash(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getMultihash(name: String, callback: js.Function2[/* error */ Error, /* multihash */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getOwner(name: String): js.Promise[String] = js.native
  def getOwner(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getOwner(name: String, callback: js.Function2[/* error */ Error, /* owner */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getPubkey(name: String): js.Promise[StringDictionary[String]] = js.native
  def getPubkey(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[StringDictionary[String]] = js.native
  def getPubkey(
    name: String,
    callback: js.Function2[/* error */ Error, /* result */ StringDictionary[String], Unit]
  ): js.Promise[StringDictionary[String]] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getResolver(name: String): js.Promise[Contract] = js.native
  def getResolver(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Contract] = js.native
  def getResolver(name: String, callback: js.Function2[/* error */ Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getTTL(name: String): js.Promise[String] = js.native
  def getTTL(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getTTL(name: String, callback: js.Function2[/* error */ Error, /* ttl */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getText(name: String, key: String): js.Promise[String] = js.native
  def getText(name: String, key: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getText(name: String, key: String, callback: js.Function2[/* error */ Error, /* ensName */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def isApprovedForAll(owner: String, operator: String): js.Promise[Boolean] = js.native
  def isApprovedForAll(owner: String, operator: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Boolean] = js.native
  def isApprovedForAll(
    owner: String,
    operator: String,
    callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]
  ): js.Promise[Boolean] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def recordExists(name: String): js.Promise[Boolean] = js.native
  def recordExists(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Boolean] = js.native
  def recordExists(name: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  /**
    * @deprecated Please use the "getResolver" method instead of "resolver"
    */
  def resolver(name: String): js.Promise[Contract] = js.native
  def resolver(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Contract] = js.native
  def resolver(name: String, callback: js.Function2[/* error */ Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
  def setAddress(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setAddress(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setAddress(
    name: String,
    address: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setApprovalForAll(operator: String, approved: Boolean): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setApprovalForAll(operator: String, approved: Boolean, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setApprovalForAll(
    operator: String,
    approved: Boolean,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContent(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContent(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContent(
    name: String,
    hash: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContenthash(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContenthash(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setContenthash(
    name: String,
    hash: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setMultihash(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setMultihash(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setMultihash(
    name: String,
    hash: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setOwner(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setOwner(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setOwner(
    name: String,
    address: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setPubkey(name: String, x: String, y: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setPubkey(name: String, x: String, y: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setPubkey(
    name: String,
    x: String,
    y: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(name: String, owner: String, resolver: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(name: String, owner: String, resolver: String, ttl: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(
    name: String,
    owner: String,
    resolver: String,
    ttl: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(name: String, owner: String, resolver: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(name: String, owner: String, resolver: String, ttl: Double, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setRecord(
    name: String,
    owner: String,
    resolver: String,
    ttl: Double,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setResolver(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setResolver(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setResolver(
    name: String,
    address: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeOwner(name: String, label: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeOwner(name: String, label: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeOwner(
    name: String,
    label: String,
    address: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(name: String, label: String, owner: String, resolver: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(
    name: String,
    label: String,
    owner: String,
    resolver: String,
    ttl: String,
    txConfig: TransactionConfig
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(
    name: String,
    label: String,
    owner: String,
    resolver: String,
    ttl: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(name: String, label: String, owner: String, resolver: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(
    name: String,
    label: String,
    owner: String,
    resolver: String,
    ttl: Double,
    txConfig: TransactionConfig
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setSubnodeRecord(
    name: String,
    label: String,
    owner: String,
    resolver: String,
    ttl: Double,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(name: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(name: String, ttl: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(
    name: String,
    ttl: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(name: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(name: String, ttl: Double, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(
    name: String,
    ttl: Double,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setText(name: String, key: String, value: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setText(name: String, key: String, value: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setText(
    name: String,
    key: String,
    value: String,
    txConfig: TransactionConfig,
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def supportsInterface(name: String, interfaceId: String): js.Promise[Boolean] = js.native
  def supportsInterface(name: String, interfaceId: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Boolean] = js.native
  def supportsInterface(
    name: String,
    interfaceId: String,
    callback: js.Function2[/* error */ Error, /* supported */ Boolean, Unit]
  ): js.Promise[Boolean] = js.native
}

