package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass sensor. */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
abstract class Compass ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Compass
object Compass {
  
  /**
    * Returns the default compass.
    * @return The default compass or null if no integrated compasses are found.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Compass.getDefault")
  @js.native
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Compass = js.native
}
