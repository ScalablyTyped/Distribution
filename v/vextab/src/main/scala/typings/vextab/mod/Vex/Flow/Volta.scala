package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Volta")
@js.native
open class Volta protected ()
  extends typings.vexflow.mod.Flow.Volta {
  def this(`type`: typings.vexflow.Vex.Flow.Volta.`type`, number: Double, x: Double, y_shift: Double) = this()
}
object Volta {
  
  @JSImport("vextab", "Vex.Flow.Volta.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Volta.`type` & Double] = js.native
    
    /* 0 */ val BEGIN: typings.vexflow.Vex.Flow.Volta.`type`.BEGIN & Double = js.native
    
    /* 3 */ val BEGIN_END: typings.vexflow.Vex.Flow.Volta.`type`.BEGIN_END & Double = js.native
    
    /* 2 */ val END: typings.vexflow.Vex.Flow.Volta.`type`.END & Double = js.native
    
    /* 1 */ val MID: typings.vexflow.Vex.Flow.Volta.`type`.MID & Double = js.native
    
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Volta.`type`.NONE & Double = js.native
  }
}
