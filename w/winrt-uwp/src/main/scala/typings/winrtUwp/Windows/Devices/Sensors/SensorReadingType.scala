package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SensorReadingType extends StObject
/** Specifies the sensor reading type. */
@JSGlobal("Windows.Devices.Sensors.SensorReadingType")
@js.native
object SensorReadingType extends StObject {
  
  /** The sensor reading type is absolute. */
  @js.native
  sealed trait absolute
    extends StObject
       with SensorReadingType
  
  /** The sensor reading type is relative. */
  @js.native
  sealed trait relative
    extends StObject
       with SensorReadingType
}
