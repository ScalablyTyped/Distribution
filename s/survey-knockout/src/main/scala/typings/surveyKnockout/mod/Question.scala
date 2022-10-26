package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.`false`
import typings.surveyKnockout.surveyKnockoutStrings.`true`
import typings.surveyKnockout.surveyKnockoutStrings.both
import typings.surveyKnockout.surveyKnockoutStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IShortcutText because Already inherited
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IElement because var conflicts: containsErrors, isCollapsed, isExpanded, isPage, isPanel, isReadOnly, isVisible, maxWidth, minWidth, name, parent, renderWidth, rightIndent, shortcutText, skeletonComponentName, width. Inlined visible, startWithNewLine, getPanel, getLayoutType, isLayoutTypeSupported, removeElement, onAnyValueChanged, clearIncorrectValues, clearErrors, needResponsiveWidth
- typings.surveyKnockout.mod.ITitleOwner because var conflicts: locTitle, name. Inlined no, requiredText, isRequireTextOnStart, isRequireTextBeforeTitle, isRequireTextAfterTitle
- typings.surveyKnockout.mod.IQuestion because var conflicts: containsErrors, hasTitle, isCollapsed, isExpanded, isPage, isPanel, isReadOnly, isVisible, maxWidth, minWidth, name, parent, renderWidth, rightIndent, shortcutText, skeletonComponentName, survey, width. Inlined isEmpty, onSurveyValueChanged, updateValueFromSurvey, updateCommentFromSurvey, supportGoNextPageAutomatic, clearUnusedValues, getDisplayValue, getValueName, clearValue, clearValueIfInvisible, isAnswerCorrect, updateValueWithDefaults, getQuestionFromArray, value */ @JSImport("survey-knockout", "Question")
@js.native
open class Question protected ()
  extends SurveyElement[Question]
     with IValidatorOwner
     with ISurveyErrorOwner
     with IConditionRunner {
  def this(name: String) = this()
  
  def addConditionObjectsByContext(objects: Any, context: Any): Unit = js.native
  
  def addError(error: String): Unit = js.native
  def addError(error: SurveyError): Unit = js.native
  
  def afterRender(el: Any): Unit = js.native
  
  def afterRenderQuestionCallback(question: Question, element: Any): Any = js.native
  
  def afterRenderQuestionElement(el: Any): Unit = js.native
  
  /* protected */ var allowNotifyValueChanged: Boolean = js.native
  
  def ariaDescribedBy: String = js.native
  
  def ariaInvalid: `true` | `false` = js.native
  
  def ariaRequired: `true` | `false` = js.native
  
  def ariaRole: String = js.native
  
  def beforeDestroyQuestionElement(el: Any): Unit = js.native
  
  /* protected */ def canCollectErrors(): Boolean = js.native
  
  /* protected */ def canRunValidators(isOnValueChanged: Boolean): Boolean = js.native
  
  /* protected */ def canSetValueToSurvey(): Boolean = js.native
  
  /* protected */ def checkForResponsiveness(el: Any): Unit = js.native
  
  def choicesLoaded(): Unit = js.native
  
  def clearErrors(): Any = js.native
  /*
    * Empties the `errors` array.
    */
  @JSName("clearErrors")
  def clearErrors_Unit(): Unit = js.native
  
  /*
    * Specifies when to clear the question value if the question becomes invisible.
    * 
    * Possible values:
    * 
    * - `"default"` (default) - Inherits the setting from the Survey's [`clearInvisibleValues`](https://surveyjs.io/form-library/documentation/surveymodel#clearInvisibleValues) property.
    * - `"onHidden"` - Clears the value when the question becomes invisible. If a question is invisible on startup and has an initial value, this value will be cleared when the survey is complete.
    * - `"onComplete"` - Clears the value when the survey is complete.
    * - `"none"` - Never clears the value of an invisible question.
    */
  def clearIfInvisible: String = js.native
  def clearIfInvisible_=(`val`: String): Unit = js.native
  
  def clearIncorrectValues(): Any = js.native
  /*
    * Removes values that cannot be assigned to this question, for example, choices unlisted in the `choices` array.
    * 
    * Call this method after you assign new question values in code to ensure that they are acceptable.
    * 
    * > NOTE: This method does not remove values that do not pass validation. Call the `hasErrors()` method to validate newly assigned values.
    */
  @JSName("clearIncorrectValues")
  def clearIncorrectValues_Unit(): Unit = js.native
  
  def clearOnDeletingContainer(): Unit = js.native
  
  def clearUnusedValues(): Any = js.native
  @JSName("clearUnusedValues")
  def clearUnusedValues_Unit(): Unit = js.native
  
  def clearValue(): Any = js.native
  
  def clearValueIfInvisible(): Any = js.native
  def clearValueIfInvisible(reason: String): Unit = js.native
  
  /* protected */ def clearValueIfInvisibleCore(): Unit = js.native
  
  @JSName("clearValueIfInvisible")
  def clearValueIfInvisible_Unit(): Unit = js.native
  
  /*
    * Sets the question's `value` and `comment` properties to `undefined`.
    */
  @JSName("clearValue")
  def clearValue_Unit(): Unit = js.native
  
  /*
    * A comment to the selected question value. Enable the `showCommentArea` property to allow users to leave comments.
    */
  def comment: String = js.native
  
  var commentChangedCallback: Any = js.native
  
  var commentElement: Any = js.native
  
  def commentOrOtherPlaceholder: String = js.native
  
  def commentPlaceHolder: String = js.native
  def commentPlaceHolder_=(`val`: String): Unit = js.native
  
  /*
    * A placeholder for the comment area. Applies when the `showCommentArea` property is `true`.
    */
  def commentPlaceholder: String = js.native
  def commentPlaceholder_=(`val`: String): Unit = js.native
  
  /*
    * Specifies a caption displayed above the comment area. Applies when the `showCommentArea` property is `true`.
    */
  def commentText: String = js.native
  def commentText_=(`val`: String): Unit = js.native
  
  def comment_=(`val`: String): Unit = js.native
  
  /* protected */ def convertDefaultValue(`val`: Any): Any = js.native
  
  /*
    * A correct answer to this question. Specify this property if you want to [create a quiz](https://surveyjs.io/form-library/documentation/design-survey-create-a-quiz).
    */
  def correctAnswer: Any = js.native
  
  def correctAnswerCount: Double = js.native
  
  def correctAnswer_=(`val`: Any): Unit = js.native
  
  def createValueCopy(): Any = js.native
  
  def cssContent: String = js.native
  
  def cssDescription: String = js.native
  
  def cssHeader: String = js.native
  
  def cssRoot: String = js.native
  
  def currentErrorCount: Double = js.native
  
  def customWidget: QuestionCustomWidget = js.native
  
  var customWidgetData: Any = js.native
  
  var customWidgetValue: QuestionCustomWidget = js.native
  
  /*
    * A default value for the question. Ignored for question types that cannot have a [value](https://surveyjs.io/form-library/documentation/question#value) (for example, HTML).
    * 
    * The default value is used as a question value in the following cases:
    * 
    * - While the survey is being loaded from JSON.
    * - The question is just added to the survey and does not yet have an answer.
    * - The respondent left the answer empty.
    */
  def defaultValue: Any = js.native
  
  /*
    * An expression used to calculate the [defaultValue](https://surveyjs.io/form-library/documentation/question#defaultValue).
    * 
    * This expression applies until the question [value](https://surveyjs.io/form-library/documentation/question#value) is specified by an end user or programmatically.
    * 
    * An expression can reference other questions as follows:
    * 
    * - `{other_question_name}`
    * - `{panel.other_question_name}` (to access questions inside the same dynamic panel)
    * - `{row.other_question_name}` (to access questions inside the same dynamic matrix or multi-column dropdown)
    * 
    * An expression can also include built-in and custom functions for advanced calculations. For example, if the `defaultValue` should be today's date, set the `defaultValueExpression` to `"today()"`, and the corresponding built-in function will be executed each time the survey is loaded. Refer to the following help topic for more information: [Built-In Functions](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#built-in-functions).
    */
  def defaultValueExpression: Any = js.native
  def defaultValueExpression_=(`val`: Any): Unit = js.native
  
  var defaultValueRunner: ExpressionRunner = js.native
  
  def defaultValue_=(`val`: Any): Unit = js.native
  
  /*
    * Specifies where to display a question description.
    * 
    * Possible values:
    * 
    * - `"default"` (default) - Inherits the setting from the Survey's [`questionDescriptionLocation`](https://surveyjs.io/form-library/documentation/surveymodel#questionDescriptionLocation) property.
    * - `"underTitle"` - Displays the description under the question title.
    * - `"underInput"` - Displays the description under the interactive area.
    */
  def descriptionLocation: String = js.native
  def descriptionLocation_=(`val`: String): Unit = js.native
  
  def displayValue: Any = js.native
  
  def displayValueCallback(text: String): String = js.native
  
  /*
    * A Boolean expression. If it evaluates to `false`, this question becomes read-only.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility)
    */
  def enableIf: String = js.native
  def enableIf_=(`val`: String): Unit = js.native
  
  def errorLocation: String = js.native
  
  /* protected */ def fireCallback(callback: Any): Unit = js.native
  
  /*
    * Moves focus to the input field of this question.
    */
  def focus(): Unit = js.native
  def focus(onError: Boolean): Unit = js.native
  
  var focusCallback: Any = js.native
  
  var focusIn: Any = js.native
  
  def fullTitle: String = js.native
  
  def getAllErrors(): js.Array[SurveyError] = js.native
  
  def getAllValues(): Any = js.native
  
  /* protected */ def getCompactRenderAs(): String = js.native
  
  def getComponentName(): String = js.native
  
  def getConditionJson(): Any = js.native
  def getConditionJson(operator: String): Any = js.native
  def getConditionJson(operator: String, path: String): Any = js.native
  def getConditionJson(operator: Unit, path: String): Any = js.native
  
  /* protected */ def getCorrectAnswerCount(): Double = js.native
  
  /* protected */ def getCssContent(cssClasses: Any): String = js.native
  
  /* protected */ def getCssDescription(cssClasses: Any): String = js.native
  
  /* protected */ def getCssError(cssClasses: Any): String = js.native
  
  /* protected */ def getCssHeader(cssClasses: Any): String = js.native
  
  /* protected */ def getCssRoot(cssClasses: Any): String = js.native
  
  /* protected */ def getCssTitle(cssClasses: Any): String = js.native
  
  /* protected */ def getCssType(): String = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredProperties(): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredValues(): Any = js.native
  
  /* protected */ def getDefaultRunner(runner: ExpressionRunner, expression: String): ExpressionRunner = js.native
  
  def getDefaultValue(): Any = js.native
  
  /* protected */ def getDesktopRenderAs(): String = js.native
  
  /*
    * Returns a display text that corresponds to the question value. For example, if you call this method for a Dropdown question, it returns an item text instead of an item value.
    */
  def getDisplayValue(keysAsText: Boolean): Any = js.native
  def getDisplayValue(keysAsText: Boolean, value: Any): Any = js.native
  
  /* protected */ def getDisplayValueCore(keyAsText: Boolean, value: Any): Any = js.native
  
  /* protected */ def getDisplayValueEmpty(): String = js.native
  
  def getErrorByType(errorType: String): SurveyError = js.native
  
  /* CompleteClass */
  override def getErrorCustomText(text: String, error: SurveyError): String = js.native
  
  /* protected */ def getFirstErrorInputElementId(): String = js.native
  
  /* protected */ def getFirstInputElementId(): String = js.native
  
  def getFirstQuestionToFocus(withError: Boolean): Question = js.native
  
  /* protected */ def getIsAnswered(): Boolean = js.native
  
  /* protected */ def getIsRunningValidators(): Boolean = js.native
  
  def getLayoutType(): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* protected */ def getObservedElementSelector(): String = js.native
  
  def getOthersMaxLength(): Any = js.native
  
  def getPanel(): IPanel = js.native
  
  /*
    * Returns the question value as an object in which the question name, title, value, and other parameters are stored as individual properties.
    * 
    * If the question can have more than one value (Matrix, Multiple Text), the object enables the `isNode` flag and stores information about these values in the `data` property. Refer to the following help topic for more information: [Access Full Survey Results](https://surveyjs.io/form-library/documentation/handle-survey-results-access#access-full-survey-results).
    * 
    * Pass an object with the `includeEmpty` property set to `false` if you want to skip empty answers.
    */
  def getPlainData(): Any = js.native
  def getPlainData(options: Any): Any = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* protected */ def getProcessedTextValue(textValue: TextPreProcessorValue): Unit = js.native
  
  /* protected */ def getQuestionComment(): String = js.native
  
  def getQuestionFromArray(name: String, index: Double): IQuestion = js.native
  
  /* protected */ def getQuizQuestionCount(): Double = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def getRootCss(): String = js.native
  
  /* protected */ def getStartIndex(): String = js.native
  
  def getSupportedValidators(): js.Array[Any] = js.native
  
  /*
    * Returns title location calculated based on the question's `titleLocation` property and the `questionTitleLocation` property of the question's containers (survey, page, or panel).
    */
  def getTitleLocation(): String = js.native
  
  /* protected */ def getTitleLocationCore(): String = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  /* protected */ def getUnbindValue(value: Any): Any = js.native
  
  /* CompleteClass */
  override def getValidatorTitle(): String = js.native
  
  /* CompleteClass */
  override def getValidators(): js.Array[SurveyValidator] = js.native
  
  /* protected */ def getValueCore(): Any = js.native
  
  def getValueName(): String = js.native
  
  def hasComment: Boolean = js.native
  def hasComment_=(`val`: Boolean): Unit = js.native
  
  def hasDescriptionUnderInput: Boolean = js.native
  
  def hasDescriptionUnderTitle: Boolean = js.native
  
  /*
    * Returns true if there is a validation error(s) in the question.
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, rec: Any): Boolean = js.native
  def hasErrors(fireCallback: Unit, rec: Any): Boolean = js.native
  
  /*
    * Returns `false` if the question has no input fields ([HTML](https://surveyjs.io/form-library/documentation/questionhtmlmodel), [Image](https://surveyjs.io/form-library/documentation/questionimagemodel), and similar question types).
    */
  def hasInput: Boolean = js.native
  
  def hasOther: Boolean = js.native
  
  /* protected */ def hasOtherChanged(): Unit = js.native
  
  def hasOther_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def hasRequiredError(): Boolean = js.native
  
  /*
    * Returns `false` if the question has no input fields ([HTML](https://surveyjs.io/form-library/documentation/questionhtmlmodel), [Image](https://surveyjs.io/form-library/documentation/questionimagemodel)) or has multiple input fields ([Matrix](https://surveyjs.io/form-library/documentation/questionmatrixmodel), [Multiple Text](https://surveyjs.io/form-library/documentation/questionmultipletextmodel)).
    */
  def hasSingleInput: Boolean = js.native
  
  def hasTitleOnBottom: Boolean = js.native
  
  def hasTitleOnLeft: Boolean = js.native
  
  def hasTitleOnLeftTop: Boolean = js.native
  
  def hasTitleOnTop: Boolean = js.native
  
  /*
    * Hides the question number from the title and excludes the question from numbering.
    * 
    * If you want to disable question numbering in the entire survey, set SurveyModel's `showQuestionNumbers` property to `false`.
    */
  def hideNumber: Boolean = js.native
  def hideNumber_=(`val`: Boolean): Unit = js.native
  
  /*
    * A value to assign to the `id` attribute of the rendered HTML element. A default `id` is generated automatically.
    */
  def id: String = js.native
  def id_=(`val`: String): Unit = js.native
  
  /* protected */ def initCommentFromSurvey(): Unit = js.native
  
  /* protected */ def initDataFromSurvey(): Unit = js.native
  
  def inputId: String = js.native
  
  /*
    * Returns `true` if the question can display its title to the left of the input field.
    */
  def isAllowTitleLeft: Boolean = js.native
  
  def isAnswerCorrect(): Boolean = js.native
  
  def isAnswered: Boolean = js.native
  def isAnswered_=(`val`: Boolean): Unit = js.native
  
  var isChangingViaDefaultValue: Boolean = js.native
  
  /* protected */ def isClearValueOnHidden: Boolean = js.native
  
  def isCompositeQuestion: Boolean = js.native
  
  var isCustomWidgetRequested: Boolean = js.native
  
  def isDefaultRendering(): Boolean = js.native
  
  /* protected */ def isDefaultValueEmpty(): Boolean = js.native
  
  /*
    * Returns `true` if the question value is an empty string, array, or object or if it equals `undefined` or `null`.
    */
  def isEmpty(): Boolean = js.native
  
  def isFlowLayout: Boolean = js.native
  
  def isInputReadOnly: Boolean = js.native
  
  def isInputTextUpdate: Boolean = js.native
  
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  
  var isMobile: Boolean = js.native
  
  /*
    * Returns `true` if a parent element (page or panel) is visible.
    */
  def isParentVisible: Boolean = js.native
  
  def isReadOnlyRenderDiv(): Boolean = js.native
  
  @JSName("isReadOnly")
  def isReadOnly_MQuestion: Boolean = js.native
  
  def isReady: Boolean = js.native
  
  /* protected */ var isReadyValue: Boolean = js.native
  
  def isRequireTextAfterTitle: Boolean = js.native
  @JSName("isRequireTextAfterTitle")
  var isRequireTextAfterTitle_FQuestion: Boolean = js.native
  
  def isRequireTextBeforeTitle: Boolean = js.native
  @JSName("isRequireTextBeforeTitle")
  var isRequireTextBeforeTitle_FQuestion: Boolean = js.native
  
  def isRequireTextOnStart: Boolean = js.native
  @JSName("isRequireTextOnStart")
  var isRequireTextOnStart_FQuestion: Boolean = js.native
  
  /*
    * Makes the question required. If a respondent skips a required question, the survey displays a validation error.
    */
  def isRequired: Boolean = js.native
  def isRequired_=(`val`: Boolean): Unit = js.native
  
  def isRunningValidators: Boolean = js.native
  
  var isRunningValidatorsValue: Boolean = js.native
  
  def isSurveyInputTextUpdate: Boolean = js.native
  
  /* protected */ def isTextValue(): Boolean = js.native
  
  var isValueChangedDirectly: Boolean = js.native
  
  var isValueChangedInSurvey: Boolean = js.native
  
  /* protected */ def isValueExpression(`val`: Any): Boolean = js.native
  
  /* protected */ def isValueSurveyElement(`val`: Any): Boolean = js.native
  
  /*
    * Returns `true` if the question is visible or the survey is currently in design mode.
    * 
    * If you want to display or hide a question based on a condition, specify the [`visibleIf`](https://surveyjs.io/form-library/documentation/question#visibleIf) property. Refer to the following help topic for information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  @JSName("isVisible")
  def isVisible_MQuestion: Boolean = js.native
  
  def locCommentPlaceholder: LocalizableString = js.native
  
  def locCommentText: LocalizableString = js.native
  
  var locProcessedTitle: LocalizableString = js.native
  
  def locRequiredErrorText: LocalizableString = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  var localeChangedCallback: Any = js.native
  
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: Any): Boolean = js.native
  
  def needResponsiveWidth(): Boolean = js.native
  
  /* protected */ def needResponsiveness(): Boolean = js.native
  
  /*
    * A question number or letter (depends on SurveyModel's `questionStartIndex` property).
    * 
    * For invisible questions, this property returns an empty string.
    */
  def no: String = js.native
  @JSName("no")
  var no_FQuestion: String = js.native
  
  def onAnyValueChanged(name: String): Any = js.native
  @JSName("onAnyValueChanged")
  def onAnyValueChanged_Unit(name: String): Unit = js.native
  
  /* protected */ def onChangeQuestionValue(newValue: Any): Unit = js.native
  
  /* protected */ def onCheckForErrors(errors: Any, isOnValueChanged: Boolean): Unit = js.native
  
  def onCommentChange(event: Any): Unit = js.native
  
  def onCommentInput(event: Any): Unit = js.native
  
  def onCompletedAsyncValidators(hasErrors: Boolean): Unit = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  var onGetSurvey: Any = js.native
  
  var onMobileChangedCallback: Any = js.native
  
  /* protected */ def onParentChanged(): Unit = js.native
  
  /*
    * An event that is raised when the question's ready state has changed (expressions are evaluated, choices are loaded from a web resource specified by the `choicesByUrl` property, etc.).
    * 
    * Parameters:
    * 
    * - `sender` - A survey that contains the question whose ready state has changed.
    * - `options.isReady` - A Boolean value that indicates whether the question is ready.
    * - `options.oldIsReady` - A Boolean value that indicates the previous ready state.
    */
  var onReadyChanged: EventBase[Question] = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  def onSurveyValueChanged(newValue: Any): Any = js.native
  @JSName("onSurveyValueChanged")
  def onSurveyValueChanged_Unit(newValue: Any): Unit = js.native
  
  /* protected */ def onValueChanged(): Unit = js.native
  
  /* protected */ def onValueNameChanged(oldValue: String): Unit = js.native
  
  /* protected */ def onVisibleChanged(): Unit = js.native
  
  /*
    * Returns a page to which the question belongs and allows you to move this question to a different page.
    */
  def page: IPage = js.native
  def page_=(`val`: IPage): Unit = js.native
  
  /*
    * Returns a survey element (panel or page) that contains the question and allows you to move this question to a different survey element.
    */
  @JSName("parent")
  def parent_MQuestion: IPanel = js.native
  
  /* protected */ def processResponsiveness(requiredWidth: Double, availableWidth: Double): Any = js.native
  
  def processedTitle: String = js.native
  
  var questionTitleTemplateCallback: Any = js.native
  
  /*
    * The number of quiz questions. A question counts if it is visible, has an input field, and specifies `correctAnswer`.
    */
  def quizQuestionCount: Double = js.native
  
  /* protected */ def raiseOnCompletedAsyncValidators(): Unit = js.native
  
  def removeElement(element: IElement): Boolean = js.native
  
  def removeError(error: SurveyError): Unit = js.native
  
  var renderAs: String = js.native
  
  def renderCssRoot: String = js.native
  
  def renderedInputDisabled: String = js.native
  
  def renderedInputReadOnly: String = js.native
  
  def requireUpdateCommentValue: Boolean = js.native
  
  /*
    * Specifies a custom error message for a required form field.
    */
  def requiredErrorText: String = js.native
  def requiredErrorText_=(`val`: String): Unit = js.native
  
  /*
    * A Boolean expression. If it evaluates to `true`, this question becomes required.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility)
    */
  def requiredIf: String = js.native
  def requiredIf_=(`val`: String): Unit = js.native
  
  /*
    * Returns a character or text string that indicates a required question.
    */
  def requiredText: String = js.native
  @JSName("requiredText")
  var requiredText_FQuestion: String = js.native
  
  var resizeObserver: Any = js.native
  
  def resizeStyle: none | both = js.native
  
  /* CompleteClass */
  override def runCondition(values: Any, properties: Any): Any = js.native
  
  /* protected */ def runExpression(expression: String): Any = js.native
  
  /* protected */ def runValidators(): js.Array[SurveyError] = js.native
  
  /* protected */ def setCssContent(`val`: String): Unit = js.native
  
  /* protected */ def setCssDescription(`val`: String): Unit = js.native
  
  /* protected */ def setCssError(`val`: String): Unit = js.native
  
  /* protected */ def setCssHeader(`val`: String): Unit = js.native
  
  /* protected */ def setCssRoot(`val`: String): Unit = js.native
  
  /* protected */ def setCssTitle(`val`: String): Unit = js.native
  
  /* protected */ def setDefaultValue(): Unit = js.native
  
  /* protected */ def setNewComment(newValue: String): Unit = js.native
  
  /* protected */ def setNewValue(newValue: Any): Unit = js.native
  
  /* protected */ def setNewValueInData(newValue: Any): Unit = js.native
  
  /* protected */ def setQuestionComment(newValue: String): Unit = js.native
  
  /* protected */ def setQuestionValue(newValue: Any): Unit = js.native
  /* protected */ def setQuestionValue(newValue: Any, updateIsAnswered: Boolean): Unit = js.native
  
  /* protected */ def setValueAndRunExpression(runner: ExpressionRunner, defaultValue: Any, setFunc: js.Function1[/* val */ Any, Unit]): Unit = js.native
  /* protected */ def setValueAndRunExpression(
    runner: ExpressionRunner,
    defaultValue: Any,
    setFunc: js.Function1[/* val */ Any, Unit],
    values: Any
  ): Unit = js.native
  /* protected */ def setValueAndRunExpression(
    runner: ExpressionRunner,
    defaultValue: Any,
    setFunc: js.Function1[/* val */ Any, Unit],
    values: Any,
    properties: Any
  ): Unit = js.native
  /* protected */ def setValueAndRunExpression(
    runner: ExpressionRunner,
    defaultValue: Any,
    setFunc: js.Function1[/* val */ Any, Unit],
    values: Unit,
    properties: Any
  ): Unit = js.native
  
  /* protected */ def setValueCore(newValue: Any): Unit = js.native
  
  /*
    * Specifies whether to display a comment area. Incompatible with the `showOtherItem` property.
    */
  def showCommentArea: Boolean = js.native
  def showCommentArea_=(`val`: Boolean): Unit = js.native
  
  def showErrorOnBottom: Boolean = js.native
  
  def showErrorOnCore(location: String): Boolean = js.native
  
  def showErrorOnTop: Boolean = js.native
  
  def showErrorsAboveQuestion: Boolean = js.native
  
  def showErrorsBelowQuestion: Boolean = js.native
  
  /*
    * Specifies whether to display the "Other" choice item. Incompatible with the `showCommentArea` property.
    */
  def showOtherItem: Boolean = js.native
  def showOtherItem_=(`val`: Boolean): Unit = js.native
  
  /*
    * Disable this property if you want to render the current question on the same line or row with the previous question or panel.
    */
  def startWithNewLine: Boolean = js.native
  def startWithNewLine_=(`val`: Boolean): Unit = js.native
  @JSName("startWithNewLine")
  var startWithNewLine_FQuestion: Boolean = js.native
  
  def supportComment(): Boolean = js.native
  
  def supportGoNextPageAutomatic(): Boolean = js.native
  
  def supportGoNextPageError(): Boolean = js.native
  
  def supportOther(): Boolean = js.native
  
  /* protected */ def supportResponsiveness(): Boolean = js.native
  
  def surveyChoiceItemVisibilityChange(): Unit = js.native
  
  var surveyLoadCallback: Any = js.native
  
  /*
    * Sets question title location relative to the input field. Overrides the `questionTitleLocation` property specified for the question's container (survey, page, or panel).
    * 
    * Possible values:
    * 
    * - `"default"` - Inherits the setting from the `questionTitleLocation` property specified for the question's container.
    * - `"top"` - Displays the title above the input field.
    * - `"bottom"` - Displays the title below the input field.
    * - `"left"` - Displays the title to the left of the input field.
    * - `"hidden"` - Hides the question title.
    * 
    * > NOTE: Certain question types (Matrix, Multiple Text) do not support the `"left"` value. For them, the `"top"` value is used.
    */
  def titleLocation: String = js.native
  def titleLocation_=(`val`: String): Unit = js.native
  
  /* protected */ def titlePattern: String = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  def transformToDesktopView(): Unit = js.native
  
  def transformToMobileView(): Unit = js.native
  
  def unbindValue(): Unit = js.native
  
  def updateCommentElement(): Unit = js.native
  
  def updateCommentFromSurvey(newValue: Any): Any = js.native
  
  /* protected */ def updateCssClasses(res: Any, css: Any): Unit = js.native
  
  def updateCustomWidget(): Unit = js.native
  
  /* protected */ def updateIsAnswered(): Unit = js.native
  
  /* protected */ def updateQuestionCss(): Unit = js.native
  /* protected */ def updateQuestionCss(reNew: Boolean): Unit = js.native
  
  def updateValueFromSurvey(newValue: Any): Any = js.native
  @JSName("updateValueFromSurvey")
  def updateValueFromSurvey_Unit(newValue: Any): Unit = js.native
  
  def updateValueWithDefaults(): Any = js.native
  @JSName("updateValueWithDefaults")
  def updateValueWithDefaults_Unit(): Unit = js.native
  
  /*
    * Specifies whether to use display names for question values interpolated in the title. To interpolate question values, use curly brackets (`{}`).
    * 
    * This property is useful when interpolated question values have both the `value` and `text` properties.
    * 
    * Default value: `true`
    */
  def useDisplayValuesInTitle: Boolean = js.native
  def useDisplayValuesInTitle_=(`val`: Boolean): Unit = js.native
  
  var validateValueCallback: Any = js.native
  
  /* CompleteClass */
  var validatedValue: Any = js.native
  @JSName("validatedValue")
  def validatedValue_MQuestion: Any = js.native
  
  var validatorRunner: ValidatorRunner = js.native
  
  /*
    * Question validators.
    */
  def validators: Any = js.native
  def validators_=(`val`: Any): Unit = js.native
  
  /*
    * Gets or sets the question value.
    */
  def value: Any = js.native
  
  var valueChangedCallback: Any = js.native
  
  def valueForSurvey: Any = js.native
  
  /* protected */ def valueFromData(`val`: Any): Any = js.native
  
  def valueFromDataCallback(`val`: Any): Any = js.native
  
  /*
    * Specifies an object property that should store the question value.
    * 
    * Refer to the [Merge Question Values](https://surveyjs.io/form-library/documentation/design-survey-merge-question-values) help topic for more information.
    */
  def valueName: String = js.native
  def valueName_=(`val`: String): Unit = js.native
  
  /* protected */ def valueToData(`val`: Any): Any = js.native
  
  def valueToDataCallback(`val`: Any): Any = js.native
  
  def value_=(`val`: Any): Unit = js.native
  @JSName("value")
  var value_FQuestion: Any = js.native
  
  /*
    * Gets or sets question visibility.
    * 
    * If you want to display or hide a question based on a condition, specify the [`visibleIf`](https://surveyjs.io/form-library/documentation/question#visibleIf) property. Refer to the following help topic for information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  def visible: Boolean = js.native
  
  /*
    * A Boolean expression. If it evaluates to `false`, this question becomes hidden.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility)
    */
  def visibleIf: String = js.native
  def visibleIf_=(`val`: String): Unit = js.native
  
  /*
    * Returns the visible index of the question in the survey. It can be from 0 to all visible questions count - 1
    * The visibleIndex is -1 if the title is 'hidden' or hideNumber is true
    */
  def visibleIndex: Double = js.native
  
  def visible_=(`val`: Boolean): Unit = js.native
  @JSName("visible")
  var visible_FQuestion: Boolean = js.native
}
/* static members */
object Question {
  
  @JSImport("survey-knockout", "Question")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Question.TextPreprocessorValuesMap")
  @js.native
  def TextPreprocessorValuesMap: Any = js.native
  inline def TextPreprocessorValuesMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPreprocessorValuesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "Question.questionCounter")
  @js.native
  def questionCounter: Double = js.native
  inline def questionCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("questionCounter")(x.asInstanceOf[js.Any])
}
