package typings.wonderJs

import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.matrix4Mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/Camera", JSImport.Namespace)
@js.native
object cameraMod extends js.Object {
  @js.native
  abstract class Camera () extends js.Object {
    val cameraToWorldMatrix: Matrix4 = js.native
    var entityObject: GameObject = js.native
    var far: Double = js.native
    var near: Double = js.native
    var pMatrix: Matrix4 = js.native
    var pMatrixDirty: Boolean = js.native
    var worldToCameraMatrix: Matrix4 = js.native
    def dispose(): Unit = js.native
    /* protected */ def getInvViewProjMat(): Matrix4 = js.native
    def init(): Unit = js.native
    def update(elapsed: Double): Unit = js.native
    /* protected */ def updateProjectionMatrix(): js.Any = js.native
  }
  
}

