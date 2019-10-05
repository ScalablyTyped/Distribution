package typings.typescriptDashServices.TypeScript.Services.Formatting

import typings.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshot extends js.Object {
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine
  def getLineFromPosition(position: Double): ITextSnapshotLine
  def getLineNumberFromPosition(position: Double): Double
  def getText(span: TextSpan): String
}

object ITextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
  
    __obj.asInstanceOf[ITextSnapshot]
  }
}

