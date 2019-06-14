package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

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
  sealed trait opacity
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  /** Animate the size of the object, magnifying or shrinking. The corresponding object is the ScaleAnimation . */
  @js.native
  sealed trait scale
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  /** Move the object. The corresponding object is the TranslationAnimation . */
  @js.native
  sealed trait translation
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  /* 2 */ val opacity: opacity with scala.Double = js.native
  /* 0 */ val scale: scale with scala.Double = js.native
  /* 1 */ val translation: translation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType with scala.Double
  ] = js.native
}

