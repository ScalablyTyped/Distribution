package typings.winrtDashUwp.Windows.Services.Store

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.day
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.hour
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.minute
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.month
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.week
import typings.winrtDashUwp.Windows.Services.Store.StoreDurationUnit.year
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreDurationUnit with Double] = js.native
  /* 2 */ @js.native
  object day extends TopLevel[day with Double]
  
  /* 1 */ @js.native
  object hour extends TopLevel[hour with Double]
  
  /* 0 */ @js.native
  object minute extends TopLevel[minute with Double]
  
  /* 4 */ @js.native
  object month extends TopLevel[month with Double]
  
  /* 3 */ @js.native
  object week extends TopLevel[week with Double]
  
  /* 5 */ @js.native
  object year extends TopLevel[year with Double]
  
}

