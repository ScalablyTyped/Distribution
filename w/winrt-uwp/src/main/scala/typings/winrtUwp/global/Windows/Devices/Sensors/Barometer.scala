package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
abstract class Barometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Barometer
object Barometer {
  
  @JSGlobal("Windows.Devices.Sensors.Barometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default barometer sensor.
    * @return The default barometer.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Barometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Barometer]
}
