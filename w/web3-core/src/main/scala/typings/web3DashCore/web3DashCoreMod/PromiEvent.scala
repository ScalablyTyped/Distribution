package typings.web3DashCore.web3DashCoreMod

import typings.std.Error
import typings.std.Promise
import typings.web3DashCore.web3DashCoreStrings.confirmation
import typings.web3DashCore.web3DashCoreStrings.error
import typings.web3DashCore.web3DashCoreStrings.receipt
import typings.web3DashCore.web3DashCoreStrings.transactionHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiEvent[T] extends Promise[T] {
  @JSName("on")
  def on_confirmation(`type`: confirmation, handler: js.Function1[/* error */ Error | TransactionReceipt | String, Unit]): PromiEvent[T] = js.native
  @JSName("on")
  def on_confirmation(
    `type`: confirmation,
    handler: js.Function2[/* confNumber */ Double, /* receipt */ TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[(/* error */ Error) | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("on")
  def on_receipt(`type`: receipt, handler: js.Function1[Error | String | (/* receipt */ TransactionReceipt), Unit]): PromiEvent[T] = js.native
  @JSName("on")
  def on_transactionHash(
    `type`: transactionHash,
    handler: js.Function1[Error | (/* receipt */ String) | TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(`type`: confirmation, handler: js.Function1[/* error */ Error | TransactionReceipt | String, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(
    `type`: confirmation,
    handler: js.Function2[/* confNumber */ Double, /* receipt */ TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_error(`type`: error, handler: js.Function1[(/* error */ Error) | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_receipt(`type`: receipt, handler: js.Function1[Error | String | (/* receipt */ TransactionReceipt), Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_transactionHash(
    `type`: transactionHash,
    handler: js.Function1[Error | (/* receipt */ String) | TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
}

