package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: java.lang.String, fromName: java.lang.String): js.Any
  def doComplete(): js.Any
  def getObjects(pages: js.Array[java.lang.String], questions: js.Array[java.lang.String]): js.Array[_]
  def setTriggerValue(name: java.lang.String, value: js.Any, isVariable: scala.Boolean): js.Any
}

