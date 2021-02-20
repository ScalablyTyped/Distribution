package typings.vexflow.Vex.Flow

import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveModifier extends StObject {
  
  def addEndModifier(): Unit = js.native
  
  def addModifier(): Unit = js.native
  
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  
  def getCategory(): String = js.native
  
  def getPadding(index: Double): Double = js.native
  
  def getPosition(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def makeSpacer(padding: Double): GetContext = js.native
  
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit = js.native
  
  def setPadding(padding: Double): Unit = js.native
}
object StaveModifier {
  
  @scala.inline
  def apply(
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
    sealed trait ABOVE extends Position
    
    @js.native
    sealed trait BEGIN extends Position
    
    @js.native
    sealed trait BELOW extends Position
    
    @js.native
    sealed trait END extends Position
    
    @js.native
    sealed trait LEFT extends Position
    
    @js.native
    sealed trait RIGHT extends Position
  }
  
  @scala.inline
  implicit class StaveModifierMutableBuilder[Self <: StaveModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEndModifier(value: () => Unit): Self = StObject.set(x, "addEndModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddModifier(value: () => Unit): Self = StObject.set(x, "addModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddToStave(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddToStaveEnd(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStaveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPadding(value: Double => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeSpacer(value: Double => GetContext): Self = StObject.set(x, "makeSpacer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlaceGlyphOnLine(value: (Glyph, Stave, Double) => Unit): Self = StObject.set(x, "placeGlyphOnLine", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPadding(value: Double => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
  }
}
