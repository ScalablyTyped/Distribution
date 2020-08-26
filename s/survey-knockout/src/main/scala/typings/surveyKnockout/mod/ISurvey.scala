package typings.surveyKnockout.mod

import typings.std.File
import typings.surveyKnockout.anon.CanAddRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurvey
  extends ISurveyErrorOwner
     with ITextProcessor {
  var areEmptyElementsHidden: Boolean = js.native
  var areInvisibleElementsShowing: Boolean = js.native
  var clearValueOnDisableItems: Boolean = js.native
  var currentPage: IPage = js.native
  var isDesignMode: Boolean = js.native
  var isDisplayMode: Boolean = js.native
  var isLoadingFromJson: Boolean = js.native
  var isUpdateValueTextOnTyping: Boolean = js.native
  var maxOthersLength: Double = js.native
  var maxTextLength: Double = js.native
  var pages: js.Array[IPage] = js.native
  var questionDescriptionLocation: String = js.native
  var questionErrorLocation: String = js.native
  var questionStartIndex: String = js.native
  var questionTitleLocation: String = js.native
  var questionTitlePattern: String = js.native
  var questionsOrder: String = js.native
  var requiredText: String = js.native
  var state: String = js.native
  var storeOthersAsComment: Boolean = js.native
  def afterRenderPage(htmlElement: js.Any): js.Any = js.native
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestionInput(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit = js.native
  def cancelPreviewByPage(panel: IPanel): js.Any = js.native
  def clearFiles(
    question: IQuestion,
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def downloadFile(name: String, content: String, callback: js.Function2[/* status */ String, /* data */ js.Any, _]): js.Any = js.native
  def dragAndDropAllow(options: js.Any): Boolean = js.native
  def dynamicPanelAdded(question: IQuestion): js.Any = js.native
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any = js.native
  def getCss(): js.Any = js.native
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion = js.native
  def getSurveyMarkdownHtml(element: Base, text: String): String = js.native
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String = js.native
  def hasVisibleQuestionByValueName(valueName: String): Boolean = js.native
  def isPageStarted(page: IPage): Boolean = js.native
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean = js.native
  def matrixBeforeRowAdded(options: CanAddRow): js.Any = js.native
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError = js.native
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixRowAdded(question: IQuestion, row: js.Any): js.Any = js.native
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any = js.native
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any = js.native
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def panelRemoved(panel: IElement): js.Any = js.native
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any = js.native
  def processHtml(html: String): String = js.native
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def questionCountByValueName(valueName: String): Double = js.native
  def questionCreated(question: IQuestion): js.Any = js.native
  def questionRemoved(question: IQuestion): js.Any = js.native
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any = js.native
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any = js.native
  def scrollElementToTop(element: ISurveyElement, question: IQuestion, page: IPage, id: String): js.Any = js.native
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_] = js.native
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any = js.native
  def uploadFiles(
    question: IQuestion,
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def validatePanel(panel: IPanel): SurveyError = js.native
  def validateQuestion(question: IQuestion): SurveyError = js.native
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
    clearFiles: (IQuestion, String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
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
    scrollElementToTop: (ISurveyElement, IQuestion, IPage, String) => js.Any,
    state: String,
    storeOthersAsComment: Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[_], js.Any) => js.Array[_],
    updatePageCssClasses: (IPanel, js.Any) => js.Any,
    updatePanelCssClasses: (IPanel, js.Any) => js.Any,
    updateQuestionCssClasses: (IQuestion, js.Any) => js.Any,
    uploadFiles: (IQuestion, String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    validatePanel: IPanel => SurveyError,
    validateQuestion: IQuestion => SurveyError
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = js.Any.fromFunction1(afterRenderPage), afterRenderPanel = js.Any.fromFunction2(afterRenderPanel), afterRenderQuestion = js.Any.fromFunction2(afterRenderQuestion), afterRenderQuestionInput = js.Any.fromFunction2(afterRenderQuestionInput), areEmptyElementsHidden = areEmptyElementsHidden.asInstanceOf[js.Any], areInvisibleElementsShowing = areInvisibleElementsShowing.asInstanceOf[js.Any], beforeSettingQuestionErrors = js.Any.fromFunction2(beforeSettingQuestionErrors), cancelPreviewByPage = js.Any.fromFunction1(cancelPreviewByPage), clearFiles = js.Any.fromFunction5(clearFiles), clearValueOnDisableItems = clearValueOnDisableItems.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], downloadFile = js.Any.fromFunction3(downloadFile), dragAndDropAllow = js.Any.fromFunction1(dragAndDropAllow), dynamicPanelAdded = js.Any.fromFunction1(dynamicPanelAdded), dynamicPanelItemValueChanged = js.Any.fromFunction2(dynamicPanelItemValueChanged), dynamicPanelRemoved = js.Any.fromFunction3(dynamicPanelRemoved), getCss = js.Any.fromFunction0(getCss), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionByValueNameFromArray = js.Any.fromFunction3(getQuestionByValueNameFromArray), getSurveyMarkdownHtml = js.Any.fromFunction2(getSurveyMarkdownHtml), getUpdatedQuestionTitle = js.Any.fromFunction2(getUpdatedQuestionTitle), hasVisibleQuestionByValueName = js.Any.fromFunction1(hasVisibleQuestionByValueName), isDesignMode = isDesignMode.asInstanceOf[js.Any], isDisplayMode = isDisplayMode.asInstanceOf[js.Any], isLoadingFromJson = isLoadingFromJson.asInstanceOf[js.Any], isPageStarted = js.Any.fromFunction1(isPageStarted), isUpdateValueTextOnTyping = isUpdateValueTextOnTyping.asInstanceOf[js.Any], matrixAfterCellRender = js.Any.fromFunction2(matrixAfterCellRender), matrixAllowRemoveRow = js.Any.fromFunction3(matrixAllowRemoveRow), matrixBeforeRowAdded = js.Any.fromFunction1(matrixBeforeRowAdded), matrixCellCreated = js.Any.fromFunction2(matrixCellCreated), matrixCellValidate = js.Any.fromFunction2(matrixCellValidate), matrixCellValueChanged = js.Any.fromFunction2(matrixCellValueChanged), matrixCellValueChanging = js.Any.fromFunction2(matrixCellValueChanging), matrixRowAdded = js.Any.fromFunction2(matrixRowAdded), matrixRowRemoved = js.Any.fromFunction3(matrixRowRemoved), maxOthersLength = maxOthersLength.asInstanceOf[js.Any], maxTextLength = maxTextLength.asInstanceOf[js.Any], pageVisibilityChanged = js.Any.fromFunction2(pageVisibilityChanged), pages = pages.asInstanceOf[js.Any], panelAdded = js.Any.fromFunction4(panelAdded), panelRemoved = js.Any.fromFunction1(panelRemoved), panelVisibilityChanged = js.Any.fromFunction2(panelVisibilityChanged), processHtml = js.Any.fromFunction1(processHtml), processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx), questionAdded = js.Any.fromFunction4(questionAdded), questionCountByValueName = js.Any.fromFunction1(questionCountByValueName), questionCreated = js.Any.fromFunction1(questionCreated), questionDescriptionLocation = questionDescriptionLocation.asInstanceOf[js.Any], questionErrorLocation = questionErrorLocation.asInstanceOf[js.Any], questionRemoved = js.Any.fromFunction1(questionRemoved), questionRenamed = js.Any.fromFunction3(questionRenamed), questionStartIndex = questionStartIndex.asInstanceOf[js.Any], questionTitleLocation = questionTitleLocation.asInstanceOf[js.Any], questionTitlePattern = questionTitlePattern.asInstanceOf[js.Any], questionVisibilityChanged = js.Any.fromFunction2(questionVisibilityChanged), questionsOrder = questionsOrder.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], scrollElementToTop = js.Any.fromFunction4(scrollElementToTop), state = state.asInstanceOf[js.Any], storeOthersAsComment = storeOthersAsComment.asInstanceOf[js.Any], updateChoicesFromServer = js.Any.fromFunction3(updateChoicesFromServer), updatePageCssClasses = js.Any.fromFunction2(updatePageCssClasses), updatePanelCssClasses = js.Any.fromFunction2(updatePanelCssClasses), updateQuestionCssClasses = js.Any.fromFunction2(updateQuestionCssClasses), uploadFiles = js.Any.fromFunction4(uploadFiles), validatePanel = js.Any.fromFunction1(validatePanel), validateQuestion = js.Any.fromFunction1(validateQuestion))
    __obj.asInstanceOf[ISurvey]
  }
  @scala.inline
  implicit class ISurveyOps[Self <: ISurvey] (val x: Self) extends AnyVal {
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
    def setAfterRenderPage(value: js.Any => js.Any): Self = this.set("afterRenderPage", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterRenderPanel(value: (IElement, js.Any) => js.Any): Self = this.set("afterRenderPanel", js.Any.fromFunction2(value))
    @scala.inline
    def setAfterRenderQuestion(value: (IQuestion, js.Any) => js.Any): Self = this.set("afterRenderQuestion", js.Any.fromFunction2(value))
    @scala.inline
    def setAfterRenderQuestionInput(value: (IQuestion, js.Any) => js.Any): Self = this.set("afterRenderQuestionInput", js.Any.fromFunction2(value))
    @scala.inline
    def setAreEmptyElementsHidden(value: Boolean): Self = this.set("areEmptyElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreInvisibleElementsShowing(value: Boolean): Self = this.set("areInvisibleElementsShowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeSettingQuestionErrors(value: (IQuestion, js.Array[SurveyError]) => Unit): Self = this.set("beforeSettingQuestionErrors", js.Any.fromFunction2(value))
    @scala.inline
    def setCancelPreviewByPage(value: IPanel => js.Any): Self = this.set("cancelPreviewByPage", js.Any.fromFunction1(value))
    @scala.inline
    def setClearFiles(
      value: (IQuestion, String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any
    ): Self = this.set("clearFiles", js.Any.fromFunction5(value))
    @scala.inline
    def setClearValueOnDisableItems(value: Boolean): Self = this.set("clearValueOnDisableItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPage(value: IPage): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadFile(value: (String, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any): Self = this.set("downloadFile", js.Any.fromFunction3(value))
    @scala.inline
    def setDragAndDropAllow(value: js.Any => Boolean): Self = this.set("dragAndDropAllow", js.Any.fromFunction1(value))
    @scala.inline
    def setDynamicPanelAdded(value: IQuestion => js.Any): Self = this.set("dynamicPanelAdded", js.Any.fromFunction1(value))
    @scala.inline
    def setDynamicPanelItemValueChanged(value: (IQuestion, js.Any) => js.Any): Self = this.set("dynamicPanelItemValueChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setDynamicPanelRemoved(value: (IQuestion, Double, IPanel) => js.Any): Self = this.set("dynamicPanelRemoved", js.Any.fromFunction3(value))
    @scala.inline
    def setGetCss(value: () => js.Any): Self = this.set("getCss", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQuestionByValueNameFromArray(value: (String, String, Double) => IQuestion): Self = this.set("getQuestionByValueNameFromArray", js.Any.fromFunction3(value))
    @scala.inline
    def setGetSurveyMarkdownHtml(value: (Base, String) => String): Self = this.set("getSurveyMarkdownHtml", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUpdatedQuestionTitle(value: (IQuestion, String) => String): Self = this.set("getUpdatedQuestionTitle", js.Any.fromFunction2(value))
    @scala.inline
    def setHasVisibleQuestionByValueName(value: String => Boolean): Self = this.set("hasVisibleQuestionByValueName", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDesignMode(value: Boolean): Self = this.set("isDesignMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisplayMode(value: Boolean): Self = this.set("isDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoadingFromJson(value: Boolean): Self = this.set("isLoadingFromJson", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPageStarted(value: IPage => Boolean): Self = this.set("isPageStarted", js.Any.fromFunction1(value))
    @scala.inline
    def setIsUpdateValueTextOnTyping(value: Boolean): Self = this.set("isUpdateValueTextOnTyping", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrixAfterCellRender(value: (IQuestion, js.Any) => js.Any): Self = this.set("matrixAfterCellRender", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixAllowRemoveRow(value: (IQuestion, Double, js.Any) => Boolean): Self = this.set("matrixAllowRemoveRow", js.Any.fromFunction3(value))
    @scala.inline
    def setMatrixBeforeRowAdded(value: CanAddRow => js.Any): Self = this.set("matrixBeforeRowAdded", js.Any.fromFunction1(value))
    @scala.inline
    def setMatrixCellCreated(value: (IQuestion, js.Any) => js.Any): Self = this.set("matrixCellCreated", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixCellValidate(value: (IQuestion, js.Any) => SurveyError): Self = this.set("matrixCellValidate", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixCellValueChanged(value: (IQuestion, js.Any) => js.Any): Self = this.set("matrixCellValueChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixCellValueChanging(value: (IQuestion, js.Any) => js.Any): Self = this.set("matrixCellValueChanging", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixRowAdded(value: (IQuestion, js.Any) => js.Any): Self = this.set("matrixRowAdded", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixRowRemoved(value: (IQuestion, Double, js.Any) => js.Any): Self = this.set("matrixRowRemoved", js.Any.fromFunction3(value))
    @scala.inline
    def setMaxOthersLength(value: Double): Self = this.set("maxOthersLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTextLength(value: Double): Self = this.set("maxTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageVisibilityChanged(value: (IPage, Boolean) => js.Any): Self = this.set("pageVisibilityChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setPagesVarargs(value: IPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[IPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelAdded(value: (IElement, Double, js.Any, js.Any) => js.Any): Self = this.set("panelAdded", js.Any.fromFunction4(value))
    @scala.inline
    def setPanelRemoved(value: IElement => js.Any): Self = this.set("panelRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def setPanelVisibilityChanged(value: (IPanel, Boolean) => js.Any): Self = this.set("panelVisibilityChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setProcessHtml(value: String => String): Self = this.set("processHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setQuestionAdded(value: (IQuestion, Double, js.Any, js.Any) => js.Any): Self = this.set("questionAdded", js.Any.fromFunction4(value))
    @scala.inline
    def setQuestionCountByValueName(value: String => Double): Self = this.set("questionCountByValueName", js.Any.fromFunction1(value))
    @scala.inline
    def setQuestionCreated(value: IQuestion => js.Any): Self = this.set("questionCreated", js.Any.fromFunction1(value))
    @scala.inline
    def setQuestionDescriptionLocation(value: String): Self = this.set("questionDescriptionLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionErrorLocation(value: String): Self = this.set("questionErrorLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionRemoved(value: IQuestion => js.Any): Self = this.set("questionRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def setQuestionRenamed(value: (IQuestion, String, String) => js.Any): Self = this.set("questionRenamed", js.Any.fromFunction3(value))
    @scala.inline
    def setQuestionStartIndex(value: String): Self = this.set("questionStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionTitleLocation(value: String): Self = this.set("questionTitleLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionTitlePattern(value: String): Self = this.set("questionTitlePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionVisibilityChanged(value: (IQuestion, Boolean) => js.Any): Self = this.set("questionVisibilityChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setQuestionsOrder(value: String): Self = this.set("questionsOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredText(value: String): Self = this.set("requiredText", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollElementToTop(value: (ISurveyElement, IQuestion, IPage, String) => js.Any): Self = this.set("scrollElementToTop", js.Any.fromFunction4(value))
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreOthersAsComment(value: Boolean): Self = this.set("storeOthersAsComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateChoicesFromServer(value: (IQuestion, js.Array[_], js.Any) => js.Array[_]): Self = this.set("updateChoicesFromServer", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdatePageCssClasses(value: (IPanel, js.Any) => js.Any): Self = this.set("updatePageCssClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdatePanelCssClasses(value: (IPanel, js.Any) => js.Any): Self = this.set("updatePanelCssClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateQuestionCssClasses(value: (IQuestion, js.Any) => js.Any): Self = this.set("updateQuestionCssClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setUploadFiles(
      value: (IQuestion, String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any
    ): Self = this.set("uploadFiles", js.Any.fromFunction4(value))
    @scala.inline
    def setValidatePanel(value: IPanel => SurveyError): Self = this.set("validatePanel", js.Any.fromFunction1(value))
    @scala.inline
    def setValidateQuestion(value: IQuestion => SurveyError): Self = this.set("validateQuestion", js.Any.fromFunction1(value))
  }
  
}

