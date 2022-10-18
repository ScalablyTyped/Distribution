package typings.three

import typings.std.WebGLShader
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcRenderersWebglWebGLUniformsMod.WebGLUniforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLProgramMod {
  
  @JSImport("three/src/renderers/webgl/WebGLProgram", "WebGLProgram")
  @js.native
  open class WebGLProgram protected () extends StObject {
    def this(renderer: WebGLRenderer, cacheKey: String, parameters: js.Object) = this()
    
    /**
      * @deprecated Use {@link WebGLProgram#getAttributes getAttributes()} instead.
      */
    var attributes: Any = js.native
    
    var cacheKey: String = js.native
    
    def destroy(): Unit = js.native
    
    var fragmentShader: WebGLShader = js.native
    
    def getAttributes(): Any = js.native
    
    def getUniforms(): WebGLUniforms = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var program: Any = js.native
    
    /**
      * @deprecated Use {@link WebGLProgram#getUniforms getUniforms()} instead.
      */
    var uniforms: Any = js.native
    
    // unique identifier for this program, used for looking up compiled programs from cache.
    /**
      * @default 1
      */
    var usedTimes: Double = js.native
    
    var vertexShader: WebGLShader = js.native
  }
}
