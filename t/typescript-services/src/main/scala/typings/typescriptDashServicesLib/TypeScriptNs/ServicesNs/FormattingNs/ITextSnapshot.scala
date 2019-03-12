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
    getLineFromLineNumber: scala.Double => ITextSnapshotLine,
    getLineFromPosition: scala.Double => ITextSnapshotLine,
    getLineNumberFromPosition: scala.Double => scala.Double,
    getText: typescriptDashServicesLib.TypeScriptNs.TextSpan => java.lang.String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
  
    __obj.asInstanceOf[ITextSnapshot]
  }
}

