package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "RequestType")
@js.native
open class RequestType[P, R, E] protected () extends AbstractMessageSignature {
  def this(method: String) = this()
  def this(method: String, _parameterStructures: ParameterStructures) = this()
  
  /* private */ var _parameterStructures: Any = js.native
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple4[P, R, E, _EM]] = js.native
  
  @JSName("parameterStructures")
  def parameterStructures_MRequestType: ParameterStructures = js.native
}
