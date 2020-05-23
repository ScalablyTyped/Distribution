package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReading")
@js.native
abstract class ProximitySensorReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading {
  /** Gets the distance from the proximity sensor to the detected object. */
  /* CompleteClass */
  override var distanceInMillimeters: Double = js.native
  /** Gets whether or not an object is detected by the proximity sensor. */
  /* CompleteClass */
  override var isDetected: Boolean = js.native
  /** Gets the time for the most recent proximity sensor reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

