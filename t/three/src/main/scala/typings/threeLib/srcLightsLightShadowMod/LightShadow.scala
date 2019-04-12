package typings
package threeLib.srcLightsLightShadowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightShadow", "LightShadow")
@js.native
class LightShadow protected () extends js.Object {
  def this(camera: threeLib.srcCamerasCameraMod.Camera) = this()
  var bias: scala.Double = js.native
  var camera: threeLib.srcCamerasCameraMod.Camera = js.native
  var map: threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget = js.native
  var mapSize: threeLib.srcMathVector2Mod.Vector2 = js.native
  var matrix: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  var radius: scala.Double = js.native
  def clone(recursive: scala.Boolean): this.type = js.native
  def copy(source: LightShadow): this.type = js.native
  def toJSON(): js.Any = js.native
}

