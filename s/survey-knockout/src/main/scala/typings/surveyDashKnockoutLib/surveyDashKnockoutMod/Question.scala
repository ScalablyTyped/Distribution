package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IQuestion because var conflicts: isPage, isReadOnly, isVisible, name. Inlined hasTitle, isEmpty, onSurveyValueChanged, updateValueFromSurvey, updateCommentFromSurvey, supportGoNextPageAutomatic, clearUnusedValues, getDisplayValue, getValueName, clearValue, clearValueIfInvisible, isAnswerCorrect, updateValueWithDefaults, value */ @JSImport("survey-knockout", "Question")
@js.native
class Question protected ()
  extends SurveyElement
     with IValidatorOwner
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(name: java.lang.String) = this()
  /**
    * The question comment value.
    */
  var comment: java.lang.String = js.native
  /**
    * Use it to get or set the comment value.
    */
  var commentText: java.lang.String = js.native
  /**
    * The correct answer on the question. Set this value if you are doing a quiz.
    * @see SurveyModel.correctAnswers
    * @see SurveyModel.inCorrectAnswers
    */
  var correctAnswer: js.Any = js.native
  /**
    * Returns all css classes that used for rendering the question. You may use survey.updateQuestionCssClasses event to override css classes for a question.
    * @see SurveyModel.updateQuestionCssClasses
    */
  val cssClasses: js.Any = js.native
  val cssMainRoot: js.Any = js.native
  /**
    * Returns the validation errors count.
    */
  val currentErrorCount: scala.Double = js.native
  /**
    * The link to the custom widget.
    */
  val customWidget: QuestionCustomWidget = js.native
  var customWidgetData: surveyDashKnockoutLib.Anon_IsNeedRender = js.native
  /**
    * Set the default value to the question. It will be assign to the question on loading the survey from JSON or adding a question to the survey or on setting this property of the value is empty.
    */
  var defaultValue: js.Any = js.native
  /**
    * Question description. It renders under question title by using smaller font. Unlike the title, description can be empty.
    * @see title
    */
  var description: java.lang.String = js.native
  val displayValue: js.Any = js.native
  /**
    * An expression that returns true or false. If it returns false the Question becomes read only and an end-user will not able to answer on the qustion. The library runs the expression on survey start and on changing a question value. If the property is empty then readOnly property is used.
    * @see readOnly
    * @see isReadOnly
    */
  var enableIf: java.lang.String = js.native
  val errorLocation: java.lang.String = js.native
  /**
    * Returns the title after processing the question template.
    * @see SurveyModel.questionTitleTemplate
    */
  val fullTitle: java.lang.String = js.native
  /**
    * Set it to true, to add a comment for the question.
    */
  var hasComment: scala.Boolean = js.native
  /**
    * Returns false if the question doesn't have an input element, for example: QuestionHtmlModel
    */
  val hasInput: scala.Boolean = js.native
  var hasOther: scala.Boolean = js.native
  /**
    * Returns false if the question doesn't have a title property, for example: QuestionHtmlModel, or titleLocation property equals to "hidden"
    * @see titleLocation
    */
  val hasTitle: scala.Boolean = js.native
  val hasTitleOnBottom: scala.Boolean = js.native
  val hasTitleOnLeft: scala.Boolean = js.native
  val hasTitleOnLeftTop: scala.Boolean = js.native
  val hasTitleOnTop: scala.Boolean = js.native
  /**
    * The unique identificator. It is generated automatically.
    */
  var id: java.lang.String = js.native
  /**
    * Set it different from 0 to increase the left padding.
    */
  var indent: scala.Double = js.native
  val inputId: java.lang.String = js.native
  /**
    * Returns true if the question may have a title located on the left
    */
  val isAllowTitleLeft: scala.Boolean = js.native
  val isFlowLayout: scala.Boolean = js.native
  /**
    * Always returns false.
    */
  val isPanel: scala.Boolean = js.native
  /**
    * Set this property to true, to make the question a required. If a user doesn't answer the question then a validation error will be generated.
    */
  var isRequired: scala.Boolean = js.native
  val locCommentText: LocalizableString = js.native
  val locDescription: LocalizableString = js.native
  var locOwner: ILocalizableOwner = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  val no: java.lang.String = js.native
  var paddingLeft: java.lang.String = js.native
  var paddingRight: java.lang.String = js.native
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
  val processedTitle: java.lang.String = js.native
  /**
    * The rendered width of the question.
    */
  var renderWidth: java.lang.String = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: java.lang.String = js.native
  /**
    * An expression that returns true or false. If it returns true the Question becomes required and an end-user has to answer it.
    * If it returns false the Question then an end-user may not answer it the Question maybe empty.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then isRequired property is used.
    * @see isRequired
    */
  var requiredIf: java.lang.String = js.native
  /**
    * Returns the char/string for a required question.
    * @see SurveyModel.requiredText
    */
  val requiredText: java.lang.String = js.native
  /**
    * Set it different from 0 to increase the right padding.
    */
  var rightIndent: scala.Double = js.native
  /**
    * The Question renders on the new line if the property is true. If the property is false, the question tries to render on the same line/row with a previous question/panel.
    */
  var startWithNewLine: scala.Boolean = js.native
  /**
    * Question title. Use survey questionTitleTemplate property to change the title question is rendered. If it is empty, then question name property is used.
    * @see SurveyModel.questionTitleTemplate
    */
  var title: java.lang.String = js.native
  /**
    * Set this property different from "default" to set the specific question title location for this panel/page.
    * @see SurveyModel.questionTitleLocation
    */
  var titleLocation: java.lang.String = js.native
  /**
    * Use it to choose how other question values will be rendered in title if referenced in {}.
    */
  var useDisplayValuesInTitle: scala.Boolean = js.native
  /* CompleteClass */
  override var validatedValue: js.Any = js.native
  /* CompleteClass */
  override var validators: js.Array[SurveyValidator] = js.native
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
    */
  var valueName: java.lang.String = js.native
  /**
    * Use it to get/set the question visibility.
    * @see visibleIf
    */
  var visible: scala.Boolean = js.native
  /**
    * An expression that returns true or false. If it returns true the Question becomes visible and if it returns false the Question becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
    * @see visible
    */
  var visibleIf: java.lang.String = js.native
  /**
    * Returns the visible index of the question in the survey. It can be from 0 to all visible questions count - 1
    */
  val visibleIndex: scala.Double = js.native
  /**
    * Use it to set the specific width to the question.
    */
  var width: java.lang.String = js.native
  def addConditionNames(names: js.Array[java.lang.String]): scala.Unit = js.native
  def addConditionObjectsByContext(objects: js.Array[IConditionObject], context: js.Any): scala.Unit = js.native
  /**
    * Add error into the question error list.
    * @param error
    */
  def addError(error: SurveyError): scala.Unit = js.native
  /**
    * Call this function to remove values from the current question, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    */
  def clearIncorrectValues(): scala.Unit = js.native
  def clearUnusedValues(): scala.Unit = js.native
  @JSName("clearUnusedValues")
  def clearUnusedValues_Any(): js.Any = js.native
  def clearValue(): scala.Unit = js.native
  def clearValueIfInvisible(): scala.Unit = js.native
  @JSName("clearValueIfInvisible")
  def clearValueIfInvisible_Any(): js.Any = js.native
  @JSName("clearValue")
  def clearValue_Any(): js.Any = js.native
  def commentChangedCallback(): scala.Unit = js.native
  def createValueCopy(): js.Any = js.native
  /* protected */ def fireCallback(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Move the focus to the input of this question.
    * @param onError set this parameter to true, to focus the input with the first error, other wise the first input will be focused.
    */
  def focus(): scala.Unit = js.native
  def focus(onError: scala.Boolean): scala.Unit = js.native
  def focusCallback(): scala.Unit = js.native
  /**
    * Returns a copy of question errors survey. For some questions like matrix and panel dynamic it includes the errors of nested questions.
    */
  def getAllErrors(): js.Array[SurveyError] = js.native
  def getAllValues(): js.Any = js.native
  /* protected */ def getComment(): java.lang.String = js.native
  def getConditionJson(): js.Any = js.native
  def getConditionJson(operator: java.lang.String): js.Any = js.native
  def getConditionJson(operator: java.lang.String, path: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getDataFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getDataFilteredValues(): js.Any = js.native
  def getDefaultValue(): js.Any = js.native
  /**
    * Return the question value as a display text. For example, for dropdown, it would return the item text instead of item value.
    * @param keysAsText Set this value to true, to return key (in matrices questions) as display text as well.
    */
  def getDisplayValue(keysAsText: scala.Boolean): js.Any = js.native
  /* protected */ def getDisplayValueCore(keyAsText: scala.Boolean): js.Any = js.native
  def getErrorCustomText(text: java.lang.String, error: SurveyError): java.lang.String = js.native
  /* protected */ def getFirstErrorInputElementId(): java.lang.String = js.native
  /* protected */ def getFirstInputElementId(): java.lang.String = js.native
  def getLayoutType(): java.lang.String = js.native
  /**
    * Returns the current survey locale
    * @see SurveyModel.locale
    */
  def getLocale(): java.lang.String = js.native
  def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  def getOthersMaxLength(): js.Any = js.native
  def getPanel(): IPanel = js.native
  def getProcessedText(text: java.lang.String): java.lang.String = js.native
  /* protected */ def getProcessedTextValue(textValue: TextPreProcessorValue): scala.Unit = js.native
  /* protected */ def getQuestionTitleTemplate(): java.lang.String = js.native
  /* protected */ def getRootCss(classes: js.Any): js.Any = js.native
  /**
    * Return the title location based on question titleLocation property and QuestionTitleLocation of it's parents
    * @see titleLocation
    * @see PanelModelBase.QuestionTitleLocation
    * @see SurveyModel.QuestionTitleLocation
    */
  def getTitleLocation(): java.lang.String = js.native
  /* protected */ def getTitleLocationCore(): java.lang.String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): java.lang.String = js.native
  /* CompleteClass */
  override def getValidatorTitle(): java.lang.String = js.native
  /* protected */ def getValueCore(): js.Any = js.native
  def getValueName(): java.lang.String = js.native
  /**
    * Returns true if there is a validation error(s) in the question.
    * @param fireCallback set it to true to show an error in UI.
    */
  def hasErrors(): scala.Boolean = js.native
  def hasErrors(fireCallback: scala.Boolean): scala.Boolean = js.native
  /* protected */ def hasOtherChanged(): scala.Unit = js.native
  /* protected */ def hasRequiredError(): scala.Boolean = js.native
  /* protected */ def initDataFromSurvey(): scala.Unit = js.native
  def isAnswerCorrect(): scala.Boolean = js.native
  /* protected */ def isDefaultValueEmpty(): scala.Boolean = js.native
  /**
    * Returns true if the question value is empty
    */
  def isEmpty(): scala.Boolean = js.native
  def isLayoutTypeSupported(layoutType: java.lang.String): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): scala.Unit with js.Any = js.native
  def onAnyValueChanged(name: java.lang.String): scala.Unit = js.native
  /* protected */ def onCheckForErrors(errors: js.Array[SurveyError]): scala.Unit = js.native
  /* protected */ def onCreating(): scala.Unit = js.native
  /* protected */ def onNameValueChanged(oldValue: java.lang.String, newValue: java.lang.String): scala.Unit = js.native
  /* protected */ def onParentChanged(): scala.Unit = js.native
  def onSurveyValueChanged(newValue: js.Any): scala.Unit = js.native
  @JSName("onSurveyValueChanged")
  def onSurveyValueChanged_Any(newValue: js.Any): js.Any = js.native
  /* protected */ def onValueChanged(): scala.Unit = js.native
  /* protected */ def onValueNameChanged(oldValue: java.lang.String): scala.Unit = js.native
  /* protected */ def onVisibleChanged(): scala.Unit = js.native
  def questionTitleTemplateCallback(): java.lang.String = js.native
  def removeElement(element: IElement): scala.Boolean = js.native
  /**
    * Remove a particular error from the question error list.
    * @param error
    */
  def removeError(error: SurveyError): scala.Unit = js.native
  /**
    * Run visibleIf and enableIf expressions. If visibleIf or/and enabledIf are not empty, then the results of performing the expression (true or false) set to the visible/readOnly properties.
    * @param values Typically survey results
    * @see visible
    * @see visibleIf
    * @see readOnly
    * @see enableIf
    */
  def runCondition(values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
  /* protected */ def runValidators(): js.Array[SurveyError] = js.native
  /* protected */ def setComment(newValue: java.lang.String): scala.Unit = js.native
  /* protected */ def setDefaultValue(): scala.Unit = js.native
  /* protected */ def setNewComment(newValue: java.lang.String): scala.Unit = js.native
  /* protected */ def setNewValue(newValue: js.Any): scala.Unit = js.native
  /* protected */ def setNewValueInData(newValue: js.Any): scala.Unit = js.native
  /* protected */ def setQuestionValue(newValue: js.Any): scala.Unit = js.native
  /* protected */ def setValueCore(newValue: js.Any): scala.Unit = js.native
  def supportComment(): scala.Boolean = js.native
  def supportGoNextPageAutomatic(): scala.Boolean = js.native
  def supportOther(): scala.Boolean = js.native
  def surveyLoadCallback(): scala.Unit = js.native
  def updateCommentFromSurvey(newValue: js.Any): js.Any = js.native
  /* protected */ def updateCssClasses(res: js.Any, surveyCss: js.Any): scala.Unit = js.native
  def updateCustomWidget(): scala.Unit = js.native
  /* protected */ def updateDisplayValue(): js.Any = js.native
  def updateValueFromSurvey(newValue: js.Any): scala.Unit = js.native
  @JSName("updateValueFromSurvey")
  def updateValueFromSurvey_Any(newValue: js.Any): js.Any = js.native
  def updateValueWithDefaults(): scala.Unit = js.native
  @JSName("updateValueWithDefaults")
  def updateValueWithDefaults_Any(): js.Any = js.native
  def validateValueCallback(): SurveyError = js.native
  def valueChangedCallback(): scala.Unit = js.native
  /* protected */ def valueFromData(`val`: js.Any): js.Any = js.native
  /* protected */ def valueToData(`val`: js.Any): js.Any = js.native
}

