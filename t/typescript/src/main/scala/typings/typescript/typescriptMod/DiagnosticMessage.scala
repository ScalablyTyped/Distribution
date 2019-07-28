package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticMessage extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var key: String
  var message: String
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
}

object DiagnosticMessage {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    key: String,
    message: String,
    reportsUnnecessary: js.Object = null
  ): DiagnosticMessage = {
    val __obj = js.Dynamic.literal(category = category, code = code, key = key, message = message)
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary)
    __obj.asInstanceOf[DiagnosticMessage]
  }
}

