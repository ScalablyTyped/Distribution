package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuestion
  extends IElement
     with ISurveyErrorOwner {
  
  def clearUnusedValues(): js.Any = js.native
  
  def clearValue(): js.Any = js.native
  
  def clearValueIfInvisible(): js.Any = js.native
  
  def getDisplayValue(keysAsText: Boolean, value: js.Any): js.Any = js.native
  
  def getQuestionFromArray(name: String, index: Double): IQuestion = js.native
  
  def getValueName(): String = js.native
  
  var hasTitle: Boolean = js.native
  
  def isAnswerCorrect(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def onSurveyValueChanged(newValue: js.Any): js.Any = js.native
  
  def supportGoNextPageAutomatic(): Boolean = js.native
  
  var survey: js.Any = js.native
  
  def updateCommentFromSurvey(newValue: js.Any): js.Any = js.native
  
  def updateValueFromSurvey(newValue: js.Any): js.Any = js.native
  
  def updateValueWithDefaults(): js.Any = js.native
  
  var value: js.Any = js.native
}
object IQuestion {
  
  @scala.inline
  def apply(
    clearErrors: () => js.Any,
    clearIncorrectValues: () => js.Any,
    clearUnusedValues: () => js.Any,
    clearValue: () => js.Any,
    clearValueIfInvisible: () => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    dispose: () => Unit,
    getDisplayValue: (Boolean, js.Any) => js.Any,
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
    survey: js.Any,
    updateCommentFromSurvey: js.Any => js.Any,
    updateCustomWidgets: () => js.Any,
    updateValueFromSurvey: js.Any => js.Any,
    updateValueWithDefaults: () => js.Any,
    value: js.Any,
    visible: Boolean,
    width: String
  ): IQuestion = {
    val __obj = js.Dynamic.literal(clearErrors = js.Any.fromFunction0(clearErrors), clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), clearUnusedValues = js.Any.fromFunction0(clearUnusedValues), clearValue = js.Any.fromFunction0(clearValue), clearValueIfInvisible = js.Any.fromFunction0(clearValueIfInvisible), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), dispose = js.Any.fromFunction0(dispose), getDisplayValue = js.Any.fromFunction2(getDisplayValue), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLayoutType = js.Any.fromFunction0(getLayoutType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getPanel = js.Any.fromFunction0(getPanel), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionFromArray = js.Any.fromFunction2(getQuestionFromArray), getType = js.Any.fromFunction0(getType), getValueName = js.Any.fromFunction0(getValueName), hasTitle = hasTitle.asInstanceOf[js.Any], isAnswerCorrect = js.Any.fromFunction0(isAnswerCorrect), isEmpty = js.Any.fromFunction0(isEmpty), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), onSurveyValueChanged = js.Any.fromFunction1(onSurveyValueChanged), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine.asInstanceOf[js.Any], supportGoNextPageAutomatic = js.Any.fromFunction0(supportGoNextPageAutomatic), survey = survey.asInstanceOf[js.Any], updateCommentFromSurvey = js.Any.fromFunction1(updateCommentFromSurvey), updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), updateValueFromSurvey = js.Any.fromFunction1(updateValueFromSurvey), updateValueWithDefaults = js.Any.fromFunction0(updateValueWithDefaults), value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuestion]
  }
  
  @scala.inline
  implicit class IQuestionOps[Self <: IQuestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearUnusedValues(value: () => js.Any): Self = this.set("clearUnusedValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearValue(value: () => js.Any): Self = this.set("clearValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearValueIfInvisible(value: () => js.Any): Self = this.set("clearValueIfInvisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValue(value: (Boolean, js.Any) => js.Any): Self = this.set("getDisplayValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetQuestionFromArray(value: (String, Double) => IQuestion): Self = this.set("getQuestionFromArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueName(value: () => String): Self = this.set("getValueName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTitle(value: Boolean): Self = this.set("hasTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnswerCorrect(value: () => Boolean): Self = this.set("isAnswerCorrect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSurveyValueChanged(value: js.Any => js.Any): Self = this.set("onSurveyValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportGoNextPageAutomatic(value: () => Boolean): Self = this.set("supportGoNextPageAutomatic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSurvey(value: js.Any): Self = this.set("survey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCommentFromSurvey(value: js.Any => js.Any): Self = this.set("updateCommentFromSurvey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateValueFromSurvey(value: js.Any => js.Any): Self = this.set("updateValueFromSurvey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateValueWithDefaults(value: () => js.Any): Self = this.set("updateValueWithDefaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
