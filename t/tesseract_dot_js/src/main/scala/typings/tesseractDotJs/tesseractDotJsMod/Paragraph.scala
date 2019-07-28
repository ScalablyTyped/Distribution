package typings.tesseractDotJs.tesseractDotJsMod

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
    val __obj = js.Dynamic.literal(baseline = baseline, bbox = bbox, block = block, confidence = confidence, is_ltr = is_ltr, lines = lines, page = page, symbols = symbols, text = text, words = words)
  
    __obj.asInstanceOf[Paragraph]
  }
}

