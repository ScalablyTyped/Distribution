package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetic sensor. */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
abstract class Magnetometer ()
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
  @scala.inline
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Magnetometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Magnetometer]
}
