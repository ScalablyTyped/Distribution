package typings.textBuffer.mod.global.TextBuffer.Structures

import typings.std.RegExpExecArray
import typings.textBuffer.mod.global.TextBuffer.Range
import typings.textBuffer.mod.global.TextBuffer.TextBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferScanResult extends js.Object {
  var buffer: TextBuffer = js.native
  var lineText: String = js.native
  var `match`: RegExpExecArray = js.native
  var matchText: String = js.native
  var range: Range = js.native
  var stopped: Boolean = js.native
  def replace(replacementText: String): Unit = js.native
  def stop(): Unit = js.native
}

object BufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): BufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferScanResult]
  }
  @scala.inline
  implicit class BufferScanResultOps[Self <: BufferScanResult] (val x: Self) extends AnyVal {
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
    def setBuffer(value: TextBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineText(value: String): Self = this.set("lineText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: RegExpExecArray): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchText(value: String): Self = this.set("matchText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: String => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setStopped(value: Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
  }
  
}

