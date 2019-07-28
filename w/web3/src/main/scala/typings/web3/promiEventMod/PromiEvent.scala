package typings.web3.promiEventMod

import typings.std.Error
import typings.std.Promise
import typings.web3.typesMod.TransactionReceipt
import typings.web3.web3Strings.confirmation
import typings.web3.web3Strings.error
import typings.web3.web3Strings.receipt
import typings.web3.web3Strings.transactionHash
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
  def once(
    `type`: PromiEventType,
    handler: js.Function1[/* error */ Error | TransactionReceipt | String, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(
    `type`: confirmation,
    handler: js.Function2[/* confNumber */ Double, /* receipt */ TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_error(`type`: error, handler: js.Function1[/* error */ Error, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_receipt(`type`: receipt, handler: js.Function1[/* receipt */ TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_transactionHash(`type`: transactionHash, handler: js.Function1[/* receipt */ String, Unit]): PromiEvent[T] = js.native
}

