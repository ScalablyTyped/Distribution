package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.TextBracket")
@js.native
class TextBracket protected ()
  extends typings.vexflow.Vex.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
/* static members */
@JSGlobal("Vex.Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  
  var DEBUG: Boolean = js.native
  
  @js.native
  object Positions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions with Double] = js.native
    
    /* -1 */ val BOTTOM: typings.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM with Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.TextBracket.Positions.TOP with Double = js.native
  }
}
