package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", JSImport.Namespace)
@js.native
object verticeCommonShaderLibMod extends js.Object {
  @js.native
  class VerticeCommonShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object VerticeCommonShaderLib extends js.Object {
    def create(): VerticeCommonShaderLib = js.native
  }
  
}

