package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
@js.native
class TextSnapshotLine protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshotLine {
  def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
  /* CompleteClass */
  override var _end: js.Any = js.native
  /* CompleteClass */
  override var _lineBreak: js.Any = js.native
  /* CompleteClass */
  override var _lineNumber: js.Any = js.native
  /* CompleteClass */
  override var _snapshot: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
  /* CompleteClass */
  override def end(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
  /* CompleteClass */
  override def endIncludingLineBreak(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
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
  override def start(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
  /* CompleteClass */
  override def startPosition(): Double = js.native
}

