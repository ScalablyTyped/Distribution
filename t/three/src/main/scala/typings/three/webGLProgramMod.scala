package typings.three

import typings.three.webGLRendererMod.WebGLRenderer
import typings.three.webGLShaderMod.WebGLShader
import typings.three.webGLUniformsMod.WebGLUniforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLProgram", JSImport.Namespace)
@js.native
object webGLProgramMod extends js.Object {
  @js.native
  class WebGLProgram protected () extends js.Object {
    def this(renderer: WebGLRenderer, cacheKey: String, parameters: js.Object) = this()
    /**
    	 * @deprecated Use {@link WebGLProgram#getAttributes getAttributes()} instead.
    	 */
    var attributes: js.Any = js.native
    var cacheKey: String = js.native
    var fragmentShader: WebGLShader = js.native
    var id: Double = js.native
    var name: String = js.native
    var program: js.Any = js.native
    /**
    	 * @deprecated Use {@link WebGLProgram#getUniforms getUniforms()} instead.
    	 */
    var uniforms: js.Any = js.native
     // unique identifier for this program, used for looking up compiled programs from cache.
    var usedTimes: Double = js.native
    var vertexShader: WebGLShader = js.native
    def destroy(): Unit = js.native
    def getAttributes(): js.Any = js.native
    def getUniforms(): WebGLUniforms = js.native
  }
  
}

