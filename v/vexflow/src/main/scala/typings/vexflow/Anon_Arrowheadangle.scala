package typings.vexflow

import typings.vexflow.Vex.Flow.StaveLine.TextJustification
import typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrowheadangle extends js.Object {
  var arrowhead_angle: Double
  var arrowhead_length: Double
  var color: String
  var draw_end_arrow: Boolean
  var draw_start_arrow: Boolean
  var line_dash: js.Array[Double]
  var line_width: Double
  var padding_left: Double
  var padding_right: Double
  var rounded_end: Boolean
  var text_justification: TextJustification
  var text_position_vertical: TextVerticalPosition
}

object Anon_Arrowheadangle {
  @scala.inline
  def apply(
    arrowhead_angle: Double,
    arrowhead_length: Double,
    color: String,
    draw_end_arrow: Boolean,
    draw_start_arrow: Boolean,
    line_dash: js.Array[Double],
    line_width: Double,
    padding_left: Double,
    padding_right: Double,
    rounded_end: Boolean,
    text_justification: TextJustification,
    text_position_vertical: TextVerticalPosition
  ): Anon_Arrowheadangle = {
    val __obj = js.Dynamic.literal(arrowhead_angle = arrowhead_angle.asInstanceOf[js.Any], arrowhead_length = arrowhead_length.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], draw_end_arrow = draw_end_arrow.asInstanceOf[js.Any], draw_start_arrow = draw_start_arrow.asInstanceOf[js.Any], line_dash = line_dash.asInstanceOf[js.Any], line_width = line_width.asInstanceOf[js.Any], padding_left = padding_left.asInstanceOf[js.Any], padding_right = padding_right.asInstanceOf[js.Any], rounded_end = rounded_end.asInstanceOf[js.Any], text_justification = text_justification.asInstanceOf[js.Any], text_position_vertical = text_position_vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arrowheadangle]
  }
}

