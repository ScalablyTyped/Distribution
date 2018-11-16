package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "AbstractMessageType")
@js.native
abstract class AbstractMessageType protected () extends MessageType {
  def this(_method: java.lang.String, _numberOfParams: scala.Double) = this()
  var _method: js.Any = js.native
  var _numberOfParams: js.Any = js.native
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /* CompleteClass */
  override val numberOfParams: scala.Double = js.native
}

