package typings.wonderJs

import typings.wonderJs.basicMaterialMod.BasicMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", JSImport.Namespace)
@js.native
object basicMaterialColorShaderLibMod extends js.Object {
  @js.native
  class BasicMaterialColorShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BasicMaterialColorShaderLib extends js.Object {
    def create(): BasicMaterialColorShaderLib = js.native
  }
  
}

