package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITicks extends StObject {
  
  var chart: IChart
  
  var length: Double
  
  var stroke: IStroke
  
  var visible: Boolean
}
object ITicks {
  
  inline def apply(chart: IChart, length: Double, stroke: IStroke, visible: Boolean): ITicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITicks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITicks] (val x: Self) extends AnyVal {
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
