package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint
  def endIncludingLineBreak(): SnapshotPoint
  def endIncludingLineBreakPosition(): Double
  def endPosition(): Double
  def getText(): String
  def length(): Double
  def lineNumber(): Double
  def snapshot(): ITextSnapshot
  def start(): SnapshotPoint
  def startPosition(): Double
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
}

