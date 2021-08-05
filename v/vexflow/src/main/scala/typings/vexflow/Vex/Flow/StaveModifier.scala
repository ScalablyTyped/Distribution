package typings.vexflow.Vex.Flow

import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveModifier extends StObject {
  
  def addEndModifier(): Unit
  
  def addModifier(): Unit
  
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier
  
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier
  
  def getCategory(): String
  
  def getPadding(index: Double): Double
  
  def getPosition(): Double
  
  def getWidth(): Double
  
  def makeSpacer(padding: Double): GetContext
  
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit
  
  def setPadding(padding: Double): Unit
}
object StaveModifier {
  
  inline def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit
  ): StaveModifier = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding))
    __obj.asInstanceOf[StaveModifier]
  }
  
  @js.native
  sealed trait Position extends StObject
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @JSGlobal("Vex.Flow.StaveModifier.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait ABOVE
      extends StObject
         with Position
    
    @js.native
    sealed trait BEGIN
      extends StObject
         with Position
    
    @js.native
    sealed trait BELOW
      extends StObject
         with Position
    
    @js.native
    sealed trait END
      extends StObject
         with Position
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Position
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Position
  }
  
  extension [Self <: StaveModifier](x: Self) {
    
    inline def setAddEndModifier(value: () => Unit): Self = StObject.set(x, "addEndModifier", js.Any.fromFunction0(value))
    
    inline def setAddModifier(value: () => Unit): Self = StObject.set(x, "addModifier", js.Any.fromFunction0(value))
    
    inline def setAddToStave(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStave", js.Any.fromFunction2(value))
    
    inline def setAddToStaveEnd(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStaveEnd", js.Any.fromFunction2(value))
    
    inline def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
    
    inline def setGetPadding(value: Double => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
    
    inline def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setMakeSpacer(value: Double => GetContext): Self = StObject.set(x, "makeSpacer", js.Any.fromFunction1(value))
    
    inline def setPlaceGlyphOnLine(value: (Glyph, Stave, Double) => Unit): Self = StObject.set(x, "placeGlyphOnLine", js.Any.fromFunction3(value))
    
    inline def setSetPadding(value: Double => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
  }
}
