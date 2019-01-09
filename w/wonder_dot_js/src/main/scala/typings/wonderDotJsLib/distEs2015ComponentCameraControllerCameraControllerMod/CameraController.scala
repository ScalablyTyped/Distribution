package typings
package wonderDotJsLib.distEs2015ComponentCameraControllerCameraControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/controller/CameraController", "CameraController")
@js.native
abstract class CameraController protected ()
  extends wonderDotJsLib.distEs2015CoreComponentMod.Component {
  def this(cameraComponent: wonderDotJsLib.distEs2015ComponentCameraCameraMod.Camera) = this()
  var camera: wonderDotJsLib.distEs2015ComponentCameraCameraMod.Camera = js.native
  val cameraToWorldMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  @JSName("entityObject")
  var entityObject_CameraController: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  var pMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  val worldToCameraMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  /* protected */ def bindClearCacheEvent(): scala.Unit = js.native
  /* protected */ def disposeClearCacheEvent(): scala.Unit = js.native
  def update(elapsed: scala.Double): scala.Unit = js.native
}

