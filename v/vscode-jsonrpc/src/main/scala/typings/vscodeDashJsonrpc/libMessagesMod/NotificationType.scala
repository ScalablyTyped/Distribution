package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "NotificationType")
@js.native
class NotificationType[P, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple3[P, RO, _EM]] = js.native
}

