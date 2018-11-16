package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "StereoCamera")
@js.native
class StereoCamera () extends Camera {
  var aspect: scala.Double = js.native
  var cameraL: PerspectiveCamera = js.native
  var cameraR: PerspectiveCamera = js.native
  var eyeSep: scala.Double = js.native
  @JSName("type")
  var type_StereoCamera: threeLib.threeLibStrings.StereoCamera = js.native
  def update(camera: PerspectiveCamera): scala.Unit = js.native
}

