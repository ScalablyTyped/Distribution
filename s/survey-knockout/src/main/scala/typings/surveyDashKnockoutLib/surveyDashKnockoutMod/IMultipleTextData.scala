package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultipleTextData
  extends IPanel
     with ILocalizableOwner {
  def getAllValues(): js.Any
  def getIsRequiredText(): java.lang.String
  def getMultipleTextValue(name: java.lang.String): js.Any
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
  def setMultipleTextValue(name: java.lang.String, value: js.Any): js.Any
}

object IMultipleTextData {
  @scala.inline
  def apply(
    addElement: js.Function2[IElement, scala.Double, js.Any],
    elementWidthChanged: js.Function1[IElement, js.Any],
    getAllValues: js.Function0[js.Any],
    getChildrenLayoutType: js.Function0[java.lang.String],
    getIsRequiredText: js.Function0[java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getMultipleTextValue: js.Function1[java.lang.String, js.Any],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getQuestionTitleLocation: js.Function0[java.lang.String],
    getSurvey: js.Function0[ISurvey],
    getTextProcessor: js.Function0[ITextProcessor],
    getType: js.Function0[java.lang.String],
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: js.Function0[js.Any],
    name: java.lang.String,
    onFirstRendering: js.Function0[js.Any],
    onSurveyLoad: js.Function0[js.Any],
    parent: IPanel,
    removeElement: js.Function1[IElement, scala.Boolean],
    setMultipleTextValue: js.Function2[java.lang.String, js.Any, js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double]
  ): IMultipleTextData = {
    val __obj = js.Dynamic.literal(addElement = addElement, elementWidthChanged = elementWidthChanged, getAllValues = getAllValues, getChildrenLayoutType = getChildrenLayoutType, getIsRequiredText = getIsRequiredText, getLocale = getLocale, getMarkdownHtml = getMarkdownHtml, getMultipleTextValue = getMultipleTextValue, getProcessedText = getProcessedText, getQuestionTitleLocation = getQuestionTitleLocation, getSurvey = getSurvey, getTextProcessor = getTextProcessor, getType = getType, isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = locStrsChanged, name = name, onFirstRendering = onFirstRendering, onSurveyLoad = onSurveyLoad, parent = parent, removeElement = removeElement, setMultipleTextValue = setMultipleTextValue, setSurveyImpl = setSurveyImpl, setVisibleIndex = setVisibleIndex)
  
    __obj.asInstanceOf[IMultipleTextData]
  }
}

