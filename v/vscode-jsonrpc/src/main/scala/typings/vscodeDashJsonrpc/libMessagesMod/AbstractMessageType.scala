package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "AbstractMessageType")
@js.native
abstract class AbstractMessageType protected () extends MessageType {
  def this(_method: String, _numberOfParams: Double) = this()
  var _method: js.Any = js.native
  var _numberOfParams: js.Any = js.native
  /* CompleteClass */
  override val method: String = js.native
  /* CompleteClass */
  override val numberOfParams: Double = js.native
}

