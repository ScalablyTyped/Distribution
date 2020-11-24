package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitResult extends js.Object {
  
  /** Contains declaration emit diagnostics */
  var diagnostics: js.Array[Diagnostic] = js.native
  
  var emitSkipped: Boolean = js.native
  
  var emittedFiles: js.UndefOr[js.Array[java.lang.String]] = js.native
}
object EmitResult {
  
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], emitSkipped: Boolean): EmitResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitResult]
  }
  
  @scala.inline
  implicit class EmitResultOps[Self <: EmitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitSkipped(value: Boolean): Self = this.set("emitSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedFilesVarargs(value: java.lang.String*): Self = this.set("emittedFiles", js.Array(value :_*))
    
    @scala.inline
    def setEmittedFiles(value: js.Array[java.lang.String]): Self = this.set("emittedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmittedFiles: Self = this.set("emittedFiles", js.undefined)
  }
}
