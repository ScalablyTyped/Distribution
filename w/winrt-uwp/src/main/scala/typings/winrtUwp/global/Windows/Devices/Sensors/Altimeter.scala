package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
abstract class Altimeter ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Altimeter
/* static members */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
object Altimeter extends js.Object {
  
  /**
    * Returns the default altimeter sensor.
    * @return The default altimeter.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Altimeter = js.native
}
