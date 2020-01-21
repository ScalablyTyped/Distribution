package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticMessage extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var key: java.lang.String
  var message: java.lang.String
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
}

object DiagnosticMessage {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    key: java.lang.String,
    message: java.lang.String,
    reportsUnnecessary: js.Object = null
  ): DiagnosticMessage = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessage]
  }
}

