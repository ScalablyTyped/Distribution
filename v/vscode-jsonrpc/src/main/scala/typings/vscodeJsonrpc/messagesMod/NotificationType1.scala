package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "NotificationType1")
@js.native
open class NotificationType1[P1] protected () extends AbstractMessageSignature {
  def this(method: String) = this()
  def this(method: String, _parameterStructures: ParameterStructures) = this()
  
  /* private */ var _parameterStructures: Any = js.native
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple2[P1, _EM]] = js.native
  
  @JSName("parameterStructures")
  def parameterStructures_MNotificationType1: ParameterStructures = js.native
}
