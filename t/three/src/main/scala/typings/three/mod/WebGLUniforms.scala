package typings.three.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
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
object WebGLUniforms {
  
  @JSImport("three", "WebGLUniforms.seqWithValue")
  @js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("three", "WebGLUniforms.upload")
  @js.native
  def upload(
    gl: WebGLRenderingContext,
    seq: js.Any,
    values: js.Array[_],
    textures: typings.three.webGLTexturesMod.WebGLTextures
  ): Unit = js.native
}
