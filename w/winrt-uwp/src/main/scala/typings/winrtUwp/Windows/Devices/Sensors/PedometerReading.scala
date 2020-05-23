package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a pedometer reading. */
trait PedometerReading extends js.Object {
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: Double
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: Double
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: Date
}

object PedometerReading {
  @scala.inline
  def apply(
    cumulativeSteps: Double,
    cumulativeStepsDuration: Double,
    stepKind: PedometerStepKind,
    timestamp: Date
  ): PedometerReading = {
    val __obj = js.Dynamic.literal(cumulativeSteps = cumulativeSteps.asInstanceOf[js.Any], cumulativeStepsDuration = cumulativeStepsDuration.asInstanceOf[js.Any], stepKind = stepKind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReading]
  }
}

