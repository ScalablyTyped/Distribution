package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
open class Compass ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Compass
object Compass {
  
  @JSGlobal("Windows.Devices.Sensors.Compass")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default compass.
    * @return The default compass or null if no integrated compasses are found.
    */
  /* static member */
  inline def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Compass = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sensors.Compass]
}
