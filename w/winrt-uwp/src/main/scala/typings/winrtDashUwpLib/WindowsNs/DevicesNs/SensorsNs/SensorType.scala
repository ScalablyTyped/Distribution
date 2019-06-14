package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

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
  sealed trait accelerometer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** An ActivitySensor . */
  @js.native
  sealed trait activitySensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A Barometer . */
  @js.native
  sealed trait barometer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A Compass . */
  @js.native
  sealed trait compass
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A custom sensor. */
  @js.native
  sealed trait customSensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A Gyrometer . */
  @js.native
  sealed trait gyroscope
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** An Inclinometer . */
  @js.native
  sealed trait inclinometer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A LightSensor . */
  @js.native
  sealed trait lightSensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** An OrientationSensor . */
  @js.native
  sealed trait orientationSensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A Pedometer . */
  @js.native
  sealed trait pedometer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A ProximitySensor . */
  @js.native
  sealed trait proximitySensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A relative Inclinometer . */
  @js.native
  sealed trait relativeInclinometer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A relative OrientationSensor . */
  @js.native
  sealed trait relativeOrientationSensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /** A SimpleOrientationSensor . */
  @js.native
  sealed trait simpleOrientationSensor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType
  
  /* 0 */ val accelerometer: accelerometer with scala.Double = js.native
  /* 1 */ val activitySensor: activitySensor with scala.Double = js.native
  /* 2 */ val barometer: barometer with scala.Double = js.native
  /* 3 */ val compass: compass with scala.Double = js.native
  /* 4 */ val customSensor: customSensor with scala.Double = js.native
  /* 5 */ val gyroscope: gyroscope with scala.Double = js.native
  /* 7 */ val inclinometer: inclinometer with scala.Double = js.native
  /* 8 */ val lightSensor: lightSensor with scala.Double = js.native
  /* 9 */ val orientationSensor: orientationSensor with scala.Double = js.native
  /* 10 */ val pedometer: pedometer with scala.Double = js.native
  /* 6 */ val proximitySensor: proximitySensor with scala.Double = js.native
  /* 11 */ val relativeInclinometer: relativeInclinometer with scala.Double = js.native
  /* 12 */ val relativeOrientationSensor: relativeOrientationSensor with scala.Double = js.native
  /* 13 */ val simpleOrientationSensor: simpleOrientationSensor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType with scala.Double] = js.native
}

