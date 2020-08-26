package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word extends js.Object {
  var baseline: Baseline = js.native
  var bbox: Bbox = js.native
  var block: Block = js.native
  var choices: js.Array[Choice] = js.native
  var confidence: Double = js.native
  var direction: String = js.native
  var font_id: Double = js.native
  var font_name: String = js.native
  var font_size: Double = js.native
  var in_dictionary: Boolean = js.native
  var is_bold: Boolean = js.native
  var is_italic: Boolean = js.native
  var is_monospace: Boolean = js.native
  var is_numeric: Boolean = js.native
  var is_serif: Boolean = js.native
  var is_smallcaps: Boolean = js.native
  var is_underlined: Boolean = js.native
  var language: String = js.native
  var line: Line = js.native
  var page: Page = js.native
  var paragraph: Paragraph = js.native
  var symbols: js.Array[Symbol] = js.native
  var text: String = js.native
}

object Word {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    direction: String,
    font_id: Double,
    font_name: String,
    font_size: Double,
    in_dictionary: Boolean,
    is_bold: Boolean,
    is_italic: Boolean,
    is_monospace: Boolean,
    is_numeric: Boolean,
    is_serif: Boolean,
    is_smallcaps: Boolean,
    is_underlined: Boolean,
    language: String,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: String
  ): Word = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], font_id = font_id.asInstanceOf[js.Any], font_name = font_name.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], in_dictionary = in_dictionary.asInstanceOf[js.Any], is_bold = is_bold.asInstanceOf[js.Any], is_italic = is_italic.asInstanceOf[js.Any], is_monospace = is_monospace.asInstanceOf[js.Any], is_numeric = is_numeric.asInstanceOf[js.Any], is_serif = is_serif.asInstanceOf[js.Any], is_smallcaps = is_smallcaps.asInstanceOf[js.Any], is_underlined = is_underlined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
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
    def setChoicesVarargs(value: Choice*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[Choice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont_id(value: Double): Self = this.set("font_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont_name(value: String): Self = this.set("font_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont_size(value: Double): Self = this.set("font_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setIn_dictionary(value: Boolean): Self = this.set("in_dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_bold(value: Boolean): Self = this.set("is_bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_italic(value: Boolean): Self = this.set("is_italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_monospace(value: Boolean): Self = this.set("is_monospace", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_numeric(value: Boolean): Self = this.set("is_numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_serif(value: Boolean): Self = this.set("is_serif", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_smallcaps(value: Boolean): Self = this.set("is_smallcaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_underlined(value: Boolean): Self = this.set("is_underlined", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
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
  }
  
}

