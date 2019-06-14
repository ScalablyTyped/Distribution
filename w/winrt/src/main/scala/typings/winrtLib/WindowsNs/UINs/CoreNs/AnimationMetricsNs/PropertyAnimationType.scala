package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyAnimationType extends js.Object

@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends js.Object {
  @js.native
  sealed trait opacity
    extends winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  @js.native
  sealed trait scale
    extends winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  @js.native
  sealed trait translation
    extends winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType
  
  /* 2 */ val opacity: opacity with scala.Double = js.native
  /* 0 */ val scale: scale with scala.Double = js.native
  /* 1 */ val translation: translation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType with scala.Double
  ] = js.native
}

