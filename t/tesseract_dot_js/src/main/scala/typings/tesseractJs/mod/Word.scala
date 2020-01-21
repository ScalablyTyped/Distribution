package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Word extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var choices: js.Array[Choice]
  var confidence: Double
  var direction: String
  var font_id: Double
  var font_name: String
  var font_size: Double
  var in_dictionary: Boolean
  var is_bold: Boolean
  var is_italic: Boolean
  var is_monospace: Boolean
  var is_numeric: Boolean
  var is_serif: Boolean
  var is_smallcaps: Boolean
  var is_underlined: Boolean
  var language: String
  var line: Line
  var page: Page
  var paragraph: Paragraph
  var symbols: js.Array[Symbol]
  var text: String
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
}

