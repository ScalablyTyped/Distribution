package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Annotation.Justify
import typings.vexflow.Vex.Flow.Annotation.VerticalJustify
import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Annotation")
@js.native
open class Annotation protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Annotation {
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
  
  // (Modifier extends Element in vexflow, but not in these definitions, probably because of some typing problem)
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
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
  override def setStyle(style: FillStyle_): typings.vexflow.Vex.Flow.Modifier = js.native
  
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
object Annotation {
  
  @JSImport("vexflow", "Flow.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Annotation.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Annotation.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.Justify & Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER_STEM & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Annotation.Justify.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.Annotation.Justify.RIGHT & Double = js.native
  }
  
  @JSImport("vexflow", "Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.VerticalJustify & Double] = js.native
    
    /* 1 */ val BOTTOM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.BOTTOM & Double = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER_STEM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.TOP & Double = js.native
  }
  
  /* static member */
  inline def format(annotations: js.Array[typings.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(annotations.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
