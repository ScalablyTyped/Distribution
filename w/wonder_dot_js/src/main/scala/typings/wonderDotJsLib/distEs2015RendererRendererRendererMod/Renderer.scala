package typings
package wonderDotJsLib.distEs2015RendererRendererRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/renderer/Renderer", "Renderer")
@js.native
abstract class Renderer () extends js.Object {
  var webglState: wonderDotJsLib.distEs2015RendererStateWebGLStateMod.WebGLState = js.native
  def addCommand(command: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def hasCommand(): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def render(): scala.Unit = js.native
}

