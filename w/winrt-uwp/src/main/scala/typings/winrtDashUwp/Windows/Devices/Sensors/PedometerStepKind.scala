package typings.winrtDashUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PedometerStepKind with Double] = js.native
  /* 2 */ @js.native
  object running extends TopLevel[running with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object walking extends TopLevel[walking with Double]
  
}

