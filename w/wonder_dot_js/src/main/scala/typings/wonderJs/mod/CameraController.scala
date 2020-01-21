package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "CameraController")
@js.native
abstract class CameraController protected ()
  extends typings.wonderJs.cameraControllerMod.CameraController {
  def this(cameraComponent: typings.wonderJs.cameraMod.Camera) = this()
}

