package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CompileResult")
@js.native
class CompileResult () extends js.Object {
  var diagnostics: js.Array[Diagnostic] = js.native
  var outputFiles: js.Array[OutputFile] = js.native
}

/* static members */
@JSGlobal("TypeScript.CompileResult")
@js.native
object CompileResult extends js.Object {
  def fromDiagnostics(diagnostics: js.Array[Diagnostic]): CompileResult = js.native
  def fromOutputFiles(outputFiles: js.Array[OutputFile]): CompileResult = js.native
}

