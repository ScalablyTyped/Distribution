package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlights extends js.Object {
  var fileName: String
  var highlightSpans: js.Array[HighlightSpan]
}

object DocumentHighlights {
  @scala.inline
  def apply(fileName: String, highlightSpans: js.Array[HighlightSpan]): DocumentHighlights = {
    val __obj = js.Dynamic.literal(fileName = fileName, highlightSpans = highlightSpans)
  
    __obj.asInstanceOf[DocumentHighlights]
  }
}

