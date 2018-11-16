package typings
package w3cDashGenericDashSensorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Magnetometer: https://www.w3.org/TR/magnetometer/
@JSGlobal("Magnetometer")
@js.native
class Magnetometer () extends Sensor {
  def this(options: SensorOptions) = this()
  val x: js.UndefOr[scala.Double] = js.native
  val y: js.UndefOr[scala.Double] = js.native
  val z: js.UndefOr[scala.Double] = js.native
}

