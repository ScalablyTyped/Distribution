package typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyAnimationType extends js.Object

/** Specifies the animation type represented by a PropertyAnimation object. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends js.Object {
  /** Animate the object's transparency. The corresponding object is the OpacityAnimation . */
  @js.native
  sealed trait opacity extends PropertyAnimationType
  
  /** Animate the size of the object, magnifying or shrinking. The corresponding object is the ScaleAnimation . */
  @js.native
  sealed trait scale extends PropertyAnimationType
  
  /** Move the object. The corresponding object is the TranslationAnimation . */
  @js.native
  sealed trait translation extends PropertyAnimationType
  
  /* 2 */ val opacity: typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
  /* 0 */ val scale: typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
  /* 1 */ val translation: typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyAnimationType with Double] = js.native
}

