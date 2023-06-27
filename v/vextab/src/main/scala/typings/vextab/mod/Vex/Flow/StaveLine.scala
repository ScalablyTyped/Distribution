package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Firstindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StaveLine")
@js.native
open class StaveLine protected ()
  extends typings.vexflow.mod.Flow.StaveLine {
  def this(notes: Firstindices) = this()
}
object StaveLine {
  
  @JSImport("vextab", "Vex.Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextJustification & Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT & Double = js.native
  }
  
  @JSImport("vextab", "Vex.Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition & Double] = js.native
    
    /* 0 */ val BOTTOM: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP & Double = js.native
  }
}
