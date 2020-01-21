package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var choices: js.Array[Choice]
  var confidence: Double
  var image: js.Any
  var is_dropcap: Boolean
  var is_subscript: Boolean
  var is_superscript: Boolean
  var line: Line
  var page: Page
  var paragraph: Paragraph
  var text: String
  var word: Word
}

object Symbol {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    image: js.Any,
    is_dropcap: Boolean,
    is_subscript: Boolean,
    is_superscript: Boolean,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    text: String,
    word: Word
  ): Symbol = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], is_dropcap = is_dropcap.asInstanceOf[js.Any], is_subscript = is_subscript.asInstanceOf[js.Any], is_superscript = is_superscript.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Symbol]
  }
}

