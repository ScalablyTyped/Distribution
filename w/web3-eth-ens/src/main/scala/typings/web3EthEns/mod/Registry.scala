package typings.web3EthEns.mod

import typings.std.Error
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.TransactionConfig
import typings.web3Core.mod.TransactionReceipt
import typings.web3CoreHelpers.mod.TransactionRevertInstructionError
import typings.web3EthContract.mod.Contract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-ens", "Registry")
@js.native
class Registry protected () extends js.Object {
  def this(ens: Ens) = this()
  var contract: Contract | Null = js.native
  var ens: Ens = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getOwner(name: String): js.Promise[String] = js.native
  def getOwner(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getOwner(name: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getResolver(name: String): js.Promise[Contract] = js.native
  def getResolver(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Contract] = js.native
  def getResolver(name: String, callback: js.Function2[/* error */ Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
  /**
    * @deprecated This callback signature is deprecated
    */
  def getTTl(name: String): js.Promise[String] = js.native
  def getTTl(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def getTTl(name: String, callback: js.Function2[/* error */ Error, /* ttl */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated Please use the "getOwner" method instead of "owner"
    */
  def owner(name: String): js.Promise[String] = js.native
  def owner(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[String] = js.native
  def owner(name: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
  /**
    * @deprecated Please use the "getResolver" method instead of "resolver"
    */
  def resolver(name: String): js.Promise[Contract] = js.native
  def resolver(name: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Promise[Contract] = js.native
  def resolver(name: String, callback: js.Function2[/* error */ Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
  def setOwner(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setOwner(
    name: String,
    address: String,
    txConfig: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
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
  def setResolver(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setResolver(
    name: String,
    address: String,
    txConfig: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
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
  def setSubnodeOwner(
    name: String,
    label: String,
    address: String,
    txConfig: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
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
  def setTTL(name: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  def setTTL(
    name: String,
    ttl: String,
    txConfig: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
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
  def setTTL(
    name: String,
    ttl: Double,
    txConfig: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ Error | TransactionRevertInstructionError, 
      /* receipt */ TransactionReceipt, 
      Unit
    ]
  ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
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
}

