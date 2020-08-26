package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileResult extends js.Object {
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
  implicit class CompileResultOps[Self <: CompileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFilesVarargs(value: OutputFile*): Self = this.set("outputFiles", js.Array(value :_*))
    @scala.inline
    def setOutputFiles(value: js.Array[OutputFile]): Self = this.set("outputFiles", value.asInstanceOf[js.Any])
  }
  
}

