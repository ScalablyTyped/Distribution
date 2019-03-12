package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyData extends js.Object {
  def getAllValues(): js.Any
  def getComment(name: java.lang.String): java.lang.String
  def getFilteredProperties(): js.Any
  def getFilteredValues(): js.Any
  def getValue(name: java.lang.String): js.Any
  def setComment(name: java.lang.String, newValue: java.lang.String): js.Any
  def setValue(name: java.lang.String, newValue: js.Any): js.Any
}

object ISurveyData {
  @scala.inline
  def apply(
    getAllValues: () => js.Any,
    getComment: java.lang.String => java.lang.String,
    getFilteredProperties: () => js.Any,
    getFilteredValues: () => js.Any,
    getValue: java.lang.String => js.Any,
    setComment: (java.lang.String, java.lang.String) => js.Any,
    setValue: (java.lang.String, js.Any) => js.Any
  ): ISurveyData = {
    val __obj = js.Dynamic.literal(getAllValues = js.Any.fromFunction0(getAllValues), getComment = js.Any.fromFunction1(getComment), getFilteredProperties = js.Any.fromFunction0(getFilteredProperties), getFilteredValues = js.Any.fromFunction0(getFilteredValues), getValue = js.Any.fromFunction1(getValue), setComment = js.Any.fromFunction2(setComment), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[ISurveyData]
  }
}

