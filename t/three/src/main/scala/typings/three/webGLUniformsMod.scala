package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLTexturesMod.WebGLTextures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLUniforms", JSImport.Namespace)
@js.native
object webGLUniformsMod extends js.Object {
  @js.native
  class WebGLUniforms protected () extends js.Object {
    def this(gl: WebGLRenderingContext, program: WebGLProgram) = this()
    def setOptional(gl: WebGLRenderingContext, `object`: js.Any, name: String): Unit = js.native
    def setValue(gl: WebGLRenderingContext, name: String, value: js.Any, textures: WebGLTextures): Unit = js.native
  }
  
  /* static members */
  @js.native
  object WebGLUniforms extends js.Object {
    def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
    def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[_], textures: WebGLTextures): Unit = js.native
  }
  
}

