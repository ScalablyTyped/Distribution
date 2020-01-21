package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "RequestType")
@js.native
class RequestType[P, R, E, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple5[P, R, E, RO, _EM]] = js.native
}

