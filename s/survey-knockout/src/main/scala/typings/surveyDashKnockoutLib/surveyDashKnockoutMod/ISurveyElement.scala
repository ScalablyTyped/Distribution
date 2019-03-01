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

object ISurveyElement {
  @scala.inline
  def apply(
    getType: js.Function0[java.lang.String],
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: js.Function0[js.Any],
    name: java.lang.String,
    onFirstRendering: js.Function0[js.Any],
    onSurveyLoad: js.Function0[js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double]
  ): ISurveyElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isPage")(isPage)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("locStrsChanged")(locStrsChanged)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad)
    __obj.updateDynamic("setSurveyImpl")(setSurveyImpl)
    __obj.updateDynamic("setVisibleIndex")(setVisibleIndex)
    __obj.asInstanceOf[ISurveyElement]
  }
}

