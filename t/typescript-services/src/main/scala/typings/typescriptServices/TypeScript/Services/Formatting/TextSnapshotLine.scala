package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSnapshotLine extends ITextSnapshotLine {
  var _end: js.Any
  var _lineBreak: js.Any
  var _lineNumber: js.Any
  var _snapshot: js.Any
  var _start: js.Any
}

object TextSnapshotLine {
  @scala.inline
  def apply(
    _end: js.Any,
    _lineBreak: js.Any,
    _lineNumber: js.Any,
    _snapshot: js.Any,
    _start: js.Any,
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => Double,
    endPosition: () => Double,
    getText: () => String,
    length: () => Double,
    lineNumber: () => Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => Double
  ): TextSnapshotLine = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _lineBreak = _lineBreak.asInstanceOf[js.Any], _lineNumber = _lineNumber.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[TextSnapshotLine]
  }
}

