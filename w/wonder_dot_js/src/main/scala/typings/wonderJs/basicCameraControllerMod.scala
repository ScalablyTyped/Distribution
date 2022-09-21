package typings.wonderJs

import typings.wonderJs.cameraControllerMod.CameraController
import typings.wonderJs.cameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicCameraControllerMod {
  
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
