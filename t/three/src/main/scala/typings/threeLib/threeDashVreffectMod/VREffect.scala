package typings
package threeLib.threeDashVreffectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-vreffect", "VREffect")
@js.native
class VREffect protected () extends js.Object {
  def this(renderer: threeLib.threeDashCoreMod.Renderer) = this()
  def this(renderer: threeLib.threeDashCoreMod.Renderer, callback: js.Function1[/* params */ java.lang.String, scala.Unit]) = this()
  def FovPortToProjection(fov: VRFov, rightHanded: scala.Boolean, zNear: scala.Double, zFar: scala.Double): threeLib.threeDashCoreMod.Matrix4 = js.native
  def FovToNDCScaleOffset(fov: VRFov): VREffectOffset = js.native
  def FovToProjection(fov: VRFov, rightHanded: scala.Boolean, zNear: scala.Double, zFar: scala.Double): threeLib.threeDashCoreMod.Matrix4 = js.native
  def render(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera): scala.Unit = js.native
  def setFullScreen(flag: scala.Boolean): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setVRDisplay(display: stdLib.VRDisplay): scala.Unit = js.native
  def startFullscreen(): scala.Unit = js.native
}

