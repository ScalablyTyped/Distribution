package typings
package tesseractDotJsLib.tesseractDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var blocktype: java.lang.String
  var confidence: scala.Double
  var lines: js.Array[Line]
  var page: Page
  var paragraphs: Paragraph
  var polygon: js.Any
  var symbols: js.Array[Symbol]
  var text: java.lang.String
  var words: js.Array[Word]
}

object Block {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    blocktype: java.lang.String,
    confidence: scala.Double,
    lines: js.Array[Line],
    page: Page,
    paragraphs: Paragraph,
    polygon: js.Any,
    symbols: js.Array[Symbol],
    text: java.lang.String,
    words: js.Array[Word]
  ): Block = {
    val __obj = js.Dynamic.literal(baseline = baseline, bbox = bbox, blocktype = blocktype, confidence = confidence, lines = lines, page = page, paragraphs = paragraphs, polygon = polygon, symbols = symbols, text = text, words = words)
  
    __obj.asInstanceOf[Block]
  }
}

