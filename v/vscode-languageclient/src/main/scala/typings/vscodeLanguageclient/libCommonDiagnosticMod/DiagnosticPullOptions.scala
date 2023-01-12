package typings.vscodeLanguageclient.libCommonDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticPullOptions extends StObject {
  
  var diagnosticPullOptions: js.UndefOr[DiagnosticPullOptions_] = js.undefined
}
object DiagnosticPullOptions {
  
  inline def apply(): DiagnosticPullOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticPullOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticPullOptions] (val x: Self) extends AnyVal {
    
    inline def setDiagnosticPullOptions(value: DiagnosticPullOptions_): Self = StObject.set(x, "diagnosticPullOptions", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticPullOptionsUndefined: Self = StObject.set(x, "diagnosticPullOptions", js.undefined)
  }
}
