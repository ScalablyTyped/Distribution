package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  var baseline: Baseline = js.native
  var bbox: Bbox = js.native
  var block: Block = js.native
  var confidence: Double = js.native
  var page: Page = js.native
  var paragraph: Paragraph = js.native
  var symbols: js.Array[Symbol] = js.native
  var text: String = js.native
  var words: js.Array[Word] = js.native
}

object Line {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: Double,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: String,
    words: js.Array[Word]
  ): Line = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseline(value: Baseline): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbox(value: Bbox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Page): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraph(value: Paragraph): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolsVarargs(value: Symbol*): Self = this.set("symbols", js.Array(value :_*))
    @scala.inline
    def setSymbols(value: js.Array[Symbol]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[Word]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

