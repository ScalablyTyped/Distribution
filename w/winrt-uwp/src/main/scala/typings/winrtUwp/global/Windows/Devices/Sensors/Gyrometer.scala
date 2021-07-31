package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
abstract class Gyrometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Gyrometer
object Gyrometer {
  
  @JSGlobal("Windows.Devices.Sensors.Gyrometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default gyrometer.
    * @return The default gyrometer or null if no integrated gyrometers are found.
    */
  /* static member */
  @scala.inline
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Gyrometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Gyrometer]
}
