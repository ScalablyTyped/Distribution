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
    getAllValues: js.Function0[js.Any],
    getComment: js.Function1[java.lang.String, java.lang.String],
    getFilteredProperties: js.Function0[js.Any],
    getFilteredValues: js.Function0[js.Any],
    getValue: js.Function1[java.lang.String, js.Any],
    setComment: js.Function2[java.lang.String, java.lang.String, js.Any],
    setValue: js.Function2[java.lang.String, js.Any, js.Any]
  ): ISurveyData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllValues")(getAllValues)
    __obj.updateDynamic("getComment")(getComment)
    __obj.updateDynamic("getFilteredProperties")(getFilteredProperties)
    __obj.updateDynamic("getFilteredValues")(getFilteredValues)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("setComment")(setComment)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[ISurveyData]
  }
}

