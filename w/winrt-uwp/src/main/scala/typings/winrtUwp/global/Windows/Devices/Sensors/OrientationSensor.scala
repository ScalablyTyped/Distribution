package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
abstract class OrientationSensor ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.OrientationSensor
object OrientationSensor {
  
  @JSGlobal("Windows.Devices.Sensors.OrientationSensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.OrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.OrientationSensor]
  
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  /* static member */
  inline def getDefaultForRelativeReadings(): typings.winrtUwp.Windows.Devices.Sensors.OrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultForRelativeReadings")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.OrientationSensor]
}
