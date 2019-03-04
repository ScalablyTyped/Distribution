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
    afterRenderPage: js.Function1[js.Any, js.Any],
    afterRenderPanel: js.Function2[IElement, js.Any, js.Any],
    afterRenderQuestion: js.Function2[IQuestion, js.Any, js.Any],
    areInvisibleElementsShowing: scala.Boolean,
    clearFiles: js.Function4[
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      js.Function2[/* status */ java.lang.String, /* data */ js.Any, _], 
      js.Any
    ],
    clearValueOnDisableItems: scala.Boolean,
    currentPage: IPage,
    downloadFile: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function2[/* status */ java.lang.String, /* data */ js.Any, _], 
      js.Any
    ],
    dragAndDropAllow: js.Function1[js.Any, scala.Boolean],
    dynamicPanelAdded: js.Function1[IQuestion, js.Any],
    dynamicPanelItemValueChanged: js.Function2[IQuestion, js.Any, js.Any],
    dynamicPanelRemoved: js.Function2[IQuestion, scala.Double, js.Any],
    getErrorCustomText: js.Function2[java.lang.String, SurveyError, java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getQuestionTitleTemplate: js.Function0[java.lang.String],
    getSurveyMarkdownHtml: js.Function2[Base, java.lang.String, java.lang.String],
    getUpdatedQuestionTitle: js.Function2[IQuestion, java.lang.String, java.lang.String],
    hasVisibleQuestionByValueName: js.Function1[java.lang.String, scala.Boolean],
    isDesignMode: scala.Boolean,
    isDisplayMode: scala.Boolean,
    isLoadingFromJson: scala.Boolean,
    isPageStarted: js.Function1[IPage, scala.Boolean],
    matrixAfterCellRender: js.Function2[IQuestion, js.Any, js.Any],
    matrixBeforeRowAdded: js.Function1[surveyDashKnockoutLib.Anon_CanAddRow, js.Any],
    matrixCellCreated: js.Function2[IQuestion, js.Any, js.Any],
    matrixCellValidate: js.Function2[IQuestion, js.Any, SurveyError],
    matrixCellValueChanged: js.Function2[IQuestion, js.Any, js.Any],
    matrixCellValueChanging: js.Function2[IQuestion, js.Any, js.Any],
    matrixRowAdded: js.Function1[IQuestion, js.Any],
    matrixRowRemoved: js.Function3[IQuestion, scala.Double, js.Any, js.Any],
    maxOthersLength: scala.Double,
    maxTextLength: scala.Double,
    pageVisibilityChanged: js.Function2[IPage, scala.Boolean, js.Any],
    pages: js.Array[IPage],
    panelAdded: js.Function4[IElement, scala.Double, js.Any, js.Any, js.Any],
    panelRemoved: js.Function1[IElement, js.Any],
    panelVisibilityChanged: js.Function2[IPanel, scala.Boolean, js.Any],
    processHtml: js.Function1[java.lang.String, java.lang.String],
    processText: js.Function2[java.lang.String, scala.Boolean, java.lang.String],
    processTextEx: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, js.Any],
    questionAdded: js.Function4[IQuestion, scala.Double, js.Any, js.Any, js.Any],
    questionCountByValueName: js.Function1[java.lang.String, scala.Double],
    questionErrorLocation: java.lang.String,
    questionRemoved: js.Function1[IQuestion, js.Any],
    questionRenamed: js.Function3[IQuestion, java.lang.String, java.lang.String, js.Any],
    questionStartIndex: java.lang.String,
    questionTitleLocation: java.lang.String,
    questionVisibilityChanged: js.Function2[IQuestion, scala.Boolean, js.Any],
    questionsOrder: java.lang.String,
    requiredText: java.lang.String,
    storeOthersAsComment: scala.Boolean,
    updateChoicesFromServer: js.Function3[IQuestion, js.Array[_], js.Any, js.Array[_]],
    updatePanelCssClasses: js.Function2[IPanel, js.Any, js.Any],
    updateQuestionCssClasses: js.Function2[IQuestion, js.Any, js.Any],
    uploadFiles: js.Function3[
      java.lang.String, 
      js.Array[stdLib.File], 
      js.Function2[/* status */ java.lang.String, /* data */ js.Any, _], 
      js.Any
    ],
    validatePanel: js.Function1[IPanel, SurveyError],
    validateQuestion: js.Function1[IQuestion, SurveyError]
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = afterRenderPage, afterRenderPanel = afterRenderPanel, afterRenderQuestion = afterRenderQuestion, areInvisibleElementsShowing = areInvisibleElementsShowing, clearFiles = clearFiles, clearValueOnDisableItems = clearValueOnDisableItems, currentPage = currentPage, downloadFile = downloadFile, dragAndDropAllow = dragAndDropAllow, dynamicPanelAdded = dynamicPanelAdded, dynamicPanelItemValueChanged = dynamicPanelItemValueChanged, dynamicPanelRemoved = dynamicPanelRemoved, getErrorCustomText = getErrorCustomText, getLocale = getLocale, getMarkdownHtml = getMarkdownHtml, getProcessedText = getProcessedText, getQuestionTitleTemplate = getQuestionTitleTemplate, getSurveyMarkdownHtml = getSurveyMarkdownHtml, getUpdatedQuestionTitle = getUpdatedQuestionTitle, hasVisibleQuestionByValueName = hasVisibleQuestionByValueName, isDesignMode = isDesignMode, isDisplayMode = isDisplayMode, isLoadingFromJson = isLoadingFromJson, isPageStarted = isPageStarted, matrixAfterCellRender = matrixAfterCellRender, matrixBeforeRowAdded = matrixBeforeRowAdded, matrixCellCreated = matrixCellCreated, matrixCellValidate = matrixCellValidate, matrixCellValueChanged = matrixCellValueChanged, matrixCellValueChanging = matrixCellValueChanging, matrixRowAdded = matrixRowAdded, matrixRowRemoved = matrixRowRemoved, maxOthersLength = maxOthersLength, maxTextLength = maxTextLength, pageVisibilityChanged = pageVisibilityChanged, pages = pages, panelAdded = panelAdded, panelRemoved = panelRemoved, panelVisibilityChanged = panelVisibilityChanged, processHtml = processHtml, processText = processText, processTextEx = processTextEx, questionAdded = questionAdded, questionCountByValueName = questionCountByValueName, questionErrorLocation = questionErrorLocation, questionRemoved = questionRemoved, questionRenamed = questionRenamed, questionStartIndex = questionStartIndex, questionTitleLocation = questionTitleLocation, questionVisibilityChanged = questionVisibilityChanged, questionsOrder = questionsOrder, requiredText = requiredText, storeOthersAsComment = storeOthersAsComment, updateChoicesFromServer = updateChoicesFromServer, updatePanelCssClasses = updatePanelCssClasses, updateQuestionCssClasses = updateQuestionCssClasses, uploadFiles = uploadFiles, validatePanel = validatePanel, validateQuestion = validateQuestion)
  
    __obj.asInstanceOf[ISurvey]
  }
}

