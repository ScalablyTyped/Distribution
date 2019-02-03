package typings
package wonderDotJsLib.distEs2015RendererShaderLibBasicBasicMaterialColorShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
@js.native
class BasicMaterialColorShaderLib ()
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

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
@js.native
object BasicMaterialColorShaderLib extends js.Object {
  def create(): wonderDotJsLib.distEs2015RendererShaderLibBasicBasicMaterialColorShaderLibMod.BasicMaterialColorShaderLib = js.native
}

