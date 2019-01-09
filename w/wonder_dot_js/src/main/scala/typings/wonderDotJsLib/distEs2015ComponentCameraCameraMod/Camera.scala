package typings
package wonderDotJsLib.distEs2015ComponentCameraCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/Camera", "Camera")
@js.native
abstract class Camera () extends js.Object {
  val cameraToWorldMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  var entityObject: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  var far: scala.Double = js.native
  var near: scala.Double = js.native
  var pMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  var pMatrixDirty: scala.Boolean = js.native
  var worldToCameraMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  def dispose(): scala.Unit = js.native
  /* protected */ def getInvViewProjMat(): wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  def init(): scala.Unit = js.native
  def update(elapsed: scala.Double): scala.Unit = js.native
  /* protected */ def updateProjectionMatrix(): js.Any = js.native
}

