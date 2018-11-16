package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
@js.native
class TextSnapshotLine protected () extends ITextSnapshotLine {
  def this(_snapshot: ITextSnapshot, _lineNumber: scala.Double, _start: scala.Double, _end: scala.Double, _lineBreak: java.lang.String) = this()
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
  override def endIncludingLineBreakPosition(): scala.Double = js.native
  /* CompleteClass */
  override def endPosition(): scala.Double = js.native
  /* CompleteClass */
  override def getText(): java.lang.String = js.native
  /* CompleteClass */
  override def length(): scala.Double = js.native
  /* CompleteClass */
  override def lineNumber(): scala.Double = js.native
  /* CompleteClass */
  override def snapshot(): ITextSnapshot = js.native
  /* CompleteClass */
  override def start(): SnapshotPoint = js.native
  /* CompleteClass */
  override def startPosition(): scala.Double = js.native
}

