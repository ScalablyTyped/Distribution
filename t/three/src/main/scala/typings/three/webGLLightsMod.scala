package typings.three

import typings.three.anon.Ambient
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLLights", JSImport.Namespace)
@js.native
object webGLLightsMod extends js.Object {
  
  @js.native
  class WebGLLights protected () extends js.Object {
    def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def get(light: js.Any): js.Any = js.native
    
    def setup(lights: js.Any, shadows: js.Any, camera: js.Any): Unit = js.native
    
    var state: Ambient = js.native
  }
}
