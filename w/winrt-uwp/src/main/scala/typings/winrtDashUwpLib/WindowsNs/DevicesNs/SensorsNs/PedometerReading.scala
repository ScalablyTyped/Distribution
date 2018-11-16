package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a pedometer reading. */
@JSGlobal("Windows.Devices.Sensors.PedometerReading")
@js.native
abstract class PedometerReading () extends js.Object {
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: scala.Double = js.native
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: scala.Double = js.native
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind = js.native
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: stdLib.Date = js.native
}

