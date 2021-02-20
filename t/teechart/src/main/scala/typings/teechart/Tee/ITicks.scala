package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITicks extends StObject {
  
  var chart: IChart = js.native
  
  var length: Double = js.native
  
  var stroke: IStroke = js.native
  
  var visible: Boolean = js.native
}
object ITicks {
  
  @scala.inline
  def apply(chart: IChart, length: Double, stroke: IStroke, visible: Boolean): ITicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITicks]
  }
  
  @scala.inline
  implicit class ITicksMutableBuilder[Self <: ITicks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
