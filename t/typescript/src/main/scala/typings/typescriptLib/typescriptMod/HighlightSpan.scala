package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSpan extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var isInString: js.UndefOr[typescriptLib.typescriptLibNumbers.`true`] = js.undefined
  var kind: HighlightSpanKind
  var textSpan: TextSpan
}

object HighlightSpan {
  @scala.inline
  def apply(
    kind: HighlightSpanKind,
    textSpan: TextSpan,
    fileName: java.lang.String = null,
    isInString: typescriptLib.typescriptLibNumbers.`true` = null
  ): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind, textSpan = textSpan)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (isInString != null) __obj.updateDynamic("isInString")(isInString)
    __obj.asInstanceOf[HighlightSpan]
  }
}

