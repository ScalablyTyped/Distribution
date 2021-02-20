package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitOutput extends StObject {
  
  var emitOutputResult: EmitOutputResult = js.native
  
  var outputFiles: js.Array[OutputFile] = js.native
}
object EmitOutput {
  
  @scala.inline
  def apply(emitOutputResult: EmitOutputResult, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitOutputResult = emitOutputResult.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
  
  @scala.inline
  implicit class EmitOutputMutableBuilder[Self <: EmitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitOutputResult(value: EmitOutputResult): Self = StObject.set(x, "emitOutputResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFiles(value: js.Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilesVarargs(value: OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value :_*))
  }
}
