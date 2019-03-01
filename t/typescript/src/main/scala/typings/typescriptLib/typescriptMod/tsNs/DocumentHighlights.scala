package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlights extends js.Object {
  var fileName: java.lang.String
  var highlightSpans: js.Array[HighlightSpan]
}

object DocumentHighlights {
  @scala.inline
  def apply(fileName: java.lang.String, highlightSpans: js.Array[HighlightSpan]): DocumentHighlights = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("highlightSpans")(highlightSpans)
    __obj.asInstanceOf[DocumentHighlights]
  }
}

