package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: String, fromName: String): js.Any = js.native
  def focusQuestion(name: String): Boolean = js.native
  def getObjects(pages: js.Array[String], questions: js.Array[String]): js.Array[_] = js.native
  def setCompleted(): js.Any = js.native
  def setTriggerValue(name: String, value: js.Any, isVariable: Boolean): js.Any = js.native
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
  @scala.inline
  implicit class ISurveyTriggerOwnerOps[Self <: ISurveyTriggerOwner] (val x: Self) extends AnyVal {
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
    def setCopyTriggerValue(value: (String, String) => js.Any): Self = this.set("copyTriggerValue", js.Any.fromFunction2(value))
    @scala.inline
    def setFocusQuestion(value: String => Boolean): Self = this.set("focusQuestion", js.Any.fromFunction1(value))
    @scala.inline
    def setGetObjects(value: (js.Array[String], js.Array[String]) => js.Array[_]): Self = this.set("getObjects", js.Any.fromFunction2(value))
    @scala.inline
    def setSetCompleted(value: () => js.Any): Self = this.set("setCompleted", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTriggerValue(value: (String, js.Any, Boolean) => js.Any): Self = this.set("setTriggerValue", js.Any.fromFunction3(value))
  }
  
}

