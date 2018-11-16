package typings
package w3cDashGenericDashSensorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Gyroscope: https://www.w3.org/TR/gyroscope/
@JSGlobal("Gyroscope")
@js.native
class Gyroscope () extends Sensor {
  def this(options: SensorOptions) = this()
  val x: js.UndefOr[scala.Double] = js.native
  val y: js.UndefOr[scala.Double] = js.native
  val z: js.UndefOr[scala.Double] = js.native
}

