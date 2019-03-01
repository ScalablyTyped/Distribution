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
    end: js.Function0[SnapshotPoint],
    endIncludingLineBreak: js.Function0[SnapshotPoint],
    endIncludingLineBreakPosition: js.Function0[scala.Double],
    endPosition: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    length: js.Function0[scala.Double],
    lineNumber: js.Function0[scala.Double],
    snapshot: js.Function0[ITextSnapshot],
    start: js.Function0[SnapshotPoint],
    startPosition: js.Function0[scala.Double]
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("endIncludingLineBreak")(endIncludingLineBreak)
    __obj.updateDynamic("endIncludingLineBreakPosition")(endIncludingLineBreakPosition)
    __obj.updateDynamic("endPosition")(endPosition)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("snapshot")(snapshot)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("startPosition")(startPosition)
    __obj.asInstanceOf[ITextSnapshotLine]
  }
}

