package typings.three

import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLCubeMaps", JSImport.Namespace)
@js.native
object webGLCubeMapsMod extends js.Object {
  
  @js.native
  class WebGLCubeMaps protected () extends js.Object {
    def this(renderer: WebGLRenderer) = this()
    
    def dispose(): Unit = js.native
    
    def get(texture: js.Any): js.Any = js.native
  }
}
