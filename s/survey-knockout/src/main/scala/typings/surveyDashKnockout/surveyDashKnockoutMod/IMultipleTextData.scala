package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultipleTextData
  extends IPanel
     with ILocalizableOwner {
  def getAllValues(): js.Any
  def getIsRequiredText(): String
  def getItemDefaultValue(name: String): js.Any
  def getMultipleTextValue(name: String): js.Any
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
  def setMultipleTextValue(name: String, value: js.Any): js.Any
}

object IMultipleTextData {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => js.Any,
    elementWidthChanged: IElement => js.Any,
    getAllValues: () => js.Any,
    getChildrenLayoutType: () => String,
    getIsRequiredText: () => String,
    getItemDefaultValue: String => js.Any,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getMultipleTextValue: String => js.Any,
    getProcessedText: String => String,
    getQuestionTitleLocation: () => String,
    getSurvey: () => ISurvey,
    getTextProcessor: () => ITextProcessor,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    setMultipleTextValue: (String, js.Any) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): IMultipleTextData = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), getAllValues = js.Any.fromFunction0(getAllValues), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getIsRequiredText = js.Any.fromFunction0(getIsRequiredText), getItemDefaultValue = js.Any.fromFunction1(getItemDefaultValue), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getMultipleTextValue = js.Any.fromFunction1(getMultipleTextValue), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), setMultipleTextValue = js.Any.fromFunction2(setMultipleTextValue), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
  
    __obj.asInstanceOf[IMultipleTextData]
  }
}

