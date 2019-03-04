package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshot extends js.Object {
  def getLineFromLineNumber(lineNumber: scala.Double): ITextSnapshotLine
  def getLineFromPosition(position: scala.Double): ITextSnapshotLine
  def getLineNumberFromPosition(position: scala.Double): scala.Double
  def getText(span: typescriptDashServicesLib.TypeScriptNs.TextSpan): java.lang.String
}

object ITextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: js.Function1[scala.Double, ITextSnapshotLine],
    getLineFromPosition: js.Function1[scala.Double, ITextSnapshotLine],
    getLineNumberFromPosition: js.Function1[scala.Double, scala.Double],
    getText: js.Function1[typescriptDashServicesLib.TypeScriptNs.TextSpan, java.lang.String]
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = getLineFromLineNumber, getLineFromPosition = getLineFromPosition, getLineNumberFromPosition = getLineNumberFromPosition, getText = getText)
  
    __obj.asInstanceOf[ITextSnapshot]
  }
}

