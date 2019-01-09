package typings
package wonderDotJsLib.distEs2015ComponentTransformThreeDTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/transform/ThreeDTransform", "ThreeDTransform")
@js.native
class ThreeDTransform ()
  extends wonderDotJsLib.distEs2015ComponentTransformTransformMod.Transform {
  var dirtyWorld: scala.Boolean = js.native
  var eulerAngles: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  val forward: js.Any = js.native
  var localEulerAngles: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  var localPosition: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  var localRotation: wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  var localScale: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  var localToWorldMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  val normalMatrix: wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3 = js.native
  @JSName("p_parent")
  var p_parent_ThreeDTransform: ThreeDTransform = js.native
  var position: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  val right: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  var rotation: wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  var scale: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  val up: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def lookAt(targetX: scala.Double, targetY: scala.Double, targetZ: scala.Double): js.Any = js.native
  def lookAt(
    targetX: scala.Double,
    targetY: scala.Double,
    targetZ: scala.Double,
    upX: scala.Double,
    upY: scala.Double,
    upZ: scala.Double
  ): js.Any = js.native
  def lookAt(target: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): js.Any = js.native
  def lookAt(
    target: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    up: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): js.Any = js.native
  def rotate(eulerAngles: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): js.Any = js.native
  def rotate(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
  def rotateAround(
    angle: scala.Double,
    centerX: scala.Double,
    centerY: scala.Double,
    centerZ: scala.Double,
    axisX: scala.Double,
    axisY: scala.Double,
    axisZ: scala.Double
  ): js.Any = js.native
  def rotateAround(
    angle: scala.Double,
    center: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    axis: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): js.Any = js.native
  def rotateLocal(eulerAngles: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): js.Any = js.native
  def rotateLocal(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
  def sync(): scala.Unit = js.native
  def translate(translation: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): js.Any = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
  def translateLocal(translation: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): js.Any = js.native
  def translateLocal(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
}

@JSImport("wonder.js/dist/es2015/component/transform/ThreeDTransform", "ThreeDTransform")
@js.native
object ThreeDTransform extends js.Object {
  def create(): wonderDotJsLib.distEs2015ComponentTransformThreeDTransformMod.ThreeDTransform = js.native
}

