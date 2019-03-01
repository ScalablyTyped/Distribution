package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitResult extends js.Object {
  /** Contains declaration emit diagnostics */
  var diagnostics: js.Array[Diagnostic]
  var emitSkipped: scala.Boolean
  var emittedFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object EmitResult {
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    emitSkipped: scala.Boolean,
    emittedFiles: js.Array[java.lang.String] = null
  ): EmitResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagnostics")(diagnostics)
    __obj.updateDynamic("emitSkipped")(emitSkipped)
    if (emittedFiles != null) __obj.updateDynamic("emittedFiles")(emittedFiles)
    __obj.asInstanceOf[EmitResult]
  }
}

