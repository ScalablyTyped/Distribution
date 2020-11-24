package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class AbsoluteOrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  // Accelerometer: https://www.w3.org/TR/accelerometer/
  @js.native
  class Accelerometer ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class GravitySensor ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Gyroscope: https://www.w3.org/TR/gyroscope/
  @js.native
  class Gyroscope ()
    extends typings.w3cGenericSensor.Gyroscope {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class LinearAccelerationSensor ()
    extends typings.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Magnetometer: https://www.w3.org/TR/magnetometer/
  @js.native
  class Magnetometer ()
    extends typings.w3cGenericSensor.Magnetometer {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class OrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor
  
  @js.native
  class RelativeOrientationSensor ()
    extends typings.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class Sensor ()
    extends typings.w3cGenericSensor.Sensor
  
  @js.native
  class SensorErrorEvent protected ()
    extends typings.w3cGenericSensor.SensorErrorEvent {
    def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  }
  
  @js.native
  class UncalibratedMagnetometer ()
    extends typings.w3cGenericSensor.UncalibratedMagnetometer {
    def this(options: SensorOptions) = this()
  }
}
