package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineMap extends js.Object {
  var _computeLineStarts: js.Any
  var _lineStarts: js.Any
  var length: js.Any
  def equals(other: LineMap): Boolean
  def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit
  def getLineAndCharacterFromPosition(position: Double): LineAndCharacter
  def getLineNumberFromPosition(position: Double): Double
  def getLineStartPosition(lineNumber: Double): Double
  def getPosition(line: Double, character: Double): Double
  def lineCount(): Double
  def lineStarts(): js.Array[Double]
  def toJSON(key: js.Any): Length
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
}

