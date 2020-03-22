package typings.three

import typings.three.cameraMod.Camera
import typings.three.constantsMod.ShadowMapType
import typings.three.sceneMod.Scene
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLShadowMap", JSImport.Namespace)
@js.native
object webGLShadowMapMod extends js.Object {
  @js.native
  class WebGLShadowMap protected () extends js.Object {
    def this(_renderer: WebGLRenderer, _objects: js.Array[_], maxTextureSize: Double) = this()
    var autoUpdate: Boolean = js.native
    /**
    	 * @deprecated Use {@link WebGLShadowMap#renderReverseSided .shadowMap.renderReverseSided} instead.
    	 */
    var cullFace: js.Any = js.native
    var enabled: Boolean = js.native
    var needsUpdate: Boolean = js.native
    var `type`: ShadowMapType = js.native
    def render(scene: Scene, camera: Camera): Unit = js.native
  }
  
}

