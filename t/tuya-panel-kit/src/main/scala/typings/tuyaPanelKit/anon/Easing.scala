package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}
object Easing {
  
  @scala.inline
  def apply(): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Easing]
  }
  
  @scala.inline
  implicit class EasingMutableBuilder[Self <: Easing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
  }
}
