package typings.three

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLExtensions", JSImport.Namespace)
@js.native
object webGLExtensionsMod extends js.Object {
  
  @js.native
  class WebGLExtensions protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    
    def get(name: String): js.Any = js.native
    
    def has(name: String): Boolean = js.native
  }
}
