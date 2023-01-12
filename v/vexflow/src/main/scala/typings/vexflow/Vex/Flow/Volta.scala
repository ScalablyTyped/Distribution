package typings.vexflow.Vex.Flow

import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volta
  extends StObject
     with StaveModifier {
  
  def draw(stave: Stave, x: Double): Volta
  
  def setShiftY(y: Double): Volta
}
object Volta {
  
  inline def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Volta,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getStyle: () => FillStyle_,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftY: Double => Volta,
    setStyle: FillStyle_ => StaveModifier
  ): Volta = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getStyle = js.Any.fromFunction0(getStyle), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftY = js.Any.fromFunction1(setShiftY), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Volta]
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Volta.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait BEGIN
      extends StObject
         with `type`
    
    @js.native
    sealed trait BEGIN_END
      extends StObject
         with `type`
    
    @js.native
    sealed trait END
      extends StObject
         with `type`
    
    @js.native
    sealed trait MID
      extends StObject
         with `type`
    
    @js.native
    sealed trait NONE
      extends StObject
         with `type`
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Volta] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: (Stave, Double) => Volta): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setSetShiftY(value: Double => Volta): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
  }
}
