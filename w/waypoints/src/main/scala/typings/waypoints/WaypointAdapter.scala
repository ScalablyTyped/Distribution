package typings.waypoints

import typings.waypoints.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointAdapter extends StObject {
  
  def innerHeight(): Double = js.native
  
  def innerWidth(): Double = js.native
  
  def off(event: String): js.UndefOr[scala.Nothing] = js.native
  
  def offset(): Left = js.native
  
  def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  
  def outerHeight(includeMargin: Boolean): Double = js.native
  
  def outerWidth(includeMargin: Boolean): Double = js.native
  
  def scrollLeft(): Double = js.native
  
  def scrollTop(): Double = js.native
}
object WaypointAdapter {
  
  @scala.inline
  def apply(
    innerHeight: () => Double,
    innerWidth: () => Double,
    off: String => js.UndefOr[scala.Nothing],
    offset: () => Left,
    on: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing],
    outerHeight: Boolean => Double,
    outerWidth: Boolean => Double,
    scrollLeft: () => Double,
    scrollTop: () => Double
  ): WaypointAdapter = {
    val __obj = js.Dynamic.literal(innerHeight = js.Any.fromFunction0(innerHeight), innerWidth = js.Any.fromFunction0(innerWidth), off = js.Any.fromFunction1(off), offset = js.Any.fromFunction0(offset), on = js.Any.fromFunction2(on), outerHeight = js.Any.fromFunction1(outerHeight), outerWidth = js.Any.fromFunction1(outerWidth), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollTop = js.Any.fromFunction0(scrollTop))
    __obj.asInstanceOf[WaypointAdapter]
  }
  
  @scala.inline
  implicit class WaypointAdapterMutableBuilder[Self <: WaypointAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerHeight(value: () => Double): Self = StObject.set(x, "innerHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInnerWidth(value: () => Double): Self = StObject.set(x, "innerWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOff(value: String => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: () => Left): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOuterHeight(value: Boolean => Double): Self = StObject.set(x, "outerHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOuterWidth(value: Boolean => Double): Self = StObject.set(x, "outerWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollLeft(value: () => Double): Self = StObject.set(x, "scrollLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollTop(value: () => Double): Self = StObject.set(x, "scrollTop", js.Any.fromFunction0(value))
  }
}
