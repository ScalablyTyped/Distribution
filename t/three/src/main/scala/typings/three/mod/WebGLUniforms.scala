package typings.three.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLUniforms")
@js.native
class WebGLUniforms protected ()
  extends typings.three.webGLUniformsMod.WebGLUniforms {
  def this(gl: WebGLRenderingContext, program: typings.three.webGLProgramMod.WebGLProgram) = this()
}
/* static members */
object WebGLUniforms {
  
  @JSImport("three", "WebGLUniforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def seqWithValue(seq: js.Any, values: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqWithValue")(seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def upload(
    gl: WebGLRenderingContext,
    seq: js.Any,
    values: js.Array[js.Any],
    textures: typings.three.webGLTexturesMod.WebGLTextures
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(gl.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
