package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Word extends js.Object {
  var baseline: Baseline
  var bbox: Bbox
  var block: Block
  var choices: js.Array[Choice]
  var confidence: scala.Double
  var direction: java.lang.String
  var font_id: scala.Double
  var font_name: java.lang.String
  var font_size: scala.Double
  var in_dictionary: scala.Boolean
  var is_bold: scala.Boolean
  var is_italic: scala.Boolean
  var is_monospace: scala.Boolean
  var is_numeric: scala.Boolean
  var is_serif: scala.Boolean
  var is_smallcaps: scala.Boolean
  var is_underlined: scala.Boolean
  var language: java.lang.String
  var line: Line
  var page: Page
  var paragraph: Paragraph
  var symbols: js.Array[Symbol]
  var text: java.lang.String
}

object Word {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: scala.Double,
    direction: java.lang.String,
    font_id: scala.Double,
    font_name: java.lang.String,
    font_size: scala.Double,
    in_dictionary: scala.Boolean,
    is_bold: scala.Boolean,
    is_italic: scala.Boolean,
    is_monospace: scala.Boolean,
    is_numeric: scala.Boolean,
    is_serif: scala.Boolean,
    is_smallcaps: scala.Boolean,
    is_underlined: scala.Boolean,
    language: java.lang.String,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: java.lang.String
  ): Word = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("bbox")(bbox)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("choices")(choices)
    __obj.updateDynamic("confidence")(confidence)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("font_id")(font_id)
    __obj.updateDynamic("font_name")(font_name)
    __obj.updateDynamic("font_size")(font_size)
    __obj.updateDynamic("in_dictionary")(in_dictionary)
    __obj.updateDynamic("is_bold")(is_bold)
    __obj.updateDynamic("is_italic")(is_italic)
    __obj.updateDynamic("is_monospace")(is_monospace)
    __obj.updateDynamic("is_numeric")(is_numeric)
    __obj.updateDynamic("is_serif")(is_serif)
    __obj.updateDynamic("is_smallcaps")(is_smallcaps)
    __obj.updateDynamic("is_underlined")(is_underlined)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Word]
  }
}

