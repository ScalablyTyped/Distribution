package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitOutput extends StObject {
  
  var emitSkipped: Boolean = js.native
  
  var outputFiles: js.Array[OutputFile] = js.native
}
object EmitOutput {
  
  @scala.inline
  def apply(emitSkipped: Boolean, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitSkipped = emitSkipped.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
  
  @scala.inline
  implicit class EmitOutputMutableBuilder[Self <: EmitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFiles(value: js.Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilesVarargs(value: OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value :_*))
  }
}
