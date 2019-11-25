package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.off
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.messages
  - typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.verbose
*/
trait TraceValues extends js.Object

object TraceValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.messages = this.cast("messages")
  @scala.inline
  def off: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.off = this.cast("off")
  @scala.inline
  def verbose: typings.vscodeDashJsonrpc.vscodeDashJsonrpcStrings.verbose = this.cast("verbose")
}

