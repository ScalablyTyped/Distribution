package typings.vexflow.Vex.Flow

import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volta extends StaveModifier {
  
  def draw(stave: Stave, x: Double): Volta = js.native
  
  def setShiftY(y: Double): Volta = js.native
}
object Volta {
  
  @scala.inline
  def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Volta,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftY: Double => Volta
  ): Volta = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftY = js.Any.fromFunction1(setShiftY))
    __obj.asInstanceOf[Volta]
  }
  
  @scala.inline
  implicit class VoltaMutableBuilder[Self <: Volta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: (Stave, Double) => Volta): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetShiftY(value: Double => Volta): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Volta.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait BEGIN extends `type`
    
    @js.native
    sealed trait BEGIN_END extends `type`
    
    @js.native
    sealed trait END extends `type`
    
    @js.native
    sealed trait MID extends `type`
    
    @js.native
    sealed trait NONE extends `type`
  }
}
