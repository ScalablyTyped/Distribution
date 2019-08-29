package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticMessageChain extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var messageText: String
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.undefined
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    messageText: String,
    next: js.Array[DiagnosticMessageChain] = null
  ): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category, code = code, messageText = messageText)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
}

