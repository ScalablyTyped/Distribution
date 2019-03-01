package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticRelatedInformation extends js.Object {
  var category: DiagnosticCategory
  var code: scala.Double
  var file: js.UndefOr[SourceFile]
  var length: js.UndefOr[scala.Double]
  var messageText: java.lang.String | DiagnosticMessageChain
  var start: js.UndefOr[scala.Double]
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: scala.Double,
    messageText: java.lang.String | DiagnosticMessageChain,
    file: SourceFile = null,
    length: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

