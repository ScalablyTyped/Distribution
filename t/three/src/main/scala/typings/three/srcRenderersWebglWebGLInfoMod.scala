package typings.three

import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLInfo", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLInfoMod extends js.Object {
  @js.native
  class WebGLInfo () extends js.Object {
    var autoReset: Boolean = js.native
    var memory: Anon_GeometriesTextures = js.native
    var programs: js.Array[WebGLProgram] | Null = js.native
    var render: Anon_Calls = js.native
    def reset(): Unit = js.native
  }
  
}

