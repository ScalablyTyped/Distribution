package typings.tslint.lintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintError extends js.Object {
  var endPos: PositionInFile = js.native
  var message: String = js.native
  var startPos: PositionInFile = js.native
}

object LintError {
  @scala.inline
  def apply(endPos: PositionInFile, message: String, startPos: PositionInFile): LintError = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintError]
  }
  @scala.inline
  implicit class LintErrorOps[Self <: LintError] (val x: Self) extends AnyVal {
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
    def setEndPos(value: PositionInFile): Self = this.set("endPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPos(value: PositionInFile): Self = this.set("startPos", value.asInstanceOf[js.Any])
  }
  
}

