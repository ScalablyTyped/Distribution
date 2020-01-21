package typings.wonderJs

import typings.wonderJs.cameraControllerMod.CameraController
import typings.wonderJs.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/controller/basic/BasicCameraController", JSImport.Namespace)
@js.native
object basicCameraControllerMod extends js.Object {
  @js.native
  class BasicCameraController () extends CameraController
  
  /* static members */
  @js.native
  object BasicCameraController extends js.Object {
    def create(cameraComponent: Camera): BasicCameraController = js.native
  }
  
}

