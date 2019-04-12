package typings
package threeLib.srcCamerasArrayCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/ArrayCamera", "ArrayCamera")
@js.native
class ArrayCamera ()
  extends threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera {
  def this(cameras: js.Array[threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera]) = this()
  var cameras: js.Array[threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera] = js.native
  var isArrayCamera: threeLib.threeLibNumbers.`true` = js.native
}

