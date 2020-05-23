package typings.vexflow.mod.Flow

import typings.vexflow.anon.Arrowheadangle
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Lastnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveLine")
@js.native
class StaveLine protected ()
  extends typings.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
  //inconsistent API: this should be set via an options object in the constructor
  /* CompleteClass */
  override var render_options: Arrowheadangle = js.native
  /* CompleteClass */
  override def applyFontStyle(): Unit = js.native
  /* CompleteClass */
  override def applyLineStyle(): Unit = js.native
  /* CompleteClass */
  override def draw(): typings.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setContext(context: js.Object): typings.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setFont(font: Family): typings.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setNotes(notes: Lastnote): typings.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setText(text: String): typings.vexflow.Vex.Flow.StaveLine = js.native
}

@JSImport("vexflow", "Flow.StaveLine")
@js.native
object StaveLine extends js.Object {
  @js.native
  object TextJustification extends js.Object {
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER with Double = js.native
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT with Double = js.native
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextJustification with Double] = js.native
  }
  
  @js.native
  object TextVerticalPosition extends js.Object {
    /* 0 */ val BOTTOM: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM with Double = js.native
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition with Double] = js.native
  }
  
}

