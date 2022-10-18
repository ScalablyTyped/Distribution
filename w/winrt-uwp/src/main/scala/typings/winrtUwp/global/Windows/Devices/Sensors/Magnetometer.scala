package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetic sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
open class Magnetometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Magnetometer
object Magnetometer {
  
  @JSGlobal("Windows.Devices.Sensors.Magnetometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default magnetometer.
    * @return The default magnetometer.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Magnetometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Magnetometer]
}
