package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundWorkCostValue
  
  /** Background resource usage is low. The background task can do work. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundWorkCostValue
  
  /** Background resources are in use, but the background task can do some work. */
  @js.native
  sealed trait medium
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundWorkCostValue
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundWorkCostValue with scala.Double
  ] = js.native
}

