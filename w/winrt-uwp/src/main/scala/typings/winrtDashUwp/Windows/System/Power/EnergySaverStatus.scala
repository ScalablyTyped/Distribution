package typings.winrtDashUwp.Windows.System.Power

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.disabled
import typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.off
import typings.winrtDashUwp.Windows.System.Power.EnergySaverStatus.on
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnergySaverStatus with Double] = js.native
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 2 */ @js.native
  object on extends TopLevel[on with Double]
  
}

