package typings.surveyKnockout.anon

import typings.surveyKnockout.mod.IQuestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanAddRow extends js.Object {
  var canAddRow: Boolean = js.native
  var question: IQuestion = js.native
}

object CanAddRow {
  @scala.inline
  def apply(canAddRow: Boolean, question: IQuestion): CanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddRow]
  }
  @scala.inline
  implicit class CanAddRowOps[Self <: CanAddRow] (val x: Self) extends AnyVal {
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
    def setCanAddRow(value: Boolean): Self = this.set("canAddRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestion(value: IQuestion): Self = this.set("question", value.asInstanceOf[js.Any])
  }
  
}

