package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a simple orientation sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
open class SimpleOrientationSensor ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensor
object SimpleOrientationSensor {
  
  @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor or null if no simple orientation sensors are found.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensor]
}
