package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A linked list of formatted diagnostic messages to be used as part of a multiline message.
  * It is built from the bottom up, leaving the head to be the "main" diagnostic.
  * While it seems that DiagnosticMessageChain is structurally similar to DiagnosticMessage,
  * the difference is that messages are all preformatted in DMC.
  */
trait DiagnosticMessageChain extends js.Object {
  var category: DiagnosticCategory
  var code: scala.Double
  var messageText: java.lang.String
  var next: js.UndefOr[DiagnosticMessageChain] = js.undefined
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: scala.Double,
    messageText: java.lang.String,
    next: DiagnosticMessageChain = null
  ): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category, code = code, messageText = messageText)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
}

