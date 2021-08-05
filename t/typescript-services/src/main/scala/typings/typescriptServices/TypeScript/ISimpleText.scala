package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleText extends StObject {
  
  def charCodeAt(index: Double): Double
  
  def copyTo(sourceIndex: Double, destination: js.Array[Double], destinationIndex: Double, count: Double): Unit
  
  def length(): Double
  
  def lineMap(): LineMap
  
  def subText(span: TextSpan): ISimpleText
  
  def substr(start: Double, length: Double, intern: Boolean): String
}
object ISimpleText {
  
  inline def apply(
    charCodeAt: Double => Double,
    copyTo: (Double, js.Array[Double], Double, Double) => Unit,
    length: () => Double,
    lineMap: () => LineMap,
    subText: TextSpan => ISimpleText,
    substr: (Double, Double, Boolean) => String
  ): ISimpleText = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), copyTo = js.Any.fromFunction4(copyTo), length = js.Any.fromFunction0(length), lineMap = js.Any.fromFunction0(lineMap), subText = js.Any.fromFunction1(subText), substr = js.Any.fromFunction3(substr))
    __obj.asInstanceOf[ISimpleText]
  }
  
  extension [Self <: ISimpleText](x: Self) {
    
    inline def setCharCodeAt(value: Double => Double): Self = StObject.set(x, "charCodeAt", js.Any.fromFunction1(value))
    
    inline def setCopyTo(value: (Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction4(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    inline def setSubText(value: TextSpan => ISimpleText): Self = StObject.set(x, "subText", js.Any.fromFunction1(value))
    
    inline def setSubstr(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "substr", js.Any.fromFunction3(value))
  }
}
