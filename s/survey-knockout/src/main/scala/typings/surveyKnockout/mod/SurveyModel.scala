package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.autogonext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.ISurvey because var conflicts: isDesignMode, isEditingSurveyElement, isLoadingFromJson. Inlined getSkeletonComponentName, currentPage, pages, getCss, isPageStarted, getQuestionByName, pageVisibilityChanged, panelVisibilityChanged, questionVisibilityChanged, isClearValueOnHidden, isClearValueOnHiddenContainer, questionsOrder, questionCreated, questionAdded, panelAdded, questionRemoved, panelRemoved, questionRenamed, validateQuestion, validatePanel, hasVisibleQuestionByValueName, questionCountByValueName, processHtml, getSurveyMarkdownHtml, getRendererForString, getRendererContextForString, getExpressionDisplayValue, isDisplayMode, areInvisibleElementsShowing, areEmptyElementsHidden, isUpdateValueTextOnTyping, autoGrowComment, state, isLazyRendering, cancelPreviewByPage, editText, cssNavigationEdit, requiredText, beforeSettingQuestionErrors, beforeSettingPanelErrors, getSurveyErrorCustomText, getElementTitleTagName, questionTitlePattern, getUpdatedQuestionTitle, getUpdatedQuestionNo, getUpdatedElementTitleActions, getUpdatedMatrixRowActions, questionStartIndex, questionTitleLocation, questionDescriptionLocation, questionErrorLocation, storeOthersAsComment, maxTextLength, maxOthersLength, clearValueOnDisableItems, uploadFiles, downloadFile, clearFiles, updateChoicesFromServer, loadedChoicesFromServer, updateQuestionCssClasses, updatePanelCssClasses, updatePageCssClasses, updateChoiceItemCss, afterRenderQuestion, afterRenderQuestionInput, afterRenderPanel, afterRenderPage, getQuestionByValueNameFromArray, canChangeChoiceItemsVisibility, getChoiceItemVisibility, matrixRowAdded, matrixBeforeRowAdded, matrixRowRemoved, matrixRowRemoving, matrixAllowRemoveRow, matrixCellCreating, matrixCellCreated, matrixAfterCellRender, matrixCellValueChanged, matrixCellValueChanging, isValidateOnValueChanging, isValidateOnValueChanged, matrixCellValidate, dynamicPanelAdded, dynamicPanelAdded, dynamicPanelAdded, dynamicPanelAdded, dynamicPanelRemoved, dynamicPanelRemoving, dynamicPanelItemValueChanged, dragAndDropAllow, scrollElementToTop, runExpression, elementContentVisibilityChanged */ @JSImport("survey-knockout", "SurveyModel")
@js.native
open class SurveyModel ()
  extends SurveyElementCore
     with ISurveyData
     with ISurveyImpl
     with ISurveyTriggerOwner
     with ISurveyTimerText
     with ITextProcessor
     with ISurveyErrorOwner {
  def this(jsonObj: Any) = this()
  def this(jsonObj: Any, renderedElement: Any) = this()
  def this(jsonObj: Unit, renderedElement: Any) = this()
  
  /*
    * Deprecated. Use the `pageCount` property instead.
    */
  def PageCount: Double = js.native
  
  var _isDesignMode: Boolean = js.native
  
  var _isMobile: Boolean = js.native
  
  /*
    * Returns the currentPage, unless the started page is showing. In this case returns the started page.
    */
  def activePage: Any = js.native
  
  /*
    * Adds a custom navigation item similar to the Previous Page, Next Page, and Complete buttons.
    * Accepts an object described in the [IAction](https://surveyjs.io/Documentation/Library?id=IAction) help section.
    */
  def addNavigationItem(`val`: IAction): Action = js.native
  
  /*
    * Creates a new page and adds it to a survey. Generates a new name if the `name` parameter is not specified.
    */
  def addNewPage(): PageModel = js.native
  def addNewPage(name: String): PageModel = js.native
  def addNewPage(name: String, index: Double): PageModel = js.native
  def addNewPage(name: Unit, index: Double): PageModel = js.native
  
  /*
    * Adds an existing page to the survey.
    */
  def addPage(page: PageModel): Unit = js.native
  def addPage(page: PageModel, index: Double): Unit = js.native
  
  def afterRenderHeader(htmlElement: Any): Unit = js.native
  
  def afterRenderPage(htmlElement: Any): Any = js.native
  @JSName("afterRenderPage")
  def afterRenderPage_Unit(htmlElement: Any): Unit = js.native
  
  def afterRenderPanel(panel: IElement, htmlElement: Any): Any = js.native
  @JSName("afterRenderPanel")
  def afterRenderPanel_Unit(panel: IElement, htmlElement: Any): Unit = js.native
  
  def afterRenderQuestion(question: IQuestion, htmlElement: Any): Any = js.native
  
  def afterRenderQuestionInput(question: IQuestion, htmlElement: Any): Any = js.native
  @JSName("afterRenderQuestionInput")
  def afterRenderQuestionInput_Unit(question: IQuestion, htmlElement: Any): Unit = js.native
  
  @JSName("afterRenderQuestion")
  def afterRenderQuestion_Unit(question: IQuestion, htmlElement: Any): Unit = js.native
  
  def afterRenderSurvey(htmlElement: Any): Unit = js.native
  
  /*
    * Gets or sets whether a survey is automatically completed when `goNextPageAutomatic = true`. Set it to `false` if you do not want to submit survey automatically on completing the last survey page.
    */
  def allowCompleteSurveyAutomatic: Boolean = js.native
  def allowCompleteSurveyAutomatic_=(`val`: Boolean): Unit = js.native
  
  def areEmptyElementsHidden: Boolean = js.native
  @JSName("areEmptyElementsHidden")
  var areEmptyElementsHidden_FSurveyModel: Boolean = js.native
  
  def areInvisibleElementsShowing: Boolean = js.native
  @JSName("areInvisibleElementsShowing")
  var areInvisibleElementsShowing_FSurveyModel: Boolean = js.native
  
  var asyncValidationQuesitons: Any = js.native
  
  /*
    * Specifies whether the text area of [comment](https://surveyjs.io/Documentation/Library?id=questioncommentmodel) questions/elements automatically expands its height to avoid the vertical scrollbar and to display the entire multi-line contents entered by respondents.
    * Default value is false.
    */
  def autoGrowComment: Boolean = js.native
  def autoGrowComment_=(`val`: Boolean): Unit = js.native
  @JSName("autoGrowComment")
  var autoGrowComment_FSurveyModel: Boolean = js.native
  
  def beforeSettingPanelErrors(question: IPanel, errors: Any): Unit = js.native
  
  def beforeSettingQuestionErrors(question: IQuestion, errors: Any): Unit = js.native
  
  def bodyCss: String = js.native
  
  def calcIsCompleteButtonVisible(): Boolean = js.native
  
  def calculateWidthMode(): String = js.native
  
  /*
    * Gets or sets a list of calculated values in the survey.
    */
  def calculatedValues: Any = js.native
  def calculatedValues_=(`val`: Any): Unit = js.native
  
  var calculatedWidthMode: String = js.native
  
  /* CompleteClass */
  override def canBeCompleted(): Unit = js.native
  
  def canChangeChoiceItemsVisibility(): Boolean = js.native
  
  /*
    * Cancels preview and switches back to the "running" state.
    * 
    * Details: [Preview State](https://surveyjs.io/Documentation/Library#states-preview)
    */
  def cancelPreview(): Unit = js.native
  def cancelPreview(curPage: Any): Unit = js.native
  
  def cancelPreviewByPage(panel: IPanel): Any = js.native
  
  /*
    * Gets or sets a value that specifies how the survey validates the question answers.
    * 
    * The following options are available:
    * 
    * - `onNextPage` (default) - check errors on navigating to the next page or on completing the survey.
    * - `onValueChanged` - check errors on every question value (i.e., answer) changing.
    * - `onValueChanging` - check errors before setting value into survey. If there is an error, then survey data is not changed, but question value will be keeped.
    * - `onComplete` - to validate all visible questions on complete button click. If there are errors on previous pages, then the page with the first error becomes the current.
    */
  def checkErrorsMode: String = js.native
  def checkErrorsMode_=(`val`: String): Unit = js.native
  
  /*
    * Clears the survey data and state. If the survey has a `completed` state, it will get a `running` state.
    */
  def clear(): Unit = js.native
  def clear(clearData: Boolean): Unit = js.native
  def clear(clearData: Boolean, gotoFirstPage: Boolean): Unit = js.native
  def clear(clearData: Unit, gotoFirstPage: Boolean): Unit = js.native
  
  def clearFiles(
    question: IQuestion,
    name: String,
    value: Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  /*
    * Clears files from server.
    */
  @JSName("clearFiles")
  def clearFiles_Unit(
    question: IQuestion,
    name: String,
    value: Any,
    fileName: String,
    callback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Unit = js.native
  
  /*
    * Call this function to remove all question values from the survey, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radiogroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    * In fact this function just call clearIncorrectValues function of all questions in the survey
    */
  def clearIncorrectValues(): Unit = js.native
  def clearIncorrectValues(removeNonExisingRootKeys: Boolean): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how the invisible data is included in survey data.
    * 
    * The following options are available:
    * 
    * - `none` - include the invisible values into the survey data.
    * - `onHidden` - clear the question value when it becomes invisible. If a question has value and it was invisible initially then survey clears the value on completing.
    * - `onHiddenContainer` - clear the question value when it or its parent (page or panel) becomes invisible. If a question has value and it was invisible initially then survey clears the value on completing.
    * - `onComplete` (default) - clear invisible question values on survey complete. In this case, the invisible questions will not be stored on the server.
    */
  def clearInvisibleValues: Any = js.native
  def clearInvisibleValues_=(`val`: Any): Unit = js.native
  
  /*
    * Removes a value from the survey results.
    */
  def clearValue(name: String): Unit = js.native
  
  /*
    * Gets or sets whether to clear value on disable items in checkbox, dropdown and radiogroup questions.
    * By default, values are not cleared on disabled the corresponded items. This property is not persisted in survey JSON and you have to set it in code.
    */
  def clearValueOnDisableItems: Boolean = js.native
  def clearValueOnDisableItems_=(`val`: Boolean): Unit = js.native
  @JSName("clearValueOnDisableItems")
  var clearValueOnDisableItems_FSurveyModel: Boolean = js.native
  
  /*
    * Gets or sets user's identifier (e.g., e-mail or unique customer id) in your web application.
    * If you load survey or post survey results from/to [api.surveyjs.io](https://api.surveyjs.io) service, then the library do not allow users to run the same survey the second time.
    * On the second run, the user will see the survey complete page.
    */
  def clientId: String = js.native
  def clientId_=(`val`: String): Unit = js.native
  
  /*
    * You can display an additional field (comment field) for the most of questions; users can enter additional comments to their response.
    * The comment field input is saved as `'question name' + 'commentPrefix'`.
    */
  def commentPrefix: String = js.native
  def commentPrefix_=(`val`: String): Unit = js.native
  
  /*
    * Returns all comments from the data.
    */
  def comments: Any = js.native
  
  /*
    * Completes the survey, if the current page is the last one. It returns `false` if the last page has errors.
    * If the last page has no errors, `completeLastPage` calls `doComplete` and returns `true`.
    */
  def completeLastPage(): Boolean = js.native
  
  /*
    * Gets or sets the 'Complete' button caption.
    */
  def completeText: String = js.native
  def completeText_=(`val`: String): Unit = js.native
  
  /*
    * The HTML content displayed to an end user that has already completed the survey.
    */
  def completedBeforeHtml: String = js.native
  def completedBeforeHtml_=(`val`: String): Unit = js.native
  
  var completedCss: String = js.native
  
  /*
    * Gets or sets the HTML content displayed on the complete page. Use this property to change the default complete page text.
    */
  def completedHtml: String = js.native
  
  /*
    * The list of HTML condition items. If the expression of this item returns `true`, then a survey will use this item HTML instead of `completedHtml`.
    */
  def completedHtmlOnCondition: Any = js.native
  def completedHtmlOnCondition_=(`val`: Any): Unit = js.native
  
  def completedHtml_=(`val`: String): Unit = js.native
  
  def completedState: String = js.native
  
  def completedStateCss: String = js.native
  
  def completedStateText: String = js.native
  
  var conditionNotifyElementsOnAnyValueOrVariableChanged: Boolean = js.native
  
  var conditionRunnerCounter: Double = js.native
  
  var conditionUpdateVisibleIndexes: Boolean = js.native
  
  var conditionValues: Any = js.native
  
  var containerCss: String = js.native
  
  /*
    * Gets or sets a cookie name used to save information about completing the survey.
    * If the property is not empty, before starting the survey, the Survey library checks if the cookie with this name exists.
    * If it is `true`, the survey goes to complete mode and a user sees the survey complete page. On completing the survey the cookie with this name is created.
    */
  def cookieName: String = js.native
  def cookieName_=(`val`: String): Unit = js.native
  
  /* CompleteClass */
  override def copyTriggerValue(name: String, fromName: String): Any = js.native
  
  /* protected */ def createNavigationActions(): js.Array[IAction] = js.native
  
  /* protected */ def createNavigationBar(): ActionContainer[Action] = js.native
  
  /*
    * Creates and returns a new page, but do not add it into the survey.
    * You can use addPage(page) function to add it into survey later.
    */
  def createNewPage(name: String): PageModel = js.native
  
  /* protected */ def createSurveyService(): dxSurveyService = js.native
  
  def css: Any = js.native
  
  def cssNavigationComplete: String = js.native
  
  def cssNavigationEdit: String = js.native
  @JSName("cssNavigationEdit")
  var cssNavigationEdit_FSurveyModel: String = js.native
  
  def cssNavigationNext: String = js.native
  
  def cssNavigationPrev: String = js.native
  
  def cssNavigationPreview: String = js.native
  
  def cssNavigationStart: String = js.native
  
  var cssValue: Any = js.native
  
  def css_=(`val`: Any): Unit = js.native
  
  /*
    * Gets or sets the current survey page. If a survey is rendered, then this property returns a page that a user can see/edit.
    */
  def currentPage: Any = js.native
  
  /* protected */ def currentPageChanged(newValue: PageModel, oldValue: PageModel): Unit = js.native
  
  /* protected */ def currentPageChanging(newValue: PageModel, oldValue: PageModel): Boolean = js.native
  
  /*
    * The zero-based index of the current page in the visible pages array.
    */
  def currentPageNo: Double = js.native
  def currentPageNo_=(`val`: Double): Unit = js.native
  
  def currentPage_=(`val`: Any): Unit = js.native
  @JSName("currentPage")
  var currentPage_FSurveyModel: IPage = js.native
  
  /*
    * Gets or sets an object that stores the survey results/data. You can set it directly as `{ 'question name': questionValue, ... }`
    * 
    * > If you set the `data` property after creating the survey, you may need to set the `currentPageNo` to `0`, if you are using `visibleIf` properties for questions/pages/panels to ensure that you are starting from the first page.
    */
  def data: Any = js.native
  def data_=(`val`: Any): Unit = js.native
  
  /*
    * Default value for loadingHtml property
    */
  def defaultLoadingHtml: String = js.native
  
  /*
    * Deletes the cookie with `cookieName` from the browser.
    */
  def deleteCookie(): Unit = js.native
  
  def deleteDataValueCore(valuesHash: Any, key: String): Unit = js.native
  
  var disposeCallback: Any = js.native
  
  /*
    * Completes the survey.
    * 
    * Calling this function performs the following tasks:
    * 
    * - writes cookie if the `cookieName` property is not empty
    * - sets the survey into `completed` state
    * - fires the `onComplete` event
    * - calls `sendResult` function.
    * 
    * Calling the `doComplete` function does not perform any validation, unlike the `completeLastPage` function.
    * The function can return false, if you set options.allowComplete to false in onCompleting event. Otherwise it returns true.
    * It calls `navigateToUrl` after calling `onComplete` event.
    * In case calling `options.showDataSaving` callback in the `onComplete` event, `navigateToUrl` is used on calling `options.showDataSavingSuccess` callback.
    */
  def doComplete(): Boolean = js.native
  def doComplete(isCompleteOnTrigger: Boolean): Boolean = js.native
  
  /* protected */ def doCurrentPageComplete(doComplete: Boolean): Boolean = js.native
  
  /* protected */ def doNextPage(): Unit = js.native
  
  /* protected */ def doOnPageAdded(page: PageModel): Unit = js.native
  
  /* protected */ def doOnPageRemoved(page: PageModel): Unit = js.native
  
  /* protected */ def doServerValidation(doComplete: Boolean): Boolean = js.native
  /* protected */ def doServerValidation(doComplete: Boolean, isPreview: Boolean): Boolean = js.native
  
  def downloadFile(
    question: IQuestion,
    name: String,
    content: String,
    callback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  /*
    * Downloads a file from server
    */
  def downloadFile(
    question: IQuestion,
    questionName: String,
    fileValue: Any,
    callback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Unit = js.native
  
  def dragAndDropAllow(options: Any): Boolean = js.native
  
  def dynamicPanelAdded(question: IQuestion): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Double): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Double, panel: IPanel): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Unit, panel: IPanel): Unit = js.native
  
  def dynamicPanelItemValueChanged(question: IQuestion, options: Any): Any = js.native
  @JSName("dynamicPanelItemValueChanged")
  def dynamicPanelItemValueChanged_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): Unit = js.native
  
  def dynamicPanelRemoving(question: IQuestion, panelIndex: Double, panel: IPanel): Boolean = js.native
  
  /*
    * Gets or sets the 'Edit' button caption.
    */
  def editText: String = js.native
  def editText_=(`val`: String): Unit = js.native
  @JSName("editText")
  var editText_FSurveyModel: String = js.native
  
  def editingObj: Base = js.native
  
  var editingObjValue: Base = js.native
  
  def editingObj_=(`val`: Base): Unit = js.native
  
  def elementContentVisibilityChanged(element: ISurveyElement): Unit = js.native
  
  /*
    * Returns the text displayed when a survey has no visible pages and questions.
    */
  def emptySurveyText: String = js.native
  
  /*
    * Checks whether survey elements (pages, panels, and questions) have unique question names.
    * You can check for unique names for individual page and panel (and all their elements) or a question.
    * If the parameter is not specified, then a survey checks that all its elements have unique names.
    */
  def ensureUniqueNames(): Unit = js.native
  def ensureUniqueNames(element: ISurveyElement): Unit = js.native
  
  /*
    * Gets or sets whether the first survey page is a start page. Set this property to `true`, to make the first page a starting page.
    * An end user cannot navigate to the start page and the start page does not affect a survey progress.
    */
  def firstPageIsStarted: Boolean = js.native
  def firstPageIsStarted_=(`val`: Boolean): Unit = js.native
  
  /*
    * Sets the input focus to the first question with the input field.
    */
  def focusFirstQuestion(): Unit = js.native
  
  /*
    * Gets or sets whether the first input is focused on showing a next or a previous page.
    */
  def focusFirstQuestionAutomatic: Boolean = js.native
  def focusFirstQuestionAutomatic_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets whether the first input is focused if the current page has errors.
    * Set this property to `false` (the default value is `true`) if you do not want to bring the focus to the first question that has error on the page.
    */
  def focusOnFirstError: Boolean = js.native
  def focusOnFirstError_=(`val`: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def focusQuestion(name: String): Boolean = js.native
  
  /*
    * Returns a list of all survey's panels.
    */
  def getAllPanels(): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: Boolean): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: Unit, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  
  /*
    * Returns a list of all questions in a survey.
    */
  def getAllQuestions(): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: Boolean): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: Unit, includingDesignTime: Boolean): js.Array[Question] = js.native
  
  def getBuiltInVariableValue(name: String): Double = js.native
  
  def getCalculatedValueByName(name: String): CalculatedValue = js.native
  
  def getChoiceItemVisibility(question: IQuestion, item: Any, `val`: Boolean): Boolean = js.native
  
  def getCompletedStateCss(): String = js.native
  
  /*
    * Returns an amount of corrected quiz answers.
    */
  def getCorrectAnswerCount(): Double = js.native
  
  /*
    * Deprecated. Use the getCorrectAnswerCount method instead.
    */
  def getCorrectedAnswerCount(): Double = js.native
  
  def getCorrectedAnswers(): Double = js.native
  
  def getCss(): Any = js.native
  
  def getDataValueCore(valuesHash: Any, key: String): Any = js.native
  
  def getElementTitleTagName(element: Base, tagName: String): String = js.native
  
  def getElementWrapperComponentData(element: Any): Any = js.native
  def getElementWrapperComponentData(element: Any, reason: String): Any = js.native
  
  def getElementWrapperComponentName(element: Any): String = js.native
  def getElementWrapperComponentName(element: Any, reason: String): String = js.native
  
  /* CompleteClass */
  override def getErrorCustomText(text: String, error: SurveyError): String = js.native
  
  def getExpressionDisplayValue(question: IQuestion, value: Any, displayValue: String): String = js.native
  
  /*
    * Returns an amount of incorrect quiz answers.
    */
  def getInCorrectAnswerCount(): Double = js.native
  
  /*
    * Deprecated. Use the getInCorrectAnswerCount method instead.
    */
  def getInCorrectedAnswerCount(): Double = js.native
  
  def getInCorrectedAnswers(): Double = js.native
  
  def getItemValueWrapperComponentData(item: ItemValue, question: QuestionSelectBase): Any = js.native
  
  def getItemValueWrapperComponentName(item: ItemValue, question: QuestionSelectBase): String = js.native
  
  def getLocString(str: String): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  def getMatrixCellTemplateData(cell: Any): Any = js.native
  
  def getNavigateToUrl(): String = js.native
  
  /* CompleteClass */
  override def getObjects(pages: Any, questions: Any): js.Array[Any] = js.native
  
  def getPage(index: Double): PageModel = js.native
  
  /*
    * Returns a page on which an element (question or panel) is placed.
    */
  def getPageByElement(element: IElement): PageModel = js.native
  
  /*
    * Returns a page by it's name.
    */
  def getPageByName(name: String): PageModel = js.native
  
  /*
    * Returns a page on which a question is located.
    */
  def getPageByQuestion(question: IQuestion): PageModel = js.native
  
  /*
    * Returns a list of pages by their names.
    */
  def getPagesByNames(names: Any): js.Array[PageModel] = js.native
  
  /*
    * Returns a panel by its name.
    */
  def getPanelByName(name: String): PanelModel = js.native
  def getPanelByName(name: String, caseInsensitive: Boolean): PanelModel = js.native
  
  /*
    * Returns survey results as an array of objects in which the question name, title, value, and other parameters are stored as individual properties.
    * 
    * If a question can have more than one value (Matrix, Multiple Text), its object enables the `isNode` flag and stores information about these values in the `data` property. Refer to the following help topic for more information: [Access Full Survey Results](https://surveyjs.io/form-library/documentation/handle-survey-results-access#access-full-survey-results).
    * 
    * If you want to skip empty answers, pass an object with the `includeEmpty` property set to `false`.
    */
  def getPlainData(): Any = js.native
  def getPlainData(options: Any): Any = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /*
    * Returns the progress that a user made while going through the survey.
    * It depends from progressBarType property
    */
  def getProgress(): Double = js.native
  
  def getProgressText(): String = js.native
  
  /*
    * Returns a question by its name.
    */
  def getQuestionByName(name: String): Question = js.native
  def getQuestionByName(name: String, caseInsensitive: Boolean): Question = js.native
  @JSName("getQuestionByName")
  def getQuestionByName_IQuestion(name: String): IQuestion = js.native
  
  /*
    * Returns a question by its value name
    */
  def getQuestionByValueName(valueName: String): IQuestion = js.native
  def getQuestionByValueName(valueName: String, caseInsensitive: Boolean): IQuestion = js.native
  
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion = js.native
  
  def getQuestionContentWrapperComponentName(element: Any): String = js.native
  
  def getQuestionTitlePatternOptions(): js.Array[Any] = js.native
  
  /*
    * Gets a list of questions by their names.
    */
  def getQuestionsByNames(names: Any): js.Array[IQuestion] = js.native
  def getQuestionsByNames(names: Any, caseInsensitive: Boolean): js.Array[IQuestion] = js.native
  
  /*
    * Returns all questions by their valueName. name property is used if valueName property is empty.
    */
  def getQuestionsByValueName(valueName: String): js.Array[Question] = js.native
  def getQuestionsByValueName(valueName: String, caseInsensitive: Boolean): js.Array[Question] = js.native
  
  /*
    * Returns quiz question number. It may be different from `getQuizQuestions.length` because some widgets like matrix may have several questions.
    */
  def getQuizQuestionCount(): Double = js.native
  
  /*
    * Returns quiz questions. All visible questions that has input(s) widgets.
    */
  def getQuizQuestions(): js.Array[IQuestion] = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def getRendererContextForString(element: Base, locStr: LocalizableString): Any = js.native
  @JSName("getRendererContextForString")
  def getRendererContextForString_LocalizableString(element: Base, locStr: LocalizableString): LocalizableString = js.native
  
  def getRendererForString(element: Base, name: String): String = js.native
  
  /*
    * Calls the [api.surveyjs.io](https://api.surveyjs.io) service and, on callback, fires the `onGetResult` event with all answers that your users made for a question.
    */
  def getResult(resultId: String, name: String): Unit = js.native
  
  def getRootCss(): String = js.native
  
  def getRowWrapperComponentData(row: QuestionRowModel): Any = js.native
  
  def getRowWrapperComponentName(row: QuestionRowModel): String = js.native
  
  def getSkeletonComponentName(element: ISurveyElement): String = js.native
  
  /* InferMemberOverrides */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  def getSurveyErrorCustomText(obj: Base, text: String, error: SurveyError): String = js.native
  
  def getSurveyMarkdownHtml(element: Base, text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
  /* protected */ def getUnbindValue(value: Any): Any = js.native
  
  def getUpdatedElementTitleActions(element: ISurveyElement, titleActions: Any): js.Array[IAction] = js.native
  
  def getUpdatedMatrixRowActions(question: IQuestion, row: Any, actions: Any): Any = js.native
  def getUpdatedMatrixRowActions(question: QuestionMatrixDropdownModelBase, row: MatrixDropdownRowModelBase, actions: Any): js.Array[IAction] = js.native
  
  def getUpdatedQuestionNo(question: IQuestion, no: String): String = js.native
  
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String = js.native
  
  /*
    * Returns an array of locales that are used in the survey's translation.
    */
  def getUsedLocales(): js.Array[Any] = js.native
  
  /*
    * Returns all variables in the survey. Use setVariable function to create a new variable.
    */
  def getVariableNames(): js.Array[Any] = js.native
  
  /*
    * Gets or ses whether user proceeds to the next page without pressing the "Next" button after answering all page questions.
    * The available options:
    * 
    * - `true` - navigate to the next page and submit survey data automatically.
    * - `autogonext` - navigate to the next page automatically but do not submit survey data.
    * - `false` - do not navigate to the next page and do not submit survey data automatically.
    * 
    * > NOTE: If any of the following questions is answered last, the survey won't be switched to the next page: Checkbox, Boolean (rendered as Checkbox), Comment, Signature Pad, Image Picker (with Multi Select), File, Single-Choice Matrix (not all rows are answered), Dynamic Matrix, Panel Dynamic.
    */
  def goNextPageAutomatic: Boolean | autogonext = js.native
  @JSName("goNextPageAutomatic_=")
  def `goNextPageAutomatic_=_autogonext`(`val`: Boolean | autogonext): Unit = js.native
  
  /*
    * Returns `true`, if a user has already completed the survey in this browser and there is a cookie about it. Survey goes to `completed` state if the function returns `true`.
    */
  def hasCookie: Boolean = js.native
  
  /*
    * Returns `true`, if the current page contains any error. If there is an async function in an expression, then the function will return `undefined` value.
    * In this case, you should use `onAsyncValidation` parameter, which is a callback function: (hasErrors: boolean) => void
    */
  def hasCurrentPageErrors(): Boolean = js.native
  def hasCurrentPageErrors(onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]): Boolean = js.native
  
  /*
    * Returns `true`, if any of the survey pages contains errors. If there is an async function in an expression, then the function will return `undefined` value.
    * In this case, you should use  the third `onAsyncValidation` parameter, which is a callback function: (hasErrors: boolean) => void
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(
    fireCallback: Boolean,
    focusOnFirstError: Boolean,
    onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]
  ): Boolean = js.native
  def hasErrors(
    fireCallback: Boolean,
    focusOnFirstError: Unit,
    onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]
  ): Boolean = js.native
  def hasErrors(fireCallback: Unit, focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(
    fireCallback: Unit,
    focusOnFirstError: Boolean,
    onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]
  ): Boolean = js.native
  def hasErrors(
    fireCallback: Unit,
    focusOnFirstError: Unit,
    onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]
  ): Boolean = js.native
  
  def hasLogo: Boolean = js.native
  
  /*
    * Returns `true`, if a page contains an error. If there is an async function in an expression, then the function will return `undefined` value.
    * In this case, you should use the second `onAsyncValidation` parameter,  which is a callback function: (hasErrors: boolean) => void
    */
  def hasPageErrors(): Boolean = js.native
  def hasPageErrors(page: Unit, onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]): Boolean = js.native
  def hasPageErrors(page: PageModel): Boolean = js.native
  def hasPageErrors(page: PageModel, onAsyncValidation: js.Function1[/* hasErrors */ Boolean, Unit]): Boolean = js.native
  
  def hasVisibleQuestionByValueName(valueName: String): Boolean = js.native
  
  /*
    * Gets or sets whether to hide all required errors.
    */
  var hideRequiredErrors: Boolean = js.native
  
  /*
    * Gets or sets whether the survey must ignore validation like required questions and others, on `nextPage` and `completeLastPage` function calls. The default is `false`.
    */
  var ignoreValidation: Boolean = js.native
  
  var isCalculatingProgressText: Boolean = js.native
  
  def isCancelPreviewButtonVisible: Boolean = js.native
  
  def isClearValueOnHidden: Boolean = js.native
  
  def isClearValueOnHiddenContainer: Boolean = js.native
  @JSName("isClearValueOnHiddenContainer")
  var isClearValueOnHiddenContainer_FSurveyModel: Boolean = js.native
  
  @JSName("isClearValueOnHidden")
  var isClearValueOnHidden_FSurveyModel: Boolean = js.native
  
  def isCompleteButtonVisible: Boolean = js.native
  
  /*
    * Returns `true`, if the current page contains errors, for example, the required question is empty or a question validation is failed.
    */
  def isCurrentPageHasErrors: Boolean = js.native
  
  var isCurrentPageRendering: Boolean = js.native
  
  /*
    * Returns `true` if the survey is in display mode or in preview mode.
    */
  def isDisplayMode: Boolean = js.native
  @JSName("isDisplayMode")
  var isDisplayMode_FSurveyModel: Boolean = js.native
  
  /*
    * Returns `true` if the survey is in edit mode.
    */
  def isEditMode: Boolean = js.native
  
  /*
    * Returns `true` if the survey contains no pages. The survey is empty.
    */
  def isEmpty: Boolean = js.native
  
  var isEndLoadingFromJson: String = js.native
  
  /*
    * Gets whether the current page is the first one.
    */
  def isFirstPage: Boolean = js.native
  
  var isFirstPageRendering: Boolean = js.native
  
  var isFocusingQuestion: Boolean = js.native
  
  /*
    * Gets whether the current page is the last one.
    */
  def isLastPage: Boolean = js.native
  
  def isLazyRendering: Boolean = js.native
  @JSName("isLazyRendering")
  var isLazyRendering_FSurveyModel: Boolean = js.native
  
  def isLogoAfter: Boolean = js.native
  
  def isLogoBefore: Boolean = js.native
  
  /* protected */ def isLogoImageChoosen(): String = js.native
  
  var isMovingQuestion: Boolean = js.native
  
  var isNavigationButtonPressed: Boolean = js.native
  
  /*
    * Returns the navigation buttons (i.e., 'Prev', 'Next', or 'Complete' and 'Preview') position.
    */
  def isNavigationButtonsShowing: String = js.native
  
  /*
    * Returns true if the navigation buttons (i.e., 'Prev', 'Next', or 'Complete' and 'Preview') are shows on bottom.
    */
  def isNavigationButtonsShowingOnBottom: Boolean = js.native
  
  /*
    * Returns true if the navigation buttons (i.e., 'Prev', 'Next', or 'Complete' and 'Preview') are shows on top.
    */
  def isNavigationButtonsShowingOnTop: Boolean = js.native
  
  def isPageStarted(page: IPage): Boolean = js.native
  
  def isPreviewButtonVisible: Boolean = js.native
  
  var isRunningElementsBindings: Boolean = js.native
  
  def isShowNextButton: Boolean = js.native
  
  def isShowPrevButton: Boolean = js.native
  
  def isShowPreviewBeforeComplete: Boolean = js.native
  
  def isShowProgressBarOnBottom: Boolean = js.native
  
  def isShowProgressBarOnTop: Boolean = js.native
  
  /*
    * The started page is showing right now. survey state equals to "starting"
    */
  def isShowStartingPage: Boolean = js.native
  
  /*
    * Survey is showing a page right now. It is in "running", "preview" or starting state.
    */
  def isShowingPage: Boolean = js.native
  
  /*
    * Obsolete. Use the `questionsOnPageMode` property instead.
    */
  def isSinglePage: Boolean = js.native
  def isSinglePage_=(`val`: Boolean): Unit = js.native
  
  def isTimerPanelShowingOnBottom: Boolean = js.native
  
  def isTimerPanelShowingOnTop: Boolean = js.native
  
  var isTriggerIsRunning: Boolean = js.native
  
  def isUpdateValueTextOnTyping: Boolean = js.native
  @JSName("isUpdateValueTextOnTyping")
  var isUpdateValueTextOnTyping_FSurveyModel: Boolean = js.native
  
  def isValidateOnValueChanged: Boolean = js.native
  @JSName("isValidateOnValueChanged")
  var isValidateOnValueChanged_FSurveyModel: Boolean = js.native
  
  def isValidateOnValueChanging: Boolean = js.native
  @JSName("isValidateOnValueChanging")
  var isValidateOnValueChanging_FSurveyModel: Boolean = js.native
  
  /*
    * Gets whether the question values on the current page are validating on the server at the current moment.
    */
  def isValidatingOnServer: Boolean = js.native
  
  var isValueChangedOnRunningCondition: Boolean = js.native
  
  /*
    * The list of errors on loading survey JSON. If the list is empty after loading a JSON, then the JSON is correct and has no errors.
    */
  var jsonErrors: Any = js.native
  
  /*
    * By default all rows are rendered no matters if they are visible or not.
    * Set it true, and survey markup rows will be rendered only if they are visible in viewport.
    * This feature is experimantal and might do not support all the use cases.
    */
  def lazyRendering: Boolean = js.native
  
  var lazyRenderingValue: Boolean = js.native
  
  def lazyRendering_=(`val`: Boolean): Unit = js.native
  
  /*
    * Loads the survey JSON from the [api.surveyjs.io](https://api.surveyjs.io) service.
    * If `clientId` is not `null` and a user had completed a survey before, the survey switches to `completedbefore` state.
    */
  def loadSurveyFromService(): Unit = js.native
  def loadSurveyFromService(surveyId: String): Unit = js.native
  def loadSurveyFromService(surveyId: String, cliendId: String): Unit = js.native
  def loadSurveyFromService(surveyId: Unit, cliendId: String): Unit = js.native
  
  def loadedChoicesFromServer(question: IQuestion): Unit = js.native
  
  /*
    * The HTML that shows on loading survey Json from the [api.surveyjs.io](https://api.surveyjs.io) service.
    */
  def loadingHtml: String = js.native
  def loadingHtml_=(`val`: String): Unit = js.native
  
  def locCompleteText: LocalizableString = js.native
  
  def locCompletedBeforeHtml: LocalizableString = js.native
  
  def locCompletedHtml: LocalizableString = js.native
  
  def locEditText: LocalizableString = js.native
  
  def locLoadingHtml: LocalizableString = js.native
  
  def locLogo: LocalizableString = js.native
  
  def locPageNextText: LocalizableString = js.native
  
  def locPagePrevText: LocalizableString = js.native
  
  def locPreviewText: LocalizableString = js.native
  
  def locQuestionTitleTemplate: LocalizableString = js.native
  
  def locStartSurveyText: LocalizableString = js.native
  
  /*
    * Gets or sets the survey locale. The default value it is empty, this means the 'en' locale is used.
    * You can set it to 'de' - German, 'fr' - French and so on. The library has built-in localization for several languages. The library has a multi-language support as well.
    */
  def locale: String = js.native
  def locale_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a survey logo.
    */
  def logo: String = js.native
  
  def logoClassNames: String = js.native
  
  /*
    * The logo fit mode.
    */
  def logoFit: String = js.native
  def logoFit_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a survey logo height.
    */
  def logoHeight: Any = js.native
  def logoHeight_=(`val`: Any): Unit = js.native
  
  /*
    * Gets or sets a survey logo position.
    */
  def logoPosition: String = js.native
  def logoPosition_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a survey logo width.
    */
  def logoWidth: Any = js.native
  def logoWidth_=(`val`: Any): Unit = js.native
  
  def logo_=(`val`: String): Unit = js.native
  
  def matrixAfterCellRender(question: IQuestion, options: Any): Any = js.native
  @JSName("matrixAfterCellRender")
  def matrixAfterCellRender_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: Any): Boolean = js.native
  
  def matrixBeforeRowAdded(options: Any): Any = js.native
  @JSName("matrixBeforeRowAdded")
  def matrixBeforeRowAdded_Unit(options: Any): Unit = js.native
  
  def matrixCellCreated(question: IQuestion, options: Any): Any = js.native
  @JSName("matrixCellCreated")
  def matrixCellCreated_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def matrixCellCreating(question: IQuestion, options: Any): Any = js.native
  @JSName("matrixCellCreating")
  def matrixCellCreating_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def matrixCellValidate(question: IQuestion, options: Any): SurveyError = js.native
  
  def matrixCellValueChanged(question: IQuestion, options: Any): Any = js.native
  @JSName("matrixCellValueChanged")
  def matrixCellValueChanged_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def matrixCellValueChanging(question: IQuestion, options: Any): Any = js.native
  @JSName("matrixCellValueChanging")
  def matrixCellValueChanging_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def matrixRowAdded(question: IQuestion, row: Any): Any = js.native
  @JSName("matrixRowAdded")
  def matrixRowAdded_Unit(question: IQuestion, row: Any): Unit = js.native
  
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: Any): Any = js.native
  @JSName("matrixRowRemoved")
  def matrixRowRemoved_Unit(question: IQuestion, rowIndex: Double, row: Any): Unit = js.native
  
  def matrixRowRemoving(question: IQuestion, rowIndex: Double, row: Any): Boolean = js.native
  
  /*
    * Gets or sets the default maximum length for question comments and others
    * 
    * The default value is `0`, that means that the question comments have the same max length as the standard HTML input - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp.
    */
  def maxOthersLength: Double = js.native
  def maxOthersLength_=(`val`: Double): Unit = js.native
  @JSName("maxOthersLength")
  var maxOthersLength_FSurveyModel: Double = js.native
  
  /*
    * Specifies the default maximum length for questions like text and comment, including matrix cell questions.
    * 
    * The default value is `0`, that means that the text and comment have the same max length as the standard HTML input - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp.
    */
  def maxTextLength: Double = js.native
  def maxTextLength_=(`val`: Double): Unit = js.native
  @JSName("maxTextLength")
  var maxTextLength_FSurveyModel: Double = js.native
  
  /*
    * Gets or sets the maximum time in seconds that end user has to complete a survey. If the value is 0 or less, an end user has no time limit to finish a survey.
    */
  def maxTimeToFinish: Double = js.native
  
  /*
    * Gets or sets the maximum time in seconds that end user has to complete a page in the survey. If the value is 0 or less, an end user has no time limit.
    * 
    * You may override this value for every page.
    */
  def maxTimeToFinishPage: Double = js.native
  def maxTimeToFinishPage_=(`val`: Double): Unit = js.native
  
  def maxTimeToFinish_=(`val`: Double): Unit = js.native
  
  /*
    * Merge the values into survey.data. It works as survey.data, except it doesn't clean the existing data, but overrides them.
    */
  def mergeData(data: Any): Unit = js.native
  
  def mergeValues(src: Any, dest: Any): Unit = js.native
  
  /*
    * Gets or sets the survey edit mode.
    * 
    * The following options are available:
    * 
    * - `edit` (default) - make a survey editable,
    * - `display` - make a survey read-only.
    */
  def mode: String = js.native
  def mode_=(`val`: String): Unit = js.native
  
  var mouseDownPage: Any = js.native
  
  /*
    * Set this property to a url you want to navigate after a user completing the survey.
    * By default it uses after calling onComplete event. In case calling options.showDataSaving callback in onComplete event, navigateToUrl will be used on calling options.showDataSavingSuccess callback.
    */
  def navigateToUrl: String = js.native
  
  /*
    * Gets or sets a list of URL condition items. If the expression of this item returns `true`, then survey will navigate to the item URL.
    */
  def navigateToUrlOnCondition: Any = js.native
  def navigateToUrlOnCondition_=(`val`: Any): Unit = js.native
  
  def navigateToUrl_=(`val`: String): Unit = js.native
  
  def navigationBar: Any = js.native
  
  var navigationBarValue: Any = js.native
  
  def navigationMouseDown(): Boolean = js.native
  
  var needRenderIcons: Boolean = js.native
  
  /*
    * Navigates user to the next page.
    * 
    * Returns `false` in the following cases:
    * 
    * - if the current page is the last page.
    * - if the current page contains errors (for example, a required question is empty).
    */
  def nextPage(): Boolean = js.native
  
  def nextPageMouseDown(): Boolean = js.native
  
  def nextPageUIClick(): Unit = js.native
  
  /* protected */ def notifyQuestionOnValueChanged(valueName: String, newValue: Any): Unit = js.native
  
  /*
    * The event is fired right after a page is rendered in DOM. Use it to modify HTML elements.
    * - `sender` - the survey object that fires the event.
    * - `options.htmlElement` - an HTML element bound to the survey header object.
    */
  var onAfterRenderHeader: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired right after a page is rendered in DOM. Use it to modify HTML elements.
    * - `sender` - the survey object that fires the event.
    * - `options.page` - a page object for which the event is fired. Typically the current/active page.
    * - `options.htmlElement` - an HTML element bound to the page object.
    */
  var onAfterRenderPage: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired right after a panel is rendered in DOM. Use it to modify HTML elements.
    * - `sender` - the survey object that fires the event
    * - `options.panel` - a panel object for which the event is fired
    * - `options.htmlElement` - an HTML element bound to the panel object
    */
  var onAfterRenderPanel: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired right after a question is rendered in DOM. Use it to modify HTML elements.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question object for which the event is fired.
    * - `options.htmlElement` - an HTML element bound to the question object.
    */
  var onAfterRenderQuestion: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired right after a non-composite question (text, comment, dropdown, radiogroup, checkbox) is rendered in DOM. Use it to modify HTML elements.
    * This event is not fired for matrices, panels, multiple text and image picker.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question object for which the event is fired.
    * - `options.htmlElement` - an HTML element bound to the question object.
    */
  var onAfterRenderQuestionInput: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired right after survey is rendered in DOM.
    * - `sender` - the survey object that fires the event.
    * - `options.htmlElement` - a root HTML element bound to the survey object.
    */
  var onAfterRenderSurvey: EventBase[SurveyModel] = js.native
  
  /* protected */ def onBeforeCreating(): Unit = js.native
  
  /*
    * This event is fired on clearing the value in a QuestionFile. Use this event to remove files stored on your server.
    * - `sender` - the survey object that fires the event.
    * - `question` - the question instance.
    * - `options.name` - the question name.
    * - `options.value` - the question value.
    * - `options.fileName` - a removed file's name, set it to `null` to clear all files.
    * - `options.callback` - a callback function to get the operation status.
    */
  var onClearFiles: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired after a user clicks the 'Complete' button and finishes a survey. Use this event to send the survey data to your web server.
    * 
    * - `sender` - the survey object that fires the event.
    * - `options.showDataSaving(text)` - call this method to show that the survey is saving survey data on your server. The `text` is an optional parameter to show a custom message instead of default.
    * - `options.showDataSavingError(text)` - call this method to show that an error occurred while saving the data on your server. If you want to show a custom error, use an optional `text` parameter.
    * - `options.showDataSavingSuccess(text)` - call this method to show that the data was successfully saved on the server.
    * - `options.showDataSavingClear` - call this method to hide the text about the saving progress.
    * - `options.isCompleteOnTrigger` - returns true if the survey is completed on "complete" trigger.
    * 
    * > NOTE: Do not disable the [`showCompletedPage`](https://surveyjs.io/form-library/documentation/surveymodel#showCompletedPage) property if you call one of the `options.showDataSaving...` methods described above. This is required because the UI that indicates data saving progress is integrated into the Complete page. If you hide the Complete page, the UI also becomes invisible.
    */
  var onComplete: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before the survey is completed and the `onComplete` event is fired. You can prevent the survey from completing by setting `options.allowComplete` to `false`
    * - `sender` - the survey object that fires the event.
    * - `options.allowComplete` - Specifies whether a user can complete a survey. Set this property to `false` to prevent the survey from completing. The default value is `true`.
    * - `options.isCompleteOnTrigger` - returns true if the survey is completing on "complete" trigger.
    */
  var onCompleting: EventBase[SurveyModel] = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  /*
    * The event is fired when the current page has been changed to another page. Typically it happens when a user click on 'Next' or 'Prev' buttons.
    * - `sender` - the survey object that fires the event.
    * - `option.oldCurrentPage` - a previous current/active page.
    * - `option.newCurrentPage` - a new current/active page.
    * - `option.isNextPage` - commonly means, that end-user press the next page button. In general, it means that options.newCurrentPage is the next page after options.oldCurrentPage
    * - `option.isPrevPage` - commonly means, that end-user press the previous page button. In general, it means that options.newCurrentPage is the previous page before options.oldCurrentPage
    */
  var onCurrentPageChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before the current page changes to another page. Typically it happens when a user click the 'Next' or 'Prev' buttons.
    * - `sender` - the survey object that fires the event.
    * - `option.oldCurrentPage` - the previous current/active page.
    * - `option.newCurrentPage` - a new current/active page.
    * - `option.allowChanging` - set it to `false` to disable the current page changing. It is `true` by default.
    * - `option.isNextPage` - commonly means, that end-user press the next page button. In general, it means that options.newCurrentPage is the next page after options.oldCurrentPage
    * - `option.isPrevPage` - commonly means, that end-user press the previous page button. In general, it means that options.newCurrentPage is the previous page before options.oldCurrentPage
    */
  var onCurrentPageChanging: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on downloading a file in QuestionFile. Use this event to pass the file to a preview.
    * - `sender` - the survey object that fires the event.
    * - `question` - the question instance.
    * - `options.name` - the question name.
    * - `options.content` - the file content.
    * - `options.fileValue` - single file question value.
    * - `options.callback` - a callback function to get the file downloading status and the downloaded file content.
    */
  var onDownloadFile: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to control drag&drop operations during design mode.
    * - `sender` - the survey object that fires the event.
    * - `options.allow` - set it to `false` to disable dragging.
    * - `options.target` - a target element that is dragged.
    * - `options.source` - a source element. It can be `null`, if it is a new element, dragging from toolbox.
    * - `options.parent` - a page or panel where target element is dragging.
    * - `options.insertBefore` - an element before the target element is dragging. It can be `null` if parent container (page or panel) is empty or dragging an element after the last element in a container.
    * - `options.insertAfter` - an element after the target element is dragging. It can be `null` if parent container (page or panel) is empty or dragging element to the first position within the parent container.
    */
  var onDragDropAllow: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on adding a new panel in Panel Dynamic question.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a panel question.
    * - `options.panel` - an added panel.
    */
  var onDynamicPanelAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when item value is changed in Panel Dynamic question.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the panel question.
    * - `options.panel` - the dynamic panel item.
    * - `options.name` - the item name.
    * - `options.value` - a new value.
    * - `options.itemIndex` - the panel item index.
    * - `options.itemValue` - the panel item object.
    */
  var onDynamicPanelItemValueChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on removing a panel from Panel Dynamic question.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a panel question.
    * - `options.panelIndex` - a removed panel index.
    * - `options.panel` - a removed panel.
    */
  var onDynamicPanelRemoved: EventBase[SurveyModel] = js.native
  
  /*
    * An event that is raised before a panel is removed from a Dynamic Panel question. Use this event to cancel the removal.
    * 
    * Parameters:
    * 
    * - `sender` - A Survey instance that raised the event.
    * - `options.question` - A [Panel Dynamic](https://surveyjs.io/Documentation/Library?id=questionpaneldynamicmodel) question instance.
    * - `options.panelIndex` - The index of the removed panel.
    * - `options.panel` - The [instance of the removed panel](https://surveyjs.io/Documentation/Library?id=panelmodel).
    * - `options.allow` - A Boolean property that you should set to `false` if you want to cancel the panel removal.
    */
  var onDynamicPanelRemoving: EventBase[SurveyModel] = js.native
  
  def onEditingObjPropertyChanged(sender: Base, options: Any): Unit = js.native
  
  /*
    * The event is fired after the survey element content was collapsed or expanded.
    * - `sender` - the survey object that fires the event.
    * - `options.element` - Specifies which survey element content was collapsed or expanded.
    */
  var onElementContentVisibilityChanged: EventBase[SurveyModel] = js.native
  
  /*
    * Use the event to change the default error text.
    * - `sender` - the survey object that fires the event.
    * - `options.text` - an error text.
    * - `options.error` - an instance of the `SurveyError` object.
    * - `options.obj` - an instance of Question, Panel or Survey object to where error is located.
    * - `options.name` - the error name. The following error names are available:
    * required, requireoneanswer, requirenumeric, exceedsize, webrequest, webrequestempty, otherempty,
    * uploadingfile, requiredinallrowserror, minrowcounterror, keyduplicationerror, custom
    */
  var onErrorCustomText: EventBase[SurveyModel] = js.native
  
  /* protected */ def onFirstPageIsStartedChanged(): Unit = js.native
  
  /*
    * The event occurs when an element within a panel gets focus.
    * - `sender` - A [survey](https://surveyjs.io/Documentation/Library?id=surveymodel) object that fires the event.
    * - `options.panel` - A [panel](https://surveyjs.io/Documentation/Library?id=PanelModelBase) whose child element gets focus.
    */
  var onFocusInPanel: EventBase[SurveyModel] = js.native
  
  /*
    * The event occurs when an element within a question gets focus.
    * - `sender` - A [survey](https://surveyjs.io/Documentation/Library?id=surveymodel) object that fires the event.
    * - `options.question` - A [question](https://surveyjs.io/Documentation/Library?id=Question) whose child element gets focus.
    */
  var onFocusInQuestion: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before expression question convert it's value into display value for rendering.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - The expression question.
    * - `options.value` - The question value.
    * - `options.displayValue` - the display value that you can change before rendering.
    */
  var onGetExpressionDisplayValue: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to create/customize actions to be displayed in a matrix question's row.
    * - `sender` - A survey object that fires the event.
    * - `options.question` - A matrix question ([QuestionMatrixBaseModel](https://surveyjs.io/Documentation/Library?id=questionmatrixbasemodel) object) for which the event is fired.
    * - `options.row` - A matrix row for which the event is fired.
    * - `options.actions` - A list of actions ([IAction](https://surveyjs.io/Documentation/Library?id=IAction) objects) associated with the processed matrix question and row.
    */
  var onGetMatrixRowActions: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to create/customize actions to be displayed in a page's title.
    * - `sender` - A survey object that fires the event.
    * - `options.page` - A page ([PageModel](https://surveyjs.io/Documentation/Library?id=pagemodel) object) for which the event is fired.
    * - `options.titleActions` - A list of actions ([IAction](https://surveyjs.io/Documentation/Library?id=IAction) objects) associated with the processed page.
    */
  var onGetPageTitleActions: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to create/customize actions to be displayed in a panel's title.
    * - `sender` - A survey object that fires the event.
    * - `options.panel` - A panel ([PanelModel](https://surveyjs.io/Documentation/Library?id=panelmodel) object) for which the event is fired.
    * - `options.titleActions` - A list of actions ([IAction](https://surveyjs.io/Documentation/Library?id=IAction) objects) associated with the processed panel.
    */
  var onGetPanelTitleActions: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to change the question no in code. If you want to remove question numbering then set showQuestionNumbers to "off".
    * - `sender` - the survey object that fires the event.
    * - `options.no` - a calculated question no, based on question `visibleIndex`, survey `.questionStartIndex` properties. You can change it.
    * - `options.question` - a question object.
    */
  var onGetQuestionNo: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to change the question title in code. If you want to remove question numbering then set showQuestionNumbers to "off".
    * - `sender` - the survey object that fires the event.
    * - `options.title` - a calculated question title, based on question `title`, `name`.
    * - `options.question` - a question object.
    */
  var onGetQuestionTitle: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to create/customize actions to be displayed in a question's title.
    * - `sender` - A [Survey](https://surveyjs.io/Documentation/Library?id=SurveyModel) object that fires the event.
    * - `options.question` - A [Question](https://surveyjs.io/Documentation/Library?id=Question) object for which the event is fired.
    * - `options.titleActions` - A list of actions ([IAction](https://surveyjs.io/Documentation/Library?id=IAction) objects) associated with the processed question.
    */
  var onGetQuestionTitleActions: EventBase[SurveyModel] = js.native
  
  /*
    * Use it to get results after calling the `getResult` method. It returns a simple analytics from [api.surveyjs.io](https://api.surveyjs.io) service.
    * - `sender` - the survey object that fires the event.
    * - `options.success` - it is `true` if the results were got from the service successfully.
    * - `options.data` - the object `{AnswersCount, QuestionResult : {} }`. `AnswersCount` is the number of posted survey results. `QuestionResult` is an object with all possible unique answers to the question and number of these answers.
    * - `options.dataList` - an array of objects `{name, value}`, where `name` is a unique value/answer to the question and `value` is a number/count of such answers.
    * - `options.response` - the server response.
    */
  var onGetResult: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to change the element title tag name that renders by default.
    * - `sender` - the survey object that fires the event.
    * - `options.element` - an element (question, panel, page and survey) that SurveyJS is going to render.
    * - `options.tagName` - an element title tagName that are used to render a title. You can change it from the default value.
    */
  var onGetTitleTagName: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to define, whether an answer to a question is correct or not.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question on which you have to decide if the answer is correct or not.
    * - `options.result` - returns `true`, if an answer is correct, or `false`, if the answer is not correct. Use questions' `value` and `correctAnswer` properties to return the correct value.
    * - `options.correctAnswers` - you may change the default number of correct or incorrect answers in the question, for example for matrix, where each row is a quiz question.
    */
  var onIsAnswerCorrect: EventBase[SurveyModel] = js.native
  
  /* protected */ def onIsValidatingOnServerChanged(): Unit = js.native
  
  /*
    * The event is fired after choices for radiogroup, checkbox, and dropdown has been loaded from a RESTful service and before they are assigned to a question.
    * You may change the choices, before they are assigned or disable/enabled make visible/invisible question, based on loaded results.
    * - `sender` - the survey object that fires the event.
    * - `question` - the question where loaded choices are going to be assigned.
    * - `choices` - the loaded choices. You can change the loaded choices to before they are assigned to question.
    * - `serverResult` - a result that comes from the server as it is.
    */
  var onLoadChoicesFromServer: EventBase[SurveyModel] = js.native
  
  /* protected */ def onLoadSurveyFromService(): Unit = js.native
  
  /*
    * The event is fired after survey is loaded from api.surveyjs.io service.
    * You can use this event to perform manipulation with the survey model after it was loaded from the web service.
    * - `sender` - the survey object that fires the event.
    */
  var onLoadedSurveyFromService: EventBase[SurveyModel] = js.native
  
  /* protected */ def onLoadingSurveyFromService(): Unit = js.native
  
  var onLocaleChangedEvent: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired for every cell after is has been rendered in DOM.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the matrix question.
    * - `options.cell` - the matrix cell.
    * - `options.cellQuestion` - the question/editor in the cell.
    * - `options.htmlElement` - an HTML element bound to the `cellQuestion` object.
    * - `options.column` - the matrix column object.
    * - `options.row` - the matrix row object.
    */
  var onMatrixAfterCellRender: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before rendering "Remove" button for removing a row from Matrix Dynamic question.
    * - `sender` - the survey object that fires the event
    * - `options.question` - a matrix question.
    * - `options.rowIndex` - a row index.
    * - `options.row` - a row object.
    * - `options.allow` - a boolean property. Set it to `false` to disable the row removing.
    */
  var onMatrixAllowRemoveRow: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before adding a new row in Matrix Dynamic question.
    * - `sender` - the survey object that fires the event
    * - `options.question` - a matrix question.
    * - `options.canAddRow` - specifies whether a new row can be added
    */
  var onMatrixBeforeRowAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired for every cell created in Matrix Dynamic and Matrix Dropdown questions.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the matrix question.
    * - `options.cell` - the matrix cell.
    * - `options.cellQuestion` - the question/editor in the cell. You may customize it, change it's properties, like choices or visible.
    * - `options.rowValue` - the value of the current row. To access a particular column's value within the current row, use: `options.rowValue["columnValue"]`.
    * - `options.column` - the matrix column object.
    * - `options.columnName` - the matrix column name.
    * - `options.row` - the matrix row object.
    */
  var onMatrixCellCreated: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before creating cell question in the matrix. You can change the cell question type by setting different options.cellType.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the matrix question.
    * - `options.cellType` - the cell question type. You can change it.
    * - `options.rowValue` - the value of the current row. To access a particular column's value within the current row, use: `options.rowValue["columnValue"]`.
    * - `options.column` - the matrix column object.
    * - `options.columnName` - the matrix column name.
    * - `options.row` - the matrix row object.
    */
  var onMatrixCellCreating: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when Matrix Dynamic and Matrix Dropdown questions validate the cell value.
    * - `sender` - the survey object that fires the event.
    * - `options.error` - an error string. It is empty by default.
    * - `options.question` - the matrix question.
    * - `options.columnName` - the matrix column name.
    * - `options.value` - a cell value.
    * - `options.row` - the matrix row object.
    * - `options.getCellQuestion(columnName)` - the function that returns the cell question by column name.
    */
  var onMatrixCellValidate: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when cell value is changed in Matrix Dynamic and Matrix Dropdown questions.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the matrix question.
    * - `options.columnName` - the matrix column name.
    * - `options.value` - a new value.
    * - `options.row` - the matrix row object.
    * - `options.getCellQuestion(columnName)` - the function that returns the cell question by column name.
    */
  var onMatrixCellValueChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on changing cell value in Matrix Dynamic and Matrix Dropdown questions. You may change the `options.value` property to change a cell value.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the matrix question.
    * - `options.columnName` - the matrix column name.
    * - `options.value` - a new value.
    * - `options.oldValue` - the old value.
    * - `options.row` - the matrix row object.
    * - `options.getCellQuestion(columnName)` - the function that returns a cell question by column name.
    */
  var onMatrixCellValueChanging: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on adding a new row in Matrix Dynamic question.
    * - `sender` - the survey object that fires the event
    * - `options.question` - a matrix question.
    * - `options.row` - a new added row.
    */
  var onMatrixRowAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on removing a row from Matrix Dynamic question.
    * - `sender` - the survey object that fires the event
    * - `options.question` - a matrix question
    * - `options.rowIndex` - a removed row index
    * - `options.row` - a removed row object
    */
  var onMatrixRowRemoved: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before removing a row from Matrix Dynamic question. You can disable removing and clear the data instead.
    * - `sender` - the survey object that fires the event
    * - `options.question` - a matrix question.
    * - `options.rowIndex` - a row index.
    * - `options.row` - a row object.
    * - `options.allow` - a boolean property. Set it to `false` to disable the row removing.
    */
  var onMatrixRowRemoving: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired after a user clicks the 'Complete' button. The event allows you to specify the URL opened after completing a survey.
    * Specify the `navigateToUrl` property to make survey navigate to another url.
    * - `sender` - the survey object that fires the event.
    * - `options.url` - Specifies a URL opened after completing a survey. Set this property to an empty string to cancel the navigation and show the completed survey page.
    */
  var onNavigateToUrl: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on adding a page into survey.
    * - `sender` - the survey object that fires the event.
    * - `options.page` - a newly added `panel` object.
    */
  var onPageAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on changing a page visibility.
    * - `sender` - the survey object that fires the event.
    * - `options.page` - a page which visibility has been changed.
    * - `options.visible` - a page `visible` boolean value.
    */
  var onPageVisibleChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on adding a panel into survey.
    * - `sender` - the survey object that fires the event.
    * - `options.panel` - a newly added panel object.
    * - `options.name` - a panel name.
    * - `options.index` - an index of the panel in the container (a page or panel).
    * - `options.parentPanel` - a container (a page or panel) where a new panel is located.
    * - `options.rootPanel` - a root container, typically it is a page.
    */
  var onPanelAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on removing a panel from survey.
    * - `sender` - the survey object that fires the event.
    * - `options.panel` - a removed panel object.
    * - `options.name` - a panel name.
    */
  var onPanelRemoved: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on changing a panel visibility.
    * - `sender` - the survey object that fires the event.
    * - `options.panel` - a panel which visibility has been changed.
    * - `options.visible` - a panel `visible` boolean value.
    */
  var onPanelVisibleChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on clicking the 'Next' button if the `sendResultOnPageNext` is set to `true`. You can use it to save the intermediate results, for example, if your survey is large enough.
    * - `sender` - the survey object that fires the event.
    */
  var onPartialSend: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to modify the HTML content before rendering, for example `completeHtml` or `loadingHtml`.
    * - `options.html` - specifies the modified HTML content.
    */
  var onProcessHtml: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on processing the text when it finds a text in brackets: `{somevalue}`. By default, it uses the value of survey question values and variables.
    * For example, you may use the text processing in loading choices from the web. If your `choicesByUrl.url` equals to "UrlToServiceToGetAllCities/{country}/{state}",
    * you may set on this event `options.value` to "all" or empty string when the "state" value/question is non selected by a user.
    * - `sender` - the survey object that fires the event.
    * - `options.name` - the name of the processing value, for example, "state" in our example.
    * - `options.value` - the value of the processing text.
    * - `options.isExists` - a boolean value. Set it to `true` if you want to use the value and set it to `false` if you don't.
    */
  var onProcessTextValue: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to change the progress text in code.
    * - `sender` - the survey object that fires the event.
    * - `options.text` - a progress text, that SurveyJS will render in progress bar.
    * - `options.questionCount` - a number of questions that have input(s). We do not count html or expression questions
    * - `options.answeredQuestionCount` - a number of questions that have input(s) and an user has answered.
    * - `options.requiredQuestionCount` - a number of required questions that have input(s). We do not count html or expression questions
    * - `options.requiredAnsweredQuestionCount` - a number of required questions that have input(s) and an user has answered.
    */
  var onProgressText: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on adding a new question into survey.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a newly added question object.
    * - `options.name` - a question name.
    * - `options.index` - an index of the question in the container (page or panel).
    * - `options.parentPanel` - a container where a new question is located. It can be a page or panel.
    * - `options.rootPanel` - typically, it is a page.
    */
  var onQuestionAdded: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on creating a new question.
    * Unlike the onQuestionAdded event, this event calls for all question created in survey including inside: a page, panel, matrix cell, dynamic panel and multiple text.
    * or inside a matrix cell or it can be a text question in multiple text items or inside a panel of a panel dynamic.
    * You can use this event to set up properties to a question based on it's type for all questions, regardless where they are located, on the page or inside a matrix cell.
    * Please note: If you want to use this event for questions loaded from JSON then you have to create survey with empty/null JSON parameter, assign the event and call survey.fromJSON(yourJSON) function.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a newly created question object.
    */
  var onQuestionCreated: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on removing a question from survey.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a removed question object.
    * - `options.name` - a question name.
    */
  var onQuestionRemoved: EventBase[SurveyModel] = js.native
  
  /* protected */ def onQuestionsOnPageModeChanged(oldValue: String): Unit = js.native
  
  /*
    * Use this event to control scrolling element to top. You can cancel the default behavior by setting options.cancel property to true.
    * - `sender` - the survey object that fires the event.
    * - `options.element` - an element that is going to be scrolled on top.
    * - `options.question` - a question that is going to be scrolled on top. It can be null if options.page is not null.
    * - `options.page` - a page that is going to be scrolled on top. It can be null if options.question is not null.
    * - `options.elementId` - the unique element DOM Id.
    * - `options.cancel` - set this property to true to cancel the default scrolling.
    */
  var onScrollingElementToTop: EventBase[SurveyModel] = js.native
  
  /*
    * The event fires when it gets response from the [api.surveyjs.io](https://api.surveyjs.io) service on saving survey results. Use it to find out if the results have been saved successfully.
    * - `sender` - the survey object that fires the event.
    * - `options.success` - it is `true` if the results has been sent to the service successfully.
    * - `options.response` - a response from the service.
    */
  var onSendResult: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to validate data on your server.
    * - `sender` - the survey object that fires the event.
    * - `options.data` - the values of all non-empty questions on the current page. You can get a question value as `options.data["myQuestionName"]`.
    * - `options.errors` - set your errors to this object as: `options.errors["myQuestionName"] = "Error text";`. It will be shown as a question error.
    * - `options.complete()` - call this function to tell survey that your server callback has been processed.
    */
  var onServerValidateQuestions: Any = js.native
  
  /*
    * The event is fired before errors are assigned to a question. You may add/remove/modify errors for a question.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a validated question.
    * - `options.errors` - the list of errors. The list is empty by default and remains empty if a validated question has no errors.
    */
  var onSettingQuestionErrors: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to change the visibility of an individual choice item in [Checkbox](https://surveyjs.io/Documentation/Library?id=questioncheckboxmodel), [Dropdown](https://surveyjs.io/Documentation/Library?id=questiondropdownmodel), [Radiogroup](https://surveyjs.io/Documentation/Library?id=questionradiogroupmodel), and other similar question types.
    * 
    * The event handler accepts the following arguments:
    * 
    * - `sender` - A Survey instance that raised the event.
    * - `options.question` - A Question instance to which the choice item belongs.
    * - `options.item` - The choice item as specified in the [choices](https://surveyjs.io/Documentation/Library?id=QuestionSelectBase#choices) array.
    * - `options.visible` - A Boolean value that specifies the item visibility. Set it to `false` to hide the item.
    */
  var onShowingChoiceItem: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before the survey is going to preview mode, state equals to `preview`. It happens when a user click on "Preview" button. It shows when "showPreviewBeforeComplete" proeprty equals to "showAllQuestions" or "showAnsweredQuestions".
    * You can prevent showing it by setting allowShowPreview to `false`.
    * - `sender` - the survey object that fires the event.
    * - `options.allowShowPreview` - Specifies whether a user can see a preview. Set this property to `false` to prevent from showing the preview. The default value is `true`.
    */
  var onShowingPreview: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired after the survey changed it's state from "starting" to "running". The "starting" state means that survey shows the started page.
    * The `firstPageIsStarted` property should be set to `true`, if you want to display a start page in your survey. In this case, an end user should click the "Start" button to start the survey.
    */
  var onStarted: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to process the markdown text.
    * - `sender` - the survey object that fires the event.
    * - `options.element` - SurveyJS element (a question, panel, page, or survey) where the string is going to be rendered.
    * - `options.name` - a property name is going to be rendered.
    * - `options.text` - a text that is going to be rendered.
    * - `options.html` - an HTML content. It is `null` by default. Use this property to specify the HTML content rendered instead of `options.text`.
    */
  var onTextMarkdown: EventBase[SurveyModel] = js.native
  
  /*
    * Use this event to specity render component name used for text rendering.
    * - `sender` - the survey object that fires the event.
    * - `options.element` - SurveyJS element (a question, panel, page, or survey) where the string is going to be rendered.
    * - `options.name` - a property name is going to be rendered.
    * - `options.renderAs` - a component name used for text rendering.
    */
  var onTextRenderAs: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired every second if the method `startTimer` has been called.
    */
  var onTimer: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before displaying a new information in the Timer Panel. Use it to change the default text.
    * - `sender` - the survey object that fires the event.
    * - `options.text` - the timer panel info text.
    */
  var onTimerPanelInfoText: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired after a trigger has been executed
    * - `sender` - the survey object that fires the event.
    * - `options.trigger` - An instance of a trigger that has been just perform it's action.
    */
  var onTriggerExecuted: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before rendering a choice item in radiogroup, checkbox or dropdown questions. Use it to override the default choice item css.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question where choice item is rendered.
    * - `options.item` - a choice item of ItemValue type. You can get value or text choice properties as options.item.value or options.choice.text
    * - `options.css` - a string with css classes divided by space. You can change it.
    */
  var onUpdateChoiceItemCss: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before rendering a page. Use it to override the default page CSS classes.
    * - `sender` - the survey object that fires the event.
    * - `options.page` - a page for which you can change the CSS classes.
    * - `options.cssClasses` - an object with CSS classes. For example `{title: "sv_p_title", description: "small"}`. You can change them to your own CSS classes.
    */
  var onUpdatePageCssClasses: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before rendering a panel. Use it to override the default panel CSS classes.
    * - `sender` - the survey object that fires the event.
    * - `options.panel` - a panel for which you can change the CSS classes.
    * - `options.cssClasses` - an object with CSS classes. For example `{title: "sv_p_title", description: "small"}`. You can change them to your own CSS classes.
    */
  var onUpdatePanelCssClasses: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before rendering a question. Use it to override the default question CSS classes.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question for which you can change the CSS classes.
    * - `options.cssClasses` - an object with CSS classes. For example `{root: "table", button: "button"}`. You can change them to your own CSS classes.
    */
  var onUpdateQuestionCssClasses: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on uploading the file in QuestionFile when `storeDataAsText` is set to `false`. Use this event to change the uploaded file name or to prevent a particular file from being uploaded.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - the file question instance.
    * - `options.name` - the question name.
    * - `options.files` - the Javascript File objects array to upload.
    * - `options.callback` - a callback function to get the file upload status and the updloaded file content.
    */
  var onUploadFiles: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on validating a panel. Set your error to `options.error` and survey will show the error for the panel and block completing the survey or going to the next page.
    * - `sender` - the survey object that fires the event.
    * - `options.name` - a panel name.
    * - `options.error` - an error string. It is empty by default.
    */
  var onValidatePanel: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired on validating value in a question. You can specify a custom error message using `options.error`. The survey blocks completing the survey or going to the next page when the error messages are displayed.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a validated question.
    * - `options.name` - a question name.
    * - `options.value` - the current question value (answer).
    * - `options.error` - an error string. It is empty by default.
    */
  var onValidateQuestion: EventBase[SurveyModel] = js.native
  
  /*
    * Use the this event to be notified when the survey finished validate questions on the current page. It commonly happens when a user try to go to the next page or complete the survey
    * options.questions - the list of questions that have errors
    * options.errors - the list of errors
    * options.page - the page where question(s) are located
    */
  var onValidatedErrorsOnCurrentPage: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when the question value (i.e., answer) has been changed. The question value can be changed in UI (by a user) or programmatically (on calling `setValue` method).
    * Use the `onDynamicPanelItemValueChanged` and `onMatrixCellValueChanged` events to handle changes in a question in the Panel Dynamic and a cell question in matrices.
    * - `sender` - the survey object that fires the event.
    * - `options.name` - the value name that has been changed.
    * - `options.question` - a question which `question.name` equals to the value name. If there are several questions with the same name, the first question is used. If there is no such questions, the `options.question` is `null`.
    * - `options.value` - a new value.
    */
  var onValueChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired before the question value (answer) is changed. It can be done via UI by a user or programmatically on calling the `setValue` method.
    * - `sender` - the survey object that fires the event.
    * - `options.name` - the value name that has being changed.
    * - `options.question` - a question which `question.name` equals to the value name. If there are several questions with the same name, the first question is used. If there is no such questions, the `options.question` is null.
    * - `options.oldValue` - an old, previous value.
    * - `options.value` - a new value. You can change it.
    */
  var onValueChanging: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when setVariable function is called. It can be called on changing a calculated value.
    * - `sender` - the survey object that fires the event.
    * - `options.name` - the variable name that has been changed.
    * - `options.value` - a new value.
    */
  var onVariableChanged: EventBase[SurveyModel] = js.native
  
  /*
    * The event is fired when a question visibility has been changed.
    * - `sender` - the survey object that fires the event.
    * - `options.question` - a question which visibility has been changed.
    * - `options.name` - a question name.
    * - `options.visible` - a question `visible` boolean value.
    */
  var onVisibleChanged: EventBase[SurveyModel] = js.native
  
  var origionalPages: Any = js.native
  
  /*
    * Returns the survey page count.
    */
  def pageCount: Double = js.native
  
  /*
    * Gets or sets the 'Next' button caption.
    */
  def pageNextText: String = js.native
  def pageNextText_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets the 'Prev' button caption.
    */
  def pagePrevText: String = js.native
  def pagePrevText_=(`val`: String): Unit = js.native
  
  def pageVisibilityChanged(page: IPage, newValue: Boolean): Any = js.native
  @JSName("pageVisibilityChanged")
  def pageVisibilityChanged_Unit(page: IPage, newValue: Boolean): Unit = js.native
  
  /*
    * Returns a list of all pages in the survey, including invisible pages.
    */
  def pages: Any = js.native
  @JSName("pages")
  var pages_FSurveyModel: Any = js.native
  
  def panelAdded(panel: IElement, index: Double, parentPanel: Any, rootPanel: Any): Any = js.native
  @JSName("panelAdded")
  def panelAdded_Unit(panel: IElement, index: Double, parentPanel: Any, rootPanel: Any): Unit = js.native
  
  def panelRemoved(panel: IElement): Any = js.native
  @JSName("panelRemoved")
  def panelRemoved_Unit(panel: IElement): Unit = js.native
  
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): Any = js.native
  @JSName("panelVisibilityChanged")
  def panelVisibilityChanged_Unit(panel: IPanel, newValue: Boolean): Unit = js.native
  
  def platformName: String = js.native
  
  /*
    * Navigates user to a previous page. If the current page is the first page, `prevPage` returns `false`. `prevPage` does not perform any checks, required questions can be empty.
    */
  def prevPage(): Boolean = js.native
  
  /*
    * Gets or sets the 'Preview' button caption.
    */
  def previewText: String = js.native
  def previewText_=(`val`: String): Unit = js.native
  
  def processHtml(html: String): String = js.native
  
  /* CompleteClass */
  override def processText(text: String, returnDisplayValue: Boolean): String = js.native
  
  /* CompleteClass */
  override def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): Any = js.native
  
  /*
    * Returns the HTML content, that is shown to a user that had completed the survey before.
    */
  def processedCompletedBeforeHtml: String = js.native
  
  /*
    * Returns the HTML content for the complete page.
    */
  def processedCompletedHtml: String = js.native
  
  /*
    * Returns the HTML content, that is shows when a survey loads the survey JSON.
    */
  def processedLoadingHtml: String = js.native
  
  /*
    * Returns the text/HTML that is rendered as a survey title.
    */
  def processedTitle: String = js.native
  
  /*
    * Gets or sets the type of info in the progress bar.
    * 
    * The following options are available:
    * 
    * - `pages` (default),
    * - `questions`,
    * - `requiredQuestions`,
    * - `correctQuestions`,
    * - `buttons`
    */
  def progressBarType: String = js.native
  def progressBarType_=(`val`: String): Unit = js.native
  
  /*
    * Returns the text for the current progress.
    */
  def progressText: String = js.native
  
  /*
    * Returns the progress that a user made while going through the survey.
    * It depends from progressBarType property
    */
  def progressValue: Double = js.native
  
  def questionAdded(question: IQuestion, index: Double, parentPanel: Any, rootPanel: Any): Any = js.native
  @JSName("questionAdded")
  def questionAdded_Unit(question: IQuestion, index: Double, parentPanel: Any, rootPanel: Any): Unit = js.native
  
  def questionCountByValueName(valueName: String): Double = js.native
  
  def questionCreated(question: IQuestion): Any = js.native
  
  /*
    * Gets or sets the question description position. The default value is `underTitle`.
    * 
    * The following options are available:
    * 
    * - `underTitle` - show question description under the question title,
    * - `underInput` - show question description under the question input instead of question title.
    */
  def questionDescriptionLocation: String = js.native
  def questionDescriptionLocation_=(`val`: String): Unit = js.native
  @JSName("questionDescriptionLocation")
  var questionDescriptionLocation_FSurveyModel: String = js.native
  
  /*
    * Gets or sets the error message position.
    * 
    * The following options are available:
    * 
    * - `top` - to show question error(s) over the question,
    * - `bottom` - to show question error(s) under the question.
    */
  def questionErrorLocation: String = js.native
  def questionErrorLocation_=(`val`: String): Unit = js.native
  @JSName("questionErrorLocation")
  var questionErrorLocation_FSurveyModel: String = js.native
  
  var questionHashes: Any = js.native
  
  /* protected */ def questionOnValueChanging(valueName: String, newValue: Any): Any = js.native
  
  def questionRemoved(question: IQuestion): Any = js.native
  @JSName("questionRemoved")
  def questionRemoved_Unit(question: IQuestion): Unit = js.native
  
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): Any = js.native
  
  /*
    * Gets or sets the first question index. The first question index is '1' by default. You may start it from '100' or from 'A', by setting '100' or 'A' to this property.
    * You can set the start index to "(1)" or "# A)" or "a)" to render question number as (1), # A) and a) accordingly.
    */
  def questionStartIndex: String = js.native
  def questionStartIndex_=(`val`: String): Unit = js.native
  @JSName("questionStartIndex")
  var questionStartIndex_FSurveyModel: String = js.native
  
  /*
    * Gets or sets question title location relative to the input field: `"top"`, `"bottom"`, or `"left"`.
    * 
    * > NOTE: Certain question types (Matrix, Multiple Text) do not support the `"left"` value. For them, the `"top"` value is used.
    * 
    * You can override this setting if you specify the `questionTitleLocation` property for an [individual page](https://surveyjs.io/form-library/documentation/pagemodel#questionTitleLocation) or [panel](https://surveyjs.io/form-library/documentation/panelmodel#questionTitleLocation) or set the `titleLocation` property for a [specific question](https://surveyjs.io/form-library/documentation/question#titleLocation).
    */
  def questionTitleLocation: String = js.native
  def questionTitleLocation_=(`val`: String): Unit = js.native
  @JSName("questionTitleLocation")
  var questionTitleLocation_FSurveyModel: String = js.native
  
  /*
    * Set the pattern for question title. Default is "numTitleRequire", 1. What is your name? *,
    * You can set it to numRequireTitle: 1. * What is your name?
    * You can set it to requireNumTitle: * 1. What is your name?
    * You can set it to numTitle (remove require symbol completely): 1. What is your name?
    */
  def questionTitlePattern: String = js.native
  def questionTitlePattern_=(`val`: String): Unit = js.native
  @JSName("questionTitlePattern")
  var questionTitlePattern_FSurveyModel: String = js.native
  
  def questionTitleTemplate: String = js.native
  def questionTitleTemplate_=(`val`: String): Unit = js.native
  
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): Any = js.native
  @JSName("questionVisibilityChanged")
  def questionVisibilityChanged_Unit(question: IQuestion, newValue: Boolean): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how the survey combines questions, panels, and pages.
    * 
    * The following options are available:
    * 
    * - `singlePage` - combine all survey pages in a single page. Pages will be converted to panels.
    * - `questionPerPage` - show one question per page. Survey will create a separate page for every question.
    */
  def questionsOnPageMode: String = js.native
  def questionsOnPageMode_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets the question display order. Use this property to randomize questions. You can randomize questions on a specific page.
    * 
    * The following options are available:
    * 
    * - `random` - randomize questions
    * - `initial` - keep questions in the same order, as in a survey model.
    */
  def questionsOrder: String = js.native
  def questionsOrder_=(`val`: String): Unit = js.native
  @JSName("questionsOrder")
  var questionsOrder_FSurveyModel: String = js.native
  
  /*
    * Removes a page from a survey.
    */
  def removePage(page: PageModel): Unit = js.native
  
  def render(): Unit = js.native
  def render(element: Any): Unit = js.native
  
  var renderCallback: Any = js.native
  
  def renderedCompletedHtml: String = js.native
  
  def renderedHasDescription: Boolean = js.native
  
  def renderedHasHeader: Boolean = js.native
  
  def renderedHasLogo: Boolean = js.native
  
  def renderedHasTitle: Boolean = js.native
  
  def renderedWidth: String = js.native
  
  /*
    * Gets or sets the required question mark. The required question mark is a char or string that is rendered in the required questions' titles.
    */
  def requiredText: String = js.native
  def requiredText_=(`val`: String): Unit = js.native
  @JSName("requiredText")
  var requiredText_FSurveyModel: String = js.native
  
  var resizeObserver: Any = js.native
  
  var rootCss: String = js.native
  
  /*
    * Calculates a given expression and returns `true` or `false`.
    */
  def runCondition(expression: String): Boolean = js.native
  
  /*
    * Calculates a given expression and returns a result value.
    */
  def runExpression(expression: String): Any = js.native
  
  /*
    * Run all triggers that performs on value changed and not on moving to the next page.
    */
  def runTriggers(): Unit = js.native
  
  var runningPages: Any = js.native
  
  def scrollElementToTop(element: ISurveyElement, question: IQuestion, page: IPage, id: String): Any = js.native
  
  def scrollToTopOnPageChange(): Unit = js.native
  def scrollToTopOnPageChange(doScroll: Boolean): Unit = js.native
  
  def searchText(text: String): js.Array[IFindElement] = js.native
  
  /*
    * Sends a survey result to the [api.surveyjs.io](https://api.surveyjs.io) service.
    */
  def sendResult(): Unit = js.native
  def sendResult(postId: String): Unit = js.native
  def sendResult(postId: String, clientId: String): Unit = js.native
  def sendResult(postId: String, clientId: String, isPartialCompleted: Boolean): Unit = js.native
  def sendResult(postId: String, clientId: Unit, isPartialCompleted: Boolean): Unit = js.native
  def sendResult(postId: Unit, clientId: String): Unit = js.native
  def sendResult(postId: Unit, clientId: String, isPartialCompleted: Boolean): Unit = js.native
  def sendResult(postId: Unit, clientId: Unit, isPartialCompleted: Boolean): Unit = js.native
  
  /*
    * Gets or sets whether to save survey results on completing every page. If the property value is set to `true`, the `onPartialSend` event is fired.
    */
  def sendResultOnPageNext: Boolean = js.native
  def sendResultOnPageNext_=(`val`: Boolean): Unit = js.native
  
  var serverValidationEventCount: Double = js.native
  
  /*
    * Sets a comment value.
    */
  def setComment(name: String, newValue: String): Unit = js.native
  
  /* CompleteClass */
  override def setCompleted(): Unit = js.native
  
  /* protected */ def setCompletedState(value: String, text: String): Unit = js.native
  
  /*
    * Set the cookie with `cookieName` in user's browser. It is done automatically on survey complete if the `cookieName` property value is not empty.
    */
  def setCookie(): Unit = js.native
  
  def setCss(value: Any): Unit = js.native
  def setCss(value: Any, needMerge: Boolean): Unit = js.native
  
  def setDataCore(data: Any): Unit = js.native
  
  def setDataValueCore(valuesHash: Any, key: String, value: Any): Unit = js.native
  
  /*
    * Sets the survey into design mode.
    */
  def setDesignMode(value: Boolean): Unit = js.native
  
  def setIsMobile(): Unit = js.native
  def setIsMobile(newVal: Boolean): Unit = js.native
  
  def setJsonObject(jsonObj: Any): Unit = js.native
  
  /* CompleteClass */
  override def setTriggerValue(name: String, value: Any, isVariable: Boolean): Any = js.native
  
  /*
    * Sets a question value (answer). It runs all triggers and conditions (`visibleIf` properties).
    * 
    * Goes to the next page if `goNextPageAutomatic` is `true` and all questions on the current page are answered correctly.
    */
  def setValue(name: String, newQuestionValue: Any): Unit = js.native
  def setValue(name: String, newQuestionValue: Any, locNotification: Unit, allowNotifyValueChanged: Boolean): Unit = js.native
  
  var showBrandInfo: Boolean = js.native
  
  /*
    * On finishing the survey the complete page is shown. Set the property to `false`, to hide the complete page.
    */
  def showCompletedPage: Boolean = js.native
  def showCompletedPage_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets whether to show all elements in the survey, regardless their visibility. The default value is `false`.
    */
  def showInvisibleElements: Boolean = js.native
  def showInvisibleElements_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets the navigation buttons position.
    * Possible values: 'bottom' (default), 'top', 'both' and 'none'. Set it to 'none' to hide 'Prev', 'Next' and 'Complete' buttons.
    * It makes sense if you are going to create a custom navigation, have only a single page, or the `goNextPageAutomatic` property is set to `true`.
    */
  def showNavigationButtons: Any = js.native
  def showNavigationButtons_=(`val`: Any): Unit = js.native
  
  /*
    * Gets or sets whether the survey displays page numbers on pages titles.
    */
  def showPageNumbers: Boolean = js.native
  def showPageNumbers_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets whether the Survey displays page titles. Set it to `false` to hide page titles.
    */
  def showPageTitles: Boolean = js.native
  def showPageTitles_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets whether the Survey displays "Prev" button in its pages. Set it to `false` to prevent end-users from going back to their answers.
    */
  def showPrevButton: Boolean = js.native
  def showPrevButton_=(`val`: Boolean): Unit = js.native
  
  /*
    * Shows preview for the survey. Switches the survey to the "preview" state.
    * 
    * Details: [Preview State](https://surveyjs.io/Documentation/Library#states-preview)
    */
  def showPreview(): Boolean = js.native
  
  /*
    * Set this property to "showAllQuestions" or "showAnsweredQuestions" to allow respondents to preview answers before submitting the survey results.
    * 
    * Details: [Preview State](https://surveyjs.io/Documentation/Library#states-preview)
    * Example: [Show Preview Before Complete](https://surveyjs.io/Examples/Library?id=survey-showpreview)
    */
  def showPreviewBeforeComplete: String = js.native
  def showPreviewBeforeComplete_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets the survey progress bar position.
    * 
    * The following options are available:
    * 
    * - `off` (default) - don't show progress bar
    * - `top` - show progress bar in the top
    * - `bottom` - show progress bar in the bottom
    * - `both` - show progress bar in both sides: top and bottom.
    */
  def showProgressBar: String = js.native
  def showProgressBar_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how the question numbers are displayed.
    * 
    * The following options are available:
    * 
    * - `on` - display question numbers
    * - `onpage` - display question numbers, start numbering on every page
    * - `off` - turn off the numbering for questions titles
    */
  def showQuestionNumbers: String = js.native
  def showQuestionNumbers_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a timer panel position. The timer panel displays information about how much time an end user spends on a survey/page.
    * 
    * The available options:
    * - `top` - display timer panel in the top.
    * - `bottom` - display timer panel in the bottom.
    * - `none` - do not display a timer panel.
    * 
    * If the value is not equal to 'none', the survey calls the `startTimer()` method on survey rendering.
    */
  def showTimerPanel: String = js.native
  
  /*
    * Gets or set a value that specifies whether the timer displays information for the page or for the entire survey.
    * 
    * The available options:
    * 
    * - `page` - show timer information for page
    * - `survey` - show timer information for survey
    * 
    * Use the `onTimerPanelInfoText` event to change the default text.
    */
  def showTimerPanelMode: String = js.native
  def showTimerPanelMode_=(`val`: String): Unit = js.native
  
  def showTimerPanel_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets whether the Survey displays survey title in its pages. Set it to `false` to hide a survey title.
    */
  def showTitle: Boolean = js.native
  def showTitle_=(`val`: Boolean): Unit = js.native
  
  var skeletonComponentName: String = js.native
  
  /*
    * Starts the survey. Changes the survey mode from "starting" to "running". Call this function if your survey has a start page, otherwise this function does nothing.
    */
  def start(): Boolean = js.native
  
  def startMovingQuestion(): Unit = js.native
  
  /*
    * Gets or sets the 'Start' button caption.
    * The 'Start' button is shown on the started page. Set the `firstPageIsStarted` property to `true`, to display the started page.
    */
  def startSurveyText: String = js.native
  def startSurveyText_=(`val`: String): Unit = js.native
  
  /*
    * Starts a timer that will calculate how much time end-user spends on the survey or on pages.
    */
  def startTimer(): Unit = js.native
  
  def startTimerFromUI(): Unit = js.native
  
  /*
    * Returns the started page. This property works if the `firstPageIsStarted` property is set to `true`.
    */
  def startedPage: PageModel = js.native
  
  /*
    * Returns the current survey state:
    * 
    * - `loading` - the survey is being loaded from JSON,
    * - `empty` - there is nothing to display in the current survey,
    * - `starting` - the survey's start page is displayed,
    * - `running` - a respondent is answering survey questions right now,
    * - `preview` - a respondent is previewing answered questions before submitting the survey (see [example](https://surveyjs.io/Examples/Library?id=survey-showpreview)),
    * - `completed` - a respondent has completed the survey and submitted the results.
    * 
    * Details: [Preview State](https://surveyjs.io/Documentation/Library#states)
    */
  def state: String = js.native
  @JSName("state")
  var state_FSurveyModel: String = js.native
  
  def stopMovingQuestion(): Unit = js.native
  
  /*
    * Stops the timer.
    */
  def stopTimer(): Unit = js.native
  
  /*
    * Gets or sets whether the "Others" option text is stored as question comment.
    * 
    * By default the entered text in the "Others" input in the checkbox/radiogroup/dropdown is stored as `"question name " + "-Comment"`. The value itself is `"question name": "others"`.
    * Set this property to `false`, to store the entered text directly in the `"question name"` key.
    */
  def storeOthersAsComment: Boolean = js.native
  def storeOthersAsComment_=(`val`: Boolean): Unit = js.native
  @JSName("storeOthersAsComment")
  var storeOthersAsComment_FSurveyModel: Boolean = js.native
  
  /*
    * Gets or sets an identifier of a survey model loaded from the [api.surveyjs.io](https://api.surveyjs.io) service. When specified, the survey JSON is automatically loaded from [api.surveyjs.io](https://api.surveyjs.io) service.
    */
  def surveyId: String = js.native
  def surveyId_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets an identifier of a survey model saved to the [api.surveyjs.io](https://api.surveyjs.io) service. When specified, the survey data is automatically saved to the [api.surveyjs.io](https://api.surveyjs.io) service.
    */
  def surveyPostId: String = js.native
  def surveyPostId_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets whether to show the progress on saving/sending data into the [api.surveyjs.io](https://api.surveyjs.io) service.
    */
  def surveyShowDataSaving: Boolean = js.native
  def surveyShowDataSaving_=(`val`: Boolean): Unit = js.native
  
  var textPreProcessor: TextPreProcessor = js.native
  
  /*
    * Gets or sets a value that specifies how the survey updates its questions' text values.
    * 
    * The following options are available:
    * 
    * - `onBlur` (default) - the value is updated after an input loses the focus.
    * - `onTyping` - update the value of text questions, "text" and "comment", on every key press.
    * 
    * Note, that setting to "onTyping" may lead to a performance degradation, in case you have many expressions in the survey.
    */
  def textUpdateMode: String = js.native
  def textUpdateMode_=(`val`: String): Unit = js.native
  
  /*
    * Returns the time in seconds an end user spends on the survey
    */
  def timeSpent: Double = js.native
  
  /* CompleteClass */
  var timerInfoText: String = js.native
  @JSName("timerInfoText")
  def timerInfoText_MSurveyModel: String = js.native
  
  def timerModel: SurveyTimerModel = js.native
  
  var timerModelValue: SurveyTimerModel = js.native
  
  def titleMaxWidth: String = js.native
  
  /* CompleteClass */
  override def triggerExecuted(trigger: Trigger): Unit = js.native
  
  var triggerKeys: Any = js.native
  
  var triggerValues: Any = js.native
  
  /*
    * Gets or sets a list of triggers in the survey.
    */
  def triggers: Any = js.native
  def triggers_=(`val`: Any): Unit = js.native
  
  /* protected */ def tryGoNextPageAutomatic(name: String): Unit = js.native
  
  def updateChoiceItemCss(question: IQuestion, options: Any): Any = js.native
  @JSName("updateChoiceItemCss")
  def updateChoiceItemCss_Unit(question: IQuestion, options: Any): Unit = js.native
  
  def updateChoicesFromServer(question: IQuestion, choices: Any, serverResult: Any): js.Array[ItemValue] = js.native
  
  /* protected */ def updateCustomWidgets(page: PageModel): Unit = js.native
  
  def updateElementCss(): Unit = js.native
  def updateElementCss(reNew: Boolean): Unit = js.native
  
  def updateNavigationItemCssCallback(): Unit = js.native
  def updateNavigationItemCssCallback(strName: String): Unit = js.native
  
  def updatePageCssClasses(page: IPage, cssClasses: Any): Unit = js.native
  def updatePageCssClasses(panel: IPanel, cssClasses: Any): Any = js.native
  
  def updatePanelCssClasses(panel: IPanel, cssClasses: Any): Any = js.native
  @JSName("updatePanelCssClasses")
  def updatePanelCssClasses_Unit(panel: IPanel, cssClasses: Any): Unit = js.native
  
  def updateProgressText(): Unit = js.native
  def updateProgressText(onValueChanged: Boolean): Unit = js.native
  
  def updateQuestionCssClasses(question: IQuestion, cssClasses: Any): Any = js.native
  @JSName("updateQuestionCssClasses")
  def updateQuestionCssClasses_Unit(question: IQuestion, cssClasses: Any): Unit = js.native
  
  /* protected */ def updateQuestionValue(valueName: String, newValue: Any): Unit = js.native
  
  def updateSurvey(newProps: Any): Unit = js.native
  def updateSurvey(newProps: Any, oldProps: Any): Unit = js.native
  
  var updateVisibleIndexAfterBindings: Boolean = js.native
  
  def uploadFiles(
    question: IQuestion,
    name: String,
    files: Any,
    uploadingCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  
  /* protected */ def uploadFilesCore(
    name: String,
    files: Any,
    uploadingCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Unit = js.native
  
  /*
    * Uploads a file to server.
    */
  @JSName("uploadFiles")
  def uploadFiles_Unit(
    question: IQuestion,
    name: String,
    files: Any,
    uploadingCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Unit = js.native
  
  def validatePanel(panel: IPanel): SurveyError = js.native
  
  def validateQuestion(question: IQuestion): SurveyError = js.native
  
  def valueHashDeleteDataCallback(valuesHash: Any, key: String): Unit = js.native
  
  def valueHashGetDataCallback(valuesHash: Any, key: String): Any = js.native
  
  def valueHashSetDataCallback(valuesHash: Any, key: String, value: Any): Unit = js.native
  
  var valuesHash: Any = js.native
  
  var variablesHash: Any = js.native
  
  /*
    * Returns a number of visible pages within the survey.
    */
  def visiblePageCount: Double = js.native
  
  /*
    * Returns a list of visible pages. If all pages are visible, then this property returns the same list as the `pages` property.
    */
  def visiblePages: Any = js.native
  
  def whenPanelFocusIn(panel: IPanel): Unit = js.native
  
  def whenQuestionFocusIn(question: IQuestion): Unit = js.native
  
  /*
    * A survey width in CSS values.
    * 
    * Default value: `undefined` (the survey inherits the width from its container)
    */
  def width: String = js.native
  
  /*
    * Gets or sets a value that specifies how the survey width is calculated.
    * 
    * The available options:
    * 
    * - `static` - A survey has a fixed width that mostly depends upon the applied theme. Resizing a browser window does not affect the survey width.
    * - `responsive` - A survey takes all available horizontal space. A survey stretches or shrinks horizonally according to the screen size.
    * - `auto` - Depends on the question type and corresponds to the static or responsive mode.
    */
  def widthMode: String = js.native
  def widthMode_=(`val`: String): Unit = js.native
  
  def width_=(`val`: String): Unit = js.native
}
/* static members */
object SurveyModel {
  
  @JSImport("survey-knockout", "SurveyModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "SurveyModel.TemplateRendererComponentName")
  @js.native
  def TemplateRendererComponentName: String = js.native
  inline def TemplateRendererComponentName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateRendererComponentName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "SurveyModel.platform")
  @js.native
  def platform: String = js.native
  inline def platform_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "SurveyModel.stylesManager")
  @js.native
  def stylesManager: StylesManager = js.native
  inline def stylesManager_=(x: StylesManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stylesManager")(x.asInstanceOf[js.Any])
}
