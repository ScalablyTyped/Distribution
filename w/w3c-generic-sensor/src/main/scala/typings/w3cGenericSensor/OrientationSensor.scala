package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientationSensor extends Sensor {
  
  def populateMatrix(targetMatrix: RotationMatrixType): Unit = js.native
  
  val quaternion: js.UndefOr[js.Array[Double]] = js.native
}
