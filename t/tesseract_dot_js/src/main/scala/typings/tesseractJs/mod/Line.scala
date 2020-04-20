package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var confidence: Double
  var page: Page
  var paragraph: Paragraph
  var symbols: js.Array[Symbol]
  var text: String
  var words: js.Array[Word]
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
}

