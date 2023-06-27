package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.TextNote")
@js.native
open class TextNote protected ()
  extends typings.vexflow.mod.Flow.TextNote {
  def this(text_struct: typings.vexflow.anon.Font) = this()
}
object TextNote {
  
  @JSImport("vextab", "Vex.Flow.TextNote.Justification")
  @js.native
  object Justification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification & Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.TextNote.Justification.CENTER & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.TextNote.Justification.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.TextNote.Justification.RIGHT & Double = js.native
  }
}
