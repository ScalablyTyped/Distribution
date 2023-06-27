package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StaveModifier")
@js.native
open class StaveModifier ()
  extends typings.vexflow.mod.Flow.StaveModifier
object StaveModifier {
  
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @JSImport("vextab", "Vex.Flow.StaveModifier.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveModifier.Position & Double] = js.native
    
    /* 3 */ val ABOVE: typings.vexflow.Vex.Flow.StaveModifier.Position.ABOVE & Double = js.native
    
    /* 5 */ val BEGIN: typings.vexflow.Vex.Flow.StaveModifier.Position.BEGIN & Double = js.native
    
    /* 4 */ val BELOW: typings.vexflow.Vex.Flow.StaveModifier.Position.BELOW & Double = js.native
    
    /* 6 */ val END: typings.vexflow.Vex.Flow.StaveModifier.Position.END & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveModifier.Position.LEFT & Double = js.native
    
    /* 2 */ val RIGHT: typings.vexflow.Vex.Flow.StaveModifier.Position.RIGHT & Double = js.native
  }
}
