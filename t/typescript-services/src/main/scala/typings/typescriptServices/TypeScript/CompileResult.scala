package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileResult extends js.Object {
  var diagnostics: js.Array[Diagnostic]
  var outputFiles: js.Array[OutputFile]
}

object CompileResult {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], outputFiles: js.Array[OutputFile]): CompileResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileResult]
  }
}

