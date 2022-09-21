package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.TextBracket")
@js.native
open class TextBracket protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
object TextBracket {
  
  @JSGlobal("Vex.Flow.TextBracket")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.TextBracket.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.TextBracket.Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions & Double] = js.native
    
    /* -1 */ val BOTTOM: typings.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.TextBracket.Positions.TOP & Double = js.native
  }
}
