package typings.three

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBufferRenderer", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLBufferRendererMod extends js.Object {
  @js.native
  class WebGLBufferRenderer protected () extends js.Object {
    def this(_gl: WebGLRenderingContext, extensions: js.Any, _infoRender: js.Any) = this()
    def render(start: js.Any, count: Double): Unit = js.native
    def renderInstances(geometry: js.Any): Unit = js.native
    def setMode(value: js.Any): Unit = js.native
  }
  
}

