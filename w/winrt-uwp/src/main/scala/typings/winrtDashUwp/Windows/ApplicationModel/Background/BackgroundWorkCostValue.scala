package typings.winrtDashUwp.Windows.ApplicationModel.Background

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
  
  /* 2 */ val high: typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.high with Double = js.native
  /* 0 */ val low: typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.low with Double = js.native
  /* 1 */ val medium: typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.medium with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundWorkCostValue with Double] = js.native
}

