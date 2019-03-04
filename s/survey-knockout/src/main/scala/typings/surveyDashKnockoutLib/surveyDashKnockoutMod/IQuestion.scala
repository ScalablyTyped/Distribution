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
    val __obj = js.Dynamic.literal(clearIncorrectValues = clearIncorrectValues, clearUnusedValues = clearUnusedValues, clearValue = clearValue, clearValueIfInvisible = clearValueIfInvisible, getDisplayValue = getDisplayValue, getErrorCustomText = getErrorCustomText, getLayoutType = getLayoutType, getLocale = getLocale, getMarkdownHtml = getMarkdownHtml, getPanel = getPanel, getProcessedText = getProcessedText, getType = getType, getValueName = getValueName, hasTitle = hasTitle, isAnswerCorrect = isAnswerCorrect, isEmpty = isEmpty, isLayoutTypeSupported = isLayoutTypeSupported, isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = locStrsChanged, name = name, onAnyValueChanged = onAnyValueChanged, onFirstRendering = onFirstRendering, onSurveyLoad = onSurveyLoad, onSurveyValueChanged = onSurveyValueChanged, parent = parent, removeElement = removeElement, renderWidth = renderWidth, rightIndent = rightIndent, runCondition = runCondition, setSurveyImpl = setSurveyImpl, setVisibleIndex = setVisibleIndex, startWithNewLine = startWithNewLine, supportGoNextPageAutomatic = supportGoNextPageAutomatic, updateCommentFromSurvey = updateCommentFromSurvey, updateCustomWidgets = updateCustomWidgets, updateValueFromSurvey = updateValueFromSurvey, updateValueWithDefaults = updateValueWithDefaults, value = value, visible = visible, width = width)
  
    __obj.asInstanceOf[IQuestion]
  }
}

