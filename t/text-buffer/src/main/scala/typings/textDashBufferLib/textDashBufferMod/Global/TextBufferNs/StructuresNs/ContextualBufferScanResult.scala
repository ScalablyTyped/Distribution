package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualBufferScanResult extends BufferScanResult {
  var leadingContextLines: js.Array[java.lang.String]
  var trailingContextLines: js.Array[java.lang.String]
}

object ContextualBufferScanResult {
  @scala.inline
  def apply(
    buffer: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.TextBuffer,
    leadingContextLines: js.Array[java.lang.String],
    lineText: java.lang.String,
    `match`: stdLib.RegExpExecArray,
    matchText: java.lang.String,
    range: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range,
    replace: js.Function1[java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    stopped: scala.Boolean,
    trailingContextLines: js.Array[java.lang.String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, leadingContextLines = leadingContextLines, lineText = lineText, matchText = matchText, range = range, replace = replace, stop = stop, stopped = stopped, trailingContextLines = trailingContextLines)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
}

