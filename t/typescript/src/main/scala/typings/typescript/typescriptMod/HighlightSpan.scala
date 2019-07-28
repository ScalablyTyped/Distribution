package typings.typescript.typescriptMod

import typings.typescript.typescriptNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSpan extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var isInString: js.UndefOr[`true`] = js.undefined
  var kind: HighlightSpanKind
  var textSpan: TextSpan
}

object HighlightSpan {
  @scala.inline
  def apply(kind: HighlightSpanKind, textSpan: TextSpan, fileName: String = null, isInString: `true` = null): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind, textSpan = textSpan)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (isInString != null) __obj.updateDynamic("isInString")(isInString)
    __obj.asInstanceOf[HighlightSpan]
  }
}

