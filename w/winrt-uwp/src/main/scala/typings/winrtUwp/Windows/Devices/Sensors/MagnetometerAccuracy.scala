package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagnetometerAccuracy extends StObject
/** The sensor's accuracy. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerAccuracy")
@js.native
object MagnetometerAccuracy extends StObject {
  
  /** The actual and reported values differ but may be accurate enough for some application. */
  @js.native
  sealed trait approximate
    extends StObject
       with MagnetometerAccuracy
  
  /** The actual and reported values are accurate. */
  @js.native
  sealed trait high
    extends StObject
       with MagnetometerAccuracy
  
  /** The accuracy is currently not available, typically because the driver can't report it. */
  @js.native
  sealed trait unknown
    extends StObject
       with MagnetometerAccuracy
  
  /** The actual and reported values have a high degree of inaccuracy. */
  @js.native
  sealed trait unreliable
    extends StObject
       with MagnetometerAccuracy
}
