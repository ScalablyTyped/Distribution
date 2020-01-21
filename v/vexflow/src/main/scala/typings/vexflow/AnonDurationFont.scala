package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationFont extends js.Object {
  var duration: String
  var font: js.UndefOr[AnonFamilySize] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var ignore_ticks: js.UndefOr[Boolean] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
  var subscript: js.UndefOr[Boolean] = js.undefined
  var superscript: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonDurationFont {
  @scala.inline
  def apply(
    duration: String,
    font: AnonFamilySize = null,
    glyph: String = null,
    ignore_ticks: js.UndefOr[Boolean] = js.undefined,
    line: Int | Double = null,
    smooth: js.UndefOr[Boolean] = js.undefined,
    subscript: js.UndefOr[Boolean] = js.undefined,
    superscript: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): AnonDurationFont = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_ticks)) __obj.updateDynamic("ignore_ticks")(ignore_ticks.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript.asInstanceOf[js.Any])
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationFont]
  }
}

