package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestion
  extends IElement
     with ISurveyErrorOwner {
  var hasTitle: Boolean
  var value: js.Any
  def clearUnusedValues(): js.Any
  def clearValue(): js.Any
  def clearValueIfInvisible(): js.Any
  def getDisplayValue(keysAsText: Boolean): js.Any
  def getQuestionFromArray(name: String, index: Double): IQuestion
  def getValueName(): String
  def isAnswerCorrect(): Boolean
  def isEmpty(): Boolean
  def onSurveyValueChanged(newValue: js.Any): js.Any
  def supportGoNextPageAutomatic(): Boolean
  def updateCommentFromSurvey(newValue: js.Any): js.Any
  def updateValueFromSurvey(newValue: js.Any): js.Any
  def updateValueWithDefaults(): js.Any
}

object IQuestion {
  @scala.inline
  def apply(
    clearErrors: () => js.Any,
    clearIncorrectValues: () => js.Any,
    clearUnusedValues: () => js.Any,
    clearValue: () => js.Any,
    clearValueIfInvisible: () => js.Any,
    getDisplayValue: Boolean => js.Any,
    getErrorCustomText: (String, SurveyError) => String,
    getLayoutType: () => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getPanel: () => IPanel,
    getProcessedText: String => String,
    getQuestionFromArray: (String, Double) => IQuestion,
    getType: () => String,
    getValueName: () => String,
    hasTitle: Boolean,
    isAnswerCorrect: () => Boolean,
    isEmpty: () => Boolean,
    isLayoutTypeSupported: String => Boolean,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onAnyValueChanged: String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    onSurveyValueChanged: js.Any => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double,
    startWithNewLine: Boolean,
    supportGoNextPageAutomatic: () => Boolean,
    updateCommentFromSurvey: js.Any => js.Any,
    updateCustomWidgets: () => js.Any,
    updateValueFromSurvey: js.Any => js.Any,
    updateValueWithDefaults: () => js.Any,
    value: js.Any,
    visible: Boolean,
    width: String
  ): IQuestion = {
    val __obj = js.Dynamic.literal(clearErrors = js.Any.fromFunction0(clearErrors), clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), clearUnusedValues = js.Any.fromFunction0(clearUnusedValues), clearValue = js.Any.fromFunction0(clearValue), clearValueIfInvisible = js.Any.fromFunction0(clearValueIfInvisible), getDisplayValue = js.Any.fromFunction1(getDisplayValue), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLayoutType = js.Any.fromFunction0(getLayoutType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getPanel = js.Any.fromFunction0(getPanel), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionFromArray = js.Any.fromFunction2(getQuestionFromArray), getType = js.Any.fromFunction0(getType), getValueName = js.Any.fromFunction0(getValueName), hasTitle = hasTitle, isAnswerCorrect = js.Any.fromFunction0(isAnswerCorrect), isEmpty = js.Any.fromFunction0(isEmpty), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), onSurveyValueChanged = js.Any.fromFunction1(onSurveyValueChanged), parent = parent, removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth, rightIndent = rightIndent, runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine, supportGoNextPageAutomatic = js.Any.fromFunction0(supportGoNextPageAutomatic), updateCommentFromSurvey = js.Any.fromFunction1(updateCommentFromSurvey), updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), updateValueFromSurvey = js.Any.fromFunction1(updateValueFromSurvey), updateValueWithDefaults = js.Any.fromFunction0(updateValueWithDefaults), value = value, visible = visible, width = width)
  
    __obj.asInstanceOf[IQuestion]
  }
}

