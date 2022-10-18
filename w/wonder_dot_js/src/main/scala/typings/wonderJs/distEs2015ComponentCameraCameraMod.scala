package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015MathMatrix4Mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentCameraCameraMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/camera/Camera", "Camera")
  @js.native
  open class Camera () extends StObject {
    
    val cameraToWorldMatrix: Matrix4 = js.native
    
    def dispose(): Unit = js.native
    
    var entityObject: GameObject = js.native
    
    var far: Double = js.native
    
    /* protected */ def getInvViewProjMat(): Matrix4 = js.native
    
    def init(): Unit = js.native
    
    var near: Double = js.native
    
    var pMatrix: Matrix4 = js.native
    
    /* protected */ var pMatrixDirty: Boolean = js.native
    
    def update(elapsed: Double): Unit = js.native
    
    /* protected */ def updateProjectionMatrix(): Any = js.native
    
    var worldToCameraMatrix: Matrix4 = js.native
  }
}
