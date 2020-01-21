package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/EndShaderLib", JSImport.Namespace)
@js.native
object endShaderLibMod extends js.Object {
  @js.native
  class EndShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EndShaderLib extends js.Object {
    def create(): EndShaderLib = js.native
  }
  
}

