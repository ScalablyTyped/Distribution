package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
abstract class Inclinometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Inclinometer
object Inclinometer {
  
  @JSGlobal("Windows.Devices.Sensors.Inclinometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  /* static member */
  @scala.inline
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Inclinometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Inclinometer]
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  /* static member */
  @scala.inline
  def getDefaultForRelativeReadings(): typings.winrtUwp.Windows.Devices.Sensors.Inclinometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultForRelativeReadings")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Inclinometer]
}
