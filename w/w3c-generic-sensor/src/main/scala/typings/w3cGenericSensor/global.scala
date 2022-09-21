package typings.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbsoluteOrientationSensor")
  @js.native
  open class AbsoluteOrientationSensor ()
    extends StObject
       with typings.w3cGenericSensor.OrientationSensor {
    def this(options: MotionSensorOptions) = this()
  }
  
  // Accelerometer: https://www.w3.org/TR/accelerometer/
  @JSGlobal("Accelerometer")
  @js.native
  open class Accelerometer ()
    extends StObject
       with typings.w3cGenericSensor.Accelerometer {
    def this(options: MotionSensorOptions) = this()
  }
  
  // Ambient Light Sensor: https://www.w3.org/TR/ambient-light/
  @JSGlobal("AmbientLightSensor")
  @js.native
  open class AmbientLightSensor ()
    extends StObject
       with typings.w3cGenericSensor.AmbientLightSensor {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("GravitySensor")
  @js.native
  open class GravitySensor ()
    extends StObject
       with typings.w3cGenericSensor.Accelerometer {
    def this(options: MotionSensorOptions) = this()
  }
  
  // Gyroscope: https://www.w3.org/TR/gyroscope/
  @JSGlobal("Gyroscope")
  @js.native
  open class Gyroscope ()
    extends StObject
       with typings.w3cGenericSensor.Gyroscope {
    def this(options: MotionSensorOptions) = this()
  }
  
  @JSGlobal("LinearAccelerationSensor")
  @js.native
  open class LinearAccelerationSensor ()
    extends StObject
       with typings.w3cGenericSensor.Accelerometer {
    def this(options: MotionSensorOptions) = this()
  }
  
  // Magnetometer: https://www.w3.org/TR/magnetometer/
  @JSGlobal("Magnetometer")
  @js.native
  open class Magnetometer ()
    extends StObject
       with typings.w3cGenericSensor.Magnetometer {
    def this(options: MotionSensorOptions) = this()
  }
  
  @JSGlobal("OrientationSensor")
  @js.native
  open class OrientationSensor ()
    extends StObject
       with typings.w3cGenericSensor.OrientationSensor
  
  @JSGlobal("RelativeOrientationSensor")
  @js.native
  open class RelativeOrientationSensor ()
    extends StObject
       with typings.w3cGenericSensor.OrientationSensor {
    def this(options: MotionSensorOptions) = this()
  }
  
  @JSGlobal("Sensor")
  @js.native
  open class Sensor ()
    extends StObject
       with typings.w3cGenericSensor.Sensor
  
  @JSGlobal("SensorErrorEvent")
  @js.native
  open class SensorErrorEvent protected ()
    extends StObject
       with typings.w3cGenericSensor.SensorErrorEvent {
    def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  }
  
  @JSGlobal("UncalibratedMagnetometer")
  @js.native
  open class UncalibratedMagnetometer ()
    extends StObject
       with typings.w3cGenericSensor.UncalibratedMagnetometer {
    def this(options: MotionSensorOptions) = this()
  }
}
