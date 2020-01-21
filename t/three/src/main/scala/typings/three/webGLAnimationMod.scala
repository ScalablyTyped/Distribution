package typings.three

import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLAnimation", JSImport.Namespace)
@js.native
object webGLAnimationMod extends js.Object {
  @js.native
  class WebGLAnimation () extends js.Object {
    def setAnimationLoop(callback: js.Function): Unit = js.native
    def setContext(value: WebGL2RenderingContext): Unit = js.native
    def setContext(value: WebGLRenderingContext): Unit = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native
  }
  
}

