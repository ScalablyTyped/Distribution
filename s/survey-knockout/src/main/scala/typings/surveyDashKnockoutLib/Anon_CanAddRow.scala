package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAddRow extends js.Object {
  var canAddRow: scala.Boolean
  var question: surveyDashKnockoutLib.surveyDashKnockoutMod.IQuestion
}

object Anon_CanAddRow {
  @scala.inline
  def apply(canAddRow: scala.Boolean, question: surveyDashKnockoutLib.surveyDashKnockoutMod.IQuestion): Anon_CanAddRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canAddRow")(canAddRow)
    __obj.updateDynamic("question")(question)
    __obj.asInstanceOf[Anon_CanAddRow]
  }
}

