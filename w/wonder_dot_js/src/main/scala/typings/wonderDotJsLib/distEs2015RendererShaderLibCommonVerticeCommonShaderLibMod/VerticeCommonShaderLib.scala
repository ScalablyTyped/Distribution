package typings
package wonderDotJsLib.distEs2015RendererShaderLibCommonVerticeCommonShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", "VerticeCommonShaderLib")
@js.native
class VerticeCommonShaderLib ()
  extends wonderDotJsLib.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib {
  def sendShaderVariables(
    program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program,
    cmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand,
    material: wonderDotJsLib.distEs2015MaterialEngineMaterialMod.EngineMaterial
  ): scala.Unit = js.native
  def setShaderDefinition(
    cmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand,
    material: wonderDotJsLib.distEs2015MaterialEngineMaterialMod.EngineMaterial
  ): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", "VerticeCommonShaderLib")
@js.native
object VerticeCommonShaderLib extends js.Object {
  def create(): wonderDotJsLib.distEs2015RendererShaderLibCommonVerticeCommonShaderLibMod.VerticeCommonShaderLib = js.native
}

