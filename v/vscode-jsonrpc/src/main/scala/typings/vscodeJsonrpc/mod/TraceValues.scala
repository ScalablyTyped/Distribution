package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.off
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.messages
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
*/
trait TraceValues extends js.Object

object TraceValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typings.vscodeJsonrpc.vscodeJsonrpcStrings.messages = this.cast("messages")
  @scala.inline
  def off: typings.vscodeJsonrpc.vscodeJsonrpcStrings.off = this.cast("off")
  @scala.inline
  def verbose: typings.vscodeJsonrpc.vscodeJsonrpcStrings.verbose = this.cast("verbose")
}

