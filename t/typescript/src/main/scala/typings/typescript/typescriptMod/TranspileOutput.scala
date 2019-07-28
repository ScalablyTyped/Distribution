package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranspileOutput extends js.Object {
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var outputText: String
  var sourceMapText: js.UndefOr[String] = js.undefined
}

object TranspileOutput {
  @scala.inline
  def apply(outputText: String, diagnostics: js.Array[Diagnostic] = null, sourceMapText: String = null): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (sourceMapText != null) __obj.updateDynamic("sourceMapText")(sourceMapText)
    __obj.asInstanceOf[TranspileOutput]
  }
}

