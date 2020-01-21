package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var confidence: Double
  var is_ltr: Boolean
  var lines: js.Array[Line]
  var page: Page
  var symbols: js.Array[Symbol]
  var text: String
  var words: js.Array[Word]
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
}

