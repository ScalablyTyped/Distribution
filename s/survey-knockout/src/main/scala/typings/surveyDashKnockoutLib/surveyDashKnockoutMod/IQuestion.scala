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
    clearIncorrectValues: () => js.Any,
    clearUnusedValues: () => js.Any,
    clearValue: () => js.Any,
    clearValueIfInvisible: () => js.Any,
    getDisplayValue: scala.Boolean => js.Any,
    getErrorCustomText: (java.lang.String, SurveyError) => java.lang.String,
    getLayoutType: () => java.lang.String,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getPanel: () => IPanel,
    getProcessedText: java.lang.String => java.lang.String,
    getType: () => java.lang.String,
    getValueName: () => java.lang.String,
    hasTitle: scala.Boolean,
    isAnswerCorrect: () => scala.Boolean,
    isEmpty: () => scala.Boolean,
    isLayoutTypeSupported: java.lang.String => scala.Boolean,
    isPage: scala.Boolean,
    isPanel: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: () => js.Any,
    name: java.lang.String,
    onAnyValueChanged: java.lang.String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    onSurveyValueChanged: js.Any => js.Any,
    parent: IPanel,
    removeElement: IElement => scala.Boolean,
    renderWidth: java.lang.String,
    rightIndent: scala.Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: scala.Double => scala.Double,
    startWithNewLine: scala.Boolean,
    supportGoNextPageAutomatic: () => scala.Boolean,
    updateCommentFromSurvey: js.Any => js.Any,
    updateCustomWidgets: () => js.Any,
    updateValueFromSurvey: js.Any => js.Any,
    updateValueWithDefaults: () => js.Any,
    value: js.Any,
    visible: scala.Boolean,
    width: java.lang.String
  ): IQuestion = {
    val __obj = js.Dynamic.literal(clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), clearUnusedValues = js.Any.fromFunction0(clearUnusedValues), clearValue = js.Any.fromFunction0(clearValue), clearValueIfInvisible = js.Any.fromFunction0(clearValueIfInvisible), getDisplayValue = js.Any.fromFunction1(getDisplayValue), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLayoutType = js.Any.fromFunction0(getLayoutType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getPanel = js.Any.fromFunction0(getPanel), getProcessedText = js.Any.fromFunction1(getProcessedText), getType = js.Any.fromFunction0(getType), getValueName = js.Any.fromFunction0(getValueName), hasTitle = hasTitle, isAnswerCorrect = js.Any.fromFunction0(isAnswerCorrect), isEmpty = js.Any.fromFunction0(isEmpty), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), onSurveyValueChanged = js.Any.fromFunction1(onSurveyValueChanged), parent = parent, removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth, rightIndent = rightIndent, runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine, supportGoNextPageAutomatic = js.Any.fromFunction0(supportGoNextPageAutomatic), updateCommentFromSurvey = js.Any.fromFunction1(updateCommentFromSurvey), updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), updateValueFromSurvey = js.Any.fromFunction1(updateValueFromSurvey), updateValueWithDefaults = js.Any.fromFunction0(updateValueWithDefaults), value = value, visible = visible, width = width)
  
    __obj.asInstanceOf[IQuestion]
  }
}

