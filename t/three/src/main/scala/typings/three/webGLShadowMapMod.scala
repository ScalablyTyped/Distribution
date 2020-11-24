package typings.three

import typings.three.cameraMod.Camera
import typings.three.constantsMod.ShadowMapType
import typings.three.lightMod.Light
import typings.three.sceneMod.Scene
import typings.three.webGLObjectsMod.WebGLObjects
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLShadowMap", JSImport.Namespace)
@js.native
object webGLShadowMapMod extends js.Object {
  
  @js.native
  class WebGLShadowMap protected () extends js.Object {
    def this(_renderer: WebGLRenderer, _objects: WebGLObjects, maxTextureSize: Double) = this()
    
    /**
    	 * @default true
    	 */
    var autoUpdate: Boolean = js.native
    
    /**
    	 * @deprecated Use {@link Material#shadowSide} instead.
    	 */
    var cullFace: js.Any = js.native
    
    /**
    	 * @default false
    	 */
    var enabled: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var needsUpdate: Boolean = js.native
    
    def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native
    
    /**
    	 * @default THREE.PCFShadowMap
    	 */
    var `type`: ShadowMapType = js.native
  }
}
