package typings.wonderJs

import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.webGLStateMod.WebGLState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/renderer/Renderer", JSImport.Namespace)
@js.native
object rendererMod extends js.Object {
  @js.native
  abstract class Renderer () extends js.Object {
    var webglState: WebGLState = js.native
    def addCommand(command: RenderCommand): Unit = js.native
    def clear(): Unit = js.native
    def hasCommand(): Boolean = js.native
    def init(): Unit = js.native
    def render(): Unit = js.native
  }
  
}

