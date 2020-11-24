package typings.vexflow.mod.Flow

import typings.vexflow.anon.Cps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Curve")
@js.native
class Curve protected ()
  extends typings.vexflow.Vex.Flow.Curve {
  def this(from: typings.vexflow.Vex.Flow.Note, to: typings.vexflow.Vex.Flow.Note) = this()
  def this(from: typings.vexflow.Vex.Flow.Note, to: typings.vexflow.Vex.Flow.Note, options: Cps) = this()
}
/* static members */
@JSImport("vexflow", "Flow.Curve")
@js.native
object Curve extends js.Object {
  
  var DEBUG: Boolean = js.native
  
  @js.native
  object Position extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Curve.Position with Double] = js.native
    
    /* 1 */ val NEAR_HEAD: typings.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD with Double = js.native
    
    /* 0 */ val NEAR_TOP: typings.vexflow.Vex.Flow.Curve.Position.NEAR_TOP with Double = js.native
  }
}
