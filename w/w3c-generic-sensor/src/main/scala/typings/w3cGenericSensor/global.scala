package typings.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbsoluteOrientationSensor")
  @js.native
  class AbsoluteOrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  // Accelerometer: https://www.w3.org/TR/accelerometer/
  @JSGlobal("Accelerometer")
  @js.native
  class Accelerometer ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("GravitySensor")
  @js.native
  class GravitySensor ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Gyroscope: https://www.w3.org/TR/gyroscope/
  @JSGlobal("Gyroscope")
  @js.native
  class Gyroscope ()
    extends typings.w3cGenericSensor.Gyroscope {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("LinearAccelerationSensor")
  @js.native
  class LinearAccelerationSensor ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Magnetometer: https://www.w3.org/TR/magnetometer/
  @JSGlobal("Magnetometer")
  @js.native
  class Magnetometer ()
    extends typings.w3cGenericSensor.Magnetometer {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("OrientationSensor")
  @js.native
  class OrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor
  
  @JSGlobal("RelativeOrientationSensor")
  @js.native
  class RelativeOrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("Sensor")
  @js.native
  class Sensor ()
    extends typings.w3cGenericSensor.Sensor
  
  @JSGlobal("SensorErrorEvent")
  @js.native
  class SensorErrorEvent protected ()
    extends typings.w3cGenericSensor.SensorErrorEvent {
    def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  }
  
  @JSGlobal("UncalibratedMagnetometer")
  @js.native
  class UncalibratedMagnetometer ()
    extends typings.w3cGenericSensor.UncalibratedMagnetometer {
    def this(options: SensorOptions) = this()
  }
}
