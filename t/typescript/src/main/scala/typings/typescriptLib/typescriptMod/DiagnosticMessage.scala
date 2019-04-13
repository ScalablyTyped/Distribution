package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticMessage extends js.Object {
  var category: DiagnosticCategory
  var code: scala.Double
  var key: java.lang.String
  var message: java.lang.String
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
}

object DiagnosticMessage {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: scala.Double,
    key: java.lang.String,
    message: java.lang.String,
    reportsUnnecessary: js.Object = null
  ): DiagnosticMessage = {
    val __obj = js.Dynamic.literal(category = category, code = code, key = key, message = message)
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary)
    __obj.asInstanceOf[DiagnosticMessage]
  }
}

