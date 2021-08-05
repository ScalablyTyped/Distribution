package typings.victory.mod

import typings.victory.anon.After
import typings.victory.anon.Before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatePropTypeInterface extends StObject {
  
  /**
    * Animation duration
    */
  var duration: Double
  
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[After] = js.undefined
  
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[Before] = js.undefined
  
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[After] = js.undefined
}
object AnimatePropTypeInterface {
  
  inline def apply(duration: Double): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
  
  extension [Self <: AnimatePropTypeInterface](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnEnter(value: After): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnExit(value: Before): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnLoad(value: After): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
  }
}
