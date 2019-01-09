package typings
package wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/ShaderLib", "ShaderLib")
@js.native
abstract class ShaderLib () extends js.Object {
  var shader: wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader = js.native
  def dispose(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def sendShaderVariables(
    program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program,
    cmd: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand,
    material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material
  ): scala.Unit = js.native
}

