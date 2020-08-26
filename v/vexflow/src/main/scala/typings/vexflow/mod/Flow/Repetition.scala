package typings.vexflow.mod.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Repetition")
@js.native
class Repetition protected ()
  extends typings.vexflow.Vex.Flow.Repetition {
  def this(`type`: typings.vexflow.Vex.Flow.Repetition.`type`, x: Double, y_shift: Double) = this()
}

@JSImport("vexflow", "Flow.Repetition")
@js.native
object Repetition extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 0 */ val CODA_LEFT: typings.vexflow.Vex.Flow.Repetition.`type`.CODA_LEFT with Double = js.native
    /* 1 */ val CODA_RIGHT: typings.vexflow.Vex.Flow.Repetition.`type`.CODA_RIGHT with Double = js.native
    /* 4 */ val DC: typings.vexflow.Vex.Flow.Repetition.`type`.DC with Double = js.native
    /* 5 */ val DC_AL_CODA: typings.vexflow.Vex.Flow.Repetition.`type`.DC_AL_CODA with Double = js.native
    /* 6 */ val DC_AL_FINE: typings.vexflow.Vex.Flow.Repetition.`type`.DC_AL_FINE with Double = js.native
    /* 7 */ val DS: typings.vexflow.Vex.Flow.Repetition.`type`.DS with Double = js.native
    /* 8 */ val DS_AL_CODA: typings.vexflow.Vex.Flow.Repetition.`type`.DS_AL_CODA with Double = js.native
    /* 9 */ val DS_AL_FINE: typings.vexflow.Vex.Flow.Repetition.`type`.DS_AL_FINE with Double = js.native
    /* 10 */ val FINE: typings.vexflow.Vex.Flow.Repetition.`type`.FINE with Double = js.native
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Repetition.`type`.NONE with Double = js.native
    /* 2 */ val SEGNO_LEFT: typings.vexflow.Vex.Flow.Repetition.`type`.SEGNO_LEFT with Double = js.native
    /* 3 */ val SEGNO_RIGHT: typings.vexflow.Vex.Flow.Repetition.`type`.SEGNO_RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Repetition.`type` with Double] = js.native
  }
  
}

