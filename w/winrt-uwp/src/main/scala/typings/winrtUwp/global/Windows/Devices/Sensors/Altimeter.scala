package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
open class Altimeter ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Altimeter
object Altimeter {
  
  @JSGlobal("Windows.Devices.Sensors.Altimeter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default altimeter sensor.
    * @return The default altimeter.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Altimeter = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Altimeter]
}
