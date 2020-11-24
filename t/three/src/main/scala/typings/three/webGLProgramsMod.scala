package typings.three

import typings.three.materialMod.Material
import typings.three.sceneMod.Scene
import typings.three.webGLBindingStatesMod.WebGLBindingStates
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLClippingMod.WebGLClipping
import typings.three.webGLCubeMapsMod.WebGLCubeMaps
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLPrograms", JSImport.Namespace)
@js.native
object webGLProgramsMod extends js.Object {
  
  @js.native
  class WebGLPrograms protected () extends js.Object {
    def this(
      renderer: WebGLRenderer,
      cubemaps: WebGLCubeMaps,
      extensions: WebGLExtensions,
      capabilities: WebGLCapabilities,
      bindingStates: WebGLBindingStates,
      clipping: WebGLClipping
    ) = this()
    
    def acquireProgram(parameters: js.Any, cacheKey: String): WebGLProgram = js.native
    
    def getParameters(material: Material, lights: js.Any, shadows: js.Array[js.Object], scene: Scene, `object`: js.Any): js.Any = js.native
    
    def getProgramCacheKey(parameters: js.Any): String = js.native
    
    def getUniforms(material: Material): js.Object = js.native
    
    var programs: js.Array[WebGLProgram] = js.native
    
    def releaseProgram(program: WebGLProgram): Unit = js.native
  }
}
