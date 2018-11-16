package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StoreDurationUnit extends js.Object

/** Defines values that represent the units of a trial period or billing period for a subscription. */
@JSGlobal("Windows.Services.Store.StoreDurationUnit")
@js.native
object StoreDurationUnit extends js.Object {
  /** The period is defined in days. */
  @js.native
  sealed trait day
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /** The period is defined in hours. */
  @js.native
  sealed trait hour
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /** The period is defined in minutes. */
  @js.native
  sealed trait minute
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /** The period is defined in months. */
  @js.native
  sealed trait month
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /** The period is defined in weeks. */
  @js.native
  sealed trait week
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /** The period is defined in years. */
  @js.native
  sealed trait year
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit
  
  /* 2 */ val day: day with scala.Double = js.native
  /* 1 */ val hour: hour with scala.Double = js.native
  /* 0 */ val minute: minute with scala.Double = js.native
  /* 4 */ val month: month with scala.Double = js.native
  /* 3 */ val week: week with scala.Double = js.native
  /* 5 */ val year: year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit with scala.Double] = js.native
}

