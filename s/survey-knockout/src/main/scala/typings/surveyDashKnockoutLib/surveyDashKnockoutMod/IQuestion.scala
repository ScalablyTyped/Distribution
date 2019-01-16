package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestion
  extends IElement
     with ISurveyErrorOwner {
  var hasTitle: scala.Boolean
  var value: js.Any
  def clearUnusedValues(): js.Any
  def clearValue(): js.Any
  def clearValueIfInvisible(): js.Any
  def getDisplayValue(keysAsText: scala.Boolean): js.Any
  def getValueName(): java.lang.String
  def isAnswerCorrect(): scala.Boolean
  def isEmpty(): scala.Boolean
  def onSurveyValueChanged(newValue: js.Any): js.Any
  def supportGoNextPageAutomatic(): scala.Boolean
  def updateValueWithDefaults(): js.Any
}

