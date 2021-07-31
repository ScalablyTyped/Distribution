package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultipleTextData
  extends StObject
     with ILocalizableOwner
     with IPanel {
  
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
    containsErrors: Boolean,
    delete: () => js.Any,
    elementWidthChanged: IElement => js.Any,
    elements: js.Array[IElement],
    getAllValues: () => js.Any,
    getChildrenLayoutType: () => String,
    getIsRequiredText: () => String,
    getItemDefaultValue: String => js.Any,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getMultipleTextValue: String => js.Any,
    getProcessedText: String => String,
    getQuestionStartIndex: () => String,
    getQuestionTitleLocation: () => String,
    getSurvey: () => ISurvey,
    getTextProcessor: () => ITextProcessor,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isPanel: Boolean,
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
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), elements = elements.asInstanceOf[js.Any], getAllValues = js.Any.fromFunction0(getAllValues), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getIsRequiredText = js.Any.fromFunction0(getIsRequiredText), getItemDefaultValue = js.Any.fromFunction1(getItemDefaultValue), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getMultipleTextValue = js.Any.fromFunction1(getMultipleTextValue), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionStartIndex = js.Any.fromFunction0(getQuestionStartIndex), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), setMultipleTextValue = js.Any.fromFunction2(setMultipleTextValue), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[IMultipleTextData]
  }
  
  @scala.inline
  implicit class IMultipleTextDataMutableBuilder[Self <: IMultipleTextData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllValues(value: () => js.Any): Self = StObject.set(x, "getAllValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsRequiredText(value: () => String): Self = StObject.set(x, "getIsRequiredText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemDefaultValue(value: String => js.Any): Self = StObject.set(x, "getItemDefaultValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMultipleTextValue(value: String => js.Any): Self = StObject.set(x, "getMultipleTextValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextProcessor(value: () => ITextProcessor): Self = StObject.set(x, "getTextProcessor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMultipleTextValue(value: (String, js.Any) => js.Any): Self = StObject.set(x, "setMultipleTextValue", js.Any.fromFunction2(value))
  }
}
