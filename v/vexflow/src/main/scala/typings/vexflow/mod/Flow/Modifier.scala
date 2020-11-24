package typings.vexflow.mod.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Modifier")
@js.native
class Modifier ()
  extends typings.vexflow.Vex.Flow.Modifier
/* static members */
@JSImport("vexflow", "Flow.Modifier")
@js.native
object Modifier extends js.Object {
  
  val CATEGORY: String = js.native
  
  var DEBUG: Boolean = js.native
  
  @js.native
  object Position extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Modifier.Position with Double] = js.native
    
    /* 1 */ val ABOVE: typings.vexflow.Vex.Flow.Modifier.Position.ABOVE with Double = js.native
    
    /* 2 */ val BELOW: typings.vexflow.Vex.Flow.Modifier.Position.BELOW with Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Modifier.Position.LEFT with Double = js.native
    
    /* 0 */ val RIGHT: typings.vexflow.Vex.Flow.Modifier.Position.RIGHT with Double = js.native
  }
}
