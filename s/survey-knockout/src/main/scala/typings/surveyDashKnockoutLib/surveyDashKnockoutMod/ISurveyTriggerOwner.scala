package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: java.lang.String, fromName: java.lang.String): js.Any
  def getObjects(pages: js.Array[java.lang.String], questions: js.Array[java.lang.String]): js.Array[_]
  def setCompleted(): js.Any
  def setTriggerValue(name: java.lang.String, value: js.Any, isVariable: scala.Boolean): js.Any
}

object ISurveyTriggerOwner {
  @scala.inline
  def apply(
    copyTriggerValue: (java.lang.String, java.lang.String) => js.Any,
    getObjects: (js.Array[java.lang.String], js.Array[java.lang.String]) => js.Array[_],
    setCompleted: () => js.Any,
    setTriggerValue: (java.lang.String, js.Any, scala.Boolean) => js.Any
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), getObjects = js.Any.fromFunction2(getObjects), setCompleted = js.Any.fromFunction0(setCompleted), setTriggerValue = js.Any.fromFunction3(setTriggerValue))
  
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
}

