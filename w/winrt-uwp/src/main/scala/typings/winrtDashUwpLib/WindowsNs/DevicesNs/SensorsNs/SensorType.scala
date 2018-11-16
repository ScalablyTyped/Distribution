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
  
  val accelerometer: accelerometer with java.lang.String = js.native
  val activitySensor: activitySensor with java.lang.String = js.native
  val barometer: barometer with java.lang.String = js.native
  val compass: compass with java.lang.String = js.native
  val customSensor: customSensor with java.lang.String = js.native
  val gyroscope: gyroscope with java.lang.String = js.native
  val inclinometer: inclinometer with java.lang.String = js.native
  val lightSensor: lightSensor with java.lang.String = js.native
  val orientationSensor: orientationSensor with java.lang.String = js.native
  val pedometer: pedometer with java.lang.String = js.native
  val proximitySensor: proximitySensor with java.lang.String = js.native
  val relativeInclinometer: relativeInclinometer with java.lang.String = js.native
  val relativeOrientationSensor: relativeOrientationSensor with java.lang.String = js.native
  val simpleOrientationSensor: simpleOrientationSensor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorType with java.lang.String] = js.native
}

