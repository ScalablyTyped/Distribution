package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLTexturesMod.WebGLTextures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLUniformsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
  @js.native
  class WebGLUniforms protected () extends StObject {
    def this(gl: WebGLRenderingContext, program: WebGLProgram) = this()
    
    def setOptional(gl: WebGLRenderingContext, `object`: js.Any, name: String): Unit = js.native
    
    def setValue(gl: WebGLRenderingContext, name: String, value: js.Any, textures: WebGLTextures): Unit = js.native
  }
  /* static members */
  object WebGLUniforms {
    
    @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms.seqWithValue")
    @js.native
    def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms.upload")
    @js.native
    def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[_], textures: WebGLTextures): Unit = js.native
  }
}
