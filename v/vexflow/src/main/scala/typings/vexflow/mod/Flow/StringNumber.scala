package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StringNumber")
@js.native
class StringNumber protected ()
  extends typings.vexflow.Vex.Flow.StringNumber {
  def this(number: String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: Double) = this()
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
@JSImport("vexflow", "Flow.StringNumber")
@js.native
object StringNumber extends js.Object {
  val CATEGORY: String = js.native
  def format(nums: js.Array[typings.vexflow.Vex.Flow.StringNumber], state: Leftshift): Boolean = js.native
}

