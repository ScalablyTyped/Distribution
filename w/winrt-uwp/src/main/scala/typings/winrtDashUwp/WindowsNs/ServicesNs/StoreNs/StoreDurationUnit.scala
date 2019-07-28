package typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs

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
  sealed trait day extends StoreDurationUnit
  
  /** The period is defined in hours. */
  @js.native
  sealed trait hour extends StoreDurationUnit
  
  /** The period is defined in minutes. */
  @js.native
  sealed trait minute extends StoreDurationUnit
  
  /** The period is defined in months. */
  @js.native
  sealed trait month extends StoreDurationUnit
  
  /** The period is defined in weeks. */
  @js.native
  sealed trait week extends StoreDurationUnit
  
  /** The period is defined in years. */
  @js.native
  sealed trait year extends StoreDurationUnit
  
  /* 2 */ val day: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.day with Double = js.native
  /* 1 */ val hour: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.hour with Double = js.native
  /* 0 */ val minute: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.minute with Double = js.native
  /* 4 */ val month: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.month with Double = js.native
  /* 3 */ val week: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.week with Double = js.native
  /* 5 */ val year: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreDurationUnit.year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreDurationUnit with Double] = js.native
}

