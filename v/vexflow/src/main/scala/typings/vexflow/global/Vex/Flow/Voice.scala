package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Beatvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Voice")
@js.native
class Voice protected ()
  extends typings.vexflow.Vex.Flow.Voice {
  def this(time: Beatvalue) = this()
}

@JSGlobal("Vex.Flow.Voice")
@js.native
object Voice extends js.Object {
  @js.native
  object Mode extends js.Object {
    /* 1 */ val FULL: typings.vexflow.Vex.Flow.Voice.Mode.FULL with Double = js.native
    /* 0 */ val SOFT: typings.vexflow.Vex.Flow.Voice.Mode.SOFT with Double = js.native
    /* 1 */ val STRICT: typings.vexflow.Vex.Flow.Voice.Mode.STRICT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Voice.Mode with Double] = js.native
  }
  
}

