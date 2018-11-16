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
  
  val opacity: opacity with java.lang.String = js.native
  val scale: scale with java.lang.String = js.native
  val translation: translation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.PropertyAnimationType with java.lang.String
  ] = js.native
}

