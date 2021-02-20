package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineMap extends StObject {
  
  var _computeLineStarts: js.Any = js.native
  
  var _lineStarts: js.Any = js.native
  
  def equals(other: LineMap): Boolean = js.native
  
  def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit = js.native
  
  def getLineAndCharacterFromPosition(position: Double): LineAndCharacter = js.native
  
  def getLineNumberFromPosition(position: Double): Double = js.native
  
  def getLineStartPosition(lineNumber: Double): Double = js.native
  
  def getPosition(line: Double, character: Double): Double = js.native
  
  var length: js.Any = js.native
  
  def lineCount(): Double = js.native
  
  def lineStarts(): js.Array[Double] = js.native
  
  def toJSON(key: js.Any): Length = js.native
}
object LineMap {
  
  @scala.inline
  def apply(
    _computeLineStarts: js.Any,
    _lineStarts: js.Any,
    equals_ : LineMap => Boolean,
    fillLineAndCharacterFromPosition: (Double, ILineAndCharacter) => Unit,
    getLineAndCharacterFromPosition: Double => LineAndCharacter,
    getLineNumberFromPosition: Double => Double,
    getLineStartPosition: Double => Double,
    getPosition: (Double, Double) => Double,
    length: js.Any,
    lineCount: () => Double,
    lineStarts: () => js.Array[Double],
    toJSON: js.Any => Length
  ): LineMap = {
    val __obj = js.Dynamic.literal(_computeLineStarts = _computeLineStarts.asInstanceOf[js.Any], _lineStarts = _lineStarts.asInstanceOf[js.Any], fillLineAndCharacterFromPosition = js.Any.fromFunction2(fillLineAndCharacterFromPosition), getLineAndCharacterFromPosition = js.Any.fromFunction1(getLineAndCharacterFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getLineStartPosition = js.Any.fromFunction1(getLineStartPosition), getPosition = js.Any.fromFunction2(getPosition), length = length.asInstanceOf[js.Any], lineCount = js.Any.fromFunction0(lineCount), lineStarts = js.Any.fromFunction0(lineStarts), toJSON = js.Any.fromFunction1(toJSON))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LineMap]
  }
  
  @scala.inline
  implicit class LineMapMutableBuilder[Self <: LineMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: LineMap => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillLineAndCharacterFromPosition(value: (Double, ILineAndCharacter) => Unit): Self = StObject.set(x, "fillLineAndCharacterFromPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLineAndCharacterFromPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineNumberFromPosition(value: Double => Double): Self = StObject.set(x, "getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineStartPosition(value: Double => Double): Self = StObject.set(x, "getLineStartPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPosition(value: (Double, Double) => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: () => Double): Self = StObject.set(x, "lineCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineStarts(value: () => js.Array[Double]): Self = StObject.set(x, "lineStarts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: js.Any => Length): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_computeLineStarts(value: js.Any): Self = StObject.set(x, "_computeLineStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineStarts(value: js.Any): Self = StObject.set(x, "_lineStarts", value.asInstanceOf[js.Any])
  }
}
