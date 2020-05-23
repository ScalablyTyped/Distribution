package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var _fileName: js.Any
  var _length: js.Any
  var _lineMap: js.Any
  var _start: js.Any
  def character(): Double
  def fileName(): String
  def length(): Double
  def line(): Double
  def lineMap(): LineMap
  def start(): Double
}

object Location {
  @scala.inline
  def apply(
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    character: () => Double,
    fileName: () => String,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    start: () => Double
  ): Location = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), fileName = js.Any.fromFunction0(fileName), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Location]
  }
}

