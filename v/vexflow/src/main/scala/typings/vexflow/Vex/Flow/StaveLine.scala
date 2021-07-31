package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Arrowheadangle
import typings.vexflow.anon.Family
import typings.vexflow.anon.Lastnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveLine extends StObject {
  
  def applyFontStyle(): Unit
  
  def applyLineStyle(): Unit
  
  def draw(): StaveLine
  
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Arrowheadangle
  
  def setContext(context: js.Object): StaveLine
  
  def setFont(font: Family): StaveLine
  
  def setNotes(notes: Lastnote): StaveLine
  
  def setText(text: String): StaveLine
}
object StaveLine {
  
  @scala.inline
  def apply(
    applyFontStyle: () => Unit,
    applyLineStyle: () => Unit,
    draw: () => StaveLine,
    render_options: Arrowheadangle,
    setContext: js.Object => StaveLine,
    setFont: Family => StaveLine,
    setNotes: Lastnote => StaveLine,
    setText: String => StaveLine
  ): StaveLine = {
    val __obj = js.Dynamic.literal(applyFontStyle = js.Any.fromFunction0(applyFontStyle), applyLineStyle = js.Any.fromFunction0(applyLineStyle), draw = js.Any.fromFunction0(draw), render_options = render_options.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[StaveLine]
  }
  
  @js.native
  sealed trait TextJustification extends StObject
  @JSGlobal("Vex.Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with TextJustification
    
    @js.native
    sealed trait LEFT
      extends StObject
         with TextJustification
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with TextJustification
  }
  
  @js.native
  sealed trait TextVerticalPosition extends StObject
  @JSGlobal("Vex.Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with TextVerticalPosition
    
    @js.native
    sealed trait TOP
      extends StObject
         with TextVerticalPosition
  }
  
  @scala.inline
  implicit class StaveLineMutableBuilder[Self <: StaveLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyFontStyle(value: () => Unit): Self = StObject.set(x, "applyFontStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyLineStyle(value: () => Unit): Self = StObject.set(x, "applyLineStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraw(value: () => StaveLine): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender_options(value: Arrowheadangle): Self = StObject.set(x, "render_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContext(value: js.Object => StaveLine): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFont(value: Family => StaveLine): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotes(value: Lastnote => StaveLine): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => StaveLine): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
