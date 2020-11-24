package typings.three

import typings.three.threeBooleans.`true`
import typings.three.webGLRendererMod.WebGLRenderer
import typings.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/WebGL1Renderer", JSImport.Namespace)
@js.native
object webGL1RendererMod extends js.Object {
  
  @js.native
  class WebGL1Renderer () extends WebGLRenderer {
    def this(parameters: WebGLRendererParameters) = this()
    
    val isWebGL1Renderer: `true` = js.native
  }
}
