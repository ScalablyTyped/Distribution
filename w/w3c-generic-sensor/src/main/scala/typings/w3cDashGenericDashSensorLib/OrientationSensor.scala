package typings
package w3cDashGenericDashSensorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OrientationSensor")
@js.native
class OrientationSensor () extends Sensor {
  val quaternion: js.UndefOr[js.Array[scala.Double]] = js.native
  def populateMatrix(targetMatrix: RotationMatrixType): scala.Unit = js.native
}

