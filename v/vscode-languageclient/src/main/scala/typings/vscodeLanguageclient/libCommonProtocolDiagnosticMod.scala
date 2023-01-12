package typings.vscodeLanguageclient

import typings.vscode.mod.Diagnostic
import typings.vscode.mod.DiagnosticSeverity
import typings.vscode.mod.Range
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDiagnosticMod {
  
  trait DiagnosticCode extends StObject {
    
    var target: String
    
    var value: String | Double
  }
  object DiagnosticCode {
    
    inline def apply(target: String, value: String | Double): DiagnosticCode = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticCode]
    }
    
    @JSImport("vscode-languageclient/lib/common/protocolDiagnostic", "DiagnosticCode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def is(value: Any): /* is vscode-languageclient.vscode-languageclient/lib/common/protocolDiagnostic.DiagnosticCode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageclient.vscode-languageclient/lib/common/protocolDiagnostic.DiagnosticCode */ Boolean]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticCode] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("vscode-languageclient/lib/common/protocolDiagnostic", "ProtocolDiagnostic")
  @js.native
  open class ProtocolDiagnostic protected () extends Diagnostic {
    def this(range: Range, message: String, severity: DiagnosticSeverity) = this()
    def this(range: Range, message: String, severity: DiagnosticSeverity, data: LSPAny) = this()
    
    val data: js.UndefOr[LSPAny] = js.native
    
    var hasDiagnosticCode: Boolean = js.native
  }
}
