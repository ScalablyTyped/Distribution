package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient-light sensor. */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
abstract class LightSensor ()
  extends typings.winrtUwp.Windows.Devices.Sensors.LightSensor
object LightSensor {
  
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.LightSensor.getDefault")
  @js.native
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.LightSensor = js.native
}
