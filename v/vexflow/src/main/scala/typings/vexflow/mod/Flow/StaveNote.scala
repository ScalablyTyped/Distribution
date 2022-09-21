package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Tickable
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveNote")
@js.native
open class StaveNote protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: typings.vexflow.anon.Clef) = this()
  
  /* CompleteClass */
  override def addModifier(mod: typings.vexflow.Vex.Flow.Modifier): Tickable = js.native
  
  /* CompleteClass */
  override def addToModifierContext(mc: typings.vexflow.Vex.Flow.ModifierContext): Unit = js.native
  
  /* CompleteClass */
  override def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  
  /* CompleteClass */
  override def getBoundingBox(): typings.vexflow.Vex.Flow.BoundingBox = js.native
  
  /* CompleteClass */
  override def getCenterXShift(): Double = js.native
  
  /* CompleteClass */
  override def getIntrinsicTicks(): typings.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTickMultiplier(): typings.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTicks(): typings.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTuplet(): typings.vexflow.Vex.Flow.Tuplet = js.native
  
  /* CompleteClass */
  override def getVoice(): typings.vexflow.Vex.Flow.Voice = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def isCenterAligned(): Boolean = js.native
  
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  
  /* CompleteClass */
  override def preFormat(): Unit = js.native
  
  /* CompleteClass */
  override def setCenterAlignment(align_center: Boolean): Tickable = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  
  /* CompleteClass */
  override def setDuration(duration: typings.vexflow.Vex.Flow.Fraction): Unit = js.native
  
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: typings.vexflow.Vex.Flow.Fraction): Unit = js.native
  
  /* CompleteClass */
  override def setTickContext(tc: typings.vexflow.Vex.Flow.TickContext): Unit = js.native
  
  /* CompleteClass */
  override def setTuplet(tuplet: typings.vexflow.Vex.Flow.Tuplet): Tickable = js.native
  
  /* CompleteClass */
  override def setVoice(voice: typings.vexflow.Vex.Flow.Voice): Unit = js.native
  
  /* CompleteClass */
  override def setXShift(x: Double): Tickable = js.native
  
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}
object StaveNote {
  
  @JSImport("vexflow", "Flow.StaveNote")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_DOWN")
  @js.native
  val STEM_DOWN: Double = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_UP")
  @js.native
  val STEM_UP: Double = js.native
  
  /* static member */
  inline def format(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def formatByY(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatByY")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def postFormat(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("postFormat")(notes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
