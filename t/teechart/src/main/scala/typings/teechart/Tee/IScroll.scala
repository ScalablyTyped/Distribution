package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScroll extends StObject {
  
  var active: Boolean
  
  var chart: IChart
  
  var direction: String
  
  var enabled: Boolean
  
  var mouseButton: Double
  
  var position: IPoint
}
object IScroll {
  
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    direction: String,
    enabled: Boolean,
    mouseButton: Double,
    position: IPoint
  ): IScroll = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], mouseButton = mouseButton.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroll]
  }
  
  @scala.inline
  implicit class IScrollMutableBuilder[Self <: IScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseButton(value: Double): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: IPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
