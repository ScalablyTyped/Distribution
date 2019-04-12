package typings
package threeLib.srcCamerasStereoCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/StereoCamera", "StereoCamera")
@js.native
class StereoCamera ()
  extends threeLib.srcCamerasCameraMod.Camera {
  var aspect: scala.Double = js.native
  var cameraL: threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera = js.native
  var cameraR: threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera = js.native
  var eyeSep: scala.Double = js.native
  @JSName("type")
  var type_StereoCamera: threeLib.threeLibStrings.StereoCamera = js.native
  def update(camera: threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera): scala.Unit = js.native
}

