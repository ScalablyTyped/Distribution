package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyData extends js.Object {
  def getAllValues(): js.Any
  def getComment(name: String): String
  def getFilteredProperties(): js.Any
  def getFilteredValues(): js.Any
  def getValue(name: String): js.Any
  def getVariable(name: String): js.Any
  def setComment(name: String, newValue: String, locNotification: js.Any): js.Any
  def setValue(name: String, newValue: js.Any, locNotification: js.Any): js.Any
  def setVariable(name: String, newValue: js.Any): Unit
}

object ISurveyData {
  @scala.inline
  def apply(
    getAllValues: () => js.Any,
    getComment: String => String,
    getFilteredProperties: () => js.Any,
    getFilteredValues: () => js.Any,
    getValue: String => js.Any,
    getVariable: String => js.Any,
    setComment: (String, String, js.Any) => js.Any,
    setValue: (String, js.Any, js.Any) => js.Any,
    setVariable: (String, js.Any) => Unit
  ): ISurveyData = {
    val __obj = js.Dynamic.literal(getAllValues = js.Any.fromFunction0(getAllValues), getComment = js.Any.fromFunction1(getComment), getFilteredProperties = js.Any.fromFunction0(getFilteredProperties), getFilteredValues = js.Any.fromFunction0(getFilteredValues), getValue = js.Any.fromFunction1(getValue), getVariable = js.Any.fromFunction1(getVariable), setComment = js.Any.fromFunction3(setComment), setValue = js.Any.fromFunction3(setValue), setVariable = js.Any.fromFunction2(setVariable))
  
    __obj.asInstanceOf[ISurveyData]
  }
}

