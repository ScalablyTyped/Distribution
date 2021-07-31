package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable2
import typings.std.WebGLRenderingContext
import typings.three.mod.WebGLUniforms
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLTexturesMod.WebGLTextures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebGLUniforms
  extends StObject
     with Instantiable2[/* gl */ WebGLRenderingContext, /* program */ WebGLProgram, WebGLUniforms] {
  
  def seqWithValue(seq: js.Any, values: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[js.Any], textures: WebGLTextures): Unit = js.native
}
