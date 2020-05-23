package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Modifier")
@js.native
class Modifier ()
  extends typings.vexflow.Vex.Flow.Modifier {
  /* CompleteClass */
  override def alignSubNotesWithNote(subNotes: js.Array[typings.vexflow.Vex.Flow.Note], note: typings.vexflow.Vex.Flow.Note): Unit = js.native
   //inconsistent type: void -> Modifier
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  /* CompleteClass */
  override def getIndex(): Double = js.native
  /* CompleteClass */
  override def getModifierContext(): typings.vexflow.Vex.Flow.ModifierContext = js.native
  /* CompleteClass */
  override def getNote(): typings.vexflow.Vex.Flow.Note = js.native
  /* CompleteClass */
  override def getPosition(): Position = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setIndex(index: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setModifierContext(c: typings.vexflow.Vex.Flow.ModifierContext): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setNote(note: typings.vexflow.Vex.Flow.Note): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setPosition(position: Position): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setTextLine(line: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setWidth(width: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  /* CompleteClass */
  override def setYShift(y: Double): typings.vexflow.Vex.Flow.Modifier = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Modifier")
@js.native
object Modifier extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  @js.native
  object Position extends js.Object {
    /* 1 */ val ABOVE: typings.vexflow.Vex.Flow.Modifier.Position.ABOVE with Double = js.native
    /* 2 */ val BELOW: typings.vexflow.Vex.Flow.Modifier.Position.BELOW with Double = js.native
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Modifier.Position.LEFT with Double = js.native
    /* 0 */ val RIGHT: typings.vexflow.Vex.Flow.Modifier.Position.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Modifier.Position with Double] = js.native
  }
  
}

