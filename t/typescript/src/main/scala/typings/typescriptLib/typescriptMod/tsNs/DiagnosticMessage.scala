package typings
package typescriptLib.typescriptMod.tsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("message")(message)
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary)
    __obj.asInstanceOf[DiagnosticMessage]
  }
}

