package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paragraph extends js.Object {
  var baseline: Baseline = js.native
  var bbox: Bbox = js.native
  var block: Block = js.native
  var confidence: Double = js.native
  var is_ltr: Boolean = js.native
  var lines: js.Array[Line] = js.native
  var page: Page = js.native
  var symbols: js.Array[Symbol] = js.native
  var text: String = js.native
  var words: js.Array[Word] = js.native
}

object Paragraph {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: Double,
    is_ltr: Boolean,
    lines: js.Array[Line],
    page: Page,
    symbols: js.Array[Symbol],
    text: String,
    words: js.Array[Word]
  ): Paragraph = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], is_ltr = is_ltr.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
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
    def setIs_ltr(value: Boolean): Self = this.set("is_ltr", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Page): Self = this.set("page", value.asInstanceOf[js.Any])
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

