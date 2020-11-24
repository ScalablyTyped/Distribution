package typings.three.mod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLUniforms")
@js.native
class WebGLUniforms protected ()
  extends typings.three.webGLUniformsMod.WebGLUniforms {
  def this(gl: WebGLRenderingContext, program: typings.three.webGLProgramMod.WebGLProgram) = this()
}
/* static members */
@JSImport("three", "WebGLUniforms")
@js.native
object WebGLUniforms extends js.Object {
  
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  
  def upload(
    gl: WebGLRenderingContext,
    seq: js.Any,
    values: js.Array[_],
    textures: typings.three.webGLTexturesMod.WebGLTextures
  ): Unit = js.native
}
