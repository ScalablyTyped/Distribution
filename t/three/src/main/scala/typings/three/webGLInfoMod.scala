package typings.three

import typings.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLInfo", JSImport.Namespace)
@js.native
object webGLInfoMod extends js.Object {
  @js.native
  class WebGLInfo () extends js.Object {
    var autoReset: Boolean = js.native
    var memory: AnonGeometriesTextures = js.native
    var programs: js.Array[WebGLProgram] | Null = js.native
    var render: AnonCalls = js.native
    def reset(): Unit = js.native
  }
  
}

