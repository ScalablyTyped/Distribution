package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Arrowheadangle
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Lastnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.StaveLine")
@js.native
open class StaveLine protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
  
  /* CompleteClass */
  override def applyFontStyle(): Unit = js.native
  
  /* CompleteClass */
  override def applyLineStyle(): Unit = js.native
  
  /* CompleteClass */
  override def draw(): typings.vexflow.Vex.Flow.StaveLine = js.native
  
  //inconsistent API: this should be set via an options object in the constructor
  /* CompleteClass */
  var render_options: Arrowheadangle = js.native
  
  /* CompleteClass */
  override def setContext(context: js.Object): typings.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setFont(font: Family): typings.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setNotes(notes: Lastnote): typings.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setText(text: String): typings.vexflow.Vex.Flow.StaveLine = js.native
}
object StaveLine {
  
  @JSGlobal("Vex.Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextJustification & Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT & Double = js.native
  }
  
  @JSGlobal("Vex.Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition & Double] = js.native
    
    /* 0 */ val BOTTOM: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP & Double = js.native
  }
}
