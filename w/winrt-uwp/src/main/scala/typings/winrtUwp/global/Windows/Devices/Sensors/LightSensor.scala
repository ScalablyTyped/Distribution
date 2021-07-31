package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient-light sensor. */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
abstract class LightSensor ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.LightSensor
object LightSensor {
  
  @JSGlobal("Windows.Devices.Sensors.LightSensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  /* static member */
  @scala.inline
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.LightSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.LightSensor]
}
