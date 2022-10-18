package typings.wonderJs

import typings.wonderJs.distEs2015ComponentCameraCameraMod.Camera
import typings.wonderJs.distEs2015CoreComponentMod.Component
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015MathMatrix4Mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentCameraControllerCameraControllerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/camera/controller/CameraController", "CameraController")
  @js.native
  open class CameraController protected () extends Component {
    def this(cameraComponent: Camera) = this()
    
    /* protected */ def bindClearCacheEvent(): Unit = js.native
    
    var camera: Camera = js.native
    
    val cameraToWorldMatrix: Matrix4 = js.native
    
    /* protected */ def disposeClearCacheEvent(): Unit = js.native
    
    @JSName("entityObject")
    var entityObject_CameraController: GameObject = js.native
    
    var pMatrix: Matrix4 = js.native
    
    def update(elapsed: Double): Unit = js.native
    
    val worldToCameraMatrix: Matrix4 = js.native
  }
}
