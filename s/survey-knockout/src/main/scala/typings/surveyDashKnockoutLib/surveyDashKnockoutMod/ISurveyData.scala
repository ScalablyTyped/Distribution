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

