package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request`
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request`
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response`
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response`
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification`
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification`
*/
trait LSPMessageType extends js.Object

object LSPMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `receive-notification`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification` = this.cast("receive-notification")
  @scala.inline
  def `receive-request`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request` = this.cast("receive-request")
  @scala.inline
  def `receive-response`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response` = this.cast("receive-response")
  @scala.inline
  def `send-notification`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification` = this.cast("send-notification")
  @scala.inline
  def `send-request`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request` = this.cast("send-request")
  @scala.inline
  def `send-response`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response` = this.cast("send-response")
}

