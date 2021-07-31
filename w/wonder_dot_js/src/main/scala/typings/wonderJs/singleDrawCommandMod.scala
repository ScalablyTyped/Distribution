package typings.wonderJs

import typings.wonderJs.matrix3Mod.Matrix3
import typings.wonderJs.quadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleDrawCommandMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", "SingleDrawCommand")
  @js.native
  class SingleDrawCommand () extends QuadCommand {
    
    var normalMatrix: Matrix3 = js.native
  }
  /* static members */
  object SingleDrawCommand {
    
    @JSImport("wonder.js/dist/es2015/renderer/command/SingleDrawCommand", "SingleDrawCommand")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): SingleDrawCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SingleDrawCommand]
  }
}
