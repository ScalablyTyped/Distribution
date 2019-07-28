package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

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
  
  /* 0 */ val accelerometer: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.accelerometer with Double = js.native
  /* 1 */ val activitySensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.activitySensor with Double = js.native
  /* 2 */ val barometer: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.barometer with Double = js.native
  /* 3 */ val compass: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.compass with Double = js.native
  /* 4 */ val customSensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.customSensor with Double = js.native
  /* 5 */ val gyroscope: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.gyroscope with Double = js.native
  /* 7 */ val inclinometer: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.inclinometer with Double = js.native
  /* 8 */ val lightSensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.lightSensor with Double = js.native
  /* 9 */ val orientationSensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.orientationSensor with Double = js.native
  /* 10 */ val pedometer: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.pedometer with Double = js.native
  /* 6 */ val proximitySensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.proximitySensor with Double = js.native
  /* 11 */ val relativeInclinometer: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.relativeInclinometer with Double = js.native
  /* 12 */ val relativeOrientationSensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.relativeOrientationSensor with Double = js.native
  /* 13 */ val simpleOrientationSensor: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SensorType.simpleOrientationSensor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SensorType with Double] = js.native
}

