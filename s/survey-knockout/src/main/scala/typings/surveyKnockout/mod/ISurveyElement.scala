package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyElement extends js.Object {
  var containsErrors: Boolean
  var isPage: Boolean
  var isPanel: Boolean
  var isReadOnly: Boolean
  var isVisible: Boolean
  var name: String
  def delete(): js.Any
  def getType(): String
  def locStrsChanged(): js.Any
  def onFirstRendering(): js.Any
  def onSurveyLoad(): js.Any
  def setSurveyImpl(value: ISurveyImpl): js.Any
  def setVisibleIndex(value: Double): Double
}

object ISurveyElement {
  @scala.inline
  def apply(
    containsErrors: Boolean,
    delete: () => js.Any,
    getType: () => String,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): ISurveyElement = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), getType = js.Any.fromFunction0(getType), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[ISurveyElement]
  }
}

