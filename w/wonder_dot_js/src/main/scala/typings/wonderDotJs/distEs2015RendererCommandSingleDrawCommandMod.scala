package typings.wonderDotJs

import typings.wonderDotJs.distEs2015MathMatrix3Mod.Matrix3
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererCommandSingleDrawCommandMod.SingleDrawCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", JSImport.Namespace)
@js.native
object distEs2015RendererCommandSingleDrawCommandMod extends js.Object {
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

