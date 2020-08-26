package typings.vexflow.global.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
class StaveModifier ()
  extends typings.vexflow.Vex.Flow.StaveModifier

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
object StaveModifier extends js.Object {
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @js.native
  object Position extends js.Object {
    /* 3 */ val ABOVE: typings.vexflow.Vex.Flow.StaveModifier.Position.ABOVE with Double = js.native
    /* 5 */ val BEGIN: typings.vexflow.Vex.Flow.StaveModifier.Position.BEGIN with Double = js.native
    /* 4 */ val BELOW: typings.vexflow.Vex.Flow.StaveModifier.Position.BELOW with Double = js.native
    /* 6 */ val END: typings.vexflow.Vex.Flow.StaveModifier.Position.END with Double = js.native
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveModifier.Position.LEFT with Double = js.native
    /* 2 */ val RIGHT: typings.vexflow.Vex.Flow.StaveModifier.Position.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveModifier.Position with Double] = js.native
  }
  
}

