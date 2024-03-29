package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITool extends StObject {
  
  var active: Boolean
  
  var chart: IChart
  
  def clicked(p: IPoint): Boolean
  
  def draw(): Unit
  
  def mousedown(event: Any): Boolean
  
  def mousemove(event: Any): Boolean
}
object ITool {
  
  inline def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove))
    __obj.asInstanceOf[ITool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITool] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setClicked(value: IPoint => Boolean): Self = StObject.set(x, "clicked", js.Any.fromFunction1(value))
    
    inline def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setMousedown(value: Any => Boolean): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
    
    inline def setMousemove(value: Any => Boolean): Self = StObject.set(x, "mousemove", js.Any.fromFunction1(value))
  }
}
