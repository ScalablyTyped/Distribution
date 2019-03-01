package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrowheadangle extends js.Object {
  var arrowhead_angle: scala.Double
  var arrowhead_length: scala.Double
  var color: java.lang.String
  var draw_end_arrow: scala.Boolean
  var draw_start_arrow: scala.Boolean
  var line_dash: js.Array[scala.Double]
  var line_width: scala.Double
  var padding_left: scala.Double
  var padding_right: scala.Double
  var rounded_end: scala.Boolean
  var text_justification: vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification
  var text_position_vertical: vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
}

object Anon_Arrowheadangle {
  @scala.inline
  def apply(
    arrowhead_angle: scala.Double,
    arrowhead_length: scala.Double,
    color: java.lang.String,
    draw_end_arrow: scala.Boolean,
    draw_start_arrow: scala.Boolean,
    line_dash: js.Array[scala.Double],
    line_width: scala.Double,
    padding_left: scala.Double,
    padding_right: scala.Double,
    rounded_end: scala.Boolean,
    text_justification: vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification,
    text_position_vertical: vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
  ): Anon_Arrowheadangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowhead_angle")(arrowhead_angle)
    __obj.updateDynamic("arrowhead_length")(arrowhead_length)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("draw_end_arrow")(draw_end_arrow)
    __obj.updateDynamic("draw_start_arrow")(draw_start_arrow)
    __obj.updateDynamic("line_dash")(line_dash)
    __obj.updateDynamic("line_width")(line_width)
    __obj.updateDynamic("padding_left")(padding_left)
    __obj.updateDynamic("padding_right")(padding_right)
    __obj.updateDynamic("rounded_end")(rounded_end)
    __obj.updateDynamic("text_justification")(text_justification)
    __obj.updateDynamic("text_position_vertical")(text_position_vertical)
    __obj.asInstanceOf[Anon_Arrowheadangle]
  }
}

