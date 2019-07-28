package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

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
  sealed trait running extends PedometerStepKind
  
  /** An unknown step type. */
  @js.native
  sealed trait unknown extends PedometerStepKind
  
  /** A walking step. */
  @js.native
  sealed trait walking extends PedometerStepKind
  
  /* 2 */ val running: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind.running with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind.unknown with Double = js.native
  /* 1 */ val walking: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.PedometerStepKind.walking with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PedometerStepKind with Double] = js.native
}

