package typings
package threeLib.srcRenderersWebglWebGLShadowMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLShadowMap", "WebGLShadowMap")
@js.native
class WebGLShadowMap protected () extends js.Object {
  def this(_renderer: threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, _lights: js.Array[_], _objects: js.Array[_], capabilities: js.Any) = this()
  var autoUpdate: scala.Boolean = js.native
  /**
    * @deprecated Use {@link WebGLShadowMap#renderReverseSided .shadowMap.renderReverseSided} instead.
    */
  var cullFace: js.Any = js.native
  var enabled: scala.Boolean = js.native
  var needsUpdate: scala.Boolean = js.native
  var `type`: threeLib.srcConstantsMod.ShadowMapType = js.native
  def render(scene: threeLib.srcScenesSceneMod.Scene, camera: threeLib.srcCamerasCameraMod.Camera): scala.Unit = js.native
}

