package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
abstract class Accelerometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Accelerometer
object Accelerometer {
  
  @JSGlobal("Windows.Devices.Sensors.Accelerometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default accelerometer.
    * @return The default accelerometer or null if no integrated accelerometers are found.
    */
  /* static member */
  @scala.inline
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Accelerometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Accelerometer]
}
