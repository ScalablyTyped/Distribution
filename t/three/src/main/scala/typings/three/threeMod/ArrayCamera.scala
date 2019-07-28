package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ArrayCamera")
@js.native
class ArrayCamera ()
  extends typings.three.srcCamerasArrayCameraMod.ArrayCamera {
  def this(cameras: js.Array[typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera]) = this()
}

