package typings.surveyKnockout.anon

import typings.surveyKnockout.mod.IQuestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanAddRow extends js.Object {
  var canAddRow: Boolean
  var question: IQuestion
}

object CanAddRow {
  @scala.inline
  def apply(canAddRow: Boolean, question: IQuestion): CanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddRow]
  }
}

