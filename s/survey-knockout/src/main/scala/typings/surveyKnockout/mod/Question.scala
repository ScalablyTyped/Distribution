package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.surveyKnockout.AnonCalculations
import typings.surveyKnockout.AnonIsNeedRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IElement because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name. Inlined visible, parent, renderWidth, width, rightIndent, startWithNewLine, getPanel, getLayoutType, isLayoutTypeSupported, removeElement, onAnyValueChanged, clearIncorrectValues, clearErrors
- typings.surveyKnockout.mod.IQuestion because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name. Inlined hasTitle, isEmpty, onSurveyValueChanged, updateValueFromSurvey, updateCommentFromSurvey, supportGoNextPageAutomatic, clearUnusedValues, getDisplayValue, getValueName, clearValue, clearValueIfInvisible, isAnswerCorrect, updateValueWithDefaults, getQuestionFromArray, value */ @JSImport("survey-knockout", "Question")
@js.native
class Question protected ()
  extends SurveyElement
     with IValidatorOwner
     with /* index */ StringDictionary[js.Any]
     with ISurveyErrorOwner
     with IConditionRunner {
  def this(name: String) = this()
  var allowNotifyValueChanged: Boolean = js.native
  /**
    * The question comment value.
    */
  var comment: String = js.native
  /**
    * Use it to get or set the comment value.
    */
  var commentText: String = js.native
  /**
    * The correct answer on the question. Set this value if you are doing a quiz.
    * @see SurveyModel.correctAnswers
    * @see SurveyModel.inCorrectAnswers
    */
  var correctAnswer: js.Any = js.native
  val correctAnswerCount: Double = js.native
  /**
    * Returns all css classes that used for rendering the question. You may use survey.updateQuestionCssClasses event to override css classes for a question.
    * @see SurveyModel.updateQuestionCssClasses
    */
  val cssClasses: js.Any = js.native
  val cssMainRoot: js.Any = js.native
  /**
    * Returns the validation errors count.
    */
  val currentErrorCount: Double = js.native
  /**
    * The link to the custom widget.
    */
  val customWidget: QuestionCustomWidget = js.native
  var customWidgetData: AnonIsNeedRender = js.native
  /**
    * Set the default value to the question. It will be assign to the question on loading the survey from JSON or adding a question to the survey or on setting this property of the value is empty.
    */
  var defaultValue: js.Any = js.native
  /**
    * Question description. It renders under question title by using smaller font. Unlike the title, description can be empty.
    * @see title
    */
  var description: String = js.native
  /**
    * Question description location. By default, value is "default" and it depends on survey questionDescriptionLocation property
    * You may change it to "underInput" to render it under question input or "underTitle" to rendered it under title.
    * @see description
    * @see Survey.questionDescriptionLocation
    */
  var descriptionLocation: String = js.native
  val displayValue: js.Any = js.native
  /**
    * An expression that returns true or false. If it returns false the Question becomes read only and an end-user will not able to answer on the qustion. The library runs the expression on survey start and on changing a question value. If the property is empty then readOnly property is used.
    * @see readOnly
    * @see isReadOnly
    */
  var enableIf: String = js.native
  val errorLocation: String = js.native
  /**
    * Returns the title after processing the question template.
    * @see SurveyModel.questionTitleTemplate
    */
  val fullTitle: String = js.native
  /**
    * Set it to true, to add a comment for the question.
    */
  var hasComment: Boolean = js.native
  val hasDescriptionUnderInput: Boolean = js.native
  val hasDescriptionUnderTitle: Boolean = js.native
  /**
    * Returns false if the question doesn't have an input element, for example: QuestionHtmlModel
    */
  val hasInput: Boolean = js.native
  var hasOther: Boolean = js.native
  /**
    * Returns false if the question doesn't have a title property, for example: QuestionHtmlModel, or titleLocation property equals to "hidden"
    * @see titleLocation
    */
  val hasTitle: Boolean = js.native
  val hasTitleOnBottom: Boolean = js.native
  val hasTitleOnLeft: Boolean = js.native
  val hasTitleOnLeftTop: Boolean = js.native
  val hasTitleOnTop: Boolean = js.native
  /**
    * The unique identificator. It is generated automatically.
    */
  var id: String = js.native
  /**
    * Set it different from 0 to increase the left padding.
    */
  var indent: Double = js.native
  val inputId: String = js.native
  /**
    * Returns true if the question may have a title located on the left
    */
  val isAllowTitleLeft: Boolean = js.native
  var isAnswered: Boolean = js.native
  val isCompositeQuestion: Boolean = js.native
  val isFlowLayout: Boolean = js.native
  val isInputTextUpdate: Boolean = js.native
  val isReady: Boolean = js.native
  var isReadyValue: Boolean = js.native
  /**
    * Set this property to true, to make the question a required. If a user doesn't answer the question then a validation error will be generated.
    */
  var isRequired: Boolean = js.native
  val isRunningValidators: Boolean = js.native
  val isSurveyInputTextUpdate: Boolean = js.native
  val locCommentText: LocalizableString = js.native
  val locDescription: LocalizableString = js.native
  var locNotificationInData: Boolean = js.native
  var locOwner: ILocalizableOwner = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * The property returns the question number. If question is invisible then it returns empty string.
    * If visibleIndex is 1, then no is 2, or 'B' if survey.questionStartIndex is 'A'.
    * @see SurveyModel.questionStartIndex
    */
  val no: String = js.native
  /**
    * The event is fired when isReady property of question is changed.
    * <br/> options.question - the question
    * <br/> options.isReady - current value of isReady
    * <br/> options.oldIsReady - old value of isReady
    */
  var onReadyChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  var paddingLeft: String = js.native
  var paddingRight: String = js.native
  /**
    * Get/set the page where the question is located.
    */
  var page: IPage = js.native
  /**
    * A parent element. It can be panel or page.
    */
  var parent: IPanel = js.native
  /**
    * Returns the rendred question title.
    */
  val processedTitle: String = js.native
  /**
    * Returns questions count: 1 for the non-matrix questions and all inner visible questions that has input(s) widgets for question of matrix types.
    * @see getQuizQuestions
    */
  val quizQuestionCount: Double = js.native
  /**
    * The rendered width of the question.
    */
  var renderWidth: String = js.native
  val requireUpdateCommentValue: Boolean = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: String = js.native
  /**
    * An expression that returns true or false. If it returns true the Question becomes required and an end-user has to answer it.
    * If it returns false the Question then an end-user may not answer it the Question maybe empty.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then isRequired property is used.
    * @see isRequired
    */
  var requiredIf: String = js.native
  /**
    * Returns the char/string for a required question.
    * @see SurveyModel.requiredText
    */
  val requiredText: String = js.native
  /**
    * Set it different from 0 to increase the right padding.
    */
  var rightIndent: Double = js.native
  /**
    * The Question renders on the new line if the property is true. If the property is false, the question tries to render on the same line/row with a previous question/panel.
    */
  var startWithNewLine: Boolean = js.native
  /**
    * Question title. Use survey questionTitleTemplate property to change the title question is rendered. If it is empty, then question name property is used.
    * @see SurveyModel.questionTitleTemplate
    */
  var title: String = js.native
  /**
    * Set this property different from "default" to set the specific question title location for this panel/page.
    * @see SurveyModel.questionTitleLocation
    */
  var titleLocation: String = js.native
  /**
    * Use it to choose how other question values will be rendered in title if referenced in {}.
    */
  var useDisplayValuesInTitle: Boolean = js.native
  /* CompleteClass */
  override var validatedValue: js.Any = js.native
  /**
    * The list of question validators.
    */
  var validators: js.Array[SurveyValidator] = js.native
  /**
    * Get/Set the question value.
    * @see SurveyMode.setValue
    * @see SurveyMode.getValue
    */
  var value: js.Any = js.native
  /**
    * Use this property if you want to store the question result in the name different from the question name.
    * Question name should be unique in the survey and valueName could be not unique. It allows to share data between several questions with the same valueName.
    * The library set the value automatically if the question.name property is not valid. For example, if it contains the period '.' symbol.
    * In this case if you set the question.name property to 'x.y' then the valueName becomes 'x y'.
    * @see name
    */
  var valueName: String = js.native
  /**
    * Use it to get/set the question visibility.
    * @see visibleIf
    */
  var visible: Boolean = js.native
  /**
    * An expression that returns true or false. If it returns true the Question becomes visible and if it returns false the Question becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
    * @see visible
    */
  var visibleIf: String = js.native
  /**
    * Returns the visible index of the question in the survey. It can be from 0 to all visible questions count - 1
    */
  val visibleIndex: Double = js.native
  /**
    * Use it to set the specific width to the question like css style (%, px, em etc).
    */
  var width: String = js.native
  def addConditionNames(names: js.Array[String]): Unit = js.native
  def addConditionObjectsByContext(objects: js.Array[IConditionObject], context: js.Any): Unit = js.native
  /**
    * Add error into the question error list.
    * @param error
    */
  def addError(error: SurveyError): Unit = js.native
  /* protected */ def addSupportedValidators(supportedValidators: js.Array[String]): Unit = js.native
  def afterRenderInput(el: js.Any): Unit = js.native
  /**
    * Get is question ready to use
    */
  def choicesLoaded(): Unit = js.native
  def clearErrors(): js.Any = js.native
  /**
    * Call this function to clear all errors in the question
    */
  @JSName("clearErrors")
  def clearErrors_Unit(): Unit = js.native
  def clearIncorrectValues(): js.Any = js.native
  /**
    * Call this function to remove values from the current question, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    */
  @JSName("clearIncorrectValues")
  def clearIncorrectValues_Unit(): Unit = js.native
  def clearOnDeletingContainer(): Unit = js.native
  def clearUnusedValues(): js.Any = js.native
  @JSName("clearUnusedValues")
  def clearUnusedValues_Unit(): Unit = js.native
  def clearValue(): js.Any = js.native
  def clearValueIfInvisible(): js.Any = js.native
  @JSName("clearValueIfInvisible")
  def clearValueIfInvisible_Unit(): Unit = js.native
  @JSName("clearValue")
  def clearValue_Unit(): Unit = js.native
  def commentChangedCallback(): Unit = js.native
  def createValueCopy(): js.Any = js.native
  /* protected */ def fireCallback(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Move the focus to the input of this question.
    * @param onError set this parameter to true, to focus the input with the first error, other wise the first input will be focused.
    */
  def focus(): Unit = js.native
  def focus(onError: Boolean): Unit = js.native
  def focusCallback(): Unit = js.native
  /**
    * Returns a copy of question errors survey. For some questions like matrix and panel dynamic it includes the errors of nested questions.
    */
  def getAllErrors(): js.Array[SurveyError] = js.native
  def getAllValues(): js.Any = js.native
  /* protected */ def getComment(): String = js.native
  def getConditionJson(): js.Any = js.native
  def getConditionJson(operator: String): js.Any = js.native
  def getConditionJson(operator: String, path: String): js.Any = js.native
  /* protected */ def getCorrectAnswerCount(): Double = js.native
  /* CompleteClass */
  override def getDataFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getDataFilteredValues(): js.Any = js.native
  def getDefaultValue(): js.Any = js.native
  /**
    * Return the question value as a display text. For example, for dropdown, it would return the item text instead of item value.
    * @param keysAsText Set this value to true, to return key (in matrices questions) as display text as well.
    * @param value use this parameter, if you want to get display value for this value and not question.value. It is undefined by default.
    */
  def getDisplayValue(keysAsText: Boolean): js.Any = js.native
  def getDisplayValue(keysAsText: Boolean, value: js.Any): js.Any = js.native
  /* protected */ def getDisplayValueCore(keyAsText: Boolean, value: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getErrorCustomText(text: String, error: SurveyError): String = js.native
  /* protected */ def getFirstErrorInputElementId(): String = js.native
  /* protected */ def getFirstInputElementId(): String = js.native
  /* protected */ def getIsAnswered(): Boolean = js.native
  /* protected */ def getIsRunningValidators(): Boolean = js.native
  def getLayoutType(): String = js.native
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  def getOthersMaxLength(): js.Any = js.native
  def getPanel(): IPanel = js.native
  /**
    * Returns question answer data as a plain object: with question title, name, value and displayValue.
    * For complex questions (like matrix, etc.) isNode flag is set to true and data contains array of nested objects (rows)
    * set options.includeEmpty to false if you want to skip empty answers
    */
  def getPlainData(): js.Any = js.native
  def getPlainData(options: AnonCalculations): js.Any = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  /* protected */ def getProcessedTextValue(textValue: TextPreProcessorValue): Unit = js.native
  def getQuestionFromArray(name: String, index: Double): IQuestion = js.native
  def getQuestionTitleTemplate(): String = js.native
  /* protected */ def getQuizQuestionCount(): Double = js.native
  /* protected */ def getRootCss(classes: js.Any): js.Any = js.native
  def getSupportedValidators(): js.Array[String] = js.native
  /**
    * Return the title location based on question titleLocation property and QuestionTitleLocation of it's parents
    * @see titleLocation
    * @see PanelModelBase.QuestionTitleLocation
    * @see SurveyModel.QuestionTitleLocation
    */
  def getTitleLocation(): String = js.native
  /* protected */ def getTitleLocationCore(): String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  /* CompleteClass */
  override def getValidatorTitle(): String = js.native
  /* CompleteClass */
  override def getValidators(): js.Array[SurveyValidator] = js.native
  /* protected */ def getValueCore(): js.Any = js.native
  def getValueName(): String = js.native
  /**
    * Returns true if there is a validation error(s) in the question.
    * @param fireCallback set it to true to show an error in UI.
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, rec: js.Any): Boolean = js.native
  /* protected */ def hasOtherChanged(): Unit = js.native
  /* protected */ def hasRequiredError(): Boolean = js.native
  /* protected */ def initCommentFromSurvey(): Unit = js.native
  /* protected */ def initDataFromSurvey(): Unit = js.native
  def isAnswerCorrect(): Boolean = js.native
  /* protected */ def isDefaultValueEmpty(): Boolean = js.native
  /**
    * Returns true if the question value is empty
    */
  def isEmpty(): Boolean = js.native
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  /* protected */ def isTextValue(): Boolean = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit with js.Any = js.native
  /**
    * Move question to a new container Page/Panel. Add as a last element if insertBefore parameter is not used or inserted into the given index,
    * if insert parameter is number, or before the given element, if the insertBefore parameter is a question or panel
    * @param container Page or Panel to where a question is relocated.
    * @param insertBefore Use it if you want to set the question to a specific position. You may use a number (use 0 to insert int the beginning) or element, if you want to insert before this element.
    */
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: js.Any): Boolean = js.native
  def onAnyValueChanged(name: String): js.Any = js.native
  @JSName("onAnyValueChanged")
  def onAnyValueChanged_Unit(name: String): Unit = js.native
  /* protected */ def onCheckForErrors(errors: js.Array[SurveyError]): Unit = js.native
  def onCompletedAsyncValidators(hasErrors: Boolean): Unit = js.native
  /* protected */ def onCreating(): Unit = js.native
  /* protected */ def onParentChanged(): Unit = js.native
  def onSurveyValueChanged(newValue: js.Any): js.Any = js.native
  @JSName("onSurveyValueChanged")
  def onSurveyValueChanged_Unit(newValue: js.Any): Unit = js.native
  /* protected */ def onValueChanged(): Unit = js.native
  /* protected */ def onValueNameChanged(oldValue: String): Unit = js.native
  /* protected */ def onVisibleChanged(): Unit = js.native
  def questionTitleTemplateCallback(): String = js.native
  /* protected */ def raiseOnCompletedAsyncValidators(): Unit = js.native
  def removeElement(element: IElement): Boolean = js.native
  /**
    * Remove a particular error from the question error list.
    * @param error
    */
  def removeError(error: SurveyError): Unit = js.native
  /* CompleteClass */
  override def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
  /* protected */ def runValidators(): js.Array[SurveyError] = js.native
  /* protected */ def setComment(newValue: String): Unit = js.native
  /* protected */ def setDefaultValue(): Unit = js.native
  /* protected */ def setNewComment(newValue: String): Unit = js.native
  /* protected */ def setNewValue(newValue: js.Any): Unit = js.native
  /* protected */ def setNewValueInData(newValue: js.Any): Unit = js.native
  /* protected */ def setQuestionValue(newValue: js.Any): Unit = js.native
  /* protected */ def setQuestionValue(newValue: js.Any, updateIsAnswered: Boolean): Unit = js.native
  /* protected */ def setValueCore(newValue: js.Any): Unit = js.native
  def supportComment(): Boolean = js.native
  def supportGoNextPageAutomatic(): Boolean = js.native
  def supportOther(): Boolean = js.native
  def surveyLoadCallback(): Unit = js.native
  def updateCommentFromSurvey(newValue: js.Any): js.Any = js.native
  /* protected */ def updateCssClasses(res: js.Any, css: js.Any): Unit = js.native
  def updateCustomWidget(): Unit = js.native
  /* protected */ def updateDisplayValue(): js.Any = js.native
  /* protected */ def updateIsAnswered(): Unit = js.native
  def updateValueFromSurvey(newValue: js.Any): js.Any = js.native
  @JSName("updateValueFromSurvey")
  def updateValueFromSurvey_Unit(newValue: js.Any): Unit = js.native
  def updateValueWithDefaults(): js.Any = js.native
  @JSName("updateValueWithDefaults")
  def updateValueWithDefaults_Unit(): Unit = js.native
  def validateValueCallback(): SurveyError = js.native
  def valueChangedCallback(): Unit = js.native
  /* protected */ def valueFromData(`val`: js.Any): js.Any = js.native
  /* protected */ def valueToData(`val`: js.Any): js.Any = js.native
}

