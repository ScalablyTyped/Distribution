package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHighlights extends js.Object {
  var fileName: java.lang.String = js.native
  var highlightSpans: js.Array[HighlightSpan] = js.native
}

object DocumentHighlights {
  @scala.inline
  def apply(fileName: java.lang.String, highlightSpans: js.Array[HighlightSpan]): DocumentHighlights = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], highlightSpans = highlightSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlights]
  }
  @scala.inline
  implicit class DocumentHighlightsOps[Self <: DocumentHighlights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightSpansVarargs(value: HighlightSpan*): Self = this.set("highlightSpans", js.Array(value :_*))
    @scala.inline
    def setHighlightSpans(value: js.Array[HighlightSpan]): Self = this.set("highlightSpans", value.asInstanceOf[js.Any])
  }
  
}

