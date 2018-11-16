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
  
  val running: running with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val walking: walking with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind with java.lang.String
  ] = js.native
}

