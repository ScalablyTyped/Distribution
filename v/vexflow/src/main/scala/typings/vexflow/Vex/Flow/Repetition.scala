package typings.vexflow.Vex.Flow

import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repetition
  extends StObject
     with StaveModifier {
  
  def draw(stave: Stave, x: Double): Repetition
  
  def drawCodaFixed(stave: Stave, x: Double): Repetition
  
  def drawSignoFixed(stave: Stave, x: Double): Repetition
  
  //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: Double, text: String, draw_coda: Boolean): Repetition
  
  def setShiftX(x: Double): Repetition
  
  def setShiftY(y: Double): Repetition
}
object Repetition {
  
  inline def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Repetition,
    drawCodaFixed: (Stave, Double) => Repetition,
    drawSignoFixed: (Stave, Double) => Repetition,
    drawSymbolText: (Stave, Double, String, Boolean) => Repetition,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getStyle: () => FillStyle_,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftX: Double => Repetition,
    setShiftY: Double => Repetition,
    setStyle: FillStyle_ => StaveModifier
  ): Repetition = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), drawCodaFixed = js.Any.fromFunction2(drawCodaFixed), drawSignoFixed = js.Any.fromFunction2(drawSignoFixed), drawSymbolText = js.Any.fromFunction4(drawSymbolText), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getStyle = js.Any.fromFunction0(getStyle), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftX = js.Any.fromFunction1(setShiftX), setShiftY = js.Any.fromFunction1(setShiftY), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Repetition]
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Repetition.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait CODA_LEFT
      extends StObject
         with `type`
    
    @js.native
    sealed trait CODA_RIGHT
      extends StObject
         with `type`
    
    @js.native
    sealed trait DC
      extends StObject
         with `type`
    
    @js.native
    sealed trait DC_AL_CODA
      extends StObject
         with `type`
    
    @js.native
    sealed trait DC_AL_FINE
      extends StObject
         with `type`
    
    @js.native
    sealed trait DS
      extends StObject
         with `type`
    
    @js.native
    sealed trait DS_AL_CODA
      extends StObject
         with `type`
    
    @js.native
    sealed trait DS_AL_FINE
      extends StObject
         with `type`
    
    @js.native
    sealed trait FINE
      extends StObject
         with `type`
    
    @js.native
    sealed trait NONE
      extends StObject
         with `type`
    
    @js.native
    sealed trait SEGNO_LEFT
      extends StObject
         with `type`
    
    @js.native
    sealed trait SEGNO_RIGHT
      extends StObject
         with `type`
  }
  
  extension [Self <: Repetition](x: Self) {
    
    inline def setDraw(value: (Stave, Double) => Repetition): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setDrawCodaFixed(value: (Stave, Double) => Repetition): Self = StObject.set(x, "drawCodaFixed", js.Any.fromFunction2(value))
    
    inline def setDrawSignoFixed(value: (Stave, Double) => Repetition): Self = StObject.set(x, "drawSignoFixed", js.Any.fromFunction2(value))
    
    inline def setDrawSymbolText(value: (Stave, Double, String, Boolean) => Repetition): Self = StObject.set(x, "drawSymbolText", js.Any.fromFunction4(value))
    
    inline def setSetShiftX(value: Double => Repetition): Self = StObject.set(x, "setShiftX", js.Any.fromFunction1(value))
    
    inline def setSetShiftY(value: Double => Repetition): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
  }
}
