package typings.victory.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryAnimationProps extends StObject {
  
  /**
    * The child of should be a function that takes an object of tweened values and returns a component to render.
    * @param style
    */
  var children: js.UndefOr[js.Function1[/* style */ AnimationStyle, ReactElement]] = js.undefined
  
  /**
    * The data prop specifies the latest set of values to tween to.
    * When this prop changes, VictoryAnimation will begin animating from the current value to the new value.
    * When given an array of values, VictoryAnimation will use it as an animation queue.
    * @default {}
    */
  var data: js.UndefOr[AnimationData] = js.undefined
  
  /**
    * The delay prop specifies a delay in milliseconds before the animation begins.
    * If multiple values are in the animation queue, it is the delay between each animation.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds the animation should take to complete.
    * @default 1000
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  
  /**
    * The onEnd prop specifies a function to run when the animation ends. If multiple animations are in the queue, it is called after the last animation.
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object VictoryAnimationProps {
  
  inline def apply(): VictoryAnimationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryAnimationProps]
  }
  
  extension [Self <: VictoryAnimationProps](x: Self) {
    
    inline def setChildren(value: /* style */ AnimationStyle => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setData(value: AnimationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: AnimationStyle*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
  }
}
