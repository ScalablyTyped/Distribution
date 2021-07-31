package typings.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientationSensor
  extends StObject
     with Sensor {
  
  def populateMatrix(targetMatrix: RotationMatrixType): Unit = js.native
  
  val quaternion: js.UndefOr[js.Array[Double]] = js.native
}
