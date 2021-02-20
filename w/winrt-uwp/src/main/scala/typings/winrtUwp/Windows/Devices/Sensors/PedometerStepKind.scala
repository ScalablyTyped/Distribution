package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PedometerStepKind extends StObject
/** The type of step taken according to the pedometer. */
@JSGlobal("Windows.Devices.Sensors.PedometerStepKind")
@js.native
object PedometerStepKind extends StObject {
  
  /** A running step. */
  @js.native
  sealed trait running extends PedometerStepKind
  
  /** An unknown step type. */
  @js.native
  sealed trait unknown extends PedometerStepKind
  
  /** A walking step. */
  @js.native
  sealed trait walking extends PedometerStepKind
}
