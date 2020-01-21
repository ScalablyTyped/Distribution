package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticRelatedInformation extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var file: js.UndefOr[SourceFile] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var messageText: java.lang.String | DiagnosticMessageChain
  var start: js.UndefOr[Double] = js.undefined
}

object DiagnosticRelatedInformation {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    messageText: java.lang.String | DiagnosticMessageChain,
    file: SourceFile = null,
    length: Int | Double = null,
    start: Int | Double = null
  ): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
}

