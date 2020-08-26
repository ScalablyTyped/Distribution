package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint = js.native
  def endIncludingLineBreak(): SnapshotPoint = js.native
  def endIncludingLineBreakPosition(): Double = js.native
  def endPosition(): Double = js.native
  def getText(): String = js.native
  def length(): Double = js.native
  def lineNumber(): Double = js.native
  def snapshot(): ITextSnapshot = js.native
  def start(): SnapshotPoint = js.native
  def startPosition(): Double = js.native
}

object ITextSnapshotLine {
  @scala.inline
  def apply(
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
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[ITextSnapshotLine]
  }
  @scala.inline
  implicit class ITextSnapshotLineOps[Self <: ITextSnapshotLine] (val x: Self) extends AnyVal {
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
    def setEnd(value: () => SnapshotPoint): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setEndIncludingLineBreak(value: () => SnapshotPoint): Self = this.set("endIncludingLineBreak", js.Any.fromFunction0(value))
    @scala.inline
    def setEndIncludingLineBreakPosition(value: () => Double): Self = this.set("endIncludingLineBreakPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setEndPosition(value: () => Double): Self = this.set("endPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setLineNumber(value: () => Double): Self = this.set("lineNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setSnapshot(value: () => ITextSnapshot): Self = this.set("snapshot", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => SnapshotPoint): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStartPosition(value: () => Double): Self = this.set("startPosition", js.Any.fromFunction0(value))
  }
  
}

