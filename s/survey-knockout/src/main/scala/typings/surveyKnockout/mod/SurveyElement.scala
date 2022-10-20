package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyElement")
@js.native
open class SurveyElement[E] protected ()
  extends SurveyElementCore
     with ISurveyElement {
  def this(name: String) = this()
  
  def __setData(data: ISurveyData): Unit = js.native
  
  var allowRootStyle: Boolean = js.native
  
  def areInvisibleElementsShowing: Boolean = js.native
  
  /* protected */ def calcCssClasses(css: Any): Any = js.native
  
  /* protected */ def clearCssClasses(): Unit = js.native
  
  def clickTitleFunction: Any = js.native
  
  /*
    * Collapses the survey element.
    * 
    * In collapsed state, the element displays only `title` and `description`.
    */
  def collapse(): Unit = js.native
  
  /*
    * Returns `true` if the survey element or its child elements have validation errors.
    * 
    * This property contains the result of the most recent validation. This result may be outdated. Call the `hasErrors` method to get an up-to-date value.
    */
  @JSName("containsErrors")
  def containsErrors_MSurveyElement: Boolean = js.native
  
  /* protected */ def createActionContainer(): ActionContainer[Action] = js.native
  /* protected */ def createActionContainer(allowAdaptiveActions: Boolean): ActionContainer[Action] = js.native
  
  var cssClassesValue: Any = js.native
  
  def cssError: String = js.native
  
  def data: ISurveyData = js.native
  
  var disableDesignActions: Boolean = js.native
  
  var dragTypeOverMe: DragTypeOverMeEnum = js.native
  
  /*
    * Validation errors. Call the `hasErrors()` method to validate survey element data.
    */
  def errors: Any = js.native
  def errors_=(`val`: Any): Unit = js.native
  
  /*
    * Expands the survey element.
    */
  def expand(): Unit = js.native
  
  /* protected */ def getContainsErrors(): Boolean = js.native
  
  /* protected */ def getDefaultTitleActions(): js.Array[IAction] = js.native
  
  /* protected */ def getIsErrorsModeTooltip(): Boolean = js.native
  
  /* protected */ def getIsTooltipErrorInsideSupported(): Boolean = js.native
  
  /* protected */ def getIsTooltipErrorSupportedByParent(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* protected */ def getPage(parent: IPanel): IPage = js.native
  
  /* protected */ def getProcessedHtml(html: String): String = js.native
  
  /* protected */ def getSkeletonComponentNameCore(): String = js.native
  
  def getTitleActions(): js.Array[Any] = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  /* protected */ def getUseDisplayValuesInTitle(): Boolean = js.native
  
  /* protected */ def getValidName(name: String): String = js.native
  
  /* protected */ def hasFrameV2: Boolean = js.native
  
  def hasParent: Boolean = js.native
  
  def hasStateButton: Boolean = js.native
  
  var hasVisibleErrors: Boolean = js.native
  
  /*
    * Increases or decreases indent of the survey element content from the left edge. Accepts positive integer values and 0.
    */
  def indent: Double = js.native
  def indent_=(`val`: Double): Unit = js.native
  
  /*
    * Returns `true` if the survey element is collapsed.
    */
  def isCollapsed: Boolean = js.native
  
  var isContentElement: Boolean = js.native
  
  /* protected */ def isDefaultV2Theme: Boolean = js.native
  
  var isDragMe: Boolean = js.native
  
  var isEditableTemplateElement: Boolean = js.native
  
  def isErrorsModeTooltip: Boolean = js.native
  
  /*
    * Returns `true` if the survey element is expanded.
    */
  def isExpanded: Boolean = js.native
  
  var isInteractiveDesignElement: Boolean = js.native
  
  /*
    * Returns `true` if the survey element is a page.
    */
  @JSName("isPage")
  def isPage_MSurveyElement: Boolean = js.native
  
  /*
    * Returns `true` if the survey element is a panel.
    */
  @JSName("isPanel")
  def isPanel_MSurveyElement: Boolean = js.native
  
  /*
    * Returns `true` if the survey element is a question.
    */
  def isQuestion: Boolean = js.native
  
  /*
    * Returns `true` if the survey element or its parent element is read-only.
    * 
    * If you want to switch a survey element to the read-only state based on a condition, specify the [`enableIf`](https://surveyjs.io/form-library/documentation/question#enableIf) property. Refer to the following help topic for information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  @JSName("isReadOnly")
  def isReadOnly_MSurveyElement: Boolean = js.native
  
  var isSingleInRow: Boolean = js.native
  
  var isTitleActionRequested: Boolean = js.native
  
  @JSName("isVisible")
  def isVisible_MSurveyElement: Boolean = js.native
  
  var locOwner: ILocalizableOwner = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  /*
    * Gets or sets maximum survey element width in CSS values.
    * 
    * Default value: "100%" (taken from [`settings.maxWidth`](https://surveyjs.io/form-library/documentation/settings#maxWidth))
    */
  def maxWidth: String = js.native
  def maxWidth_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets minimum survey element width in CSS values.
    * 
    * Default value: "300px" (taken from [`settings.minWidth`](https://surveyjs.io/form-library/documentation/settings#minWidth))
    */
  def minWidth: String = js.native
  def minWidth_=(`val`: String): Unit = js.native
  
  /* protected */ def moveToBase(parent: IPanel, container: IPanel): Boolean = js.native
  /* protected */ def moveToBase(parent: IPanel, container: IPanel, insertBefore: Any): Boolean = js.native
  
  /*
    * A survey element identifier.
    */
  @JSName("name")
  def name_MSurveyElement: String = js.native
  
  /* protected */ def needClickTitleFunction(): Boolean = js.native
  
  /* protected */ def onNameChanged(oldValue: String): Unit = js.native
  
  /* protected */ def onParentQuestionChanged(): Unit = js.native
  
  /* protected */ def onReadOnlyChanged(): Unit = js.native
  
  /* protected */ def onSetData(): Unit = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  def paddingLeft: String = js.native
  def paddingLeft_=(`val`: String): Unit = js.native
  
  def paddingRight: String = js.native
  def paddingRight_=(`val`: String): Unit = js.native
  
  /*
    * A Dynamic Panel, Dynamic Matrix, or Dropdown Matrix that includes the current question.
    * 
    * This property is `null` for standalone questions.
    */
  def parentQuestion: Any = js.native
  
  var parentQuestionValue: Any = js.native
  
  @JSName("parent")
  def parent_MSurveyElement: IPanel = js.native
  
  /* protected */ def processTitleClick(): Unit = js.native
  
  /*
    * Makes the survey element read-only.
    * 
    * If you want to switch a survey element to the read-only state based on a condition, specify the [`enableIf`](https://surveyjs.io/form-library/documentation/question#enableIf) property. Refer to the following help topic for information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  def readOnly: Boolean = js.native
  
  var readOnlyChangedCallback: Any = js.native
  
  def readOnly_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def removeSelfFromList(list: Any): Unit = js.native
  
  /*
    * Returns a calculated width of the rendered survey element in CSS values.
    */
  def renderWidth: String = js.native
  def renderWidth_=(`val`: String): Unit = js.native
  
  /*
    * Increases or decreases indent of the survey element content from the right edge. Accepts positive integer values and 0.
    */
  def rightIndent: Double = js.native
  def rightIndent_=(`val`: Double): Unit = js.native
  
  def rootStyle: Any = js.native
  
  def selectedElementInDesign: Any = js.native
  
  var selectedElementInDesignValue: Any = js.native
  
  def selectedElementInDesign_=(`val`: Any): Unit = js.native
  
  /* protected */ def setPage(parent: IPanel, newPage: IPage): Unit = js.native
  
  def setParentQuestion(`val`: Any): Unit = js.native
  
  /* protected */ def setSurveyCore(value: ISurvey): Unit = js.native
  
  /* CompleteClass */
  var shortcutText: String = js.native
  @JSName("shortcutText")
  def shortcutText_MSurveyElement: String = js.native
  
  @JSName("skeletonComponentName")
  def skeletonComponentName_MSurveyElement: String = js.native
  
  /*
    * Gets and sets the survey element's expand state.
    * 
    * Possible values:
    * 
    * - `"default"` (default) - The survey element is displayed in full and cannot be collapsed in the UI.
    * - `"expanded"` - The survey element is displayed in full and can be collapsed in the UI.
    * - `"collapsed"` - The survey element displays only `title` and `description` and can be expanded in the UI.
    */
  def state: String = js.native
  
  @JSName("stateChangedCallback")
  var stateChangedCallback_FSurveyElement: Any = js.native
  
  def state_=(`val`: String): Unit = js.native
  
  /*
    * Returns the survey object.
    */
  def survey: ISurvey = js.native
  
  var surveyDataValue: ISurveyData = js.native
  
  /* protected */ def surveyImpl: ISurveyImpl = js.native
  
  var surveyImplValue: ISurveyImpl = js.native
  
  var surveyValue: ISurvey = js.native
  
  /* protected */ def textProcessor: ITextProcessor = js.native
  
  var textProcessorValue: ITextProcessor = js.native
  
  def titleActions: Any = js.native
  
  var titleToolbarValue: Any = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  def updateContainsErrors(): Unit = js.native
  
  def updateCustomWidgets(): Unit = js.native
  
  def updateElementCss(): Unit = js.native
  def updateElementCss(reNew: Boolean): Unit = js.native
  
  /* protected */ def updateElementCssCore(cssClasses: Any): Unit = js.native
  
  /*
    * Sets survey element width in CSS values.
    * 
    * Default value: ""
    */
  def width: String = js.native
  def width_=(`val`: String): Unit = js.native
}
/* static members */
object SurveyElement {
  
  @JSImport("survey-knockout", "SurveyElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "SurveyElement.CreateDisabledDesignElements")
  @js.native
  def CreateDisabledDesignElements: Boolean = js.native
  inline def CreateDisabledDesignElements_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisabledDesignElements")(x.asInstanceOf[js.Any])
  
  inline def FocusElement(elementId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusElement")(elementId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def GetFirstNonTextElement(elements: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstNonTextElement")(elements.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def GetFirstNonTextElement(elements: Any, removeSpaces: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstNonTextElement")(elements.asInstanceOf[js.Any], removeSpaces.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ScrollElementToTop(elementId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollElementToTop")(elementId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getProgressInfoByElements(children: Any, isRequired: Boolean): IProgressInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgressInfoByElements")(children.asInstanceOf[js.Any], isRequired.asInstanceOf[js.Any])).asInstanceOf[IProgressInfo]
}
