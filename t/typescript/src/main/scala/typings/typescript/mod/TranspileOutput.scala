package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranspileOutput extends js.Object {
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  var outputText: java.lang.String = js.native
  var sourceMapText: js.UndefOr[java.lang.String] = js.native
}

object TranspileOutput {
  @scala.inline
  def apply(outputText: java.lang.String): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOutput]
  }
  @scala.inline
  implicit class TranspileOutputOps[Self <: TranspileOutput] (val x: Self) extends AnyVal {
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
    def setOutputText(value: java.lang.String): Self = this.set("outputText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setSourceMapText(value: java.lang.String): Self = this.set("sourceMapText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapText: Self = this.set("sourceMapText", js.undefined)
  }
  
}

