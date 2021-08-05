package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import typings.vexflow.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Bend")
@js.native
class Bend protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
  def this(text: String, release: Unit, phrase: js.Array[Text]) = this()
  
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
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setFont(font: String): typings.vexflow.Vex.Flow.Bend = js.native
  
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
  
  /* CompleteClass */
  override def updateWidth(): typings.vexflow.Vex.Flow.Bend = js.native
}
object Bend {
  
  @JSImport("vexflow", "Flow.Bend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Bend.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Bend.DOWN")
  @js.native
  def DOWN: Double = js.native
  inline def DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.Bend.UP")
  @js.native
  def UP: Double = js.native
  inline def UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(bends: js.Array[typings.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(bends.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
