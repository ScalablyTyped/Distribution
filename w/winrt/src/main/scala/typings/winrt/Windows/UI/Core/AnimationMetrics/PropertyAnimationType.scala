package typings.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyAnimationType extends js.Object

@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends js.Object {
  @js.native
  sealed trait opacity extends PropertyAnimationType
  
  @js.native
  sealed trait scale extends PropertyAnimationType
  
  @js.native
  sealed trait translation extends PropertyAnimationType
  
  /* 2 */ val opacity: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
  /* 0 */ val scale: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
  /* 1 */ val translation: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyAnimationType with Double] = js.native
}

