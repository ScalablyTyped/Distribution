package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SensorType extends StObject
/** Indicates the type of sensor. */
@JSGlobal("Windows.Devices.Sensors.SensorType")
@js.native
object SensorType extends StObject {
  
  /** An Accelerometer . */
  @js.native
  sealed trait accelerometer
    extends StObject
       with SensorType
  
  /** An ActivitySensor . */
  @js.native
  sealed trait activitySensor
    extends StObject
       with SensorType
  
  /** A Barometer . */
  @js.native
  sealed trait barometer
    extends StObject
       with SensorType
  
  /** A Compass . */
  @js.native
  sealed trait compass
    extends StObject
       with SensorType
  
  /** A custom sensor. */
  @js.native
  sealed trait customSensor
    extends StObject
       with SensorType
  
  /** A Gyrometer . */
  @js.native
  sealed trait gyroscope
    extends StObject
       with SensorType
  
  /** An Inclinometer . */
  @js.native
  sealed trait inclinometer
    extends StObject
       with SensorType
  
  /** A LightSensor . */
  @js.native
  sealed trait lightSensor
    extends StObject
       with SensorType
  
  /** An OrientationSensor . */
  @js.native
  sealed trait orientationSensor
    extends StObject
       with SensorType
  
  /** A Pedometer . */
  @js.native
  sealed trait pedometer
    extends StObject
       with SensorType
  
  /** A ProximitySensor . */
  @js.native
  sealed trait proximitySensor
    extends StObject
       with SensorType
  
  /** A relative Inclinometer . */
  @js.native
  sealed trait relativeInclinometer
    extends StObject
       with SensorType
  
  /** A relative OrientationSensor . */
  @js.native
  sealed trait relativeOrientationSensor
    extends StObject
       with SensorType
  
  /** A SimpleOrientationSensor . */
  @js.native
  sealed trait simpleOrientationSensor
    extends StObject
       with SensorType
}
