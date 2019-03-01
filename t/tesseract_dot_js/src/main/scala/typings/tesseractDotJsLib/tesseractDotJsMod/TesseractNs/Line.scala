package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var confidence: scala.Double
  var page: Page
  var paragraph: Paragraph
  var symbols: js.Array[Symbol]
  var text: java.lang.String
  var words: js.Array[Word]
}

object Line {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: scala.Double,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: java.lang.String,
    words: js.Array[Word]
  ): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("bbox")(bbox)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("confidence")(confidence)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Line]
  }
}

