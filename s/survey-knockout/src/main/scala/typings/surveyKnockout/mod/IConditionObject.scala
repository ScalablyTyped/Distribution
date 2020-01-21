package typings.surveyKnockout.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConditionObject]
  }
}

