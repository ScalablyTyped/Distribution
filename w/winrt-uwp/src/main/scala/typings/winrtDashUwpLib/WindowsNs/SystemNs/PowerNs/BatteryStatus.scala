package typings
package winrtDashUwpLib.WindowsNs.SystemNs.PowerNs

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
  sealed trait charging
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus
  
  /** The battery is discharging. */
  @js.native
  sealed trait discharging
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus
  
  /** The battery is idle. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus
  
  /** The battery or battery controller is not present. */
  @js.native
  sealed trait notPresent
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus
  
  /* 3 */ val charging: charging with scala.Double = js.native
  /* 1 */ val discharging: discharging with scala.Double = js.native
  /* 2 */ val idle: idle with scala.Double = js.native
  /* 0 */ val notPresent: notPresent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus with scala.Double] = js.native
}

