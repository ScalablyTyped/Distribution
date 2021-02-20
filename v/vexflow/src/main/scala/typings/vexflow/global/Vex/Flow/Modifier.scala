package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Modifier")
@js.native
class Modifier ()
  extends typings.vexflow.Vex.Flow.Modifier
object Modifier {
  
  @JSGlobal("Vex.Flow.Modifier")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Modifier.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Modifier.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.Modifier.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Modifier.Position with Double] = js.native
    
    /* 1 */ val ABOVE: typings.vexflow.Vex.Flow.Modifier.Position.ABOVE with Double = js.native
    
    /* 2 */ val BELOW: typings.vexflow.Vex.Flow.Modifier.Position.BELOW with Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Modifier.Position.LEFT with Double = js.native
    
    /* 0 */ val RIGHT: typings.vexflow.Vex.Flow.Modifier.Position.RIGHT with Double = js.native
  }
}
