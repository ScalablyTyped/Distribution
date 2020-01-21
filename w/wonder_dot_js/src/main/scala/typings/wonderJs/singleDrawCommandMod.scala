package typings.wonderJs

import typings.wonderJs.matrix3Mod.Matrix3
import typings.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", JSImport.Namespace)
@js.native
object singleDrawCommandMod extends js.Object {
  @js.native
  class SingleDrawCommand () extends QuadCommand {
    var normalMatrix: Matrix3 = js.native
  }
  
  /* static members */
  @js.native
  object SingleDrawCommand extends js.Object {
    def create(): SingleDrawCommand = js.native
  }
  
}

