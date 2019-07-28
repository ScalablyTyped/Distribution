package typings.wonderDotJs.distEs2015RendererShaderLibShaderLibMod

import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderShaderShaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/ShaderLib", "ShaderLib")
@js.native
abstract class ShaderLib () extends js.Object {
  var shader: Shader = js.native
  def dispose(): Unit = js.native
  def init(): Unit = js.native
  def sendShaderVariables(program: Program, cmd: RenderCommand, material: Material): Unit = js.native
}

