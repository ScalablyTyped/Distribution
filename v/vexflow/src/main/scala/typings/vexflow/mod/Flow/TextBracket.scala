package typings.vexflow.mod.Flow

import typings.vexflow.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TextBracket")
@js.native
class TextBracket protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
object TextBracket {
  
  @JSImport("vexflow", "Flow.TextBracket")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.TextBracket.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.TextBracket.Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions & Double] = js.native
    
    /* -1 */ val BOTTOM: typings.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.TextBracket.Positions.TOP & Double = js.native
  }
}
