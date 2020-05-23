package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends Location {
  var _additionalLocations: js.Any
  var _arguments: js.Any
  var _diagnosticKey: js.Any
  def additionalLocations(): js.Array[Location]
  def arguments(): js.Array[_]
  def diagnosticKey(): String
  def info(): DiagnosticInfo
  def message(): String
  def text(): String
  def toJSON(key: js.Any): js.Any
}

object Diagnostic {
  @scala.inline
  def apply(
    _additionalLocations: js.Any,
    _arguments: js.Any,
    _diagnosticKey: js.Any,
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    additionalLocations: () => js.Array[Location],
    arguments: () => js.Array[_],
    character: () => Double,
    diagnosticKey: () => String,
    fileName: () => String,
    info: () => DiagnosticInfo,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    message: () => String,
    start: () => Double,
    text: () => String,
    toJSON: js.Any => js.Any
  ): Diagnostic = {
    val __obj = js.Dynamic.literal(_additionalLocations = _additionalLocations.asInstanceOf[js.Any], _arguments = _arguments.asInstanceOf[js.Any], _diagnosticKey = _diagnosticKey.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], additionalLocations = js.Any.fromFunction0(additionalLocations), arguments = js.Any.fromFunction0(arguments), character = js.Any.fromFunction0(character), diagnosticKey = js.Any.fromFunction0(diagnosticKey), fileName = js.Any.fromFunction0(fileName), info = js.Any.fromFunction0(info), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), message = js.Any.fromFunction0(message), start = js.Any.fromFunction0(start), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[Diagnostic]
  }
}

