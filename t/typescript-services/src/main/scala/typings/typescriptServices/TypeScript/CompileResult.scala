package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileResult extends StObject {
  
  var diagnostics: js.Array[Diagnostic] = js.native
  
  var outputFiles: js.Array[OutputFile] = js.native
}
object CompileResult {
  
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], outputFiles: js.Array[OutputFile]): CompileResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileResult]
  }
  
  @scala.inline
  implicit class CompileResultMutableBuilder[Self <: CompileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setOutputFiles(value: js.Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilesVarargs(value: OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value :_*))
  }
}
