package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: String, fromName: String): js.Any
  def focusQuestion(name: String): Boolean
  def getObjects(pages: js.Array[String], questions: js.Array[String]): js.Array[_]
  def setCompleted(): js.Any
  def setTriggerValue(name: String, value: js.Any, isVariable: Boolean): js.Any
}

object ISurveyTriggerOwner {
  @scala.inline
  def apply(
    copyTriggerValue: (String, String) => js.Any,
    focusQuestion: String => Boolean,
    getObjects: (js.Array[String], js.Array[String]) => js.Array[_],
    setCompleted: () => js.Any,
    setTriggerValue: (String, js.Any, Boolean) => js.Any
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), focusQuestion = js.Any.fromFunction1(focusQuestion), getObjects = js.Any.fromFunction2(getObjects), setCompleted = js.Any.fromFunction0(setCompleted), setTriggerValue = js.Any.fromFunction3(setTriggerValue))
  
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
}

