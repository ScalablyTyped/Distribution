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

