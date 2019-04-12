package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ArrayCamera")
@js.native
class ArrayCamera ()
  extends threeLib.srcCamerasArrayCameraMod.ArrayCamera {
  def this(cameras: js.Array[threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera]) = this()
}

