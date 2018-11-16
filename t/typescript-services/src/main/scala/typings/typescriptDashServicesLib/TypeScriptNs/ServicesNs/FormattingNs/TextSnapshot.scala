package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TextSnapshot")
@js.native
class TextSnapshot protected () extends ITextSnapshot {
  def this(snapshot: typescriptDashServicesLib.TypeScriptNs.ISimpleText) = this()
  var lines: js.Any = js.native
  var snapshot: js.Any = js.native
  /* CompleteClass */
  override def getLineFromLineNumber(lineNumber: scala.Double): ITextSnapshotLine = js.native
  /* private */ def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getLineFromPosition(position: scala.Double): ITextSnapshotLine = js.native
  /* CompleteClass */
  override def getLineNumberFromPosition(position: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getText(span: typescriptDashServicesLib.TypeScriptNs.TextSpan): java.lang.String = js.native
}

