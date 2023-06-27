package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Modifier")
@js.native
open class Modifier ()
  extends typings.vexflow.mod.Flow.Modifier
object Modifier {
  
  @JSImport("vextab", "Vex.Flow.Modifier")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Modifier.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Modifier.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.Modifier.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Modifier.Position & Double] = js.native
    
    /* 1 */ val ABOVE: typings.vexflow.Vex.Flow.Modifier.Position.ABOVE & Double = js.native
    
    /* 2 */ val BELOW: typings.vexflow.Vex.Flow.Modifier.Position.BELOW & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Modifier.Position.LEFT & Double = js.native
    
    /* 0 */ val RIGHT: typings.vexflow.Vex.Flow.Modifier.Position.RIGHT & Double = js.native
  }
}
