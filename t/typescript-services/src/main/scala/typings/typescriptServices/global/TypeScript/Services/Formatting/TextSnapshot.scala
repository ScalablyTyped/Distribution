package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshotLine
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TextSnapshot")
@js.native
class TextSnapshot protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshot {
  def this(snapshot: ISimpleText) = this()
  /* CompleteClass */
  override var lines: js.Any = js.native
  /* CompleteClass */
  override var snapshot: js.Any = js.native
  /* CompleteClass */
  override def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
  /* CompleteClass */
  /* private */ override def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
  /* CompleteClass */
  override def getLineNumberFromPosition(position: Double): Double = js.native
  /* CompleteClass */
  override def getText(span: TextSpan): String = js.native
}

