package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConditionObject extends js.Object {
  var name: String
  var question: Question
  var text: String
}

object IConditionObject {
  @scala.inline
  def apply(name: String, question: Question, text: String): IConditionObject = {
    val __obj = js.Dynamic.literal(name = name, question = question, text = text)
  
    __obj.asInstanceOf[IConditionObject]
  }
}

