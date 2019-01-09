package typings
package wonderDotJsLib.distEs2015RendererShaderLibBasicBasicShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
@js.native
class BasicShaderLib ()
  extends wonderDotJsLib.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib {
  def sendShaderVariables(
    program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program,
    cmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand,
    material: wonderDotJsLib.distEs2015MaterialBasicMaterialMod.BasicMaterial
  ): scala.Unit = js.native
  def setShaderDefinition(
    cmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand,
    material: wonderDotJsLib.distEs2015MaterialBasicMaterialMod.BasicMaterial
  ): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
@js.native
object BasicShaderLib extends js.Object {
  def create(): wonderDotJsLib.distEs2015RendererShaderLibBasicBasicShaderLibMod.BasicShaderLib = js.native
}

