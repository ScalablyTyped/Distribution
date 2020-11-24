package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineMap extends js.Object {
  
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
    equals: LineMap => Boolean,
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
    val __obj = js.Dynamic.literal(_computeLineStarts = _computeLineStarts.asInstanceOf[js.Any], _lineStarts = _lineStarts.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), fillLineAndCharacterFromPosition = js.Any.fromFunction2(fillLineAndCharacterFromPosition), getLineAndCharacterFromPosition = js.Any.fromFunction1(getLineAndCharacterFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getLineStartPosition = js.Any.fromFunction1(getLineStartPosition), getPosition = js.Any.fromFunction2(getPosition), length = length.asInstanceOf[js.Any], lineCount = js.Any.fromFunction0(lineCount), lineStarts = js.Any.fromFunction0(lineStarts), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[LineMap]
  }
  
  @scala.inline
  implicit class LineMapOps[Self <: LineMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_computeLineStarts(value: js.Any): Self = this.set("_computeLineStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineStarts(value: js.Any): Self = this.set("_lineStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: LineMap => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillLineAndCharacterFromPosition(value: (Double, ILineAndCharacter) => Unit): Self = this.set("fillLineAndCharacterFromPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLineAndCharacterFromPosition(value: Double => LineAndCharacter): Self = this.set("getLineAndCharacterFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineNumberFromPosition(value: Double => Double): Self = this.set("getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineStartPosition(value: Double => Double): Self = this.set("getLineStartPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPosition(value: (Double, Double) => Double): Self = this.set("getPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLength(value: js.Any): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: () => Double): Self = this.set("lineCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineStarts(value: () => js.Array[Double]): Self = this.set("lineStarts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: js.Any => Length): Self = this.set("toJSON", js.Any.fromFunction1(value))
  }
}
