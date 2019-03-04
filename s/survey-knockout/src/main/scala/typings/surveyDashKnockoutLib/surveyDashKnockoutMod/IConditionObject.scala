package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConditionObject extends js.Object {
  var name: java.lang.String
  var question: Question
  var text: java.lang.String
}

object IConditionObject {
  @scala.inline
  def apply(name: java.lang.String, question: Question, text: java.lang.String): IConditionObject = {
    val __obj = js.Dynamic.literal(name = name, question = question, text = text)
  
    __obj.asInstanceOf[IConditionObject]
  }
}

