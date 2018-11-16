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
  
  val opacity: opacity with java.lang.String = js.native
  val scale: scale with java.lang.String = js.native
  val translation: translation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType with java.lang.String
  ] = js.native
}

