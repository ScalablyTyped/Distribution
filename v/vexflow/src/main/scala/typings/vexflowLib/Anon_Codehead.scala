package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codehead extends js.Object {
  var code_head: js.UndefOr[java.lang.String] = js.undefined
  var dot_shiftY: scala.Double
  var flag: scala.Boolean
  var gracenote_stem_down_extension: scala.Double
  var gracenote_stem_up_extension: scala.Double
  var head_width: scala.Double
  var line_above: scala.Double
  var line_below: scala.Double
  var position: js.UndefOr[java.lang.String] = js.undefined
  var rest: js.UndefOr[scala.Boolean] = js.undefined
  var stem: scala.Boolean
  var stem_down_extension: scala.Double
  var stem_offset: scala.Double
  var stem_up_extension: scala.Double
  var tabnote_stem_down_extension: scala.Double
  var tabnote_stem_up_extension: scala.Double
}

object Anon_Codehead {
  @scala.inline
  def apply(
    dot_shiftY: scala.Double,
    flag: scala.Boolean,
    gracenote_stem_down_extension: scala.Double,
    gracenote_stem_up_extension: scala.Double,
    head_width: scala.Double,
    line_above: scala.Double,
    line_below: scala.Double,
    stem: scala.Boolean,
    stem_down_extension: scala.Double,
    stem_offset: scala.Double,
    stem_up_extension: scala.Double,
    tabnote_stem_down_extension: scala.Double,
    tabnote_stem_up_extension: scala.Double,
    code_head: java.lang.String = null,
    position: java.lang.String = null,
    rest: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Codehead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dot_shiftY")(dot_shiftY)
    __obj.updateDynamic("flag")(flag)
    __obj.updateDynamic("gracenote_stem_down_extension")(gracenote_stem_down_extension)
    __obj.updateDynamic("gracenote_stem_up_extension")(gracenote_stem_up_extension)
    __obj.updateDynamic("head_width")(head_width)
    __obj.updateDynamic("line_above")(line_above)
    __obj.updateDynamic("line_below")(line_below)
    __obj.updateDynamic("stem")(stem)
    __obj.updateDynamic("stem_down_extension")(stem_down_extension)
    __obj.updateDynamic("stem_offset")(stem_offset)
    __obj.updateDynamic("stem_up_extension")(stem_up_extension)
    __obj.updateDynamic("tabnote_stem_down_extension")(tabnote_stem_down_extension)
    __obj.updateDynamic("tabnote_stem_up_extension")(tabnote_stem_up_extension)
    if (code_head != null) __obj.updateDynamic("code_head")(code_head)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(rest)) __obj.updateDynamic("rest")(rest)
    __obj.asInstanceOf[Anon_Codehead]
  }
}

