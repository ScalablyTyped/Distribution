package typings.vexflow.mod.Flow

import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Annotation")
@js.native
class Annotation protected ()
  extends typings.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Annotation")
@js.native
object Annotation extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(annotations: js.Array[typings.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = js.native
  @js.native
  object Justify extends js.Object {
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER with Double = js.native
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER_STEM with Double = js.native
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Annotation.Justify.LEFT with Double = js.native
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.Annotation.Justify.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.Justify with Double] = js.native
  }
  
  @js.native
  object VerticalJustify extends js.Object {
    /* 1 */ val BOTTOM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.BOTTOM with Double = js.native
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER with Double = js.native
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER_STEM with Double = js.native
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.TOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.VerticalJustify with Double] = js.native
  }
  
}

