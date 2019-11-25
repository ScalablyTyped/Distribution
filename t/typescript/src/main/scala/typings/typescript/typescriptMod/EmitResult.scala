package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitResult extends js.Object {
  /** Contains declaration emit diagnostics */
  var diagnostics: js.Array[Diagnostic]
  var emitSkipped: Boolean
  var emittedFiles: js.UndefOr[js.Array[String]] = js.undefined
}

object EmitResult {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], emitSkipped: Boolean, emittedFiles: js.Array[String] = null): EmitResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any])
    if (emittedFiles != null) __obj.updateDynamic("emittedFiles")(emittedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitResult]
  }
}

