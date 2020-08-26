package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Stroke.Type
import typings.vexflow.anon.Allvoices
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Stroke")
@js.native
class Stroke protected ()
  extends typings.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typings.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = js.native
  @js.native
  object Type extends js.Object {
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typings.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS with Double = js.native
    /* 1 */ val BRUSH_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN with Double = js.native
    /* 0 */ val BRUSH_UP: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP with Double = js.native
    /* 3 */ val RASQUEDO_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN with Double = js.native
    /* 4 */ val RASQUEDO_UP: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP with Double = js.native
    /* 1 */ val ROLL_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN with Double = js.native
    /* 2 */ val ROLL_UP: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Stroke.Type with Double] = js.native
  }
  
}

