package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticServerCancellationData extends StObject {
  
  var retriggerRequest: Boolean
}
object DiagnosticServerCancellationData {
  
  inline def apply(retriggerRequest: Boolean): DiagnosticServerCancellationData = {
    val __obj = js.Dynamic.literal(retriggerRequest = retriggerRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticServerCancellationData]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DiagnosticServerCancellationData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.diagnostic.DiagnosticServerCancellationData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.diagnostic.DiagnosticServerCancellationData */ Boolean]
  
  extension [Self <: DiagnosticServerCancellationData](x: Self) {
    
    inline def setRetriggerRequest(value: Boolean): Self = StObject.set(x, "retriggerRequest", value.asInstanceOf[js.Any])
  }
}
