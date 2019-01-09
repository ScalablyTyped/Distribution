package typings
package wonderDotJsLib.distEs2015RendererCommandRenderCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/RenderCommand", "RenderCommand")
@js.native
abstract class RenderCommand () extends js.Object {
  var drawMode: wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode = js.native
  var webglState: wonderDotJsLib.distEs2015RendererStateWebGLStateMod.WebGLState = js.native
  def dispose(): scala.Unit = js.native
  /* protected */ def drawArray(vertexBuffer: wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer): scala.Unit = js.native
  /* protected */ def drawElements(indexBuffer: wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer): scala.Unit = js.native
  def execute(): scala.Unit = js.native
  def init(): scala.Unit = js.native
}

