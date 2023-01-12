package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.On
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDiagnosticMod {
  
  @JSImport("vscode-languageserver/lib/common/diagnostic", "DiagnosticFeature")
  @js.native
  val DiagnosticFeature: Feature[_Languages, DiagnosticFeatureShape] = js.native
  
  trait DiagnosticFeatureShape extends StObject {
    
    var diagnostics: On
  }
  object DiagnosticFeatureShape {
    
    inline def apply(diagnostics: On): DiagnosticFeatureShape = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticFeatureShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticFeatureShape] (val x: Self) extends AnyVal {
      
      inline def setDiagnostics(value: On): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    }
  }
}
