package typings.surveyKnockout.mod

import typings.std.File
import typings.surveyKnockout.AnonCanAddRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurvey
  extends ISurveyErrorOwner
     with ITextProcessor {
  var areInvisibleElementsShowing: Boolean
  var clearValueOnDisableItems: Boolean
  var currentPage: IPage
  var isDesignMode: Boolean
  var isDisplayMode: Boolean
  var isLoadingFromJson: Boolean
  var isUpdateValueTextOnTyping: Boolean
  var maxOthersLength: Double
  var maxTextLength: Double
  var pages: js.Array[IPage]
  var questionDescriptionLocation: String
  var questionErrorLocation: String
  var questionStartIndex: String
  var questionTitleLocation: String
  var questionsOrder: String
  var requiredText: String
  var storeOthersAsComment: Boolean
  def afterRenderPage(htmlElement: js.Any): js.Any
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any
  def afterRenderQuestionInput(question: IQuestion, htmlElement: js.Any): js.Any
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit
  def clearFiles(
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any
  def downloadFile(name: String, content: String, callback: js.Function2[/* status */ String, /* data */ js.Any, _]): js.Any
  def dragAndDropAllow(options: js.Any): Boolean
  def dynamicPanelAdded(question: IQuestion): js.Any
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any
  def getCss(): js.Any
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion
  def getQuestionTitleTemplate(): String
  def getSurveyMarkdownHtml(element: Base, text: String): String
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String
  def hasVisibleQuestionByValueName(valueName: String): Boolean
  def isPageStarted(page: IPage): Boolean
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean
  def matrixBeforeRowAdded(options: AnonCanAddRow): js.Any
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any
  def matrixRowAdded(question: IQuestion): js.Any
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def panelRemoved(panel: IElement): js.Any
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any
  def processHtml(html: String): String
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def questionCountByValueName(valueName: String): Double
  def questionRemoved(question: IQuestion): js.Any
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_]
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any
  def uploadFiles(
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
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
    afterRenderQuestionInput: (IQuestion, js.Any) => js.Any,
    areInvisibleElementsShowing: Boolean,
    beforeSettingQuestionErrors: (IQuestion, js.Array[SurveyError]) => Unit,
    clearFiles: (String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    clearValueOnDisableItems: Boolean,
    currentPage: IPage,
    downloadFile: (String, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    dragAndDropAllow: js.Any => Boolean,
    dynamicPanelAdded: IQuestion => js.Any,
    dynamicPanelItemValueChanged: (IQuestion, js.Any) => js.Any,
    dynamicPanelRemoved: (IQuestion, Double, IPanel) => js.Any,
    getCss: () => js.Any,
    getErrorCustomText: (String, SurveyError) => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getQuestionByValueNameFromArray: (String, String, Double) => IQuestion,
    getQuestionTitleTemplate: () => String,
    getSurveyMarkdownHtml: (Base, String) => String,
    getUpdatedQuestionTitle: (IQuestion, String) => String,
    hasVisibleQuestionByValueName: String => Boolean,
    isDesignMode: Boolean,
    isDisplayMode: Boolean,
    isLoadingFromJson: Boolean,
    isPageStarted: IPage => Boolean,
    isUpdateValueTextOnTyping: Boolean,
    matrixAfterCellRender: (IQuestion, js.Any) => js.Any,
    matrixAllowRemoveRow: (IQuestion, Double, js.Any) => Boolean,
    matrixBeforeRowAdded: AnonCanAddRow => js.Any,
    matrixCellCreated: (IQuestion, js.Any) => js.Any,
    matrixCellValidate: (IQuestion, js.Any) => SurveyError,
    matrixCellValueChanged: (IQuestion, js.Any) => js.Any,
    matrixCellValueChanging: (IQuestion, js.Any) => js.Any,
    matrixRowAdded: IQuestion => js.Any,
    matrixRowRemoved: (IQuestion, Double, js.Any) => js.Any,
    maxOthersLength: Double,
    maxTextLength: Double,
    pageVisibilityChanged: (IPage, Boolean) => js.Any,
    pages: js.Array[IPage],
    panelAdded: (IElement, Double, js.Any, js.Any) => js.Any,
    panelRemoved: IElement => js.Any,
    panelVisibilityChanged: (IPanel, Boolean) => js.Any,
    processHtml: String => String,
    processText: (String, Boolean) => String,
    processTextEx: (String, Boolean, Boolean) => js.Any,
    questionAdded: (IQuestion, Double, js.Any, js.Any) => js.Any,
    questionCountByValueName: String => Double,
    questionDescriptionLocation: String,
    questionErrorLocation: String,
    questionRemoved: IQuestion => js.Any,
    questionRenamed: (IQuestion, String, String) => js.Any,
    questionStartIndex: String,
    questionTitleLocation: String,
    questionVisibilityChanged: (IQuestion, Boolean) => js.Any,
    questionsOrder: String,
    requiredText: String,
    storeOthersAsComment: Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[_], js.Any) => js.Array[_],
    updatePageCssClasses: (IPanel, js.Any) => js.Any,
    updatePanelCssClasses: (IPanel, js.Any) => js.Any,
    updateQuestionCssClasses: (IQuestion, js.Any) => js.Any,
    uploadFiles: (String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    validatePanel: IPanel => SurveyError,
    validateQuestion: IQuestion => SurveyError
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = js.Any.fromFunction1(afterRenderPage), afterRenderPanel = js.Any.fromFunction2(afterRenderPanel), afterRenderQuestion = js.Any.fromFunction2(afterRenderQuestion), afterRenderQuestionInput = js.Any.fromFunction2(afterRenderQuestionInput), areInvisibleElementsShowing = areInvisibleElementsShowing.asInstanceOf[js.Any], beforeSettingQuestionErrors = js.Any.fromFunction2(beforeSettingQuestionErrors), clearFiles = js.Any.fromFunction4(clearFiles), clearValueOnDisableItems = clearValueOnDisableItems.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], downloadFile = js.Any.fromFunction3(downloadFile), dragAndDropAllow = js.Any.fromFunction1(dragAndDropAllow), dynamicPanelAdded = js.Any.fromFunction1(dynamicPanelAdded), dynamicPanelItemValueChanged = js.Any.fromFunction2(dynamicPanelItemValueChanged), dynamicPanelRemoved = js.Any.fromFunction3(dynamicPanelRemoved), getCss = js.Any.fromFunction0(getCss), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionByValueNameFromArray = js.Any.fromFunction3(getQuestionByValueNameFromArray), getQuestionTitleTemplate = js.Any.fromFunction0(getQuestionTitleTemplate), getSurveyMarkdownHtml = js.Any.fromFunction2(getSurveyMarkdownHtml), getUpdatedQuestionTitle = js.Any.fromFunction2(getUpdatedQuestionTitle), hasVisibleQuestionByValueName = js.Any.fromFunction1(hasVisibleQuestionByValueName), isDesignMode = isDesignMode.asInstanceOf[js.Any], isDisplayMode = isDisplayMode.asInstanceOf[js.Any], isLoadingFromJson = isLoadingFromJson.asInstanceOf[js.Any], isPageStarted = js.Any.fromFunction1(isPageStarted), isUpdateValueTextOnTyping = isUpdateValueTextOnTyping.asInstanceOf[js.Any], matrixAfterCellRender = js.Any.fromFunction2(matrixAfterCellRender), matrixAllowRemoveRow = js.Any.fromFunction3(matrixAllowRemoveRow), matrixBeforeRowAdded = js.Any.fromFunction1(matrixBeforeRowAdded), matrixCellCreated = js.Any.fromFunction2(matrixCellCreated), matrixCellValidate = js.Any.fromFunction2(matrixCellValidate), matrixCellValueChanged = js.Any.fromFunction2(matrixCellValueChanged), matrixCellValueChanging = js.Any.fromFunction2(matrixCellValueChanging), matrixRowAdded = js.Any.fromFunction1(matrixRowAdded), matrixRowRemoved = js.Any.fromFunction3(matrixRowRemoved), maxOthersLength = maxOthersLength.asInstanceOf[js.Any], maxTextLength = maxTextLength.asInstanceOf[js.Any], pageVisibilityChanged = js.Any.fromFunction2(pageVisibilityChanged), pages = pages.asInstanceOf[js.Any], panelAdded = js.Any.fromFunction4(panelAdded), panelRemoved = js.Any.fromFunction1(panelRemoved), panelVisibilityChanged = js.Any.fromFunction2(panelVisibilityChanged), processHtml = js.Any.fromFunction1(processHtml), processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx), questionAdded = js.Any.fromFunction4(questionAdded), questionCountByValueName = js.Any.fromFunction1(questionCountByValueName), questionDescriptionLocation = questionDescriptionLocation.asInstanceOf[js.Any], questionErrorLocation = questionErrorLocation.asInstanceOf[js.Any], questionRemoved = js.Any.fromFunction1(questionRemoved), questionRenamed = js.Any.fromFunction3(questionRenamed), questionStartIndex = questionStartIndex.asInstanceOf[js.Any], questionTitleLocation = questionTitleLocation.asInstanceOf[js.Any], questionVisibilityChanged = js.Any.fromFunction2(questionVisibilityChanged), questionsOrder = questionsOrder.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], storeOthersAsComment = storeOthersAsComment.asInstanceOf[js.Any], updateChoicesFromServer = js.Any.fromFunction3(updateChoicesFromServer), updatePageCssClasses = js.Any.fromFunction2(updatePageCssClasses), updatePanelCssClasses = js.Any.fromFunction2(updatePanelCssClasses), updateQuestionCssClasses = js.Any.fromFunction2(updateQuestionCssClasses), uploadFiles = js.Any.fromFunction3(uploadFiles), validatePanel = js.Any.fromFunction1(validatePanel), validateQuestion = js.Any.fromFunction1(validateQuestion))
  
    __obj.asInstanceOf[ISurvey]
  }
}

