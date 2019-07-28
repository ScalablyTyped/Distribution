package typings.tesseractDotJs.tesseractDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var blocks: js.Array[Block]
  var confidence: Double
  var html: String
  var lines: js.Array[Line]
  var oem: String
  var paragraphs: js.Array[Paragraph]
  var psm: String
  var symbols: js.Array[Symbol]
  var text: String
  var version: String
  var words: js.Array[Word]
}

object Page {
  @scala.inline
  def apply(
    blocks: js.Array[Block],
    confidence: Double,
    html: String,
    lines: js.Array[Line],
    oem: String,
    paragraphs: js.Array[Paragraph],
    psm: String,
    symbols: js.Array[Symbol],
    text: String,
    version: String,
    words: js.Array[Word]
  ): Page = {
    val __obj = js.Dynamic.literal(blocks = blocks, confidence = confidence, html = html, lines = lines, oem = oem, paragraphs = paragraphs, psm = psm, symbols = symbols, text = text, version = version, words = words)
  
    __obj.asInstanceOf[Page]
  }
}

