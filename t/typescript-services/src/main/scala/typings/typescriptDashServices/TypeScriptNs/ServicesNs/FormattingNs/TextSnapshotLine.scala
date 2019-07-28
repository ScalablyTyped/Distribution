package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
@js.native
class TextSnapshotLine protected () extends ITextSnapshotLine {
  def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
  var _end: js.Any = js.native
  var _lineBreak: js.Any = js.native
  var _lineNumber: js.Any = js.native
  var _snapshot: js.Any = js.native
  var _start: js.Any = js.native
  /* CompleteClass */
  override def end(): SnapshotPoint = js.native
  /* CompleteClass */
  override def endIncludingLineBreak(): SnapshotPoint = js.native
  /* CompleteClass */
  override def endIncludingLineBreakPosition(): Double = js.native
  /* CompleteClass */
  override def endPosition(): Double = js.native
  /* CompleteClass */
  override def getText(): String = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def lineNumber(): Double = js.native
  /* CompleteClass */
  override def snapshot(): ITextSnapshot = js.native
  /* CompleteClass */
  override def start(): SnapshotPoint = js.native
  /* CompleteClass */
  override def startPosition(): Double = js.native
}

