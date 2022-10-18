package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.CompassReading")
@js.native
open class CompassReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.CompassReading {
  
  /** Gets the compass's heading accuracy. */
  /* CompleteClass */
  var headingAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  
  /** Gets the heading in degrees relative to magnetic-north. */
  /* CompleteClass */
  var headingMagneticNorth: Double = js.native
  
  /** Gets the heading in degrees relative to geographic true-north. */
  /* CompleteClass */
  var headingTrueNorth: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
