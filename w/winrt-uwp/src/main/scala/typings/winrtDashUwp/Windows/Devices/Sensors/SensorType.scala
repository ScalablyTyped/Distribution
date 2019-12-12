package typings.winrtDashUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.accelerometer
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.activitySensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.barometer
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.compass
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.customSensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.gyroscope
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.inclinometer
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.lightSensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.orientationSensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.pedometer
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.proximitySensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.relativeInclinometer
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.relativeOrientationSensor
import typings.winrtDashUwp.Windows.Devices.Sensors.SensorType.simpleOrientationSensor
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SensorType with Double] = js.native
  /* 0 */ @js.native
  object accelerometer extends TopLevel[accelerometer with Double]
  
  /* 1 */ @js.native
  object activitySensor extends TopLevel[activitySensor with Double]
  
  /* 2 */ @js.native
  object barometer extends TopLevel[barometer with Double]
  
  /* 3 */ @js.native
  object compass extends TopLevel[compass with Double]
  
  /* 4 */ @js.native
  object customSensor extends TopLevel[customSensor with Double]
  
  /* 5 */ @js.native
  object gyroscope extends TopLevel[gyroscope with Double]
  
  /* 7 */ @js.native
  object inclinometer extends TopLevel[inclinometer with Double]
  
  /* 8 */ @js.native
  object lightSensor extends TopLevel[lightSensor with Double]
  
  /* 9 */ @js.native
  object orientationSensor extends TopLevel[orientationSensor with Double]
  
  /* 10 */ @js.native
  object pedometer extends TopLevel[pedometer with Double]
  
  /* 6 */ @js.native
  object proximitySensor extends TopLevel[proximitySensor with Double]
  
  /* 11 */ @js.native
  object relativeInclinometer extends TopLevel[relativeInclinometer with Double]
  
  /* 12 */ @js.native
  object relativeOrientationSensor extends TopLevel[relativeOrientationSensor with Double]
  
  /* 13 */ @js.native
  object simpleOrientationSensor extends TopLevel[simpleOrientationSensor with Double]
  
}

