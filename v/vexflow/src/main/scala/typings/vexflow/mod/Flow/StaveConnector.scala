package typings.vexflow.mod.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveConnector")
@js.native
class StaveConnector protected ()
  extends typings.vexflow.Vex.Flow.StaveConnector {
  def this(top_stave: typings.vexflow.Vex.Flow.Stave, bottom_stave: typings.vexflow.Vex.Flow.Stave) = this()
}

@JSImport("vexflow", "Flow.StaveConnector")
@js.native
object StaveConnector extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 5 */ val BOLD_DOUBLE_LEFT: typings.vexflow.Vex.Flow.StaveConnector.`type`.BOLD_DOUBLE_LEFT with Double = js.native
    /* 6 */ val BOLD_DOUBLE_RIGHT: typings.vexflow.Vex.Flow.StaveConnector.`type`.BOLD_DOUBLE_RIGHT with Double = js.native
    /* 3 */ val BRACE: typings.vexflow.Vex.Flow.StaveConnector.`type`.BRACE with Double = js.native
    /* 4 */ val BRACKET: typings.vexflow.Vex.Flow.StaveConnector.`type`.BRACKET with Double = js.native
    /* 2 */ val DOUBLE: typings.vexflow.Vex.Flow.StaveConnector.`type`.DOUBLE with Double = js.native
    /* 8 */ val NONE: typings.vexflow.Vex.Flow.StaveConnector.`type`.NONE with Double = js.native
    /* 1 */ val SINGLE: typings.vexflow.Vex.Flow.StaveConnector.`type`.SINGLE with Double = js.native
    /* 1 */ val SINGLE_LEFT: typings.vexflow.Vex.Flow.StaveConnector.`type`.SINGLE_LEFT with Double = js.native
    /* 0 */ val SINGLE_RIGHT: typings.vexflow.Vex.Flow.StaveConnector.`type`.SINGLE_RIGHT with Double = js.native
    /* 7 */ val THIN_DOUBLE: typings.vexflow.Vex.Flow.StaveConnector.`type`.THIN_DOUBLE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveConnector.`type` with Double] = js.native
  }
  
}

