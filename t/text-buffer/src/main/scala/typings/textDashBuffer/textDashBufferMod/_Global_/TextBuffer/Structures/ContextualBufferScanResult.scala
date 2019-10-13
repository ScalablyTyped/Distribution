package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Structures

import typings.std.RegExpExecArray
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualBufferScanResult extends BufferScanResult {
  var leadingContextLines: js.Array[String]
  var trailingContextLines: js.Array[String]
}

object ContextualBufferScanResult {
  @scala.inline
  def apply(
    buffer: typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.TextBuffer,
    leadingContextLines: js.Array[String],
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean,
    trailingContextLines: js.Array[String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, leadingContextLines = leadingContextLines, lineText = lineText, matchText = matchText, range = range, replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped, trailingContextLines = trailingContextLines)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
}

