package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsdiag {
  
  @JSImport("vscode-languageclient", "vsdiag.DocumentDiagnosticReportKind")
  @js.native
  object DocumentDiagnosticReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind & String
      ] = js.native
    
    /* "full" */ val full: typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.full & String = js.native
    
    /* "unChanged" */ val unChanged: typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.unChanged & String = js.native
  }
}
