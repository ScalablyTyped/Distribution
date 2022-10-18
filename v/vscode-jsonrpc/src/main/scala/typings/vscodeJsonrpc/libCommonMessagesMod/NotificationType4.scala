package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "NotificationType4")
@js.native
open class NotificationType4[P1, P2, P3, P4] protected () extends AbstractMessageSignature {
  def this(method: String) = this()
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple5[P1, P2, P3, P4, _EM]] = js.native
}
