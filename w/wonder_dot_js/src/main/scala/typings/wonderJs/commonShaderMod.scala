package typings.wonderJs

import typings.wonderJs.engineShaderMod.EngineShader
import typings.wonderJs.materialMod.Material
import typings.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", JSImport.Namespace)
@js.native
object commonShaderMod extends js.Object {
  @js.native
  class CommonShader () extends EngineShader {
    def update(cmd: QuadCommand, material: Material): Unit = js.native
  }
  
  /* static members */
  @js.native
  object CommonShader extends js.Object {
    def create(): CommonShader = js.native
  }
  
}

