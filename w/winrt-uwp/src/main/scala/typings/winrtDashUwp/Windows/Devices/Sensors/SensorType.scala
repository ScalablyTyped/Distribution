package typings.winrtDashUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val accelerometer: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.accelerometer with Double = js.native
  /* 1 */ val activitySensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.activitySensor with Double = js.native
  /* 2 */ val barometer: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.barometer with Double = js.native
  /* 3 */ val compass: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.compass with Double = js.native
  /* 4 */ val customSensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.customSensor with Double = js.native
  /* 5 */ val gyroscope: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.gyroscope with Double = js.native
  /* 7 */ val inclinometer: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.inclinometer with Double = js.native
  /* 8 */ val lightSensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.lightSensor with Double = js.native
  /* 9 */ val orientationSensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.orientationSensor with Double = js.native
  /* 10 */ val pedometer: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.pedometer with Double = js.native
  /* 6 */ val proximitySensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.proximitySensor with Double = js.native
  /* 11 */ val relativeInclinometer: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.relativeInclinometer with Double = js.native
  /* 12 */ val relativeOrientationSensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.relativeOrientationSensor with Double = js.native
  /* 13 */ val simpleOrientationSensor: typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.simpleOrientationSensor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SensorType with Double] = js.native
}

