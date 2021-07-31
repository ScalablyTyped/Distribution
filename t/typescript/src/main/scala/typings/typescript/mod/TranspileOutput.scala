package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranspileOutput extends StObject {
  
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  
  var outputText: java.lang.String
  
  var sourceMapText: js.UndefOr[java.lang.String] = js.undefined
}
object TranspileOutput {
  
  @scala.inline
  def apply(outputText: java.lang.String): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOutput]
  }
  
  @scala.inline
  implicit class TranspileOutputMutableBuilder[Self <: TranspileOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setOutputText(value: java.lang.String): Self = StObject.set(x, "outputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapText(value: java.lang.String): Self = StObject.set(x, "sourceMapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapTextUndefined: Self = StObject.set(x, "sourceMapText", js.undefined)
  }
}
