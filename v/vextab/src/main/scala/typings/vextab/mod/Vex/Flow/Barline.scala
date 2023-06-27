package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Barline")
@js.native
open class Barline protected ()
  extends typings.vexflow.mod.Flow.Barline {
  def this(`type`: typings.vexflow.Vex.Flow.Barline.`type`, x: Double) = this()
}
object Barline {
  
  @JSImport("vextab", "Vex.Flow.Barline.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Barline.`type` & Double] = js.native
    
    /* 0 */ val DOUBLE: typings.vexflow.Vex.Flow.Barline.`type`.DOUBLE & Double = js.native
    
    /* 1 */ val END: typings.vexflow.Vex.Flow.Barline.`type`.END & Double = js.native
    
    /* 5 */ val NONE: typings.vexflow.Vex.Flow.Barline.`type`.NONE & Double = js.native
    
    /* 2 */ val REPEAT_BEGIN: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BEGIN & Double = js.native
    
    /* 4 */ val REPEAT_BOTH: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BOTH & Double = js.native
    
    /* 3 */ val REPEAT_END: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_END & Double = js.native
    
    /* 1 */ val SINGLE: typings.vexflow.Vex.Flow.Barline.`type`.SINGLE & Double = js.native
  }
}
