package typings.wonderDotJs

import typings.wonderDotJs.distEs2015MaterialBasicMaterialMod.BasicMaterial
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderLibBasicBasicShaderLibMod.BasicShaderLib
import typings.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", JSImport.Namespace)
@js.native
object distEs2015RendererShaderLibBasicBasicShaderLibMod extends js.Object {
  @js.native
  class BasicShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BasicShaderLib extends js.Object {
    def create(): BasicShaderLib = js.native
  }
  
}

