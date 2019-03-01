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
    copyTriggerValue: js.Function2[java.lang.String, java.lang.String, js.Any],
    getObjects: js.Function2[js.Array[java.lang.String], js.Array[java.lang.String], js.Array[_]],
    setCompleted: js.Function0[js.Any],
    setTriggerValue: js.Function3[java.lang.String, js.Any, scala.Boolean, js.Any]
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyTriggerValue")(copyTriggerValue)
    __obj.updateDynamic("getObjects")(getObjects)
    __obj.updateDynamic("setCompleted")(setCompleted)
    __obj.updateDynamic("setTriggerValue")(setTriggerValue)
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
}

