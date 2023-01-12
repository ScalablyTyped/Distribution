package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineMap extends StObject {
  
  /* private */ var _computeLineStarts: Any
  
  /* private */ var _lineStarts: Any
  
  def equals(other: LineMap): Boolean
  
  def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit
  
  def getLineAndCharacterFromPosition(position: Double): LineAndCharacter
  
  def getLineNumberFromPosition(position: Double): Double
  
  def getLineStartPosition(lineNumber: Double): Double
  
  def getPosition(line: Double, character: Double): Double
  
  /* private */ var length: Any
  
  def lineCount(): Double
  
  def lineStarts(): js.Array[Double]
  
  def toJSON(key: Any): Length
}
object LineMap {
  
  inline def apply(
    _computeLineStarts: Any,
    _lineStarts: Any,
    equals_ : LineMap => Boolean,
    fillLineAndCharacterFromPosition: (Double, ILineAndCharacter) => Unit,
    getLineAndCharacterFromPosition: Double => LineAndCharacter,
    getLineNumberFromPosition: Double => Double,
    getLineStartPosition: Double => Double,
    getPosition: (Double, Double) => Double,
    length: Any,
    lineCount: () => Double,
    lineStarts: () => js.Array[Double],
    toJSON: Any => Length
  ): LineMap = {
    val __obj = js.Dynamic.literal(_computeLineStarts = _computeLineStarts.asInstanceOf[js.Any], _lineStarts = _lineStarts.asInstanceOf[js.Any], fillLineAndCharacterFromPosition = js.Any.fromFunction2(fillLineAndCharacterFromPosition), getLineAndCharacterFromPosition = js.Any.fromFunction1(getLineAndCharacterFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getLineStartPosition = js.Any.fromFunction1(getLineStartPosition), getPosition = js.Any.fromFunction2(getPosition), length = length.asInstanceOf[js.Any], lineCount = js.Any.fromFunction0(lineCount), lineStarts = js.Any.fromFunction0(lineStarts), toJSON = js.Any.fromFunction1(toJSON))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LineMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineMap] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: LineMap => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFillLineAndCharacterFromPosition(value: (Double, ILineAndCharacter) => Unit): Self = StObject.set(x, "fillLineAndCharacterFromPosition", js.Any.fromFunction2(value))
    
    inline def setGetLineAndCharacterFromPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterFromPosition", js.Any.fromFunction1(value))
    
    inline def setGetLineNumberFromPosition(value: Double => Double): Self = StObject.set(x, "getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    inline def setGetLineStartPosition(value: Double => Double): Self = StObject.set(x, "getLineStartPosition", js.Any.fromFunction1(value))
    
    inline def setGetPosition(value: (Double, Double) => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction2(value))
    
    inline def setLength(value: Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: () => Double): Self = StObject.set(x, "lineCount", js.Any.fromFunction0(value))
    
    inline def setLineStarts(value: () => js.Array[Double]): Self = StObject.set(x, "lineStarts", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: Any => Length): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_computeLineStarts(value: Any): Self = StObject.set(x, "_computeLineStarts", value.asInstanceOf[js.Any])
    
    inline def set_lineStarts(value: Any): Self = StObject.set(x, "_lineStarts", value.asInstanceOf[js.Any])
  }
}
