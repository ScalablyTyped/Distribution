package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentCameraCameraMod.Camera
import typings.wonderDotJs.distEs2015CoreComponentMod.Component
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015MathMatrix4Mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/controller/CameraController", JSImport.Namespace)
@js.native
object distEs2015ComponentCameraControllerCameraControllerMod extends js.Object {
  @js.native
  abstract class CameraController protected () extends Component {
    def this(cameraComponent: Camera) = this()
    var camera: Camera = js.native
    val cameraToWorldMatrix: Matrix4 = js.native
    @JSName("entityObject")
    var entityObject_CameraController: GameObject = js.native
    var pMatrix: Matrix4 = js.native
    val worldToCameraMatrix: Matrix4 = js.native
    /* protected */ def bindClearCacheEvent(): Unit = js.native
    /* protected */ def disposeClearCacheEvent(): Unit = js.native
    def update(elapsed: Double): Unit = js.native
  }
  
}

