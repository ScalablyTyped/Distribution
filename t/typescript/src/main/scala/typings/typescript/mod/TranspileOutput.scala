package typings.typescript.mod

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
    val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (sourceMapText != null) __obj.updateDynamic("sourceMapText")(sourceMapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOutput]
  }
}

