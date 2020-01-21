package typings.wonderJs

import typings.wonderJs.materialMod.Material
import typings.wonderJs.programMod.Program
import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.shaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/ShaderLib", JSImport.Namespace)
@js.native
object shaderLibMod extends js.Object {
  @js.native
  abstract class ShaderLib () extends js.Object {
    var shader: Shader = js.native
    def dispose(): Unit = js.native
    def init(): Unit = js.native
    def sendShaderVariables(program: Program, cmd: RenderCommand, material: Material): Unit = js.native
  }
  
}

