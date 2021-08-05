package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Accidental")
@js.native
class Accidental protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
  
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
object Accidental {
  
  @JSGlobal("Vex.Flow.Accidental")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Accidental.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Accidental.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyAccidentals")(voices.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice], keySignature: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAccidentals")(voices.asInstanceOf[js.Any], keySignature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def format(accidentals: js.Array[typings.vexflow.Vex.Flow.Accidental], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(accidentals.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
