package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var confidence: scala.Double
  var is_ltr: scala.Boolean
  var lines: js.Array[Line]
  var page: Page
  var symbols: js.Array[Symbol]
  var text: java.lang.String
  var words: js.Array[Word]
}

object Paragraph {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: scala.Double,
    is_ltr: scala.Boolean,
    lines: js.Array[Line],
    page: Page,
    symbols: js.Array[Symbol],
    text: java.lang.String,
    words: js.Array[Word]
  ): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("bbox")(bbox)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("confidence")(confidence)
    __obj.updateDynamic("is_ltr")(is_ltr)
    __obj.updateDynamic("lines")(lines)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Paragraph]
  }
}

