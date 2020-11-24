package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messages", "RequestType7")
@js.native
class RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple11[P1, P2, P3, P4, P5, P6, P7, R, E, RO, _EM]] = js.native
}
