package typings.three

import typings.std.GLenum
import typings.std.WebGLRenderingContext
import typings.three.anon.Calls
import typings.three.anon.Textures
import typings.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLInfo", JSImport.Namespace)
@js.native
object webGLInfoMod extends js.Object {
  @js.native
  class WebGLInfo protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    var autoReset: Boolean = js.native
    var memory: Textures = js.native
    var programs: js.Array[WebGLProgram] | Null = js.native
    var render: Calls = js.native
    def reset(): Unit = js.native
    def update(count: Double, mode: GLenum, instanceCount: Double): Unit = js.native
  }
  
}

