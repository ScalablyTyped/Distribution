package typings.three.srcCamerasArrayCameraMod

import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/ArrayCamera", "ArrayCamera")
@js.native
class ArrayCamera () extends PerspectiveCamera {
  def this(cameras: js.Array[PerspectiveCamera]) = this()
  var cameras: js.Array[PerspectiveCamera] = js.native
  var isArrayCamera: `true` = js.native
}

