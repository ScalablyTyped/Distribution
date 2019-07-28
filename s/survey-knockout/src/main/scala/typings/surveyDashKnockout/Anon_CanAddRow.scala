package typings.surveyDashKnockout

import typings.surveyDashKnockout.surveyDashKnockoutMod.IQuestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAddRow extends js.Object {
  var canAddRow: Boolean
  var question: IQuestion
}

object Anon_CanAddRow {
  @scala.inline
  def apply(canAddRow: Boolean, question: IQuestion): Anon_CanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow, question = question)
  
    __obj.asInstanceOf[Anon_CanAddRow]
  }
}

