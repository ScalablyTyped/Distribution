package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetometer reading. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerReading")
@js.native
abstract class MagnetometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.MagnetometerReading {
  
  /** Gets the magnetometer's directional accuracy. */
  /* CompleteClass */
  var directionalAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  
  /** Gets the magnetic field strength in microteslas along the X axis. */
  /* CompleteClass */
  var magneticFieldX: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  /* CompleteClass */
  var magneticFieldY: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  /* CompleteClass */
  var magneticFieldZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: Date = js.native
}
