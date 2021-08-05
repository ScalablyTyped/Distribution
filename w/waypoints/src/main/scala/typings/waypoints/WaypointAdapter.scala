package typings.waypoints

import typings.waypoints.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointAdapter extends StObject {
  
  def innerHeight(): Double
  
  def innerWidth(): Double
  
  def off(event: String): Unit
  
  def offset(): Left
  
  def on(event: String, handler: js.Function0[Unit]): Unit
  
  def outerHeight(includeMargin: Boolean): Double
  
  def outerWidth(includeMargin: Boolean): Double
  
  def scrollLeft(): Double
  
  def scrollTop(): Double
}
object WaypointAdapter {
  
  inline def apply(
    innerHeight: () => Double,
    innerWidth: () => Double,
    off: String => Unit,
    offset: () => Left,
    on: (String, js.Function0[Unit]) => Unit,
    outerHeight: Boolean => Double,
    outerWidth: Boolean => Double,
    scrollLeft: () => Double,
    scrollTop: () => Double
  ): WaypointAdapter = {
    val __obj = js.Dynamic.literal(innerHeight = js.Any.fromFunction0(innerHeight), innerWidth = js.Any.fromFunction0(innerWidth), off = js.Any.fromFunction1(off), offset = js.Any.fromFunction0(offset), on = js.Any.fromFunction2(on), outerHeight = js.Any.fromFunction1(outerHeight), outerWidth = js.Any.fromFunction1(outerWidth), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollTop = js.Any.fromFunction0(scrollTop))
    __obj.asInstanceOf[WaypointAdapter]
  }
  
  extension [Self <: WaypointAdapter](x: Self) {
    
    inline def setInnerHeight(value: () => Double): Self = StObject.set(x, "innerHeight", js.Any.fromFunction0(value))
    
    inline def setInnerWidth(value: () => Double): Self = StObject.set(x, "innerWidth", js.Any.fromFunction0(value))
    
    inline def setOff(value: String => Unit): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
    
    inline def setOffset(value: () => Left): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    inline def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOuterHeight(value: Boolean => Double): Self = StObject.set(x, "outerHeight", js.Any.fromFunction1(value))
    
    inline def setOuterWidth(value: Boolean => Double): Self = StObject.set(x, "outerWidth", js.Any.fromFunction1(value))
    
    inline def setScrollLeft(value: () => Double): Self = StObject.set(x, "scrollLeft", js.Any.fromFunction0(value))
    
    inline def setScrollTop(value: () => Double): Self = StObject.set(x, "scrollTop", js.Any.fromFunction0(value))
  }
}
