package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-native.react-native.Animated.TimingAnimationConfig, 'toValue' | keyof react-native.react-native.Animated.AnimationConfig> */
trait OmitTimingAnimationConfig extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
}
object OmitTimingAnimationConfig {
  
  inline def apply(): OmitTimingAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTimingAnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTimingAnimationConfig] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* value */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
