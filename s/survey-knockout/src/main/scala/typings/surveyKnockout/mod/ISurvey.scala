package typings.surveyKnockout.mod

import typings.std.File
import typings.surveyKnockout.anon.CanAddRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurvey
  extends StObject
     with ITextProcessor
     with ISurveyErrorOwner {
  
  def afterRenderPage(htmlElement: js.Any): js.Any
  
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any
  
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any
  
  def afterRenderQuestionInput(question: IQuestion, htmlElement: js.Any): js.Any
  
  var areEmptyElementsHidden: Boolean
  
  var areInvisibleElementsShowing: Boolean
  
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit
  
  def cancelPreviewByPage(panel: IPanel): js.Any
  
  def clearFiles(
    question: IQuestion,
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, js.Any]
  ): js.Any
  
  var clearValueOnDisableItems: Boolean
  
  var currentPage: IPage
  
  def downloadFile(
    name: String,
    content: String,
    callback: js.Function2[/* status */ String, /* data */ js.Any, js.Any]
  ): js.Any
  
  def dragAndDropAllow(options: js.Any): Boolean
  
  def dynamicPanelAdded(question: IQuestion): js.Any
  
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any
  
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any
  
  def getCss(): js.Any
  
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion
  
  def getSurveyMarkdownHtml(element: Base, text: String): String
  
  def getUpdatedQuestionNo(question: IQuestion, no: String): String
  
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String
  
  def hasVisibleQuestionByValueName(valueName: String): Boolean
  
  var isClearValueOnHidden: Boolean
  
  var isDesignMode: Boolean
  
  var isDisplayMode: Boolean
  
  var isLoadingFromJson: Boolean
  
  def isPageStarted(page: IPage): Boolean
  
  var isUpdateValueTextOnTyping: Boolean
  
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any
  
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean
  
  def matrixBeforeRowAdded(options: CanAddRow): js.Any
  
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any
  
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError
  
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any
  
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any
  
  def matrixRowAdded(question: IQuestion, row: js.Any): js.Any
  
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any
  
  var maxOthersLength: Double
  
  var maxTextLength: Double
  
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any
  
  var pages: js.Array[IPage]
  
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  
  def panelRemoved(panel: IElement): js.Any
  
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any
  
  def processHtml(html: String): String
  
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  
  def questionCountByValueName(valueName: String): Double
  
  def questionCreated(question: IQuestion): js.Any
  
  var questionDescriptionLocation: String
  
  var questionErrorLocation: String
  
  def questionRemoved(question: IQuestion): js.Any
  
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any
  
  var questionStartIndex: String
  
  var questionTitleLocation: String
  
  var questionTitlePattern: String
  
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any
  
  var questionsOrder: String
  
  var requiredText: String
  
  def runExpression(expression: String): js.Any
  
  def scrollElementToTop(element: ISurveyElement, question: IQuestion, page: IPage, id: String): js.Any
  
  var state: String
  
  var storeOthersAsComment: Boolean
  
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[js.Any], serverResult: js.Any): js.Array[js.Any]
  
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any
  
  def uploadFiles(
    question: IQuestion,
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, js.Any]
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
    areEmptyElementsHidden: Boolean,
    areInvisibleElementsShowing: Boolean,
    beforeSettingQuestionErrors: (IQuestion, js.Array[SurveyError]) => Unit,
    cancelPreviewByPage: IPanel => js.Any,
    clearFiles: (IQuestion, String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any,
    clearValueOnDisableItems: Boolean,
    currentPage: IPage,
    downloadFile: (String, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any,
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
    getSurveyMarkdownHtml: (Base, String) => String,
    getUpdatedQuestionNo: (IQuestion, String) => String,
    getUpdatedQuestionTitle: (IQuestion, String) => String,
    hasVisibleQuestionByValueName: String => Boolean,
    isClearValueOnHidden: Boolean,
    isDesignMode: Boolean,
    isDisplayMode: Boolean,
    isLoadingFromJson: Boolean,
    isPageStarted: IPage => Boolean,
    isUpdateValueTextOnTyping: Boolean,
    matrixAfterCellRender: (IQuestion, js.Any) => js.Any,
    matrixAllowRemoveRow: (IQuestion, Double, js.Any) => Boolean,
    matrixBeforeRowAdded: CanAddRow => js.Any,
    matrixCellCreated: (IQuestion, js.Any) => js.Any,
    matrixCellValidate: (IQuestion, js.Any) => SurveyError,
    matrixCellValueChanged: (IQuestion, js.Any) => js.Any,
    matrixCellValueChanging: (IQuestion, js.Any) => js.Any,
    matrixRowAdded: (IQuestion, js.Any) => js.Any,
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
    questionCreated: IQuestion => js.Any,
    questionDescriptionLocation: String,
    questionErrorLocation: String,
    questionRemoved: IQuestion => js.Any,
    questionRenamed: (IQuestion, String, String) => js.Any,
    questionStartIndex: String,
    questionTitleLocation: String,
    questionTitlePattern: String,
    questionVisibilityChanged: (IQuestion, Boolean) => js.Any,
    questionsOrder: String,
    requiredText: String,
    runExpression: String => js.Any,
    scrollElementToTop: (ISurveyElement, IQuestion, IPage, String) => js.Any,
    state: String,
    storeOthersAsComment: Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[js.Any], js.Any) => js.Array[js.Any],
    updatePageCssClasses: (IPanel, js.Any) => js.Any,
    updatePanelCssClasses: (IPanel, js.Any) => js.Any,
    updateQuestionCssClasses: (IQuestion, js.Any) => js.Any,
    uploadFiles: (IQuestion, String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any,
    validatePanel: IPanel => SurveyError,
    validateQuestion: IQuestion => SurveyError
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = js.Any.fromFunction1(afterRenderPage), afterRenderPanel = js.Any.fromFunction2(afterRenderPanel), afterRenderQuestion = js.Any.fromFunction2(afterRenderQuestion), afterRenderQuestionInput = js.Any.fromFunction2(afterRenderQuestionInput), areEmptyElementsHidden = areEmptyElementsHidden.asInstanceOf[js.Any], areInvisibleElementsShowing = areInvisibleElementsShowing.asInstanceOf[js.Any], beforeSettingQuestionErrors = js.Any.fromFunction2(beforeSettingQuestionErrors), cancelPreviewByPage = js.Any.fromFunction1(cancelPreviewByPage), clearFiles = js.Any.fromFunction5(clearFiles), clearValueOnDisableItems = clearValueOnDisableItems.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], downloadFile = js.Any.fromFunction3(downloadFile), dragAndDropAllow = js.Any.fromFunction1(dragAndDropAllow), dynamicPanelAdded = js.Any.fromFunction1(dynamicPanelAdded), dynamicPanelItemValueChanged = js.Any.fromFunction2(dynamicPanelItemValueChanged), dynamicPanelRemoved = js.Any.fromFunction3(dynamicPanelRemoved), getCss = js.Any.fromFunction0(getCss), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionByValueNameFromArray = js.Any.fromFunction3(getQuestionByValueNameFromArray), getSurveyMarkdownHtml = js.Any.fromFunction2(getSurveyMarkdownHtml), getUpdatedQuestionNo = js.Any.fromFunction2(getUpdatedQuestionNo), getUpdatedQuestionTitle = js.Any.fromFunction2(getUpdatedQuestionTitle), hasVisibleQuestionByValueName = js.Any.fromFunction1(hasVisibleQuestionByValueName), isClearValueOnHidden = isClearValueOnHidden.asInstanceOf[js.Any], isDesignMode = isDesignMode.asInstanceOf[js.Any], isDisplayMode = isDisplayMode.asInstanceOf[js.Any], isLoadingFromJson = isLoadingFromJson.asInstanceOf[js.Any], isPageStarted = js.Any.fromFunction1(isPageStarted), isUpdateValueTextOnTyping = isUpdateValueTextOnTyping.asInstanceOf[js.Any], matrixAfterCellRender = js.Any.fromFunction2(matrixAfterCellRender), matrixAllowRemoveRow = js.Any.fromFunction3(matrixAllowRemoveRow), matrixBeforeRowAdded = js.Any.fromFunction1(matrixBeforeRowAdded), matrixCellCreated = js.Any.fromFunction2(matrixCellCreated), matrixCellValidate = js.Any.fromFunction2(matrixCellValidate), matrixCellValueChanged = js.Any.fromFunction2(matrixCellValueChanged), matrixCellValueChanging = js.Any.fromFunction2(matrixCellValueChanging), matrixRowAdded = js.Any.fromFunction2(matrixRowAdded), matrixRowRemoved = js.Any.fromFunction3(matrixRowRemoved), maxOthersLength = maxOthersLength.asInstanceOf[js.Any], maxTextLength = maxTextLength.asInstanceOf[js.Any], pageVisibilityChanged = js.Any.fromFunction2(pageVisibilityChanged), pages = pages.asInstanceOf[js.Any], panelAdded = js.Any.fromFunction4(panelAdded), panelRemoved = js.Any.fromFunction1(panelRemoved), panelVisibilityChanged = js.Any.fromFunction2(panelVisibilityChanged), processHtml = js.Any.fromFunction1(processHtml), processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx), questionAdded = js.Any.fromFunction4(questionAdded), questionCountByValueName = js.Any.fromFunction1(questionCountByValueName), questionCreated = js.Any.fromFunction1(questionCreated), questionDescriptionLocation = questionDescriptionLocation.asInstanceOf[js.Any], questionErrorLocation = questionErrorLocation.asInstanceOf[js.Any], questionRemoved = js.Any.fromFunction1(questionRemoved), questionRenamed = js.Any.fromFunction3(questionRenamed), questionStartIndex = questionStartIndex.asInstanceOf[js.Any], questionTitleLocation = questionTitleLocation.asInstanceOf[js.Any], questionTitlePattern = questionTitlePattern.asInstanceOf[js.Any], questionVisibilityChanged = js.Any.fromFunction2(questionVisibilityChanged), questionsOrder = questionsOrder.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], runExpression = js.Any.fromFunction1(runExpression), scrollElementToTop = js.Any.fromFunction4(scrollElementToTop), state = state.asInstanceOf[js.Any], storeOthersAsComment = storeOthersAsComment.asInstanceOf[js.Any], updateChoicesFromServer = js.Any.fromFunction3(updateChoicesFromServer), updatePageCssClasses = js.Any.fromFunction2(updatePageCssClasses), updatePanelCssClasses = js.Any.fromFunction2(updatePanelCssClasses), updateQuestionCssClasses = js.Any.fromFunction2(updateQuestionCssClasses), uploadFiles = js.Any.fromFunction4(uploadFiles), validatePanel = js.Any.fromFunction1(validatePanel), validateQuestion = js.Any.fromFunction1(validateQuestion))
    __obj.asInstanceOf[ISurvey]
  }
  
  @scala.inline
  implicit class ISurveyMutableBuilder[Self <: ISurvey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRenderPage(value: js.Any => js.Any): Self = StObject.set(x, "afterRenderPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterRenderPanel(value: (IElement, js.Any) => js.Any): Self = StObject.set(x, "afterRenderPanel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderQuestion(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "afterRenderQuestion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderQuestionInput(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "afterRenderQuestionInput", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAreEmptyElementsHidden(value: Boolean): Self = StObject.set(x, "areEmptyElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreInvisibleElementsShowing(value: Boolean): Self = StObject.set(x, "areInvisibleElementsShowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSettingQuestionErrors(value: (IQuestion, js.Array[SurveyError]) => Unit): Self = StObject.set(x, "beforeSettingQuestionErrors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCancelPreviewByPage(value: IPanel => js.Any): Self = StObject.set(x, "cancelPreviewByPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearFiles(
      value: (IQuestion, String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "clearFiles", js.Any.fromFunction5(value))
    
    @scala.inline
    def setClearValueOnDisableItems(value: Boolean): Self = StObject.set(x, "clearValueOnDisableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPage(value: IPage): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadFile(value: (String, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any): Self = StObject.set(x, "downloadFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDragAndDropAllow(value: js.Any => Boolean): Self = StObject.set(x, "dragAndDropAllow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDynamicPanelAdded(value: IQuestion => js.Any): Self = StObject.set(x, "dynamicPanelAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDynamicPanelItemValueChanged(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "dynamicPanelItemValueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDynamicPanelRemoved(value: (IQuestion, Double, IPanel) => js.Any): Self = StObject.set(x, "dynamicPanelRemoved", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCss(value: () => js.Any): Self = StObject.set(x, "getCss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuestionByValueNameFromArray(value: (String, String, Double) => IQuestion): Self = StObject.set(x, "getQuestionByValueNameFromArray", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSurveyMarkdownHtml(value: (Base, String) => String): Self = StObject.set(x, "getSurveyMarkdownHtml", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUpdatedQuestionNo(value: (IQuestion, String) => String): Self = StObject.set(x, "getUpdatedQuestionNo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUpdatedQuestionTitle(value: (IQuestion, String) => String): Self = StObject.set(x, "getUpdatedQuestionTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasVisibleQuestionByValueName(value: String => Boolean): Self = StObject.set(x, "hasVisibleQuestionByValueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsClearValueOnHidden(value: Boolean): Self = StObject.set(x, "isClearValueOnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDesignMode(value: Boolean): Self = StObject.set(x, "isDesignMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisplayMode(value: Boolean): Self = StObject.set(x, "isDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingFromJson(value: Boolean): Self = StObject.set(x, "isLoadingFromJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPageStarted(value: IPage => Boolean): Self = StObject.set(x, "isPageStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUpdateValueTextOnTyping(value: Boolean): Self = StObject.set(x, "isUpdateValueTextOnTyping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixAfterCellRender(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "matrixAfterCellRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixAllowRemoveRow(value: (IQuestion, Double, js.Any) => Boolean): Self = StObject.set(x, "matrixAllowRemoveRow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMatrixBeforeRowAdded(value: CanAddRow => js.Any): Self = StObject.set(x, "matrixBeforeRowAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatrixCellCreated(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "matrixCellCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixCellValidate(value: (IQuestion, js.Any) => SurveyError): Self = StObject.set(x, "matrixCellValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixCellValueChanged(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "matrixCellValueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixCellValueChanging(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "matrixCellValueChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixRowAdded(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "matrixRowAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrixRowRemoved(value: (IQuestion, Double, js.Any) => js.Any): Self = StObject.set(x, "matrixRowRemoved", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMaxOthersLength(value: Double): Self = StObject.set(x, "maxOthersLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTextLength(value: Double): Self = StObject.set(x, "maxTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageVisibilityChanged(value: (IPage, Boolean) => js.Any): Self = StObject.set(x, "pageVisibilityChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPages(value: js.Array[IPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: IPage*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setPanelAdded(value: (IElement, Double, js.Any, js.Any) => js.Any): Self = StObject.set(x, "panelAdded", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPanelRemoved(value: IElement => js.Any): Self = StObject.set(x, "panelRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanelVisibilityChanged(value: (IPanel, Boolean) => js.Any): Self = StObject.set(x, "panelVisibilityChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessHtml(value: String => String): Self = StObject.set(x, "processHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuestionAdded(value: (IQuestion, Double, js.Any, js.Any) => js.Any): Self = StObject.set(x, "questionAdded", js.Any.fromFunction4(value))
    
    @scala.inline
    def setQuestionCountByValueName(value: String => Double): Self = StObject.set(x, "questionCountByValueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuestionCreated(value: IQuestion => js.Any): Self = StObject.set(x, "questionCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuestionDescriptionLocation(value: String): Self = StObject.set(x, "questionDescriptionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionErrorLocation(value: String): Self = StObject.set(x, "questionErrorLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionRemoved(value: IQuestion => js.Any): Self = StObject.set(x, "questionRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuestionRenamed(value: (IQuestion, String, String) => js.Any): Self = StObject.set(x, "questionRenamed", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQuestionStartIndex(value: String): Self = StObject.set(x, "questionStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionTitleLocation(value: String): Self = StObject.set(x, "questionTitleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionTitlePattern(value: String): Self = StObject.set(x, "questionTitlePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionVisibilityChanged(value: (IQuestion, Boolean) => js.Any): Self = StObject.set(x, "questionVisibilityChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuestionsOrder(value: String): Self = StObject.set(x, "questionsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredText(value: String): Self = StObject.set(x, "requiredText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunExpression(value: String => js.Any): Self = StObject.set(x, "runExpression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollElementToTop(value: (ISurveyElement, IQuestion, IPage, String) => js.Any): Self = StObject.set(x, "scrollElementToTop", js.Any.fromFunction4(value))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreOthersAsComment(value: Boolean): Self = StObject.set(x, "storeOthersAsComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateChoicesFromServer(value: (IQuestion, js.Array[js.Any], js.Any) => js.Array[js.Any]): Self = StObject.set(x, "updateChoicesFromServer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdatePageCssClasses(value: (IPanel, js.Any) => js.Any): Self = StObject.set(x, "updatePageCssClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePanelCssClasses(value: (IPanel, js.Any) => js.Any): Self = StObject.set(x, "updatePanelCssClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateQuestionCssClasses(value: (IQuestion, js.Any) => js.Any): Self = StObject.set(x, "updateQuestionCssClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadFiles(
      value: (IQuestion, String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "uploadFiles", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValidatePanel(value: IPanel => SurveyError): Self = StObject.set(x, "validatePanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateQuestion(value: IQuestion => SurveyError): Self = StObject.set(x, "validateQuestion", js.Any.fromFunction1(value))
  }
}
