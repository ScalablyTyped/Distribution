package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.TextBracket")
@js.native
open class TextBracket protected ()
  extends typings.vexflow.mod.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
object TextBracket {
  
  @JSImport("vextab", "Vex.Flow.TextBracket")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.TextBracket.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.TextBracket.Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions & Double] = js.native
    
    /* -1 */ val BOTTOM: typings.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.TextBracket.Positions.TOP & Double = js.native
  }
}
