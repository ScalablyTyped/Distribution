package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodehead extends js.Object {
  var code_head: js.UndefOr[String] = js.undefined
  var dot_shiftY: Double
  var flag: Boolean
  var gracenote_stem_down_extension: Double
  var gracenote_stem_up_extension: Double
  var head_width: Double
  var line_above: Double
  var line_below: Double
  var position: js.UndefOr[String] = js.undefined
  var rest: js.UndefOr[Boolean] = js.undefined
  var stem: Boolean
  var stem_down_extension: Double
  var stem_offset: Double
  var stem_up_extension: Double
  var tabnote_stem_down_extension: Double
  var tabnote_stem_up_extension: Double
}

object AnonCodehead {
  @scala.inline
  def apply(
    dot_shiftY: Double,
    flag: Boolean,
    gracenote_stem_down_extension: Double,
    gracenote_stem_up_extension: Double,
    head_width: Double,
    line_above: Double,
    line_below: Double,
    stem: Boolean,
    stem_down_extension: Double,
    stem_offset: Double,
    stem_up_extension: Double,
    tabnote_stem_down_extension: Double,
    tabnote_stem_up_extension: Double,
    code_head: String = null,
    position: String = null,
    rest: js.UndefOr[Boolean] = js.undefined
  ): AnonCodehead = {
    val __obj = js.Dynamic.literal(dot_shiftY = dot_shiftY.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], gracenote_stem_down_extension = gracenote_stem_down_extension.asInstanceOf[js.Any], gracenote_stem_up_extension = gracenote_stem_up_extension.asInstanceOf[js.Any], head_width = head_width.asInstanceOf[js.Any], line_above = line_above.asInstanceOf[js.Any], line_below = line_below.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], stem_down_extension = stem_down_extension.asInstanceOf[js.Any], stem_offset = stem_offset.asInstanceOf[js.Any], stem_up_extension = stem_up_extension.asInstanceOf[js.Any], tabnote_stem_down_extension = tabnote_stem_down_extension.asInstanceOf[js.Any], tabnote_stem_up_extension = tabnote_stem_up_extension.asInstanceOf[js.Any])
    if (code_head != null) __obj.updateDynamic("code_head")(code_head.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rest)) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodehead]
  }
}

