package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cGenericSensor {
  type AbsoluteOrientationSensor = typings.w3cGenericSensor.OrientationSensor
  type GravitySensor = typings.w3cGenericSensor.Accelerometer
  type LinearAccelerationSensor = typings.w3cGenericSensor.Accelerometer
  type RelativeOrientationSensor = typings.w3cGenericSensor.OrientationSensor
  // Orientation Sensor: https://www.w3.org/TR/orientation-sensor/
  type RotationMatrixType = typings.std.Float32Array | typings.std.Float64Array | typings.std.DOMMatrix
}
