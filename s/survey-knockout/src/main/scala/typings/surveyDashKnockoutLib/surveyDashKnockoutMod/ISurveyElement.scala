package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyElement extends js.Object {
  var isPage: scala.Boolean
  var isReadOnly: scala.Boolean
  var isVisible: scala.Boolean
  var name: java.lang.String
  def getType(): java.lang.String
  def locStrsChanged(): js.Any
  def onFirstRendering(): js.Any
  def onSurveyLoad(): js.Any
  def setSurveyImpl(value: ISurveyImpl): js.Any
  def setVisibleIndex(value: scala.Double): scala.Double
}

