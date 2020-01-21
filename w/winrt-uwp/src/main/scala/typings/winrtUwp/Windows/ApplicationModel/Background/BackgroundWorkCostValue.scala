package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundWorkCostValue extends js.Object

/** Indicates the current cost of doing background work. Used as a hint to background tasks about how much work they can do. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCostValue")
@js.native
object BackgroundWorkCostValue extends js.Object {
  /** Background resources are under heavy use and the background task should not do any work. */
  @js.native
  sealed trait high extends BackgroundWorkCostValue
  
  /** Background resource usage is low. The background task can do work. */
  @js.native
  sealed trait low extends BackgroundWorkCostValue
  
  /** Background resources are in use, but the background task can do some work. */
  @js.native
  sealed trait medium extends BackgroundWorkCostValue
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundWorkCostValue with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

