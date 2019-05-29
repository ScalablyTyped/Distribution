package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurvey
  extends ISurveyErrorOwner
     with ITextProcessor {
  var areInvisibleElementsShowing: scala.Boolean
  var clearValueOnDisableItems: scala.Boolean
  var currentPage: IPage
  var isDesignMode: scala.Boolean
  var isDisplayMode: scala.Boolean
  var isLoadingFromJson: scala.Boolean
  var maxOthersLength: scala.Double
  var maxTextLength: scala.Double
  var pages: js.Array[IPage]
  var questionErrorLocation: java.lang.String
  var questionStartIndex: java.lang.String
  var questionTitleLocation: java.lang.String
  var questionsOrder: java.lang.String
  var requiredText: java.lang.String
  var storeOthersAsComment: scala.Boolean
  def afterRenderPage(htmlElement: js.Any): js.Any
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any
  def clearFiles(
    name: java.lang.String,
    value: js.Any,
    fileName: java.lang.String,
    clearCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def downloadFile(
    name: java.lang.String,
    content: java.lang.String,
    callback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def dragAndDropAllow(options: js.Any): scala.Boolean
  def dynamicPanelAdded(question: IQuestion): js.Any
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any
  def dynamicPanelRemoved(question: IQuestion, panelIndex: scala.Double): js.Any
  def getQuestionByValueNameFromArray(valueName: java.lang.String, name: java.lang.String, index: scala.Double): IQuestion
  def getQuestionTitleTemplate(): java.lang.String
  def getSurveyMarkdownHtml(element: Base, text: java.lang.String): java.lang.String
  def getUpdatedQuestionTitle(question: IQuestion, title: java.lang.String): java.lang.String
  def hasVisibleQuestionByValueName(valueName: java.lang.String): scala.Boolean
  def isPageStarted(page: IPage): scala.Boolean
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any
  def matrixBeforeRowAdded(options: surveyDashKnockoutLib.Anon_CanAddRow): js.Any
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any
  def matrixRowAdded(question: IQuestion): js.Any
  def matrixRowRemoved(question: IQuestion, rowIndex: scala.Double, row: js.Any): js.Any
  def pageVisibilityChanged(page: IPage, newValue: scala.Boolean): js.Any
  def panelAdded(panel: IElement, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def panelRemoved(panel: IElement): js.Any
  def panelVisibilityChanged(panel: IPanel, newValue: scala.Boolean): js.Any
  def processHtml(html: java.lang.String): java.lang.String
  def questionAdded(question: IQuestion, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def questionCountByValueName(valueName: java.lang.String): scala.Double
  def questionRemoved(question: IQuestion): js.Any
  def questionRenamed(question: IQuestion, oldName: java.lang.String, oldValueName: java.lang.String): js.Any
  def questionVisibilityChanged(question: IQuestion, newValue: scala.Boolean): js.Any
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_]
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any
  def uploadFiles(
    name: java.lang.String,
    files: js.Array[stdLib.File],
    uploadingCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def validatePanel(panel: IPanel): SurveyError
  def validateQuestion(question: IQuestion): SurveyError
}

object ISurvey {
  @scala.inline
  def apply(
    afterRenderPage: js.Any => js.Any,
    afterRenderPanel: (IElement, js.Any) => js.Any,
    afterRenderQuestion: (IQuestion, js.Any) => js.Any,
    areInvisibleElementsShowing: scala.Boolean,
    clearFiles: (java.lang.String, js.Any, java.lang.String, js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]) => js.Any,
    clearValueOnDisableItems: scala.Boolean,
    currentPage: IPage,
    downloadFile: (java.lang.String, java.lang.String, js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]) => js.Any,
    dragAndDropAllow: js.Any => scala.Boolean,
    dynamicPanelAdded: IQuestion => js.Any,
    dynamicPanelItemValueChanged: (IQuestion, js.Any) => js.Any,
    dynamicPanelRemoved: (IQuestion, scala.Double) => js.Any,
    getErrorCustomText: (java.lang.String, SurveyError) => java.lang.String,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getProcessedText: java.lang.String => java.lang.String,
    getQuestionByValueNameFromArray: (java.lang.String, java.lang.String, scala.Double) => IQuestion,
    getQuestionTitleTemplate: () => java.lang.String,
    getSurveyMarkdownHtml: (Base, java.lang.String) => java.lang.String,
    getUpdatedQuestionTitle: (IQuestion, java.lang.String) => java.lang.String,
    hasVisibleQuestionByValueName: java.lang.String => scala.Boolean,
    isDesignMode: scala.Boolean,
    isDisplayMode: scala.Boolean,
    isLoadingFromJson: scala.Boolean,
    isPageStarted: IPage => scala.Boolean,
    matrixAfterCellRender: (IQuestion, js.Any) => js.Any,
    matrixBeforeRowAdded: surveyDashKnockoutLib.Anon_CanAddRow => js.Any,
    matrixCellCreated: (IQuestion, js.Any) => js.Any,
    matrixCellValidate: (IQuestion, js.Any) => SurveyError,
    matrixCellValueChanged: (IQuestion, js.Any) => js.Any,
    matrixCellValueChanging: (IQuestion, js.Any) => js.Any,
    matrixRowAdded: IQuestion => js.Any,
    matrixRowRemoved: (IQuestion, scala.Double, js.Any) => js.Any,
    maxOthersLength: scala.Double,
    maxTextLength: scala.Double,
    pageVisibilityChanged: (IPage, scala.Boolean) => js.Any,
    pages: js.Array[IPage],
    panelAdded: (IElement, scala.Double, js.Any, js.Any) => js.Any,
    panelRemoved: IElement => js.Any,
    panelVisibilityChanged: (IPanel, scala.Boolean) => js.Any,
    processHtml: java.lang.String => java.lang.String,
    processText: (java.lang.String, scala.Boolean) => java.lang.String,
    processTextEx: (java.lang.String, scala.Boolean, scala.Boolean) => js.Any,
    questionAdded: (IQuestion, scala.Double, js.Any, js.Any) => js.Any,
    questionCountByValueName: java.lang.String => scala.Double,
    questionErrorLocation: java.lang.String,
    questionRemoved: IQuestion => js.Any,
    questionRenamed: (IQuestion, java.lang.String, java.lang.String) => js.Any,
    questionStartIndex: java.lang.String,
    questionTitleLocation: java.lang.String,
    questionVisibilityChanged: (IQuestion, scala.Boolean) => js.Any,
    questionsOrder: java.lang.String,
    requiredText: java.lang.String,
    storeOthersAsComment: scala.Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[_], js.Any) => js.Array[_],
    updatePanelCssClasses: (IPanel, js.Any) => js.Any,
    updateQuestionCssClasses: (IQuestion, js.Any) => js.Any,
    uploadFiles: (java.lang.String, js.Array[stdLib.File], js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]) => js.Any,
    validatePanel: IPanel => SurveyError,
    validateQuestion: IQuestion => SurveyError
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = js.Any.fromFunction1(afterRenderPage), afterRenderPanel = js.Any.fromFunction2(afterRenderPanel), afterRenderQuestion = js.Any.fromFunction2(afterRenderQuestion), areInvisibleElementsShowing = areInvisibleElementsShowing, clearFiles = js.Any.fromFunction4(clearFiles), clearValueOnDisableItems = clearValueOnDisableItems, currentPage = currentPage, downloadFile = js.Any.fromFunction3(downloadFile), dragAndDropAllow = js.Any.fromFunction1(dragAndDropAllow), dynamicPanelAdded = js.Any.fromFunction1(dynamicPanelAdded), dynamicPanelItemValueChanged = js.Any.fromFunction2(dynamicPanelItemValueChanged), dynamicPanelRemoved = js.Any.fromFunction2(dynamicPanelRemoved), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionByValueNameFromArray = js.Any.fromFunction3(getQuestionByValueNameFromArray), getQuestionTitleTemplate = js.Any.fromFunction0(getQuestionTitleTemplate), getSurveyMarkdownHtml = js.Any.fromFunction2(getSurveyMarkdownHtml), getUpdatedQuestionTitle = js.Any.fromFunction2(getUpdatedQuestionTitle), hasVisibleQuestionByValueName = js.Any.fromFunction1(hasVisibleQuestionByValueName), isDesignMode = isDesignMode, isDisplayMode = isDisplayMode, isLoadingFromJson = isLoadingFromJson, isPageStarted = js.Any.fromFunction1(isPageStarted), matrixAfterCellRender = js.Any.fromFunction2(matrixAfterCellRender), matrixBeforeRowAdded = js.Any.fromFunction1(matrixBeforeRowAdded), matrixCellCreated = js.Any.fromFunction2(matrixCellCreated), matrixCellValidate = js.Any.fromFunction2(matrixCellValidate), matrixCellValueChanged = js.Any.fromFunction2(matrixCellValueChanged), matrixCellValueChanging = js.Any.fromFunction2(matrixCellValueChanging), matrixRowAdded = js.Any.fromFunction1(matrixRowAdded), matrixRowRemoved = js.Any.fromFunction3(matrixRowRemoved), maxOthersLength = maxOthersLength, maxTextLength = maxTextLength, pageVisibilityChanged = js.Any.fromFunction2(pageVisibilityChanged), pages = pages, panelAdded = js.Any.fromFunction4(panelAdded), panelRemoved = js.Any.fromFunction1(panelRemoved), panelVisibilityChanged = js.Any.fromFunction2(panelVisibilityChanged), processHtml = js.Any.fromFunction1(processHtml), processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx), questionAdded = js.Any.fromFunction4(questionAdded), questionCountByValueName = js.Any.fromFunction1(questionCountByValueName), questionErrorLocation = questionErrorLocation, questionRemoved = js.Any.fromFunction1(questionRemoved), questionRenamed = js.Any.fromFunction3(questionRenamed), questionStartIndex = questionStartIndex, questionTitleLocation = questionTitleLocation, questionVisibilityChanged = js.Any.fromFunction2(questionVisibilityChanged), questionsOrder = questionsOrder, requiredText = requiredText, storeOthersAsComment = storeOthersAsComment, updateChoicesFromServer = js.Any.fromFunction3(updateChoicesFromServer), updatePanelCssClasses = js.Any.fromFunction2(updatePanelCssClasses), updateQuestionCssClasses = js.Any.fromFunction2(updateQuestionCssClasses), uploadFiles = js.Any.fromFunction3(uploadFiles), validatePanel = js.Any.fromFunction1(validatePanel), validateQuestion = js.Any.fromFunction1(validateQuestion))
  
    __obj.asInstanceOf[ISurvey]
  }
}

