package typings
package winrtDashUwpLib.WindowsNs.SystemNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnergySaverStatus extends js.Object

/** Specifies the status of battery saver. */
@JSGlobal("Windows.System.Power.EnergySaverStatus")
@js.native
object EnergySaverStatus extends js.Object {
  /** Battery saver is off permanently or the device is plugged in. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.EnergySaverStatus
  
  /** Battery saver is off now, but ready to turn on automatically. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.EnergySaverStatus
  
  /** Battery saver is on. Save energy where possible. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.EnergySaverStatus
  
  /* 0 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val off: off with scala.Double = js.native
  /* 2 */ val on: on with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.EnergySaverStatus with scala.Double] = js.native
}

