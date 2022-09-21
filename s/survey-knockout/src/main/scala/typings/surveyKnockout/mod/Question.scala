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
  extends SurveyElement
     with IValidatorOwner
     with ISurveyErrorOwner
     with IConditionRunner {
  def this(name: String) = this()
  
  def addConditionObjectsByContext(objects: Any, context: Any): Unit = js.native
  
  /*
    * Add error into the question error list.
    */
  def addError(error: String): Unit = js.native
  def addError(error: SurveyError): Unit = js.native
  
  def afterRender(el: Any): Unit = js.native
  
  def afterRenderQuestionCallback(question: Question, element: Any): Any = js.native
  
  def afterRenderQuestionElement(el: Any): Unit = js.native
  
  /* protected */ var allowNotifyValueChanged: Boolean = js.native
  
  def ariaDescribedBy: String = js.native
  
  def ariaInvalid: `true` | `false` = js.native
  
  /*
    * A11Y properties
    */
  def ariaRequired: `true` | `false` = js.native
  
  def ariaRole: String = js.native
  
  def beforeDestroyQuestionElement(el: Any): Unit = js.native
  
  /* protected */ def canCollectErrors(): Boolean = js.native
  
  /* protected */ def canRunValidators(isOnValueChanged: Boolean): Boolean = js.native
  
  /* protected */ def canSetValueToSurvey(): Boolean = js.native
  
  /* protected */ def checkForResponsiveness(el: Any): Unit = js.native
  
  /*
    * Get is question ready to use
    */
  def choicesLoaded(): Unit = js.native
  
  def clearErrors(): Any = js.native
  /*
    * Call this function to clear all errors in the question
    */
  @JSName("clearErrors")
  def clearErrors_Unit(): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how invisible question clears the value. By default the behavior is define by Survey "clearInvisibleValues" property.
    * 
    * The following options are available:
    * 
    * - `default` (default) - Survey "clearInvisibleValues" property defines the behavior.
    * - `none` - do not clear invisible value.
    * - `onHidden` - clear the question value when it becomes invisible. If a question has value and it was invisible initially then survey clears the value on completing.
    * - `onComplete` - clear invisible question value on survey complete.
    */
  def clearIfInvisible: String = js.native
  def clearIfInvisible_=(`val`: String): Unit = js.native
  
  def clearIncorrectValues(): Any = js.native
  /*
    * Call this function to remove values from the current question, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
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
    * Clear the question value. It clears the question comment as well.
    */
  @JSName("clearValue")
  def clearValue_Unit(): Unit = js.native
  
  /*
    * The question comment value.
    */
  def comment: String = js.native
  
  var commentChangedCallback: Any = js.native
  
  var commentElement: Any = js.native
  
  def commentOrOtherPlaceHolder: String = js.native
  
  /*
    * Use this property to set the place holder text for comment field  .
    */
  def commentPlaceHolder: String = js.native
  def commentPlaceHolder_=(`val`: String): Unit = js.native
  
  /*
    * Use it to get or set the comment value.
    */
  def commentText: String = js.native
  def commentText_=(`val`: String): Unit = js.native
  
  def comment_=(`val`: String): Unit = js.native
  
  /* protected */ def convertDefaultValue(`val`: Any): Any = js.native
  
  /*
    * The correct answer on the question. Set this value if you are doing a quiz.
    * Please note, this property is hidden for question without input, for example html question.
    */
  def correctAnswer: Any = js.native
  
  def correctAnswerCount: Double = js.native
  
  def correctAnswer_=(`val`: Any): Unit = js.native
  
  def createValueCopy(): Any = js.native
  
  def cssContent: String = js.native
  
  def cssDescription: String = js.native
  
  def cssHeader: String = js.native
  
  def cssRoot: String = js.native
  
  /*
    * Returns the validation errors count.
    */
  def currentErrorCount: Double = js.native
  
  /*
    * The link to the custom widget.
    */
  def customWidget: QuestionCustomWidget = js.native
  
  var customWidgetData: Any = js.native
  
  var customWidgetValue: QuestionCustomWidget = js.native
  
  /*
    * A default value for the question. Ignored for question types that cannot have a [value](https://surveyjs.io/Documentation/Library?id=Question#value) (for example, HTML).
    * 
    * The default value is used as a question value in the following cases:
    * 
    * - While the survey is being loaded from JSON.
    * - The question is just added to the survey and does not yet have an answer.
    * - The respondent left the answer empty.
    */
  def defaultValue: Any = js.native
  
  /*
    * An expression used to calculate the [defaultValue](https://surveyjs.io/Documentation/Library?id=Question#defaultValue).
    * 
    * This expression applies until the question [value](https://surveyjs.io/Documentation/Library?id=Question#value) is specified by an end user or programmatically.
    * 
    * An expression can reference other questions as follows:
    * 
    * - `{other_question_name}`
    * - `{panel.other_question_name}` (to access questions inside the same dynamic panel)
    * - `{row.other_question_name}` (to access questions inside the same dynamic matrix or multi-column dropdown)
    * 
    * An expression can also include built-in and custom functions for advanced calculations. For example, if the `defaultValue` should be today's date, set the `defaultValueExpression` to `"today()"`, and the corresponding built-in function will be executed each time the survey is loaded. Refer to the following help topic for more information: [Use Functions in Expressions](https://surveyjs.io/Documentation/Library#conditions-functions).
    */
  def defaultValueExpression: Any = js.native
  def defaultValueExpression_=(`val`: Any): Unit = js.native
  
  var defaultValueRunner: ExpressionRunner = js.native
  
  def defaultValue_=(`val`: Any): Unit = js.native
  
  /*
    * Question description location. By default, value is "default" and it depends on survey questionDescriptionLocation property
    * You may change it to "underInput" to render it under question input or "underTitle" to rendered it under title.
    */
  def descriptionLocation: String = js.native
  def descriptionLocation_=(`val`: String): Unit = js.native
  
  def displayValue: Any = js.native
  
  def displayValueCallback(text: String): String = js.native
  
  /*
    * An expression that returns true or false. If it returns false the Question becomes read only and an end-user will not able to answer on the qustion. The library runs the expression on survey start and on changing a question value. If the property is empty then readOnly property is used.
    * Please note, this property is hidden for question without input, for example html question.
    */
  def enableIf: String = js.native
  def enableIf_=(`val`: String): Unit = js.native
  
  def errorLocation: String = js.native
  
  /* protected */ def fireCallback(callback: Any): Unit = js.native
  
  /*
    * Move the focus to the input of this question.
    */
  def focus(): Unit = js.native
  def focus(onError: Boolean): Unit = js.native
  
  var focusCallback: Any = js.native
  
  var focusIn: Any = js.native
  
  /*
    * Returns the title after processing the question template.
    */
  def fullTitle: String = js.native
  
  /*
    * Returns a copy of question errors survey. For some questions like matrix and panel dynamic it includes the errors of nested questions.
    */
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
    * Return the question value as a display text. For example, for dropdown, it would return the item text instead of item value.
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
    * Returns question answer data as a plain object: with question title, name, value and displayValue.
    * For complex questions (like matrix, etc.) isNode flag is set to true and data contains array of nested objects (rows)
    * set options.includeEmpty to false if you want to skip empty answers
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
    * Return the title location based on question titleLocation property and QuestionTitleLocation of it's parents
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
  
  /*
    * Set it to true, to add a comment for the question.
    */
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
    * Returns false if the question doesn't have an input element, for example: QuestionHtmlModel
    */
  def hasInput: Boolean = js.native
  
  /*
    * Specifies whether to display the "Other" choice item.
    */
  def hasOther: Boolean = js.native
  
  /* protected */ def hasOtherChanged(): Unit = js.native
  
  def hasOther_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def hasRequiredError(): Boolean = js.native
  
  /*
    * Returns false if the question doesn't have an input element or have multiple inputs: matrices or panel dynamic
    */
  def hasSingleInput: Boolean = js.native
  
  def hasTitleOnBottom: Boolean = js.native
  
  def hasTitleOnLeft: Boolean = js.native
  
  def hasTitleOnLeftTop: Boolean = js.native
  
  def hasTitleOnTop: Boolean = js.native
  
  /*
    * Set hideNumber to true to stop showing the number for this question. The question will not be counter
    */
  def hideNumber: Boolean = js.native
  def hideNumber_=(`val`: Boolean): Unit = js.native
  
  /*
    * The unique identificator. It is generated automatically.
    */
  def id: String = js.native
  def id_=(`val`: String): Unit = js.native
  
  /* protected */ def initCommentFromSurvey(): Unit = js.native
  
  /* protected */ def initDataFromSurvey(): Unit = js.native
  
  def inputId: String = js.native
  
  /*
    * Returns true if the question may have a title located on the left
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
    * Returns true if the question value is empty
    */
  def isEmpty(): Boolean = js.native
  
  def isFlowLayout: Boolean = js.native
  
  def isInputReadOnly: Boolean = js.native
  
  def isInputTextUpdate: Boolean = js.native
  
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  
  var isMobile: Boolean = js.native
  
  /*
    * Return true if there is a parent (page or panel) and it is visible
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
    * Set this property to true, to make the question a required. If a user doesn't answer the question then a validation error will be generated.
    * Please note, this property is hidden for question without input, for example html question.
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
    * Returns true if the question is visible or survey is in design mode right now.
    */
  @JSName("isVisible")
  def isVisible_MQuestion: Boolean = js.native
  
  def locCommentPlaceHolder: LocalizableString = js.native
  
  def locCommentText: LocalizableString = js.native
  
  var locProcessedTitle: LocalizableString = js.native
  
  def locRequiredErrorText: LocalizableString = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  var localeChangedCallback: Any = js.native
  
  /*
    * Move question to a new container Page/Panel. Add as a last element if insertBefore parameter is not used or inserted into the given index,
    * if insert parameter is number, or before the given element, if the insertBefore parameter is a question or panel
    */
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: Any): Boolean = js.native
  
  def needResponsiveWidth(): Boolean = js.native
  
  /* protected */ def needResponsiveness(): Boolean = js.native
  
  /*
    * The property returns the question number. If question is invisible then it returns empty string.
    * If visibleIndex is 1, then no is 2, or 'B' if survey.questionStartIndex is 'A'.
    */
  def no: String = js.native
  @JSName("no")
  var no_FQuestion: String = js.native
  
  def onAnyValueChanged(name: String): Any = js.native
  @JSName("onAnyValueChanged")
  def onAnyValueChanged_Unit(name: String): Unit = js.native
  
  /* protected */ def onCheckForErrors(errors: Any, isOnValueChanged: Boolean): Unit = js.native
  
  def onCommentChange(event: Any): Unit = js.native
  
  def onCommentInput(event: Any): Unit = js.native
  
  def onCompletedAsyncValidators(hasErrors: Boolean): Unit = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  var onGetSurvey: Any = js.native
  
  var onMobileChangedCallback: Any = js.native
  
  /* protected */ def onParentChanged(): Unit = js.native
  
  /* protected */ def onParentQuestionChanged(): Unit = js.native
  
  /*
    * The event is fired when isReady property of question is changed.
    * options.question - the question
    * options.isReady - current value of isReady
    * options.oldIsReady - old value of isReady
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
    * Get/set the page where the question is located.
    */
  def page: IPage = js.native
  def page_=(`val`: IPage): Unit = js.native
  
  /*
    * A parent question. It can be a dynamic panel or dynamic/dropdown matrices. If the value is a matrix, it means that question is a cell question.
    * This property is null for a stand alone question.
    */
  def parentQuestion: Question = js.native
  
  var parentQuestionValue: Question = js.native
  
  /*
    * A parent element. It can be panel or page.
    */
  @JSName("parent")
  def parent_MQuestion: IPanel = js.native
  
  /* protected */ def processResponsiveness(requiredWidth: Double, availableWidth: Double): Any = js.native
  
  /*
    * Returns the rendred question title.
    */
  def processedTitle: String = js.native
  
  var questionTitleTemplateCallback: Any = js.native
  
  /*
    * Returns questions count: 1 for the non-matrix questions and all inner visible questions that has input(s) widgets for question of matrix types.
    */
  def quizQuestionCount: Double = js.native
  
  /* protected */ def raiseOnCompletedAsyncValidators(): Unit = js.native
  
  def removeElement(element: IElement): Boolean = js.native
  
  /*
    * Remove a particular error from the question error list.
    */
  def removeError(error: SurveyError): Unit = js.native
  
  var renderAs: String = js.native
  
  def renderCssRoot: String = js.native
  
  def renderedInputDisabled: String = js.native
  
  def renderedInputReadOnly: String = js.native
  
  def requireUpdateCommentValue: Boolean = js.native
  
  /*
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    * Please note, this property is hidden for question without input, for example html question.
    */
  def requiredErrorText: String = js.native
  def requiredErrorText_=(`val`: String): Unit = js.native
  
  /*
    * An expression that returns true or false. If it returns true the Question becomes required and an end-user has to answer it.
    * If it returns false the Question then an end-user may not answer it the Question maybe empty.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then isRequired property is used.
    * Please note, this property is hidden for question without input, for example html question.
    */
  def requiredIf: String = js.native
  def requiredIf_=(`val`: String): Unit = js.native
  
  /*
    * Returns the char/string for a required question.
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
  
  def setParentQuestion(`val`: Question): Unit = js.native
  
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
  
  def showErrorOnBottom: Boolean = js.native
  
  def showErrorOnCore(location: String): Boolean = js.native
  
  def showErrorOnTop: Boolean = js.native
  
  def showErrorsAboveQuestion: Boolean = js.native
  
  def showErrorsBelowQuestion: Boolean = js.native
  
  /*
    * The Question renders on the new line if the property is true. If the property is false, the question tries to render on the same line/row with a previous question/panel.
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
    * Set this property different from "default" to set the specific question title location for this panel/page.
    * Please note, this property is hidden for questions without input, for example html question.
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
    * Use it to choose how other question values will be rendered in title if referenced in {}.
    * Please note, this property is hidden for question without input, for example html question.
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
    * The list of question validators.
    * Please note, this property is hidden for question without input, for example html question.
    */
  def validators: Any = js.native
  def validators_=(`val`: Any): Unit = js.native
  
  /*
    * Get/Set the question value.
    */
  def value: Any = js.native
  
  var valueChangedCallback: Any = js.native
  
  def valueForSurvey: Any = js.native
  
  /* protected */ def valueFromData(`val`: Any): Any = js.native
  
  def valueFromDataCallback(`val`: Any): Any = js.native
  
  /*
    * Use this property if you want to store the question result in the name different from the question name.
    * Question name should be unique in the survey and valueName could be not unique. It allows to share data between several questions with the same valueName.
    * The library set the value automatically if the question.name property is not valid. For example, if it contains the period '.' symbol.
    * In this case if you set the question.name property to 'x.y' then the valueName becomes 'x y'.
    * Please note, this property is hidden for questions without input, for example html question.
    */
  def valueName: String = js.native
  def valueName_=(`val`: String): Unit = js.native
  
  /* protected */ def valueToData(`val`: Any): Any = js.native
  
  def valueToDataCallback(`val`: Any): Any = js.native
  
  def value_=(`val`: Any): Unit = js.native
  @JSName("value")
  var value_FQuestion: Any = js.native
  
  /*
    * Use it to get/set the question visibility.
    */
  def visible: Boolean = js.native
  
  /*
    * An expression that returns true or false. If it returns true the Question becomes visible and if it returns false the Question becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
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
