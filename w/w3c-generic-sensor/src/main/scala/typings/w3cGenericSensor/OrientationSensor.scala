package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OrientationSensor")
@js.native
class OrientationSensor () extends Sensor {
  val quaternion: js.UndefOr[js.Array[Double]] = js.native
  def populateMatrix(targetMatrix: RotationMatrixType): Unit = js.native
}

