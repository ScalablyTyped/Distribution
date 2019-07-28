package typings.three.srcRenderersWebglWebGLUniformsMod

import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import typings.three.srcRenderersWebglWebGLTexturesMod.WebGLTextures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
@js.native
class WebGLUniforms protected () extends js.Object {
  def this(gl: js.Any, program: WebGLProgram) = this()
  def setOptional(gl: js.Any, `object`: js.Any, name: String): Unit = js.native
  def setValue(gl: js.Any, name: String, value: js.Any, textures: WebGLTextures): Unit = js.native
}

/* static members */
@JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
@js.native
object WebGLUniforms extends js.Object {
  def evalDynamic(seq: js.Any, values: js.Array[_], `object`: js.Any, camera: js.Any): js.Array[_] = js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def splitDynamic(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def upload(gl: js.Any, seq: js.Any, values: js.Array[_], textures: WebGLTextures): Unit = js.native
}

