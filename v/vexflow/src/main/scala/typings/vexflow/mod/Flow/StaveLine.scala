package typings.vexflow.mod.Flow

import typings.vexflow.anon.Firstindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveLine")
@js.native
class StaveLine protected ()
  extends typings.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
}
object StaveLine {
  
  @JSImport("vexflow", "Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextJustification with Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER with Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT with Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT with Double = js.native
  }
  
  @JSImport("vexflow", "Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition with Double] = js.native
    
    /* 0 */ val BOTTOM: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM with Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP with Double = js.native
  }
}
