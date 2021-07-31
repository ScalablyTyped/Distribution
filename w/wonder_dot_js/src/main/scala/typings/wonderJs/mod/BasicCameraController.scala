package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "BasicCameraController")
@js.native
class BasicCameraController protected ()
  extends typings.wonderJs.basicCameraControllerMod.BasicCameraController {
  def this(cameraComponent: typings.wonderJs.cameraMod.Camera) = this()
}
/* static members */
object BasicCameraController {
  
  @JSImport("wonder.js/dist/es2015", "BasicCameraController")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(cameraComponent: typings.wonderJs.cameraMod.Camera): typings.wonderJs.basicCameraControllerMod.BasicCameraController = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cameraComponent.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.basicCameraControllerMod.BasicCameraController]
}
