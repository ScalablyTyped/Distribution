package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
abstract class Accelerometer ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Accelerometer
object Accelerometer {
  
  /**
    * Returns the default accelerometer.
    * @return The default accelerometer or null if no integrated accelerometers are found.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Accelerometer.getDefault")
  @js.native
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Accelerometer = js.native
}
