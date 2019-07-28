package typings.three.srcRenderersWebglWebGLInfoMod

import typings.three.Anon_Calls
import typings.three.Anon_GeometriesTextures
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLInfo", "WebGLInfo")
@js.native
class WebGLInfo () extends js.Object {
  var autoReset: Boolean = js.native
  var memory: Anon_GeometriesTextures = js.native
  var programs: js.Array[WebGLProgram] | Null = js.native
  var render: Anon_Calls = js.native
  def reset(): Unit = js.native
}

