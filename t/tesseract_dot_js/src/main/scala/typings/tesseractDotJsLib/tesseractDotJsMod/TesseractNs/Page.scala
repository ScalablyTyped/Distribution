package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var blocks: js.Array[Block]
  var confidence: scala.Double
  var html: java.lang.String
  var lines: js.Array[Line]
  var oem: java.lang.String
  var paragraphs: js.Array[Paragraph]
  var psm: java.lang.String
  var symbols: js.Array[Symbol]
  var text: java.lang.String
  var version: java.lang.String
  var words: js.Array[Word]
}

object Page {
  @scala.inline
  def apply(
    blocks: js.Array[Block],
    confidence: scala.Double,
    html: java.lang.String,
    lines: js.Array[Line],
    oem: java.lang.String,
    paragraphs: js.Array[Paragraph],
    psm: java.lang.String,
    symbols: js.Array[Symbol],
    text: java.lang.String,
    version: java.lang.String,
    words: js.Array[Word]
  ): Page = {
    val __obj = js.Dynamic.literal(blocks = blocks, confidence = confidence, html = html, lines = lines, oem = oem, paragraphs = paragraphs, psm = psm, symbols = symbols, text = text, version = version, words = words)
  
    __obj.asInstanceOf[Page]
  }
}

