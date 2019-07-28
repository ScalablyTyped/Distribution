package typings.tesseractDotJs.tesseractDotJsMod

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
    val __obj = js.Dynamic.literal(baseline = baseline, bbox = bbox, block = block, choices = choices, confidence = confidence, image = image, is_dropcap = is_dropcap, is_subscript = is_subscript, is_superscript = is_superscript, line = line, page = page, paragraph = paragraph, text = text, word = word)
  
    __obj.asInstanceOf[Symbol]
  }
}

