package typings.three.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLUniforms")
@js.native
open class WebGLUniforms protected ()
  extends typings.three.srcThreeMod.WebGLUniforms {
  def this(gl: WebGLRenderingContext, program: typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram) = this()
}
/* static members */
object WebGLUniforms {
  
  @JSImport("three", "WebGLUniforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def seqWithValue(seq: Any, values: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqWithValue")(seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def upload(
    gl: WebGLRenderingContext,
    seq: Any,
    values: js.Array[Any],
    textures: typings.three.srcRenderersWebglWebGLTexturesMod.WebGLTextures
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(gl.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
