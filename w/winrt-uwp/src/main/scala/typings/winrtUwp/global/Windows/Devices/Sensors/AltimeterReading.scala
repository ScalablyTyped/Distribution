package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an altimeter reading. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReading")
@js.native
abstract class AltimeterReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.AltimeterReading {
  /** Gets the current altitude determined by the altimeter sensor. */
  /* CompleteClass */
  override var altitudeChangeInMeters: Double = js.native
  /** Gets the time for the most recent altimeter reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

