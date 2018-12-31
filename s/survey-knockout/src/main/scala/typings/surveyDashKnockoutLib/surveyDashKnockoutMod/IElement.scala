package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement
  extends IConditionRunner
     with ISurveyElement {
  var isPanel: scala.Boolean
  var parent: IPanel
  var renderWidth: java.lang.String
  var rightIndent: scala.Double
  var startWithNewLine: scala.Boolean
  var visible: scala.Boolean
  var width: java.lang.String
  def clearIncorrectValues(): js.Any
  def getPanel(): IPanel
  def onAnyValueChanged(name: java.lang.String): js.Any
  def removeElement(el: IElement): scala.Boolean
  def updateCustomWidgets(): js.Any
}

