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
  def updateCommentFromSurvey(newValue: js.Any): js.Any
  def updateValueFromSurvey(newValue: js.Any): js.Any
  def updateValueWithDefaults(): js.Any
}

object IQuestion {
  @scala.inline
  def apply(
    clearIncorrectValues: js.Function0[js.Any],
    clearUnusedValues: js.Function0[js.Any],
    clearValue: js.Function0[js.Any],
    clearValueIfInvisible: js.Function0[js.Any],
    getDisplayValue: js.Function1[scala.Boolean, js.Any],
    getErrorCustomText: js.Function2[java.lang.String, SurveyError, java.lang.String],
    getLayoutType: js.Function0[java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getPanel: js.Function0[IPanel],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getType: js.Function0[java.lang.String],
    getValueName: js.Function0[java.lang.String],
    hasTitle: scala.Boolean,
    isAnswerCorrect: js.Function0[scala.Boolean],
    isEmpty: js.Function0[scala.Boolean],
    isLayoutTypeSupported: js.Function1[java.lang.String, scala.Boolean],
    isPage: scala.Boolean,
    isPanel: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: js.Function0[js.Any],
    name: java.lang.String,
    onAnyValueChanged: js.Function1[java.lang.String, js.Any],
    onFirstRendering: js.Function0[js.Any],
    onSurveyLoad: js.Function0[js.Any],
    onSurveyValueChanged: js.Function1[js.Any, js.Any],
    parent: IPanel,
    removeElement: js.Function1[IElement, scala.Boolean],
    renderWidth: java.lang.String,
    rightIndent: scala.Double,
    runCondition: js.Function2[HashTable[_], HashTable[_], js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double],
    startWithNewLine: scala.Boolean,
    supportGoNextPageAutomatic: js.Function0[scala.Boolean],
    updateCommentFromSurvey: js.Function1[js.Any, js.Any],
    updateCustomWidgets: js.Function0[js.Any],
    updateValueFromSurvey: js.Function1[js.Any, js.Any],
    updateValueWithDefaults: js.Function0[js.Any],
    value: js.Any,
    visible: scala.Boolean,
    width: java.lang.String
  ): IQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearIncorrectValues")(clearIncorrectValues)
    __obj.updateDynamic("clearUnusedValues")(clearUnusedValues)
    __obj.updateDynamic("clearValue")(clearValue)
    __obj.updateDynamic("clearValueIfInvisible")(clearValueIfInvisible)
    __obj.updateDynamic("getDisplayValue")(getDisplayValue)
    __obj.updateDynamic("getErrorCustomText")(getErrorCustomText)
    __obj.updateDynamic("getLayoutType")(getLayoutType)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getMarkdownHtml")(getMarkdownHtml)
    __obj.updateDynamic("getPanel")(getPanel)
    __obj.updateDynamic("getProcessedText")(getProcessedText)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValueName")(getValueName)
    __obj.updateDynamic("hasTitle")(hasTitle)
    __obj.updateDynamic("isAnswerCorrect")(isAnswerCorrect)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isLayoutTypeSupported")(isLayoutTypeSupported)
    __obj.updateDynamic("isPage")(isPage)
    __obj.updateDynamic("isPanel")(isPanel)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("locStrsChanged")(locStrsChanged)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onAnyValueChanged")(onAnyValueChanged)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad)
    __obj.updateDynamic("onSurveyValueChanged")(onSurveyValueChanged)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("removeElement")(removeElement)
    __obj.updateDynamic("renderWidth")(renderWidth)
    __obj.updateDynamic("rightIndent")(rightIndent)
    __obj.updateDynamic("runCondition")(runCondition)
    __obj.updateDynamic("setSurveyImpl")(setSurveyImpl)
    __obj.updateDynamic("setVisibleIndex")(setVisibleIndex)
    __obj.updateDynamic("startWithNewLine")(startWithNewLine)
    __obj.updateDynamic("supportGoNextPageAutomatic")(supportGoNextPageAutomatic)
    __obj.updateDynamic("updateCommentFromSurvey")(updateCommentFromSurvey)
    __obj.updateDynamic("updateCustomWidgets")(updateCustomWidgets)
    __obj.updateDynamic("updateValueFromSurvey")(updateValueFromSurvey)
    __obj.updateDynamic("updateValueWithDefaults")(updateValueWithDefaults)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IQuestion]
  }
}

