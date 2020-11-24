package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SensorType extends js.Object
/** Indicates the type of sensor. */
@JSGlobal("Windows.Devices.Sensors.SensorType")
@js.native
object SensorType extends js.Object {
  
  /** An Accelerometer . */
  @js.native
  sealed trait accelerometer extends SensorType
  
  /** An ActivitySensor . */
  @js.native
  sealed trait activitySensor extends SensorType
  
  /** A Barometer . */
  @js.native
  sealed trait barometer extends SensorType
  
  /** A Compass . */
  @js.native
  sealed trait compass extends SensorType
  
  /** A custom sensor. */
  @js.native
  sealed trait customSensor extends SensorType
  
  /** A Gyrometer . */
  @js.native
  sealed trait gyroscope extends SensorType
  
  /** An Inclinometer . */
  @js.native
  sealed trait inclinometer extends SensorType
  
  /** A LightSensor . */
  @js.native
  sealed trait lightSensor extends SensorType
  
  /** An OrientationSensor . */
  @js.native
  sealed trait orientationSensor extends SensorType
  
  /** A Pedometer . */
  @js.native
  sealed trait pedometer extends SensorType
  
  /** A ProximitySensor . */
  @js.native
  sealed trait proximitySensor extends SensorType
  
  /** A relative Inclinometer . */
  @js.native
  sealed trait relativeInclinometer extends SensorType
  
  /** A relative OrientationSensor . */
  @js.native
  sealed trait relativeOrientationSensor extends SensorType
  
  /** A SimpleOrientationSensor . */
  @js.native
  sealed trait simpleOrientationSensor extends SensorType
}
