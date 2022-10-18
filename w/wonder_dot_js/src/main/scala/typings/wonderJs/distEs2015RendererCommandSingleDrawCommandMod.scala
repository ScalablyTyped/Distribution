package typings.wonderJs

import typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererCommandSingleDrawCommandMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", "SingleDrawCommand")
  @js.native
  open class SingleDrawCommand () extends QuadCommand {
    
    var normalMatrix: Matrix3 = js.native
  }
  /* static members */
  object SingleDrawCommand {
    
    @JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", "SingleDrawCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): SingleDrawCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SingleDrawCommand]
  }
}
