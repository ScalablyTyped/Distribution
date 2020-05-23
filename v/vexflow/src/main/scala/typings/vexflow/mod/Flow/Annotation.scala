package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Annotation.Justify
import typings.vexflow.Vex.Flow.Annotation.VerticalJustify
import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Annotation")
@js.native
class Annotation protected ()
  extends typings.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
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
  override def getJustification(): Justify = js.native
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
  override def setFont(family: String, size: Double, weight: String): typings.vexflow.Vex.Flow.Annotation = js.native
  /* CompleteClass */
  override def setIndex(index: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setJustification(justification: Justify): typings.vexflow.Vex.Flow.Annotation = js.native
  /* CompleteClass */
  override def setModifierContext(c: typings.vexflow.Vex.Flow.ModifierContext): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setNote(note: typings.vexflow.Vex.Flow.Note): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setPosition(position: Position): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setTextLine(line: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setVerticalJustification(just: VerticalJustify): typings.vexflow.Vex.Flow.Annotation = js.native
  /* CompleteClass */
  override def setWidth(width: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  /* CompleteClass */
  override def setYShift(y: Double): typings.vexflow.Vex.Flow.Modifier = js.native
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

