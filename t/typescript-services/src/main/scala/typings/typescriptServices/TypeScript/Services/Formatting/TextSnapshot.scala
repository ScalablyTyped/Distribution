package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSnapshot extends ITextSnapshot {
  var lines: js.Any
  var snapshot: js.Any
  /* private */ def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any
}

object TextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromLineNumberWorker: js.Any => js.Any,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String,
    lines: js.Any,
    snapshot: js.Any
  ): TextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromLineNumberWorker = js.Any.fromFunction1(getLineFromLineNumberWorker), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText), lines = lines.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnapshot]
  }
}

