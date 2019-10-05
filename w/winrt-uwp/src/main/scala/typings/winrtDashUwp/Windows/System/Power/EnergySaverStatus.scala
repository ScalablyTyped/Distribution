package typings.winrtDashUwp.Windows.System.Power

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
  sealed trait disabled extends EnergySaverStatus
  
  /** Battery saver is off now, but ready to turn on automatically. */
  @js.native
  sealed trait off extends EnergySaverStatus
  
  /** Battery saver is on. Save energy where possible. */
  @js.native
  sealed trait on extends EnergySaverStatus
  
  /* 0 */ val disabled: typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.disabled with Double = js.native
  /* 1 */ val off: typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.off with Double = js.native
  /* 2 */ val on: typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnergySaverStatus with Double] = js.native
}

