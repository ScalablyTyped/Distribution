package typings.surveyKnockout

import typings.surveyKnockout.mod.IQuestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanAddRow extends js.Object {
  var canAddRow: Boolean
  var question: IQuestion
}

object AnonCanAddRow {
  @scala.inline
  def apply(canAddRow: Boolean, question: IQuestion): AnonCanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanAddRow]
  }
}

