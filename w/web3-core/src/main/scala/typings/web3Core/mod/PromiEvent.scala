package typings.web3Core.mod

import typings.std.Error
import typings.web3Core.web3CoreStrings.confirmation
import typings.web3Core.web3CoreStrings.error
import typings.web3Core.web3CoreStrings.receipt
import typings.web3Core.web3CoreStrings.sending
import typings.web3Core.web3CoreStrings.sent
import typings.web3Core.web3CoreStrings.transactionHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiEvent[T]
  extends js.Promise[T] {
  
  @JSName("on")
  def on_confirmation(`type`: confirmation, handler: js.Function1[/* error */ Error | TransactionReceipt | String, Unit]): PromiEvent[T] = js.native
  @JSName("on")
  def on_confirmation(
    `type`: confirmation,
    handler: js.Function3[
      /* confNumber */ Double, 
      /* receipt */ TransactionReceipt, 
      /* latestBlockHash */ js.UndefOr[String], 
      Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[Error | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
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
    handler: js.Function3[
      /* confirmationNumber */ Double, 
      /* receipt */ TransactionReceipt, 
      /* latestBlockHash */ js.UndefOr[String], 
      Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_error(`type`: error, handler: js.Function1[Error | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_receipt(`type`: receipt, handler: js.Function1[Error | String | (/* receipt */ TransactionReceipt), Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_sending(`type`: sending, handler: js.Function1[/* payload */ js.Object, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_sent(`type`: sent, handler: js.Function1[/* payload */ js.Object, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_transactionHash(
    `type`: transactionHash,
    handler: js.Function1[Error | (/* transactionHash */ String) | TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
}
