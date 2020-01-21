package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticMessageChain extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var messageText: java.lang.String
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.undefined
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    messageText: java.lang.String,
    next: js.Array[DiagnosticMessageChain] = null
  ): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
}

