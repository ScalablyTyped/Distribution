package typings.wonderJs

import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.matrix4Mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod {
  
  @JSImport("wonder.js/dist/es2015/component/camera/Camera", "Camera")
  @js.native
  abstract class Camera () extends StObject {
    
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
    
    /* protected */ def updateProjectionMatrix(): js.Any = js.native
    
    var worldToCameraMatrix: Matrix4 = js.native
  }
}
