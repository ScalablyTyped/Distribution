package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticServerCapabilities extends StObject {
  
  var diagnosticProvider: js.UndefOr[DiagnosticOptions] = js.undefined
}
object DiagnosticServerCapabilities {
  
  inline def apply(): DiagnosticServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticServerCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticServerCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDiagnosticProvider(value: DiagnosticOptions): Self = StObject.set(x, "diagnosticProvider", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticProviderUndefined: Self = StObject.set(x, "diagnosticProvider", js.undefined)
  }
}
