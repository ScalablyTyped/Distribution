package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptSnapshot extends StObject {
  
  def getLength(): Double
  
  def getLineStartPositions(): js.Array[Double]
  
  def getText(start: Double, end: Double): String
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): TextChangeRange
}
object IScriptSnapshot {
  
  inline def apply(
    getLength: () => Double,
    getLineStartPositions: () => js.Array[Double],
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => TextChangeRange
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshot]
  }
  
  extension [Self <: IScriptSnapshot](x: Self) {
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setGetLineStartPositions(value: () => js.Array[Double]): Self = StObject.set(x, "getLineStartPositions", js.Any.fromFunction0(value))
    
    inline def setGetText(value: (Double, Double) => String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    inline def setGetTextChangeRangeSinceVersion(value: Double => TextChangeRange): Self = StObject.set(x, "getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
