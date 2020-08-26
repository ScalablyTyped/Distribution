package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSnapshot extends ITextSnapshot {
  var lines: js.Any = js.native
  var snapshot: js.Any = js.native
  /* private */ def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class TextSnapshotOps[Self <: TextSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLineFromLineNumberWorker(value: js.Any => js.Any): Self = this.set("getLineFromLineNumberWorker", js.Any.fromFunction1(value))
    @scala.inline
    def setLines(value: js.Any): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot(value: js.Any): Self = this.set("snapshot", value.asInstanceOf[js.Any])
  }
  
}

