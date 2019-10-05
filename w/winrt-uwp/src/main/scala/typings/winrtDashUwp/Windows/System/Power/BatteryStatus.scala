package typings.winrtDashUwp.Windows.System.Power

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BatteryStatus extends js.Object

/** Indicates the status of the battery. */
@JSGlobal("Windows.System.Power.BatteryStatus")
@js.native
object BatteryStatus extends js.Object {
  /** The battery is charging. */
  @js.native
  sealed trait charging extends BatteryStatus
  
  /** The battery is discharging. */
  @js.native
  sealed trait discharging extends BatteryStatus
  
  /** The battery is idle. */
  @js.native
  sealed trait idle extends BatteryStatus
  
  /** The battery or battery controller is not present. */
  @js.native
  sealed trait notPresent extends BatteryStatus
  
  /* 3 */ val charging: typings.winrtDashUwp.Windows.System.Power.BatteryStatus.charging with Double = js.native
  /* 1 */ val discharging: typings.winrtDashUwp.Windows.System.Power.BatteryStatus.discharging with Double = js.native
  /* 2 */ val idle: typings.winrtDashUwp.Windows.System.Power.BatteryStatus.idle with Double = js.native
  /* 0 */ val notPresent: typings.winrtDashUwp.Windows.System.Power.BatteryStatus.notPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BatteryStatus with Double] = js.native
}

