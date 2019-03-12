package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint
  def endIncludingLineBreak(): SnapshotPoint
  def endIncludingLineBreakPosition(): scala.Double
  def endPosition(): scala.Double
  def getText(): java.lang.String
  def length(): scala.Double
  def lineNumber(): scala.Double
  def snapshot(): ITextSnapshot
  def start(): SnapshotPoint
  def startPosition(): scala.Double
}

object ITextSnapshotLine {
  @scala.inline
  def apply(
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => scala.Double,
    endPosition: () => scala.Double,
    getText: () => java.lang.String,
    length: () => scala.Double,
    lineNumber: () => scala.Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => scala.Double
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
  
    __obj.asInstanceOf[ITextSnapshotLine]
  }
}

