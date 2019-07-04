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
    addElement: (IElement, scala.Double) => js.Any,
    elementWidthChanged: IElement => js.Any,
    getAllValues: () => js.Any,
    getChildrenLayoutType: () => java.lang.String,
    getIsRequiredText: () => java.lang.String,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getMultipleTextValue: java.lang.String => js.Any,
    getProcessedText: java.lang.String => java.lang.String,
    getQuestionTitleLocation: () => java.lang.String,
    getSurvey: () => ISurvey,
    getTextProcessor: () => ITextProcessor,
    getType: () => java.lang.String,
    indexOf: IElement => scala.Double,
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: () => js.Any,
    name: java.lang.String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => scala.Boolean,
    setMultipleTextValue: (java.lang.String, js.Any) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: scala.Double => scala.Double
  ): IMultipleTextData = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), getAllValues = js.Any.fromFunction0(getAllValues), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getIsRequiredText = js.Any.fromFunction0(getIsRequiredText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getMultipleTextValue = js.Any.fromFunction1(getMultipleTextValue), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), setMultipleTextValue = js.Any.fromFunction2(setMultipleTextValue), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
  
    __obj.asInstanceOf[IMultipleTextData]
  }
}

