package typings.wonderDotJs.distEs2015RendererShaderLibBasicBasicMaterialColorShaderLibMod

import typings.wonderDotJs.distEs2015MaterialBasicMaterialMod.BasicMaterial
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
@js.native
class BasicMaterialColorShaderLib () extends EngineShaderLib {
  def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
@js.native
object BasicMaterialColorShaderLib extends js.Object {
  def create(): BasicMaterialColorShaderLib = js.native
}

