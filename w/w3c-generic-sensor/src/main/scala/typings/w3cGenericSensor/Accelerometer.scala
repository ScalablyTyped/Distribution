package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Accelerometer: https://www.w3.org/TR/accelerometer/
@JSGlobal("Accelerometer")
@js.native
class Accelerometer () extends Sensor {
  def this(options: SensorOptions) = this()
  val x: js.UndefOr[Double] = js.native
  val y: js.UndefOr[Double] = js.native
  val z: js.UndefOr[Double] = js.native
}

