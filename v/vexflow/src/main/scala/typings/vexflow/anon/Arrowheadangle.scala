package typings.vexflow.anon

import typings.vexflow.Vex.Flow.StaveLine.TextJustification
import typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrowheadangle extends StObject {
  
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
object Arrowheadangle {
  
  inline def apply(
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
  ): Arrowheadangle = {
    val __obj = js.Dynamic.literal(arrowhead_angle = arrowhead_angle.asInstanceOf[js.Any], arrowhead_length = arrowhead_length.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], draw_end_arrow = draw_end_arrow.asInstanceOf[js.Any], draw_start_arrow = draw_start_arrow.asInstanceOf[js.Any], line_dash = line_dash.asInstanceOf[js.Any], line_width = line_width.asInstanceOf[js.Any], padding_left = padding_left.asInstanceOf[js.Any], padding_right = padding_right.asInstanceOf[js.Any], rounded_end = rounded_end.asInstanceOf[js.Any], text_justification = text_justification.asInstanceOf[js.Any], text_position_vertical = text_position_vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrowheadangle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrowheadangle] (val x: Self) extends AnyVal {
    
    inline def setArrowhead_angle(value: Double): Self = StObject.set(x, "arrowhead_angle", value.asInstanceOf[js.Any])
    
    inline def setArrowhead_length(value: Double): Self = StObject.set(x, "arrowhead_length", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDraw_end_arrow(value: Boolean): Self = StObject.set(x, "draw_end_arrow", value.asInstanceOf[js.Any])
    
    inline def setDraw_start_arrow(value: Boolean): Self = StObject.set(x, "draw_start_arrow", value.asInstanceOf[js.Any])
    
    inline def setLine_dash(value: js.Array[Double]): Self = StObject.set(x, "line_dash", value.asInstanceOf[js.Any])
    
    inline def setLine_dashVarargs(value: Double*): Self = StObject.set(x, "line_dash", js.Array(value*))
    
    inline def setLine_width(value: Double): Self = StObject.set(x, "line_width", value.asInstanceOf[js.Any])
    
    inline def setPadding_left(value: Double): Self = StObject.set(x, "padding_left", value.asInstanceOf[js.Any])
    
    inline def setPadding_right(value: Double): Self = StObject.set(x, "padding_right", value.asInstanceOf[js.Any])
    
    inline def setRounded_end(value: Boolean): Self = StObject.set(x, "rounded_end", value.asInstanceOf[js.Any])
    
    inline def setText_justification(value: TextJustification): Self = StObject.set(x, "text_justification", value.asInstanceOf[js.Any])
    
    inline def setText_position_vertical(value: TextVerticalPosition): Self = StObject.set(x, "text_position_vertical", value.asInstanceOf[js.Any])
  }
}
