package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes properties of animations that are common to all animation effects. */
@js.native
trait IPropertyAnimation extends StObject {
  
  /** Gets the location of the first control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control1: Point = js.native
  
  /** Gets the location of the second control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control2: Point = js.native
  
  /** Gets the amount of time between when the animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  
  /** Gets the amount of time over which the animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}
object IPropertyAnimation {
  
  @scala.inline
  def apply(control1: Point, control2: Point, delay: Double, duration: Double, `type`: PropertyAnimationType): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyAnimation]
  }
  
  @scala.inline
  implicit class IPropertyAnimationMutableBuilder[Self <: IPropertyAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl1(value: Point): Self = StObject.set(x, "control1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl2(value: Point): Self = StObject.set(x, "control2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyAnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
