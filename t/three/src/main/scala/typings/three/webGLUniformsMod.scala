package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLTexturesMod.WebGLTextures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def seqWithValue(seq: js.Any, values: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqWithValue")(seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    inline def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[js.Any], textures: WebGLTextures): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(gl.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
