package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranspileOutput extends js.Object {
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var outputText: java.lang.String
  var sourceMapText: js.UndefOr[java.lang.String] = js.undefined
}

object TranspileOutput {
  @scala.inline
  def apply(
    outputText: java.lang.String,
    diagnostics: js.Array[Diagnostic] = null,
    sourceMapText: java.lang.String = null
  ): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (sourceMapText != null) __obj.updateDynamic("sourceMapText")(sourceMapText)
    __obj.asInstanceOf[TranspileOutput]
  }
}

