package typings.wonderJs

import typings.wonderJs.distEs2015ComponentCameraCameraMod.Camera
import typings.wonderJs.distEs2015ComponentCameraControllerCameraControllerMod.CameraController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentCameraControllerBasicBasicCameraControllerMod {
  
  @JSImport("wonder.js/dist/es2015/component/camera/controller/basic/BasicCameraController", "BasicCameraController")
  @js.native
  open class BasicCameraController protected () extends CameraController {
    def this(cameraComponent: Camera) = this()
  }
  /* static members */
  object BasicCameraController {
    
    @JSImport("wonder.js/dist/es2015/component/camera/controller/basic/BasicCameraController", "BasicCameraController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(cameraComponent: Camera): BasicCameraController = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cameraComponent.asInstanceOf[js.Any]).asInstanceOf[BasicCameraController]
  }
}
