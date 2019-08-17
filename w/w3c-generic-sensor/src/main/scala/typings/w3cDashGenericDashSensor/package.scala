package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cDashGenericDashSensor {
  import typings.std.DOMMatrix
  import typings.std.Float32Array
  import typings.std.Float64Array

  // Orientation Sensor: https://www.w3.org/TR/orientation-sensor/
  type RotationMatrixType = Float32Array | Float64Array | DOMMatrix
}
