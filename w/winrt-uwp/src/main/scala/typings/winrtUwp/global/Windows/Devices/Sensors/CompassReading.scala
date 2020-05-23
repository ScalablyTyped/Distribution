package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass reading. */
@JSGlobal("Windows.Devices.Sensors.CompassReading")
@js.native
abstract class CompassReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.CompassReading {
  /** Gets the compass's heading accuracy. */
  /* CompleteClass */
  override var headingAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  /** Gets the heading in degrees relative to magnetic-north. */
  /* CompleteClass */
  override var headingMagneticNorth: Double = js.native
  /** Gets the heading in degrees relative to geographic true-north. */
  /* CompleteClass */
  override var headingTrueNorth: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

