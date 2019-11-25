package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-request`
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-request`
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-response`
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-response`
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-notification`
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-notification`
*/
trait LSPMessageType extends js.Object

object LSPMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `receive-notification`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-notification` = this.cast("receive-notification")
  @scala.inline
  def `receive-request`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-request` = this.cast("receive-request")
  @scala.inline
  def `receive-response`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`receive-response` = this.cast("receive-response")
  @scala.inline
  def `send-notification`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-notification` = this.cast("send-notification")
  @scala.inline
  def `send-request`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-request` = this.cast("send-request")
  @scala.inline
  def `send-response`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.`send-response` = this.cast("send-response")
}

