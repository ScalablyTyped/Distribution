package typings.three

import typings.three.anon.Ambient
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLLightsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLLights", "WebGLLights")
  @js.native
  open class WebGLLights protected () extends StObject {
    def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def get(light: Any): Any = js.native
    
    def setup(lights: Any): Unit = js.native
    
    def setupView(lights: Any, camera: Any): Unit = js.native
    
    var state: Ambient = js.native
  }
}
