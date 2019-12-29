package typings.winrt.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyAnimationType with Double] = js.native
  /* 2 */ @js.native
  object opacity extends TopLevel[opacity with Double]
  
  /* 0 */ @js.native
  object scale extends TopLevel[scale with Double]
  
  /* 1 */ @js.native
  object translation extends TopLevel[translation with Double]
  
}

