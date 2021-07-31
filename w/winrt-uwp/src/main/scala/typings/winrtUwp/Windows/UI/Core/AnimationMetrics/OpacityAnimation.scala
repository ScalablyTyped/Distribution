package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
trait OpacityAnimation extends StObject {
  
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control1: Point
  
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control2: Point
  
  /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double
  
  /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
  var duration: Double
  
  /** Gets the object's final opacity. */
  var finalOpacity: Double
  
  /** Gets the object's initial opacity. */
  var initialOpacity: Double
  
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType
}
object OpacityAnimation {
  
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): OpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityAnimation]
  }
  
  @scala.inline
  implicit class OpacityAnimationMutableBuilder[Self <: OpacityAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl1(value: Point): Self = StObject.set(x, "control1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl2(value: Point): Self = StObject.set(x, "control2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalOpacity(value: Double): Self = StObject.set(x, "finalOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialOpacity(value: Double): Self = StObject.set(x, "initialOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyAnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
