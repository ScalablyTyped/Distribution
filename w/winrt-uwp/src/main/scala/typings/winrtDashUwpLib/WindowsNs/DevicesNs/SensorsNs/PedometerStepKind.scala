package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PedometerStepKind extends js.Object

/** The type of step taken according to the pedometer. */
@JSGlobal("Windows.Devices.Sensors.PedometerStepKind")
@js.native
object PedometerStepKind extends js.Object {
  /** A running step. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind
  
  /** An unknown step type. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind
  
  /** A walking step. */
  @js.native
  sealed trait walking
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind
  
  /* 2 */ val running: running with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 1 */ val walking: walking with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind with scala.Double
  ] = js.native
}

