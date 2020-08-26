package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a pedometer reading. */
@js.native
trait PedometerReading extends js.Object {
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: Double = js.native
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: Double = js.native
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind = js.native
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: Date = js.native
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
  @scala.inline
  implicit class PedometerReadingOps[Self <: PedometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCumulativeSteps(value: Double): Self = this.set("cumulativeSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCumulativeStepsDuration(value: Double): Self = this.set("cumulativeStepsDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepKind(value: PedometerStepKind): Self = this.set("stepKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

