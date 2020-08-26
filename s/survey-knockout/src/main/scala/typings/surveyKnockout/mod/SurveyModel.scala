package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.File
import typings.surveyKnockout.anon.CanAddRow
import typings.surveyKnockout.anon.IncludeEmpty
import typings.surveyKnockout.surveyKnockoutStrings.autogonext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.ISurvey because var conflicts: isLoadingFromJson. Inlined currentPage, pages, getCss, isPageStarted, pageVisibilityChanged, panelVisibilityChanged, questionVisibilityChanged, questionsOrder, questionCreated, questionAdded, panelAdded, questionRemoved, panelRemoved, questionRenamed, validateQuestion, validatePanel, hasVisibleQuestionByValueName, questionCountByValueName, processHtml, getSurveyMarkdownHtml, isDisplayMode, isDesignMode, areInvisibleElementsShowing, areEmptyElementsHidden, isUpdateValueTextOnTyping, state, cancelPreviewByPage, requiredText, beforeSettingQuestionErrors, questionTitlePattern, getUpdatedQuestionTitle, questionStartIndex, questionTitleLocation, questionDescriptionLocation, questionErrorLocation, storeOthersAsComment, maxTextLength, maxOthersLength, clearValueOnDisableItems, uploadFiles, downloadFile, clearFiles, updateChoicesFromServer, updateQuestionCssClasses, updatePanelCssClasses, updatePageCssClasses, afterRenderQuestion, afterRenderQuestionInput, afterRenderPanel, afterRenderPage, getQuestionByValueNameFromArray, matrixRowAdded, matrixBeforeRowAdded, matrixRowRemoved, matrixAllowRemoveRow, matrixCellCreated, matrixAfterCellRender, matrixCellValueChanged, matrixCellValueChanging, matrixCellValidate, dynamicPanelAdded, dynamicPanelRemoved, dynamicPanelItemValueChanged, dragAndDropAllow, scrollElementToTop */ @JSImport("survey-knockout", "SurveyModel")
@js.native
class SurveyModel ()
  extends Base
     with ISurveyData
     with ISurveyImpl
     with ISurveyTriggerOwner
     with /* index */ StringDictionary[js.Any]
     with ITextProcessor
     with ISurveyErrorOwner {
  def this(jsonObj: js.Any) = this()
  /**
    * Deprecated. Use the `pageCount` property instead.
    */
  val PageCount: Double = js.native
  /**
    * Gets or sets whether a survey is automatically completed when `goNextPageAutomatic = true`. Set it to `false` if you do not want to submit survey automatically on completing the last survey page.
    * @see goNextPageAutomatic
    */
  var allowCompleteSurveyAutomatic: Boolean = js.native
  val areEmptyElementsHidden: Boolean = js.native
  val areInvisibleElementsShowing: Boolean = js.native
  /**
    * Gets or sets a list of calculated values in the survey.
    * @see CalculatedValue
    */
  var calculatedValues: js.Array[CalculatedValue] = js.native
  /**
    * Gets or sets a value that specifies how the survey validates the question answers.
    *
    * The following options are available:
    *
    * - `onNextPage` (default) - check errors on navigating to the next page or on completing the survey.
    * - `onValueChanged` - check errors on every question value (i.e., answer) changing.
    * - `onComplete` - to validate all visible questions on complete button click. If there are errors on previous pages, then the page with the first error becomes the current.
    */
  var checkErrorsMode: String = js.native
  /**
    * Gets or sets a value that specifies how the invisible data is included in survey data.
    *
    * The following options are available:
    *
    * - `none` - include the invisible values into the survey data.
    * - `onHidden` - clear the question value when it becomes invisible. If a question has value and it was invisible initially then survey clears the value on completing.
    * - `onComplete` (default) - clear invisible question values on survey complete. In this case, the invisible questions will not be stored on the server.
    * @see Question.visible
    * @see onComplete
    */
  var clearInvisibleValues: js.Any = js.native
  /**
    * Gets or sets whether to clear value on disable items in checkbox, dropdown and radiogroup questions.
    * By default, values are not cleared on disabled the corresponded items. This property is not persisted in survey JSON and you have to set it in code.
    */
  var clearValueOnDisableItems: Boolean = js.native
  /**
    * Gets or sets user's identifier (e.g., e-mail or unique customer id) in your web application.
    * If you load survey or post survey results from/to [api.surveyjs.io](https://api.surveyjs.io) service, then the library do not allow users to run the same survey the second time.
    * On the second run, the user will see the survey complete page.
    */
  var clientId: String = js.native
  /**
    * You can display an additional field (comment field) for the most of questions; users can enter additional comments to their response.
    * The comment field input is saved as `'question name' + 'commentPrefix'`.
    * @see data
    * @see Question.hasComment
    */
  var commentPrefix: String = js.native
  /**
    * Returns all comments from the data.
    * @see data
    */
  val comments: js.Any = js.native
  /**
    *  Gets or sets the 'Complete' button caption.
    * @see locale
    */
  var completeText: String = js.native
  /**
    * The HTML content displayed to an end user that has already completed the survey.
    * @see clientId
    * @see locale
    */
  var completedBeforeHtml: String = js.native
  val completedCss: String = js.native
  /**
    * Gets or sets the HTML content displayed on the complete page. Use this property to change the default complete page text.
    * @see showCompletedPage
    * @see completedHtmlOnCondition
    * @see locale
    */
  var completedHtml: String = js.native
  /**
    * The list of HTML condition items. If the expression of this item returns `true`, then a survey will use this item HTML instead of `completedHtml`.
    * @see HtmlConditionItem
    * @see completeHtml
    */
  var completedHtmlOnCondition: js.Array[HtmlConditionItem] = js.native
  val completedState: String = js.native
  val completedStateText: String = js.native
  /**
    * Gets or sets a cookie name used to save information about completing the survey.
    * If the property is not empty, before starting the survey, the Survey library checks if the cookie with this name exists.
    * If it is `true`, the survey goes to complete mode and a user sees the survey complete page. On completing the survey the cookie with this name is created.
    */
  var cookieName: String = js.native
  var css: js.Any = js.native
  val cssNavigationComplete: String = js.native
  val cssNavigationEdit: String = js.native
  val cssNavigationNext: String = js.native
  val cssNavigationPrev: String = js.native
  val cssNavigationPreview: String = js.native
  val cssNavigationStart: String = js.native
  /**
    * Gets or sets the current survey page. If a survey is rendered, then this property returns a page that a user can see/edit.
    */
  var currentPage: js.Any | IPage = js.native
  /**
    * The zero-based index of the current page in the visible pages array.
    */
  var currentPageNo: Double = js.native
  /**
    * Gets or sets an object that stores the survey results/data. You can set it directly as `{ 'question name': questionValue, ... }`
    *
    * > If you set the `data` property after creating the survey, you may need to set the `currentPageNo` to `0`, if you are using `visibleIf` properties for questions/pages/panels to ensure that you are starting from the first page.
    * @see setValue
    * @see getValue
    * @see mergeData
    * @see currentPageNo
    */
  var data: js.Any = js.native
  /**
    * Gets or sets a survey description. The survey description is displayed under a survey title.
    * @see title
    */
  var description: String = js.native
  /**
    *  Gets or sets the 'Edit' button caption.
    * @see locale
    * @see showPreviewBeforeComplete
    * @see previewText
    * @see cancelPreview
    */
  var editText: String = js.native
  /**
    * Returns the text that is displayed when there are no any visible pages and questiona.
    */
  val emptySurveyText: String = js.native
  /**
    * Gets or sets whether the first survey page is a start page. Set this property to `true`, to make the first page a starting page.
    * An end user cannot navigate to the start page and the start page does not affect a survey progress.
    */
  var firstPageIsStarted: Boolean = js.native
  /**
    * Gets or sets whether the first input is focused on showing a next or a previous page.
    */
  var focusFirstQuestionAutomatic: Boolean = js.native
  /**
    * Gets or sets whether the first input is focused if the current page has errors.
    * Set this property to `false` (the default value is `true`) if you do not want to bring the focus to the first question that has error on the page.
    */
  var focusOnFirstError: Boolean = js.native
  /**
    * Gets or ses whether a user can navigate the next page automatically after answering all the questions on a page without pressing the "Next" button.
    * The available options:
    *
    * - `true` - navigate the next page and submit survey data automatically.
    * - `autogonext` - navigate the next page automatically but do not submit survey data.
    * - `false` - do not navigate the next page and do not submit survey data automatically.
    * @see showNavigationButtons
    */
  var goNextPageAutomatic: Boolean | autogonext = js.native
  /**
    * Returns `true`, if a user has already completed the survey in this browser and there is a cookie about it. Survey goes to `completed` state if the function returns `true`.
    * @see cookieName
    * @see setCookie
    * @see deleteCookie
    * @see state
    */
  val hasCookie: Boolean = js.native
  val hasLogo: Boolean = js.native
  /**
    * Gets or sets whether to hide all required errors.
    */
  var hideRequiredErrors: Boolean = js.native
  /**
    * Gets or sets whether the survey must ignore validation like required questions and others, on `nextPage` and `completeLastPage` function calls. The default is `false`.
    * @see nextPage
    * @see completeLastPage
    * @see mode
    */
  var ignoreValidation: Boolean = js.native
  val isCancelPreviewButtonVisible: Boolean = js.native
  val isCompleteButtonVisible: Boolean = js.native
  /**
    * Returns `true`, if the current page contains errors, for example, the required question is empty or a question validation is failed.
    * @see nextPage
    */
  val isCurrentPageHasErrors: Boolean = js.native
  /**
    * Returns `true` if the survey is in design mode. It is used by SurveyJS Editor.
    * @see setDesignMode
    */
  val isDesignMode: Boolean = js.native
  /**
    * Returns `true` if the survey is in display mode or in preview mode.
    * @see mode
    * @see showPreviewBeforeComplete
    */
  val isDisplayMode: Boolean = js.native
  /**
    * Returns `true` if the survey is in edit mode.
    * @see mode
    */
  val isEditMode: Boolean = js.native
  /**
    * Returns `true` if the survey contains no pages. The survey is empty.
    */
  val isEmpty: Boolean = js.native
  /**
    * Gets whether the current page is the first one.
    */
  val isFirstPage: Boolean = js.native
  /**
    * Gets whether the current page is the last one.
    */
  val isLastPage: Boolean = js.native
  val isLogoAfter: Boolean = js.native
  val isLogoBefore: Boolean = js.native
  /**
    * Returns the navigation buttons (i.e., 'Prev', 'Next', or 'Complete') position.
    */
  val isNavigationButtonsShowing: String = js.native
  val isPreviewButtonVisible: Boolean = js.native
  val isShowPrevButton: Boolean = js.native
  val isShowPreviewBeforeComplete: Boolean = js.native
  val isShowProgressBarOnBottom: Boolean = js.native
  val isShowProgressBarOnTop: Boolean = js.native
  /**
    * Obsolete use the `questionsOnPageMode` property instead.
    * @see questionsOnPageMode
    */
  var isSinglePage: Boolean = js.native
  val isTimerPanelShowingOnBottom: Boolean = js.native
  val isTimerPanelShowingOnTop: Boolean = js.native
  val isUpdateValueTextOnTyping: Boolean = js.native
  /**
    * Gets whether the question values on the current page are validating on the server at the current moment.
    * @see onServerValidateQuestions
    */
  val isValidatingOnServer: Boolean = js.native
  /**
    * The list of errors on loading survey JSON. If the list is empty after loading a JSON, then the JSON is correct and has no errors.
    * @see JsonError
    */
  var jsonErrors: js.Array[JsonError] = js.native
  /**
    * The HTML that shows on loading survey Json from the [api.surveyjs.io](https://api.surveyjs.io) service.
    * @see surveyId
    * @see locale
    */
  var loadingHtml: String = js.native
  val locCompleteText: LocalizableString = js.native
  val locCompletedBeforeHtml: LocalizableString = js.native
  val locCompletedHtml: LocalizableString = js.native
  val locDescription: LocalizableString = js.native
  val locEditText: LocalizableString = js.native
  val locLoadingHtml: LocalizableString = js.native
  val locLogo: LocalizableString = js.native
  val locPageNextText: LocalizableString = js.native
  val locPagePrevText: LocalizableString = js.native
  val locPreviewText: LocalizableString = js.native
  val locQuestionTitleTemplate: LocalizableString = js.native
  val locStartSurveyText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * Gets or sets the survey locale. The default value it is empty, this means the 'en' locale is used.
    * You can set it to 'de' - German, 'fr' - French and so on. The library has built-in localization for several languages. The library has a multi-language support as well.
    */
  var locale: String = js.native
  /**
    * Gets or sets a survey logo.
    * @see title
    */
  var logo: String = js.native
  val logoClassNames: String = js.native
  /**
    * The logo fit mode.
    * @see logo
    */
  var logoFit: String = js.native
  /**
    * Gets or sets a survey logo height.
    * @see logo
    */
  var logoHeight: Double = js.native
  /**
    * Gets or sets a survey logo position.
    * @see logo
    */
  var logoPosition: String = js.native
  /**
    * Gets or sets a survey logo width.
    * @see logo
    */
  var logoWidth: Double = js.native
  /**
    * Gets or sets the default maximum length for question comments and others
    *
    * The default value is `0`, that means that the question comments have the same max length as the standard HTML input - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp.
    * @see Question.hasComment
    * @see Question.hasOther
    * @see maxTextLength
    */
  var maxOthersLength: Double = js.native
  /**
    * Specifies the default maximum length for questions like text and comment, including matrix cell questions.
    *
    * The default value is `0`, that means that the text and comment have the same max length as the standard HTML input - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp.
    * @see maxOthersLength
    */
  var maxTextLength: Double = js.native
  /**
    * Gets or sets the maximum time in seconds that end user has to complete a survey. If the value is 0 or less, an end user has no time limit to finish a survey.
    * @see startTimer
    * @see maxTimeToFinishPage
    */
  var maxTimeToFinish: Double = js.native
  /**
    * Gets or sets the maximum time in seconds that end user has to complete a page in the survey. If the value is 0 or less, an end user has no time limit.
    *
    * You may override this value for every page.
    * @see startTimer
    * @see maxTimeToFinish
    * @see PageModel.maxTimeToFinish
    */
  var maxTimeToFinishPage: Double = js.native
  /**
    * Gets or sets the survey edit mode.
    *
    * The following options are available:
    *
    * - `edit` (default) - make a survey editable,
    * - `display` - make a survey read-only.
    */
  var mode: String = js.native
  /**
    * Set this property to a url you want to navigate after a user completing the survey.
    * By default it uses after calling onComplete event. In case calling options.showDataSaving callback in onComplete event, navigateToUrl will be used on calling options.showDataSavingSuccess callback.
    */
  var navigateToUrl: String = js.native
  /**
    * Gets or sets a list of URL condition items. If the expression of this item returns `true`, then survey will navigate to the item URL.
    * @see UrlConditionItem
    * @see navigateToUrl
    */
  var navigateToUrlOnCondition: js.Array[UrlConditionItem] = js.native
  /**
    * The event is fired right after a page is rendered in DOM. Use it to modify HTML elements.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.htmlElement` - an HTML element bound to the survey header object.
    */
  var onAfterRenderHeader: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a page is rendered in DOM. Use it to modify HTML elements.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.page` - a page object for which the event is fired. Typically the current/active page.
    * <br/> `options.htmlElement` - an HTML element bound to the page object.
    */
  var onAfterRenderPage: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a panel is rendered in DOM. Use it to modify HTML elements.
    * <br/> `sender` - the survey object that fires the event
    * <br/> `options.panel` - a panel object for which the event is fired
    * <br/> `options.htmlElement` - an HTML element bound to the panel object
    */
  var onAfterRenderPanel: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a question is rendered in DOM. Use it to modify HTML elements.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a question object for which the event is fired.
    * <br/> `options.htmlElement` - an HTML element bound to the question object.
    */
  var onAfterRenderQuestion: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a non-composite question (text, comment, dropdown, radiogroup, checkbox) is rendered in DOM. Use it to modify HTML elements.
    * This event is not fired for matrices, panels, multiple text and image picker.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a question object for which the event is fired.
    * <br/> `options.htmlElement` - an HTML element bound to the question object.
    */
  var onAfterRenderQuestionInput: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after survey is rendered in DOM.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.htmlElement` - a root HTML element bound to the survey object.
    */
  var onAfterRenderSurvey: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * This event is fired on clearing the value in a QuestionFile. Use this event to remove files stored on your server.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `question` - the question instance.
    * <br/> `options.name` - the question name.
    * <br/> `options.value` - the question value.
    * <br/> `options.fileName` - a removed file's name, set it to `null` to clear all files.
    * <br/> `options.callback` - a call back function to get the status on clearing the files operation.
    * @see clearFiles
    */
  var onClearFiles: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after a user clicks the 'Complete' button and finishes a survey. Use this event to send the survey data to your web server.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.showDataSaving(text)` - call this method to show that the survey is saving survey data on your server. The `text` is an optional parameter to show a custom message instead of default.
    * <br/> `options.showDataSavingError(text)` - call this method to show that an error occurred while saving the data on your server. If you want to show a custom error, use an optional `text` parameter.
    * <br/> `options.showDataSavingSuccess(text)` - call this method to show that the data was successfully saved on the server.
    * <br/> `options.showDataSavingClear` - call this method to hide the text about the saving progress.
    * <br/> `options.isCompleteOnTrigger` - returns true if the survey is completed on "complete" trigger.
    *  @see data
    * @see clearInvisibleValues
    * @see completeLastPage
    * @see surveyPostId
    */
  var onComplete: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before the survey is completed and the `onComplete` event is fired. You can prevent the survey from completing by setting `options.allowComplete` to `false`
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.allowComplete` - Specifies whether a user can complete a survey. Set this property to `false` to prevent the survey from completing. The default value is `true`.
    * <br/> `options.isCompleteOnTrigger` - returns true if the survey is completing on "complete" trigger.
    * @see onComplete
    */
  var onCompleting: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when the current page has been changed to another page. Typically it happens when a user click on 'Next' or 'Prev' buttons.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `option.oldCurrentPage` - a previous current/active page.
    * <br/> `option.newCurrentPage` - a new current/active page.
    * <br/> `option.isNextPage` - commonly means, that end-user press the next page button. In general, it means that options.newCurrentPage is the next page after options.oldCurrentPage
    * <br/> `option.isPrevPage` - commonly means, that end-user press the previous page button. In general, it means that options.newCurrentPage is the previous page before options.oldCurrentPage
    * @see currentPage
    * @see currentPageNo
    * @see nextPage
    * @see prevPage
    * @see completeLastPage
    * @see onCurrentPageChanging
    */
  var onCurrentPageChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before the current page changes to another page. Typically it happens when a user click the 'Next' or 'Prev' buttons.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `option.oldCurrentPage` - the previous current/active page.
    * <br/> `option.newCurrentPage` - a new current/active page.
    * <br/> `option.allowChanging` - set it to `false` to disable the current page changing. It is `true` by default.
    * <br/> `option.isNextPage` - commonly means, that end-user press the next page button. In general, it means that options.newCurrentPage is the next page after options.oldCurrentPage
    * <br/> `option.isPrevPage` - commonly means, that end-user press the previous page button. In general, it means that options.newCurrentPage is the previous page before options.oldCurrentPage
    * @see currentPage
    * @see currentPageNo
    * @see nextPage
    * @see prevPage
    * @see completeLastPage
    * @see onCurrentPageChanged
    **/
  var onCurrentPageChanging: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on downloading a file in QuestionFile. Use this event to pass the file to a preview.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.name` - the question name.
    * <br/> `options.content` - the file content.
    * <br/> `options.fileValue` - single file question value.
    * <br/> `options.callback` - a call back function to get the status on downloading the file and the downloaded file content.
    * @see downloadFile
    */
  var onDownloadFile: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to control drag&drop operations during design mode.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.allow` - set it to `false` to disable dragging.
    * <br/> `options.target` - a target element that is dragged.
    * <br/> `options.source` - a source element. It can be `null`, if it is a new element, dragging from toolbox.
    * <br/> `options.parent` - a page or panel where target element is dragging.
    * <br/> `options.insertBefore` - an element before the target element is dragging. It can be `null` if parent container (page or panel) is empty or dragging an element after the last element in a container.
    * <br/> `options.insertAfter` - an element after the target element is dragging. It can be `null` if parent container (page or panel) is empty or dragging element to the first position within the parent container.
    * @see setDesignMode
    * @see isDesignMode
    */
  var onDragDropAllow: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new panel in Panel Dynamic question.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a panel question.
    * @see QuestionPanelDynamicModel
    * @see QuestionPanelDynamicModel.panels
    */
  var onDynamicPanelAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when item value is changed in Panel Dynamic question.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the panel question.
    * <br/> `options.panel` - the dynamic panel item.
    * <br/> `options.name` - the item name.
    * <br/> `options.value` - a new value.
    * <br/> `options.itemIndex` - the panel item index.
    * <br/> `options.itemValue` - the panel item object.
    * @see onDynamicPanelAdded
    * @see QuestionPanelDynamicModel
    */
  var onDynamicPanelItemValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a panel from Panel Dynamic question.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a panel question.
    * <br/> `options.panelIndex` - a removed panel index.
    * <br/> `options.panel` - a removed panel.
    * @see QuestionPanelDynamicModel
    * @see QuestionPanelDynamicModel.panels
    */
  var onDynamicPanelRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use the event to change the default error text.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.text` - an error text.
    * <br/> `options.error` - an instance of the `SurveyError` object.
    * <br/> `options.name` - the error name. The following error names are available:
    * required, requireoneanswer, requirenumeric, exceedsize, webrequest, webrequestempty, otherempty,
    * uploadingfile, requiredinallrowserror, minrowcounterror, keyduplicationerror, custom
    */
  var onErrorCustomText: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to change the question title in code.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.title` - a calculated question title, based on question `title`, `name`, `isRequired`, and `visibleIndex` properties.
    * <br/> `options.question` - a question object.
    */
  var onGetQuestionTitle: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use it to get results after calling the `getResult` method. It returns a simple analytics from [api.surveyjs.io](https://api.surveyjs.io) service.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.success` - it is `true` if the results were got from the service successfully.
    * <br/> `options.data` - the object `{AnswersCount, QuestionResult : {} }`. `AnswersCount` is the number of posted survey results. `QuestionResult` is an object with all possible unique answers to the question and number of these answers.
    * <br/> `options.dataList` - an array of objects `{name, value}`, where `name` is a unique value/answer to the question and `value` is a number/count of such answers.
    * <br/> `options.response` - the server response.
    * @see getResult
    */
  var onGetResult: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to define, whether an answer to a question is correct or not.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a question on which you have to decide if the answer is correct or not.
    * <br/> `options.result` - returns `true`, if an answer is correct, or `false`, if the answer is not correct. Use questions' `value` and `correctAnswer` properties to return the correct value.
    * <br/> `options.correctAnswers` - you may change the default number of correct or incorrect answers in the question, for example for matrix, where each row is a quiz question.
    * @see Question.value
    * @see Question.correctAnswer
    */
  var onIsAnswerCorrect: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after choices for radiogroup, checkbox, and dropdown has been loaded from a RESTful service and before they are assigned to a question.
    * You may change the choices, before they are assigned or disable/enabled make visible/invisible question, based on loaded results.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `question` - the question where loaded choices are going to be assigned.
    * <br/> `choices` - the loaded choices. You can change the loaded choices to before they are assigned to question.
    * <br/> `serverResult` - a result that comes from the server as it is.
    */
  var onLoadChoicesFromServer: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after survey is loaded from api.surveyjs.io service.
    * You can use this event to perform manipulation with the survey model after it was loaded from the web service.
    * <br/> `sender` - the survey object that fires the event.
    * @see surveyId
    * @see loadSurveyFromService
    */
  var onLoadedSurveyFromService: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  var onLocaleChangedEvent: Event[js.Function2[/* sender */ this.type, /* value */ String, _], _] = js.native
  /**
    * The event is fired for every cell after is has been rendered in DOM.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the matrix question.
    * <br/> `options.cell` - the matrix cell.
    * <br/> `options.cellQuestion` - the question/editor in the cell.
    * <br/> `options.htmlElement` - an HTML element bound to the `cellQuestion` object.
    * <br/> `options.column` - the matrix column object.
    * <br/> `options.row` - the matrix row object.
    * @see onMatrixCellCreated
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixAfterCellRender: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering "Remove" button for removing a row from Matrix Dynamic question.
    * <br/> `sender` - the survey object that fires the event
    * <br/> `options.question` - a matrix question.
    * <br/> `options.rowIndex` - a row index.
    * <br/> `options.row` - a row object.
    * <br/> `options.allow` - a boolean property. Set it to `false` to disable the row removing.
    * @see QuestionMatrixDynamicModel
    */
  var onMatrixAllowRemoveRow: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before adding a new row in Matrix Dynamic question.
    * <br/> `sender` - the survey object that fires the event
    * <br/> `options.question` - a matrix question.
    * <br/> `options.canAddRow` - specifies whether a new row can be added
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixBeforeRowAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired for every cell created in Matrix Dynamic and Matrix Dropdown questions.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the matrix question.
    * <br/> `options.cell` - the matrix cell.
    * <br/> `options.cellQuestion` - the question/editor in the cell. You may customize it, change it's properties, like choices or visible.
    * <br/> `options.rowValue` - the value of the current row. To access a particular column's value within the current row, use: `options.rowValue["columnValue"]`.
    * <br/> `options.column` - the matrix column object.
    * <br/> `options.columName` - the matrix column name.
    * <br/> `options.row` - the matrix row object.
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellCreated: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when Matrix Dynamic and Matrix Dropdown questions validate the cell value.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the matrix question.
    * <br/> `options.columName` - the matrix column name.
    * <br/> `options.value` - a cell value.
    * <br/> `options.row` - the matrix row object.
    * <br/> `options.getCellQuestion(columnName)` - the function that returns the cell question by column name.
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellValidate: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when cell value is changed in Matrix Dynamic and Matrix Dropdown questions.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the matrix question.
    * <br/> `options.columName` - the matrix column name.
    * <br/> `options.value` - a new value.
    * <br/> `options.row` - the matrix row object.
    * <br/> `options.getCellQuestion(columnName)` - the function that returns the cell question by column name.
    * @see onMatrixCellValueChanging
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing cell value in Matrix Dynamic and Matrix Dropdown questions. You may change the `options.value` property to change a cell value.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the matrix question.
    * <br/> `options.columName` - the matrix column name.
    * <br/> `options.value` - a new value.
    * <br/> `options.oldValue` - the old value.
    * <br/> `options.row` - the matrix row object.
    * <br/> `options.getCellQuestion(columnName)` - the function that returns a cell question by column name.
    * @see onMatrixCellValueChanged
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellValueChanging: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new row in Matrix Dynamic question.
    * <br/> `sender` - the survey object that fires the event
    * <br/> `options.question` - a matrix question.
    * <br/> `options.row` - a new added row.
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixRowAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a row from Matrix Dynamic question.
    * <br/> `sender` - the survey object that fires the event
    * <br/> `options.question` - a matrix question
    * <br/> `options.rowIndex` - a removed row index
    * <br/> `options.row` - a removed row object
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixRowRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after a user clicks the 'Complete' button. The event allows you to specify the URL opened after completing a survey.
    * Specify the `navigateToUrl` property to make survey navigate to another url.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.url` - Specifies a URL opened after completing a survey. Set this property to an empty string to cancel the navigation and show the completed survey page.
    * @see navigateToUrl
    * @see navigateToUrlOnCondition
    */
  var onNavigateToUrl: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a page into survey.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.page` - a newly added `panel` object.
    * @see PanelModel
    */
  var onPageAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing a page visibility.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.page` - a page which visibility has been changed.
    * <br/> `options.visible` - a page `visible` boolean value.
    * @see PageModel.visibile
    * @see PageModel.visibileIf
    */
  var onPageVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a panel into survey.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.panel` - a newly added panel object.
    * <br/> `options.name` - a panel name.
    * <br/> `options.index` - an index of the panel in the container (a page or panel).
    * <br/> `options.parentPanel` - a container (a page or panel) where a new panel is located.
    * <br/> `options.rootPanel` - a root container, typically it is a page.
    * @see PanelModel
    */
  var onPanelAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a panel from survey.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.panel` - a removed panel object.
    * <br/> `options.name` - a panel name.
    * @see PanelModel
    */
  var onPanelRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing a panel visibility.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.panel` - a panel which visibility has been changed.
    * <br/> `options.visible` - a panel `visible` boolean value.
    * @see PanelModel.visibile
    * @see PanelModel.visibileIf
    */
  var onPanelVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on clicking the 'Next' button if the `sendResultOnPageNext` is set to `true`. You can use it to save the intermediate results, for example, if your survey is large enough.
    * <br/> `sender` - the survey object that fires the event.
    * @see sendResultOnPageNext
    */
  var onPartialSend: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  /**
    * Use this event to modify the HTML content before rendering, for example `completeHtml` or `loadingHtml`.
    * `options.html` - specifies the modified HTML content.
    * @see completedHtml
    * @see loadingHtml
    */
  var onProcessHtml: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on processing the text when it finds a text in brackets: `{somevalue}`. By default, it uses the value of survey question values and variables.
    * For example, you may use the text processing in loading choices from the web. If your `choicesByUrl.url` equals to "UrlToServiceToGetAllCities/{country}/{state}",
    * you may set on this event `options.value` to "all" or empty string when the "state" value/question is non selected by a user.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.name` - the name of the processing value, for example, "state" in our example.
    * <br/> `options.value` - the value of the processing text.
    * <br/> `options.isExists` - a boolean value. Set it to `true` if you want to use the value and set it to `false` if you don't.
    */
  var onProcessTextValue: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new question into survey.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a newly added question object.
    * <br/> `options.name` - a question name.
    * <br/> `options.index` - an index of the question in the container (page or panel).
    * <br/> `options.parentPanel` - a container where a new question is located. It can be a page or panel.
    * <br/> `options.rootPanel` - typically, it is a page.
    * @see Question
    * @see onQuestionCreated
    */
  var onQuestionAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on creating a new question.
    * Unlike the onQuestionAdded event, this event calls for all question created in survey including inside: a page, panel, matrix cell, dynamic panel and multiple text.
    * or inside a matrix cell or it can be a text question in multiple text items or inside a panel of a panel dynamic.
    * You can use this event to set up properties to a question based on it's type for all questions, regardless where they are located, on the page or inside a matrix cell.
    * Please note: If you want to use this event for questions loaded from JSON then you have to create survey with empty/null JSON parameter, assign the event and call survey.fromJSON(yourJSON) function.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a newly created question object.
    * @see Question
    * @see onQuestionAdded
    */
  var onQuestionCreated: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a question from survey.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a removed question object.
    * <br/> `options.name` - a question name.
    * @see Question
    */
  var onQuestionRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to control scrolling element to top. You can cancel the default behavior by setting options.cancel property to true.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.element` - an element that is going to be scrolled on top.
    * <br/> `options.question` - a question that is going to be scrolled on top. It can be null if options.page is not null.
    * <br/> `options.page` - a page that is going to be scrolled on top. It can be null if options.question is not null.
    * <br/> `options.elementId` - the unique element DOM Id.
    * <br/> `options.cancel` - set this property to true to cancel the default scrolling.
    */
  var onScrollingElementToTop: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event fires when it gets response from the [api.surveyjs.io](https://api.surveyjs.io) service on saving survey results. Use it to find out if the results have been saved successfully.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.success` - it is `true` if the results has been sent to the service successfully.
    * <br/> `options.response` - a response from the service.
    */
  var onSendResult: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to validate data on your server.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.data` - the values of all non-empty questions on the current page. You can get a question value as `options.data["myQuestionName"]`.
    * <br/> `options.errors` - set your errors to this object as: `options.errors["myQuestionName"] = "Error text";`. It will be shown as a question error.
    * <br/> `options.complete()` - call this function to tell survey that your server callback has been processed.
    * @see onValidateQuestion
    * @see onValidatePanel
    */
  var onServerValidateQuestions: js.Any = js.native
  /**
    * The event is fired before errors are assigned to a question. You may add/remove/modify errors for a question.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a validated question.
    * <br/> `options.errors` - the list of errors. The list is empty by default and remains empty if a validated question has no errors.
    * @see onValidateQuestion
    */
  var onSettingQuestionErrors: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after the survey changed it's state from "starting" to "running". The "starting" state means that survey shows the started page.
    * The `firstPageIsStarted` property should be set to `true`, if you want to display a start page in your survey. In this case, an end user should click the "Start" button to start the survey.
    * @see firstPageIsStarted
    */
  var onStarted: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  /**
    * Use this event to process the markdown text.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.element` - SurveyJS element (a question, panel, page, or survey) where the string is going to be rendered.
    * <br/> `options.text` - a text that is going to be rendered.
    * <br/> `options.html` - an HTML content. It is `null` by default. Use this property to specify the HTML content rendered instead of `options.text`.
    */
  var onTextMarkdown: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired every second if the method `startTimer` has been called.
    * @see startTimer
    * @see timeSpent
    * @see Page.timeSpent
    */
  var onTimer: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  /**
    * The event is fired before displaying a new information in the Timer Panel. Use it to change the default text.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.text` - the timer panel info text.
    */
  var onTimerPanelInfoText: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering a page. Use it to override the default page CSS classes.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.page` - a page for which you can change the CSS classes.
    * <br/> `options.cssClasses` - an object with CSS classes. For example `{title: "sv_p_title", description: "small"}`. You can change them to your own CSS classes.
    */
  var onUpdatePageCssClasses: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering a panel. Use it to override the default panel CSS classes.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.panel` - a panel for which you can change the CSS classes.
    * <br/> `options.cssClasses` - an object with CSS classes. For example `{title: "sv_p_title", description: "small"}`. You can change them to your own CSS classes.
    */
  var onUpdatePanelCssClasses: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering a question. Use it to override the default question CSS classes.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a question for which you can change the CSS classes.
    * <br/> `options.cssClasses` - an object with CSS classes. For example `{root: "table", button: "button"}`. You can change them to your own CSS classes.
    */
  var onUpdateQuestionCssClasses: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on uploading the file in QuestionFile when `storeDataAsText` is set to `false`. Use this event to change the uploaded file name or to prevent a particular file from being uploaded.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - the file question instance.
    * <br/> `options.name` - the file name.
    * <br/> `options.file` - the Javascript File object.
    * <br/> `options.accept` - a boolean value, `true` by default. Set it to `false` to deny this file uploading.
    * @see uploadFiles
    * @see QuestionFileModel.storeDataAsText
    */
  var onUploadFiles: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on validating a panel. Set your error to `options.error` and survey will show the error for the panel and block completing the survey or going to the next page.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.name` - a panel name.
    * <br/> `options.error` - an error string. It is empty by default.
    * @see onValidateQuestion
    */
  var onValidatePanel: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on validating value in a question. You can specify a custom error message using `options.error`. The survey blocks completing the survey or going to the next page when the error messages are displayed.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a validated question.
    * <br/> `options.name` - a question name.
    * <br/> `options.value` - the current question value (answer).
    * <br/> `options.error` - an error string. It is empty by default.
    * @see onServerValidateQuestions
    * @see onSettingQuestionErrors
    */
  var onValidateQuestion: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use the this event to be notified when the survey finished validate questions on the current page. It commonly happens when a user try to go to the next page or complete the survey
    * options.questions - the list of questions that have errors
    * options.errors - the list of errors
    * options.page - the page where question(s) are located
    */
  var onValidatedErrorsOnCurrentPage: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when the question value (i.e., answer) has been changed. The question value can be changed in UI (by a user) or programmatically (on calling `setValue` method).
    * Use the `onDynamicPanelItemValueChanged` and `onMatrixCellValueChanged` events to handle changes in a question in the Panel Dynamic and a cell question in matrices.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.name` - the value name that has been changed.
    * <br/> `options.question` - a question which `question.name` equals to the value name. If there are several questions with the same name, the first question is used. If there is no such questions, the `options.question` is `null`.
    * <br/> `options.value` - a new value.
    * @see setValue
    * @see onValueChanging
    * @see onDynamicPanelItemValueChanged
    * @see onMatrixCellValueChanged
    */
  var onValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before the question value (answer) is changed. It can be done via UI by a user or programmatically on calling the `setValue` method.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.name` - the value name that has being changed.
    * <br/> `options.question` - a question which `question.name` equals to the value name. If there are several questions with the same name, the first question is used. If there is no such questions, the `options.question` is null.
    * <br/> `options.oldValue` - an old, previous value.
    * <br/> `options.value` - a new value. You can change it.
    * @see setValue
    * @see onValueChanged
    */
  var onValueChanging: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when a question visibility has been changed.
    * <br/> `sender` - the survey object that fires the event.
    * <br/> `options.question` - a question which visibility has been changed.
    * <br/> `options.name` - a question name.
    * <br/> `options.visible` - a question `visible` boolean value.
    * @see Question.visibile
    * @see Question.visibileIf
    */
  var onVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  var origionalPages: js.Any = js.native
  /**
    * Returns the survey page count.
    * @see visiblePageCount
    * @see pages
    */
  val pageCount: Double = js.native
  /**
    * Gets or sets the 'Next' button caption.
    * @see locale
    */
  var pageNextText: String = js.native
  /**
    * Gets or sets the 'Prev' button caption.
    * @see locale
    */
  var pagePrevText: String = js.native
  /**
    * Returns a list of all pages in the survey, including invisible pages.
    * @see PageModel
    * @see visiblePages
    */
  val pages: js.Array[IPage | PageModel] = js.native
  val platformName: String = js.native
  /**
    *  Gets or sets the 'Preview' button caption.
    * @see locale
    * @see showPreviewBeforeComplete
    * @see editText
    * @see showPreview
    */
  var previewText: String = js.native
  /**
    * Returns the HTML content, that is shown to a user that had completed the survey before.
    * @see completedHtml
    * @see cookieName
    */
  val processedCompletedBeforeHtml: String = js.native
  /**
    * Returns the HTML content for the complete page.
    * @see completedHtml
    */
  val processedCompletedHtml: String = js.native
  /**
    * Returns the HTML content, that is shows when a survey loads the survey JSON.
    */
  val processedLoadingHtml: String = js.native
  /**
    * Returns the text/HTML that is rendered as a survey title.
    */
  val processedTitle: String = js.native
  /**
    * Gets or sets the type of info in the progress bar.
    *
    * The following options are available:
    *
    * - `pages` (default),
    * - `questions`,
    * - `correctQuestions`.
    */
  var progressBarType: String = js.native
  /**
    * Returns the text for the current progress.
    */
  val progressText: String = js.native
  /**
    * Gets or sets the question description position.
    *
    * The following options are available:
    *
    * - `underTitle` - show question description under the question title,
    * - `underInput` - show question description under the question input instead of question title.
    */
  var questionDescriptionLocation: String = js.native
  /**
    * Gets or sets the error message position.
    *
    * The following options are available:
    *
    * - `top` - to show question error(s) over the question,
    * - `bottom` - to show question error(s) under the question.
    */
  var questionErrorLocation: String = js.native
  /**
    * Gets or sets the first question index. The first question index is '1' by default. You may start it from '100' or from 'A', by setting '100' or 'A' to this property.
    * You can set the start index to "(1)" or "# A)" or "a)" to render question number as (1), # A) and a) accordingly.
    * @see Question.title
    * @see requiredText
    */
  var questionStartIndex: String = js.native
  /**
    * Gets or sets the question title location.
    *
    * The following options are available:
    *
    * - `bottom` - show a question title to bottom
    * - `left` - show a question title to left
    * - `top` - show a question title to top.
    *
    * > Some questions, for example matrixes, do not support 'left' value. The title for them will be displayed to the top.
    */
  var questionTitleLocation: String = js.native
  /**
    * Set the pattern for question title. Default is "numTitleRequire", 1. What is your name? *,
    * You can set it to numRequireTitle: 1. * What is your name?
    * You can set it to requireNumTitle: * 1. What is your name?
    * You can set it to numTitle (remove require symbol completely): 1. What is your name?
    * @see QuestionModel.title
    */
  var questionTitlePattern: String = js.native
  /**
    * Gets or sets a question title template. Obsolete, please use questionTitlePattern
    * @see QuestionModel.title
    * @see questionTitlePattern
    */
  var questionTitleTemplate: String = js.native
  /**
    * Gets or sets a value that specifies how the survey combines questions, panels, and pages.
    *
    * The following options are available:
    *
    * - `singlePage` - combine all survey pages in a single page. Pages will be converted to panels.
    * - `questionPerPage` - show one question per page. Survey will create a separate page for every question.
    */
  var questionsOnPageMode: String = js.native
  /**
    * Gets or sets the question display order. Use this property to randomize questions. You can randomize questions on a specific page.
    *
    * The following options are available:
    *
    * - `random` - randomize questions
    * - `initial` - keep questions in the same order, as in a survey model.
    * @see SurveyPage.questionsOrder
    */
  var questionsOrder: String = js.native
  val renderedCompletedHtml: String = js.native
  /**
    * Gets or sets the required question mark. The required question mark is a char or string that is rendered in the required questions' titles.
    * @see Question.title
    */
  var requiredText: String = js.native
  var runningPages: js.Any = js.native
  /**
    * Gets or sets whether to save survey results on completing every page. If the property value is set to `true`, the `onPartialSend` event is fired.
    * @see onPartialSend
    * @see clientId
    */
  var sendResultOnPageNext: Boolean = js.native
  /**
    * On finishing the survey the complete page is shown. Set the property to `false`, to hide the complete page.
    * @see data
    * @see onComplete
    * @see navigateToUrl
    */
  var showCompletedPage: Boolean = js.native
  /**
    * Gets or sets whether to show all elements in the survey, regardless their visibility. The default value is `false`.
    */
  var showInvisibleElements: Boolean = js.native
  /**
    * Gets or sets the navigation buttons position.
    * Possible values: 'bottom' (default), 'top', 'both' and 'none'. Set it to 'none' to hide 'Prev', 'Next' and 'Complete' buttons.
    * It makes sense if you are going to create a custom navigation, have only a single page, or the `goNextPageAutomatic` property is set to `true`.
    * @see goNextPageAutomatic
    * @see showPrevButton
    */
  var showNavigationButtons: String | js.Any = js.native
  /**
    * Gets or sets whether the survey displays page numbers on pages titles.
    */
  var showPageNumbers: Boolean = js.native
  /**
    * Gets or sets whether the Survey displays page titles. Set it to `false` to hide page titles.
    * @see PageModel.title
    */
  var showPageTitles: Boolean = js.native
  /**
    * Gets or sets whether the Survey displays "Prev" button in its pages. Set it to `false` to prevent end-users from going back to their answers.
    * @see showNavigationButtons
    */
  var showPrevButton: Boolean = js.native
  /**
    * Set this property to "showAllQuestions" or "showAnsweredQuestions" to preview results to a user before he/she completes the survey.
    */
  var showPreviewBeforeComplete: String = js.native
  /**
    * Gets or sets the survey progress bar position.
    *
    * The following options are available:
    *
    * - `top` - show progress bar in the top
    * - `bottom` - show progress bar in the bottom
    * - `both` - show progress bar in both sides: top and bottom.
    */
  var showProgressBar: String = js.native
  /**
    * Gets or sets a value that specifies how the question numbers are displayed.
    *
    * The following options are available:
    *
    * - `on` - display question numbers
    * - `onpage` - display question numbers, start numbering on every page
    * - `off` - turn off the numbering for questions titles
    */
  var showQuestionNumbers: String = js.native
  /**
    * Gets or sets a timer panel position. The timer panel displays information about how much time an end user spends on a survey/page.
    *
    * The available options:
    * - `top` - display timer panel in the top.
    * - `bottom` - display timer panel in the bottom.
    * - `none` - do not display a timer panel.
    *
    * If the value is not equal to 'none', the survey calls the `startTimer()` method on survey rendering.
    * @see showTimerPanelMode
    * @see startTimer
    * @see stopTimer
    */
  var showTimerPanel: String = js.native
  /**
    * Gets or set a value that specifies whether the timer displays information for the page or for the entire survey.
    *
    * The available options:
    *
    * - `page` - show timer information for page
    * - `survey` - show timer information for survey
    *
    * Use the `onTimerPanelInfoText` event to change the default text.
    * @see showTimerPanel
    * @see onTimerPanelInfoText
    */
  var showTimerPanelMode: String = js.native
  /**
    * Gets or sets whether the Survey displays survey title in its pages. Set it to `false` to hide a survey title.
    * @see title
    */
  var showTitle: Boolean = js.native
  /**
    * Gets or sets the 'Start' button caption.
    * The 'Start' button is shown on the started page. Set the `firstPageIsStarted` property to `true`, to display the started page.
    * @see firstPageIsStarted
    * @see locale
    */
  var startSurveyText: String = js.native
  /**
    * Returns the started page. This property works if the `firstPageIsStarted` property is set to `true`.
    * @see firstPageIsStarted
    */
  val startedPage: PageModel = js.native
  /**
    * Returns the current survey state:
    *
    * - `loading` - loading from the JSON,
    * - `completed` - a user has completed the survey,
    * - `starting` - the started page is showing,
    * - `running` - a user answers questions right now,
    * - `empty` - there is nothing to show in the current survey.
    */
  val state: String = js.native
  /**
    * Gets or sets whether the "Others" option text is stored as question comment.
    *
    * By default the entered text in the "Others" input in the checkbox/radiogroup/dropdown is stored as `"question name " + "-Comment"`. The value itself is `"question name": "others"`.
    * Set this property to `false`, to store the entered text directly in the `"question name"` key.
    * @see commentPrefix
    */
  var storeOthersAsComment: Boolean = js.native
  /**
    * Gets or sets an identifier of a survey model loaded from the [api.surveyjs.io](https://api.surveyjs.io) service. When specified, the survey JSON is automatically loaded from [api.surveyjs.io](https://api.surveyjs.io) service.
    * @see loadSurveyFromService
    * @see onLoadedSurveyFromService
    */
  var surveyId: String = js.native
  /**
    * Gets or sets an identifier of a survey model saved to the [api.surveyjs.io](https://api.surveyjs.io) service. When specified, the survey data is automatically saved to the [api.surveyjs.io](https://api.surveyjs.io) service.
    * @see onComplete
    * @see surveyShowDataSaving
    */
  var surveyPostId: String = js.native
  /**
    * Gets or sets whether to show the progress on saving/sending data into the [api.surveyjs.io](https://api.surveyjs.io) service.
    * @see surveyPostId
    */
  var surveyShowDataSaving: Boolean = js.native
  /**
    * Gets or sets a value that specifies how the survey updates its questions' text values.
    *
    * The following options are available:
    *
    * - `onBlur` (default) - the value is updated after an input loses the focus.
    * - `onTyping` - update the value of text questions, "text" and "comment", on every key press.
    *
    * Note, that setting to "onTyping" may lead to a performance degradation, in case you have many expressions in the survey.
    */
  var textUpdateMode: String = js.native
  /**
    * Returns the time in seconds an end user spends on the survey
    * @see startTimer
    * @see PageModel.timeSpent
    */
  var timeSpent: Double = js.native
  val timerInfoText: String = js.native
  /**
    * Gets or sets a survey title.
    * @see description
    */
  var title: String = js.native
  /**
    * Gets or sets a list of triggers in the survey.
    * @see SurveyTrigger
    */
  var triggers: js.Array[SurveyTrigger] = js.native
  /**
    * Returns a number of visible pages within the survey.
    * @see pageCount
    * @see visiblePages
    */
  val visiblePageCount: Double = js.native
  /**
    * Returns a list of visible pages. If all pages are visible, then this property returns the same list as the `pages` property.
    * @see pages
    * @see PageModel.visible
    * @see PageModel.visibleIf
    */
  val visiblePages: js.Array[PageModel] = js.native
  /**
    * Creates a new page and adds it to a survey. Generates a new name if the `name` parameter is not specified.
    * @param name a page name
    * @see addPage
    */
  def addNewPage(): PageModel = js.native
  def addNewPage(name: String): PageModel = js.native
  /**
    * Adds an existing page to the survey.
    * @param page a newly added page
    * @see addNewPage
    */
  def addPage(page: PageModel): Unit = js.native
  def afterRenderHeader(htmlElement: js.Any): Unit = js.native
  def afterRenderPage(htmlElement: js.Any): js.Any = js.native
  @JSName("afterRenderPage")
  def afterRenderPage_Unit(htmlElement: js.Any): Unit = js.native
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any = js.native
  @JSName("afterRenderPanel")
  def afterRenderPanel_Unit(panel: IElement, htmlElement: js.Any): Unit = js.native
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestionInput(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  @JSName("afterRenderQuestionInput")
  def afterRenderQuestionInput_Unit(question: IQuestion, htmlElement: js.Any): Unit = js.native
  @JSName("afterRenderQuestion")
  def afterRenderQuestion_Unit(question: IQuestion, htmlElement: js.Any): Unit = js.native
  /* protected */ def afterRenderSurvey(htmlElement: js.Any): Unit = js.native
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit = js.native
  /**
    * Canel preview and go back to the "running" state.
    * @param curPage - a new current page. If the parameter is underfined then the last page becomes current.
    * @see showPreviewBeforeComplete
    * @see showPreview
    * @see state
    */
  def cancelPreview(): Unit = js.native
  def cancelPreview(curPage: js.Any): Unit = js.native
  def cancelPreviewByPage(panel: IPanel): js.Any = js.native
  /**
    * Clears the survey data and state. If the survey has a `completed` state, it will get a `running` state.
    * @param clearData clear the data
    * @param gotoFirstPage make the first page as a current page.
    * @see data
    * @see state
    * @see currentPage
    */
  def clear(): Unit = js.native
  def clear(clearData: js.UndefOr[scala.Nothing], gotoFirstPage: Boolean): Unit = js.native
  def clear(clearData: Boolean): Unit = js.native
  def clear(clearData: Boolean, gotoFirstPage: Boolean): Unit = js.native
  def clearFiles(
    question: IQuestion,
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  /**
    * Clears files from server.
    * @param question question
    * @param name question name
    * @param value file question value
    * @param callback call back function to get the status of the clearing operation
    */
  @JSName("clearFiles")
  def clearFiles_Unit(
    question: IQuestion,
    name: String,
    value: js.Any,
    fileName: String,
    callback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): Unit = js.native
  /**
    * Call this function to remove all question values from the survey, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radiogroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    * In fact this function just call clearIncorrectValues function of all questions in the survey
    * @see Question.clearIncorrectValues
    * @see Page.clearIncorrectValues
    * @see Panel.clearIncorrectValues
    */
  def clearIncorrectValues(): Unit = js.native
  /**
    * Removes a value from the survey results.
    * @param {string} name The name of the value. Typically it is a question name.
    */
  def clearValue(name: String): Unit = js.native
  /**
    * Completes the survey, if the current page is the last one. It returns `false` if the last page has errors.
    * If the last page has no errors, `completeLastPage` calls `doComplete` and returns `true`.
    * @see isCurrentPageHasErrors
    * @see nextPage
    * @see doComplete
    */
  def completeLastPage(): Boolean = js.native
  /* protected */ def createNewPage(name: String): PageModel = js.native
  /* protected */ def createSurveyService(): dxSurveyService = js.native
  /* protected */ def currentPageChanged(newValue: PageModel, oldValue: PageModel): Unit = js.native
  /* protected */ def currentPageChanging(newValue: PageModel, oldValue: PageModel): Boolean = js.native
  /**
    * Deletes the cookie with `cookieName` from the browser.
    * @see cookieName
    * @see hasCookie
    * @see setCookie
    */
  def deleteCookie(): Unit = js.native
  def deleteDataValueCore(valuesHash: js.Any, key: String): Unit = js.native
  /**
    * Use this method to dispose survey model properly.
    */
  def dispose(): Unit = js.native
  /**
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
    * It calls `navigateToUrl` after calling `onComplete` event.
    * In case calling `options.showDataSaving` callback in the `onComplete` event, `navigateToUrl` is used on calling `options.showDataSavingSuccess` callback.
    * @see completeLastPage
    * @see cookieName
    * @see state
    * @see onComplete
    * @see surveyPostId
    * @see completeLastPage
    * @see navigateToUrl
    * @see navigateToUrlOnCondition
    */
  def doComplete(): Unit = js.native
  def doComplete(isCompleteOnTrigger: Boolean): Unit = js.native
  /* protected */ def doCurrentPageComplete(doComplete: Boolean): Boolean = js.native
  /* protected */ def doNextPage(): Unit = js.native
  /* protected */ def doOnPageAdded(page: PageModel): Unit = js.native
  /* protected */ def doServerValidation(): Boolean = js.native
  /* protected */ def doTimer(): Unit = js.native
  def downloadFile(name: String, content: String, callback: js.Function2[/* status */ String, /* data */ js.Any, _]): js.Any = js.native
  /**
    * Downloads a file from server
    * @param name a question name
    * @param fileValue a single file question value
    * @param callback a call back function to get the status on downloading the file and the downloaded file content
    */
  def downloadFile(
    questionName: String,
    fileValue: js.Any,
    callback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): Unit = js.native
  def dragAndDropAllow(options: js.Any): Boolean = js.native
  def dynamicPanelAdded(question: IQuestion): js.Any = js.native
  @JSName("dynamicPanelAdded")
  def dynamicPanelAdded_Unit(question: IQuestion): Unit = js.native
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  @JSName("dynamicPanelItemValueChanged")
  def dynamicPanelItemValueChanged_Unit(question: IQuestion, options: js.Any): Unit = js.native
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any = js.native
  @JSName("dynamicPanelRemoved")
  def dynamicPanelRemoved_Unit(question: IQuestion, panelIndex: Double, panel: IPanel): Unit = js.native
  /**
    * Checks whether survey elements (pages, panels, and questions) have unique question names.
    * You can check for unique names for individual page and panel (and all their elements) or a question.
    * If the parameter is not specified, then a survey checks that all its elements have unique names.
    * @param element page, panel or question, it is `null` by default, that means all survey elements will be checked
    */
  def ensureUniqueNames(): Unit = js.native
  def ensureUniqueNames(element: ISurveyElement): Unit = js.native
  /**
    * Sets the input focus to the first question with the input field.
    */
  def focusFirstQuestion(): Unit = js.native
  /**
    * Returns a list of all survey's panels.
    */
  def getAllPanels(): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: js.UndefOr[scala.Nothing], includingDesignTime: Boolean): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: Boolean): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  /**
    * Returns a list of all questions in a survey.
    * @param visibleOnly set it `true`, if you want to get only visible questions
    */
  def getAllQuestions(): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: js.UndefOr[scala.Nothing], includingDesignTime: Boolean): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: Boolean): js.Array[Question] = js.native
  def getAllQuestions(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[Question] = js.native
  /**
    * Returns an amount of corrected quiz answers.
    */
  def getCorrectedAnswerCount(): Double = js.native
  def getCorrectedAnswers(): Double = js.native
  def getCss(): js.Any = js.native
  def getDataValueCore(valuesHash: js.Any, key: String): js.Any = js.native
  /**
    * Returns an amount of incorrect quiz answers.
    */
  def getInCorrectedAnswerCount(): Double = js.native
  def getInCorrectedAnswers(): Double = js.native
  def getLocString(str: String): js.Any = js.native
  def getNavigateToUrl(): String = js.native
  def getPage(index: Double): PageModel = js.native
  /**
    * Returns a page on which an element (question or panel) is placed.
    * @param element Question or Panel
    */
  def getPageByElement(element: IElement): PageModel = js.native
  /**
    * Returns a page by it's name.
    * @param name
    */
  def getPageByName(name: String): PageModel = js.native
  /**
    * Returns a page on which a question is located.
    * @param question
    */
  def getPageByQuestion(question: IQuestion): PageModel = js.native
  /**
    * Returns a list of pages by their names.
    * @param names a list of page names
    */
  def getPagesByNames(names: js.Array[String]): js.Array[PageModel] = js.native
  /**
    * Returns a panel by its name.
    * @param name a panel name
    * @param caseInsensitive
    * @see getQuestionByName
    */
  def getPanelByName(name: String): IPanel = js.native
  def getPanelByName(name: String, caseInsensitive: Boolean): IPanel = js.native
  /**
    * Returns survey result data as an array of plain objects: with question `title`, `name`, `value`, and `displayValue`.
    *
    * For complex questions (like matrix, etc.) `isNode` flag is set to `true` and data contains array of nested objects (rows).
    *
    * Set `options.includeEmpty` to `false` if you want to skip empty answers.
    */
  def getPlainData(): js.Array[_] = js.native
  def getPlainData(options: IncludeEmpty): js.Array[_] = js.native
  /**
    * Returns the progress that a user made while going through the survey.
    */
  def getProgress(): Double = js.native
  /**
    * Returns a question by its name.
    * @param name a question name
    * @param caseInsensitive
    * @see getQuestionByValueName
    */
  def getQuestionByName(name: String): Question = js.native
  def getQuestionByName(name: String, caseInsensitive: Boolean): Question = js.native
  /**
    * Returns a question by its value name
    * @param valueName a question name
    * @param caseInsensitive
    * @see getQuestionByName
    * @see Question.valueName
    */
  def getQuestionByValueName(valueName: String): IQuestion = js.native
  def getQuestionByValueName(valueName: String, caseInsensitive: Boolean): IQuestion = js.native
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion = js.native
  def getQuestionTitlePatternOptions(): js.Array[_] = js.native
  /**
    * Gets a list of questions by their names.
    * @param names an array of question names
    * @param caseInsensitive
    */
  def getQuestionsByNames(names: js.Array[String]): js.Array[IQuestion] = js.native
  def getQuestionsByNames(names: js.Array[String], caseInsensitive: Boolean): js.Array[IQuestion] = js.native
  /**
    * Returns quiz question number. It may be different from `getQuizQuestions.length` because some widgets like matrix may have several questions.
    * @see getQuizQuestions
    */
  def getQuizQuestionCount(): Double = js.native
  /**
    * Returns quiz questions. All visible questions that has input(s) widgets.
    * @see getQuizQuestionCount
    */
  def getQuizQuestions(): js.Array[IQuestion] = js.native
  /**
    * Calls the [api.surveyjs.io](https://api.surveyjs.io) service and, on callback, fires the `onGetResult` event with all answers that your users made for a question.
    * @param resultId [api.surveyjs.io](https://api.surveyjs.io) service resultId
    * @param name The question name
    * @see onGetResult
    */
  def getResult(resultId: String, name: String): Unit = js.native
  def getSurveyMarkdownHtml(element: Base, text: String): String = js.native
  /* protected */ def getUnbindValue(value: js.Any): js.Any = js.native
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String = js.native
  /**
    * Returns an array of locales that are used in the current survey.
    */
  def getUsedLocales(): js.Array[String] = js.native
  /**
    * Returns `true`, if any of the survey pages contains errors.
    * @param fireCallback set it to `true`, to show errors in UI.
    * @param focusOnFirstError set it to `true` to focus on the first question that doesn't pass the validation and make the page, where the question is located, the current.
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: js.UndefOr[scala.Nothing], focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean): Boolean = js.native
  def hasVisibleQuestionByValueName(valueName: String): Boolean = js.native
  def isPageStarted(page: IPage): Boolean = js.native
  /**
    * Loads the survey JSON from the [api.surveyjs.io](https://api.surveyjs.io) service.
    * If `clientId` is not `null` and a user had completed a survey before, the survey switches to `completedbefore` state.
    * @param surveyId [api.surveyjs.io](https://api.surveyjs.io) service surveyId
    * @param clientId users' indentifier, for example an e-mail or a unique customer id in your web application.
    * @see state
    * @see onLoadedSurveyFromService
    */
  def loadSurveyFromService(): Unit = js.native
  def loadSurveyFromService(surveyId: js.UndefOr[scala.Nothing], cliendId: String): Unit = js.native
  def loadSurveyFromService(surveyId: String): Unit = js.native
  def loadSurveyFromService(surveyId: String, cliendId: String): Unit = js.native
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any = js.native
  @JSName("matrixAfterCellRender")
  def matrixAfterCellRender_Unit(question: IQuestion, options: js.Any): Unit = js.native
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean = js.native
  def matrixBeforeRowAdded(options: js.Any): Unit = js.native
  def matrixBeforeRowAdded(options: CanAddRow): js.Any = js.native
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any = js.native
  @JSName("matrixCellCreated")
  def matrixCellCreated_Unit(question: IQuestion, options: js.Any): Unit = js.native
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError = js.native
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  @JSName("matrixCellValueChanged")
  def matrixCellValueChanged_Unit(question: IQuestion, options: js.Any): Unit = js.native
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any = js.native
  @JSName("matrixCellValueChanging")
  def matrixCellValueChanging_Unit(question: IQuestion, options: js.Any): Unit = js.native
  def matrixRowAdded(question: IQuestion, row: js.Any): js.Any = js.native
  @JSName("matrixRowAdded")
  def matrixRowAdded_Unit(question: IQuestion, row: js.Any): Unit = js.native
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any = js.native
  @JSName("matrixRowRemoved")
  def matrixRowRemoved_Unit(question: IQuestion, rowIndex: Double, row: js.Any): Unit = js.native
  /**
    * Merge the values into survey.data. It works as survey.data, except it doesn't clean the existing data, but overrides them.
    * @param data data to merge. It should be an object {keyValue: Value, ...}
    * @see data
    * @see setValue
    */
  def mergeData(data: js.Any): Unit = js.native
  def mergeValues(src: js.Any, dest: js.Any): Unit = js.native
  def navigationMouseDown(): Boolean = js.native
  /**
    * Navigates user to the next page.
    *
    * Returns `false` in the following cases:
    *
    * - if the current page is the last page.
    * - if the current page contains errors (for example, a required question is empty).
    * @see isCurrentPageHasErrors
    * @see prevPage
    * @see completeLastPage
    */
  def nextPage(): Boolean = js.native
  /* protected */ def notifyQuestionOnValueChanged(valueName: String, newValue: js.Any): Unit = js.native
  /* protected */ def onBeforeCreating(): Unit = js.native
  /* protected */ def onCreating(): Unit = js.native
  /* protected */ def onFirstPageIsStartedChanged(): Unit = js.native
  /* protected */ def onIsValidatingOnServerChanged(): Unit = js.native
  /* protected */ def onLoadSurveyFromService(): Unit = js.native
  /* protected */ def onLoadingSurveyFromService(): Unit = js.native
  /* protected */ def onLocaleChanged(): Unit = js.native
  /* protected */ def onQuestionsOnPageModeChanged(oldValue: String): Unit = js.native
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any = js.native
  @JSName("pageVisibilityChanged")
  def pageVisibilityChanged_Unit(page: IPage, newValue: Boolean): Unit = js.native
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  @JSName("panelAdded")
  def panelAdded_Unit(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): Unit = js.native
  def panelRemoved(panel: IElement): js.Any = js.native
  @JSName("panelRemoved")
  def panelRemoved_Unit(panel: IElement): Unit = js.native
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any = js.native
  @JSName("panelVisibilityChanged")
  def panelVisibilityChanged_Unit(panel: IPanel, newValue: Boolean): Unit = js.native
  /**
    * Navigates user to a previous page. If the current page is the first page, `prevPage` returns `false`. `prevPage` does not perform any checks, required questions can be empty.
    * @see isFirstPage
    */
  def prevPage(): Boolean = js.native
  def processHtml(html: String): String = js.native
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  @JSName("questionAdded")
  def questionAdded_Unit(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): Unit = js.native
  def questionCountByValueName(valueName: String): Double = js.native
  def questionCreated(question: IQuestion): js.Any = js.native
  /* protected */ def questionOnValueChanging(valueName: String, newValue: js.Any): js.Any = js.native
  def questionRemoved(question: IQuestion): js.Any = js.native
  @JSName("questionRemoved")
  def questionRemoved_Unit(question: IQuestion): Unit = js.native
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any = js.native
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any = js.native
  @JSName("questionVisibilityChanged")
  def questionVisibilityChanged_Unit(question: IQuestion, newValue: Boolean): Unit = js.native
  /**
    * Removes a page from a survey.
    * @param page
    */
  def removePage(page: PageModel): Unit = js.native
  /**
    * Calculates a given expression and returns `true` or `false`.
    * @param expression
    */
  def runCondition(expression: String): Boolean = js.native
  /**
    * Calculates a given expression and returns a result value.
    * @param expression
    */
  def runExpression(expression: String): js.Any = js.native
  def scrollElementToTop(element: ISurveyElement, question: IQuestion, page: IPage, id: String): js.Any = js.native
  def scrollToTopOnPageChange(): Unit = js.native
  /**
    * Sends a survey result to the [api.surveyjs.io](https://api.surveyjs.io) service.
    * @param postId [api.surveyjs.io](https://api.surveyjs.io) service postId
    * @param clientId Typically a customer e-mail or an identifier
    * @param isPartialCompleted Set it to `true` if the survey is not completed yet and the results are intermediate
    * @see surveyPostId
    * @see clientId
    */
  def sendResult(): Unit = js.native
  def sendResult(
    postId: js.UndefOr[scala.Nothing],
    clientId: js.UndefOr[scala.Nothing],
    isPartialCompleted: Boolean
  ): Unit = js.native
  def sendResult(postId: js.UndefOr[scala.Nothing], clientId: String): Unit = js.native
  def sendResult(postId: js.UndefOr[scala.Nothing], clientId: String, isPartialCompleted: Boolean): Unit = js.native
  def sendResult(postId: String): Unit = js.native
  def sendResult(postId: String, clientId: js.UndefOr[scala.Nothing], isPartialCompleted: Boolean): Unit = js.native
  def sendResult(postId: String, clientId: String): Unit = js.native
  def sendResult(postId: String, clientId: String, isPartialCompleted: Boolean): Unit = js.native
  /**
    * Sets a comment value.
    * @param name A comment name.
    * @param newValue A new comment value.
    * @see getComment
    */
  def setComment(name: String, newValue: String): Unit = js.native
  /* protected */ def setCompletedState(value: String, text: String): Unit = js.native
  /**
    * Set the cookie with `cookieName` in user's browser. It is done automatically on survey complete if the `cookieName` property value is not empty.
    * @see cookieName
    * @see hasCookie
    * @see deleteCookie
    */
  def setCookie(): Unit = js.native
  def setDataCore(data: js.Any): Unit = js.native
  def setDataValueCore(valuesHash: js.Any, key: String, value: js.Any): Unit = js.native
  /**
    * Sets the survey into design mode.
    * @param value use true to set the survey into the design mode.
    */
  def setDesignMode(value: Boolean): Unit = js.native
  def setJsonObject(jsonObj: js.Any): Unit = js.native
  /**
    * Sets a question value (answer). It runs all triggers and conditions (`visibleIf` properties).
    *
    * Goes to the next page if `goNextPageAutomatic` is `true` and all questions on the current page are answered correctly.
    * @param name A question name
    * @param newValue A new question value
    * @see data
    * @see getValue
    * @see PageModel.visibleIf
    * @see Question.visibleIf
    * @see goNextPageAutomatic
    */
  def setValue(name: String, newQuestionValue: js.Any): Unit = js.native
  def setValue(
    name: String,
    newQuestionValue: js.Any,
    locNotification: js.UndefOr[scala.Nothing],
    allowNotifyValueChanged: Boolean
  ): Unit = js.native
  /**
    * Show preview for the survey. Go to the "preview" state
    * @see showPreviewBeforeComplete
    * @see cancelPreview
    * @see state
    */
  def showPreview(): Boolean = js.native
  /**
    * Starts the survey. Changes the survey mode from "starting" to "running". Call this function if your survey has a start page, otherwise this function does nothing.
    * @see firstPageIsStarted
    */
  def start(): Boolean = js.native
  /**
    * Starts a timer that will calculate how much time end-user spends on the survey or on pages.
    * @see stopTimer
    * @see timeSpent
    */
  def startTimer(): Unit = js.native
  def startTimerFromUI(): Unit = js.native
  /**
    * Stops the timer.
    * @see startTimer
    * @see timeSpent
    */
  def stopTimer(): Unit = js.native
  /* protected */ def tryGoNextPageAutomatic(name: String): Unit = js.native
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_ | ItemValue], serverResult: js.Any): js.Array[ItemValue] = js.native
  /* protected */ def updateCustomWidgets(page: PageModel): Unit = js.native
  /* protected */ def updateElementCss(): Unit = js.native
  def updatePageCssClasses(page: IPage, cssClasses: js.Any): Unit = js.native
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  @JSName("updatePanelCssClasses")
  def updatePanelCssClasses_Unit(panel: IPanel, cssClasses: js.Any): Unit = js.native
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any = js.native
  @JSName("updateQuestionCssClasses")
  def updateQuestionCssClasses_Unit(question: IQuestion, cssClasses: js.Any): Unit = js.native
  /* protected */ def updateQuestionValue(valueName: String, newValue: js.Any): Unit = js.native
  def uploadFiles(
    question: IQuestion,
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  /* protected */ def uploadFilesCore(
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): Unit = js.native
  /**
    * Uploads a file to server.
    * @param question a file question object
    * @param name a question name
    * @param file an uploaded file
    * @param storeDataAsText set it to `true` to encode file content into the survey results
    * @param uploadingCallback a call back function to get the status on uploading the file
    */
  @JSName("uploadFiles")
  def uploadFiles_Unit(
    question: IQuestion,
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): Unit = js.native
  def validatePanel(panel: IPanel): SurveyError = js.native
  def validateQuestion(question: IQuestion): SurveyError = js.native
}

/* static members */
@JSImport("survey-knockout", "SurveyModel")
@js.native
object SurveyModel extends js.Object {
  var platform: String = js.native
}

