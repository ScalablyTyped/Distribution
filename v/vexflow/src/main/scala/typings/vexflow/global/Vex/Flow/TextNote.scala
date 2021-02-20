package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.TextNote")
@js.native
class TextNote protected ()
  extends typings.vexflow.Vex.Flow.TextNote {
  def this(text_struct: typings.vexflow.anon.Font) = this()
}
object TextNote {
  
  @JSGlobal("Vex.Flow.TextNote.Justification")
  @js.native
  object Justification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification with Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.TextNote.Justification.CENTER with Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.TextNote.Justification.LEFT with Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.TextNote.Justification.RIGHT with Double = js.native
  }
}
