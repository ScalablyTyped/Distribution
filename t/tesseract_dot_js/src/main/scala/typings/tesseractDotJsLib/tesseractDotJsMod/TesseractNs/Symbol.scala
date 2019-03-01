package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var choices: js.Array[Choice]
  var confidence: scala.Double
  var image: js.Any
  var is_dropcap: scala.Boolean
  var is_subscript: scala.Boolean
  var is_superscript: scala.Boolean
  var line: Line
  var page: Page
  var paragraph: Paragraph
  var text: java.lang.String
  var word: Word
}

object Symbol {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: scala.Double,
    image: js.Any,
    is_dropcap: scala.Boolean,
    is_subscript: scala.Boolean,
    is_superscript: scala.Boolean,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    text: java.lang.String,
    word: Word
  ): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("bbox")(bbox)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("choices")(choices)
    __obj.updateDynamic("confidence")(confidence)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("is_dropcap")(is_dropcap)
    __obj.updateDynamic("is_subscript")(is_subscript)
    __obj.updateDynamic("is_superscript")(is_superscript)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[Symbol]
  }
}

