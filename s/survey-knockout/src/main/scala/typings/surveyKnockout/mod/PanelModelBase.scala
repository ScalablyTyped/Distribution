package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IShortcutText because Already inherited
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.ITitleOwner because var conflicts: locTitle, name. Inlined no, requiredText, isRequireTextOnStart, isRequireTextBeforeTitle, isRequireTextAfterTitle
- typings.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, shortcutText, skeletonComponentName. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements, ensureRowsVisibility */ @JSImport("survey-knockout", "PanelModelBase")
@js.native
open class PanelModelBase ()
  extends SurveyElement
     with IConditionRunner
     with ISurveyErrorOwner {
  def this(name: String) = this()
  
  def _showDescription: Boolean = js.native
  
  /*
    * Add an element into Panel or Page. Returns true if the element added successfully. Otherwise returns false.
    */
  def addElement(element: IElement): Boolean = js.native
  def addElement(element: IElement, index: Double): Any = js.native
  
  def addElementCallback(element: IElement): Unit = js.native
  
  @JSName("addElement")
  def addElement_Boolean(element: IElement, index: Double): Boolean = js.native
  
  /*
    * Creates a new panel and adds it into the end of the elements list. Returns null, if the panel could not be created or could not be added into page or panel.
    */
  def addNewPanel(): PanelModel = js.native
  def addNewPanel(name: String): PanelModel = js.native
  
  /*
    * Creates a new question and adds it at location of index, by default the end of the elements list. Returns null, if the question could not be created or could not be added into page or panel.
    */
  def addNewQuestion(questionType: String): Question = js.native
  def addNewQuestion(questionType: String, name: String): Question = js.native
  def addNewQuestion(questionType: String, name: String, index: Double): Question = js.native
  def addNewQuestion(questionType: String, name: Unit, index: Double): Question = js.native
  
  /*
    * Add a panel into Panel or Page.  Returns true if the panel added successfully. Otherwise returns false.
    */
  def addPanel(panel: PanelModel): Boolean = js.native
  def addPanel(panel: PanelModel, index: Double): Boolean = js.native
  
  /*
    * Fill list array with the panels.
    */
  def addPanelsIntoList(list: Any): Unit = js.native
  def addPanelsIntoList(list: Any, visibleOnly: Boolean): Unit = js.native
  def addPanelsIntoList(list: Any, visibleOnly: Boolean, includingDesignTime: Boolean): Unit = js.native
  def addPanelsIntoList(list: Any, visibleOnly: Unit, includingDesignTime: Boolean): Unit = js.native
  
  /*
    * Add a question into Panel or Page. Returns true if the question added successfully. Otherwise returns false.
    */
  def addQuestion(question: Question): Boolean = js.native
  def addQuestion(question: Question, index: Double): Boolean = js.native
  
  /*
    * Fill list array with the questions.
    */
  def addQuestionsToList(list: Any): Unit = js.native
  def addQuestionsToList(list: Any, visibleOnly: Boolean): Unit = js.native
  def addQuestionsToList(list: Any, visibleOnly: Boolean, includingDesignTime: Boolean): Unit = js.native
  def addQuestionsToList(list: Any, visibleOnly: Unit, includingDesignTime: Boolean): Unit = js.native
  
  /* protected */ def beforeSetVisibleIndex(index: Double): Double = js.native
  
  /* protected */ def canAddElement(element: IElement): Boolean = js.native
  
  /* protected */ def canRenderFirstRows(): Boolean = js.native
  
  /* protected */ def canShowTitle(): Boolean = js.native
  
  /* protected */ def childVisibilityChanged(): Unit = js.native
  
  /*
    * Call this function to clear all errors in the panel / page and all its child elements (panels and questions)
    */
  def clearErrors(): Unit = js.native
  
  /*
    * Call this function to remove all question values from the current page/panel, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    */
  def clearIncorrectValues(): Unit = js.native
  
  /*
    * Returns true if the current element belongs to the Panel/Page. It looks in nested Panels as well.
    */
  def containsElement(element: IElement): Boolean = js.native
  
  /* protected */ def createNewPanel(name: String): PanelModel = js.native
  
  /* protected */ def createRow(): QuestionRowModel = js.native
  
  /* protected */ def createRowAndSetLazy(index: Double): QuestionRowModel = js.native
  
  def cssDescription: String = js.native
  
  def cssHeader: String = js.native
  
  def depth: Double = js.native
  
  /* protected */ def dragDropAddTarget(dragDropInfo: DragDropInfo): Unit = js.native
  
  def dragDropFindRow(findElement: ISurveyElement): QuestionRowModel = js.native
  
  def dragDropMoveElement(src: IElement, target: IElement, targetIndex: Double): Unit = js.native
  
  def elementWidthChanged(el: IElement): Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  
  /*
    * Returns the list of the elements in the object, Panel/Page. Elements can be questions or panels. The function doesn't return elements in the nested Panels.
    */
  def elements: Any = js.native
  
  var elementsValue: Any = js.native
  
  @JSName("elements")
  var elements_FPanelModelBase: Any = js.native
  
  /*
    * An expression that returns true or false. If it returns false the Panel/Page becomes read only and an end-user will not able to answer on qustions inside it.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then readOnly property is used.
    */
  def enableIf: String = js.native
  def enableIf_=(`val`: String): Unit = js.native
  
  def ensureRowsVisibility(): Unit = js.native
  
  /*
    * Call it to focus the input of the first question that has an error.
    */
  def focusFirstErrorQuestion(): Unit = js.native
  
  /*
    * Call it to focus the input on the first question
    */
  def focusFirstQuestion(): Unit = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  /*
    * Returns question comments on the current page
    */
  def getComments(): Any = js.native
  
  /*
    * Return questions values as a JSON object with display text. For example, for dropdown, it would return the item text instead of item value.
    */
  def getDisplayValue(keysAsText: Boolean): Any = js.native
  
  /* protected */ def getDragDropInfo(): Any = js.native
  
  /*
    * Returns the element by its name. It works recursively.
    */
  def getElementByName(name: String): IElement = js.native
  
  /* CompleteClass */
  override def getErrorCustomText(text: String, error: SurveyError): String = js.native
  
  def getFirstQuestionToFocus(): Question = js.native
  def getFirstQuestionToFocus(withError: Boolean): Question = js.native
  
  def getIsPageVisible(exceptionQuestion: IQuestion): Boolean = js.native
  
  def getLayoutType(): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  def getPanel(): IPanel = js.native
  
  /* protected */ def getPanelStartIndex(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /*
    * Returns the question by its name
    */
  def getQuestionByName(name: String): Question = js.native
  
  def getQuestionByValueName(valueName: String): Question = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  /* protected */ def getRenderedTitle(str: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  /* protected */ def getStartIndex(): String = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  /*
    * Returns question values on the current page
    */
  def getValue(): Any = js.native
  
  def hasDescriptionUnderTitle: Boolean = js.native
  
  /*
    * Returns true, if there is an error on this Page or inside the current Panel
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean, rec: Any): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Unit, rec: Any): Boolean = js.native
  def hasErrors(fireCallback: Unit, focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Unit, focusOnFirstError: Boolean, rec: Any): Boolean = js.native
  def hasErrors(fireCallback: Unit, focusOnFirstError: Unit, rec: Any): Boolean = js.native
  
  /* protected */ def hasErrorsCore(rec: Any): Unit = js.native
  
  /*
    * A unique element identificator. It is generated automatically.
    */
  def id: String = js.native
  def id_=(`val`: String): Unit = js.native
  
  /*
    * Returns the index of element parameter in the elements list.
    */
  def indexOf(element: IElement): Double = js.native
  
  def insertElementAfter(element: IElement, after: IElement): Unit = js.native
  
  def insertElementBefore(element: IElement, before: IElement): Unit = js.native
  
  /*
    * Returns true if the current object is Page and it is the current page.
    */
  def isActive: Boolean = js.native
  
  /* protected */ def isContinueNumbering(): Boolean = js.native
  
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  
  /*
    * Returns true if the current object is Panel. Returns false if the current object is Page (a root Panel).
    */
  @JSName("isPanel")
  def isPanel_MPanelModelBase: Boolean = js.native
  
  var isQuestionsReady: Boolean = js.native
  
  /* protected */ var isRandomizing: Boolean = js.native
  
  @JSName("isReadOnly")
  def isReadOnly_MPanelModelBase: Boolean = js.native
  
  def isRequireTextAfterTitle: Boolean = js.native
  @JSName("isRequireTextAfterTitle")
  var isRequireTextAfterTitle_FPanelModelBase: Boolean = js.native
  
  def isRequireTextBeforeTitle: Boolean = js.native
  @JSName("isRequireTextBeforeTitle")
  var isRequireTextBeforeTitle_FPanelModelBase: Boolean = js.native
  
  def isRequireTextOnStart: Boolean = js.native
  @JSName("isRequireTextOnStart")
  var isRequireTextOnStart_FPanelModelBase: Boolean = js.native
  
  /*
    * Set this property to true, to require the answer at least in one question in the panel.
    */
  def isRequired: Boolean = js.native
  def isRequired_=(`val`: Boolean): Unit = js.native
  
  /*
    * Returns true if object is visible or survey is in design mode right now.
    */
  @JSName("isVisible")
  def isVisible_MPanelModelBase: Boolean = js.native
  
  var lastVisibleIndex: Double = js.native
  
  def locRequiredErrorText: LocalizableString = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  def needResponsiveWidth(): Boolean = js.native
  
  def no: String = js.native
  @JSName("no")
  var no_FPanelModelBase: String = js.native
  
  /* protected */ def onAddElement(element: IElement, index: Double): Unit = js.native
  
  def onAnyValueChanged(name: String): Unit = js.native
  
  var onGetQuestionTitleLocation: Any = js.native
  
  /* protected */ def onRemoveElement(element: IElement): Unit = js.native
  
  /* protected */ def onRowsChanged(): Unit = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  /* protected */ def onVisibleChanged(): Unit = js.native
  
  /*
    * A parent element. It is always null for the Page object and always not null for the Panel object. Panel object may contain Questions and other Panels.
    */
  @JSName("parent")
  def parent_MPanelModelBase: PanelModelBase = js.native
  
  /*
    * Returns rendered title text or html.
    */
  def processedTitle: String = js.native
  
  /*
    * Set this property different from "default" to set the specific question title location for this panel/page.
    */
  def questionTitleLocation: String = js.native
  def questionTitleLocation_=(`val`: String): Unit = js.native
  
  /*
    * Returns the list of all questions located in the Panel/Page, including in the nested Panels.
    */
  def questions: Any = js.native
  
  /*
    * Use this property to randomize questions. Set it to 'random' to randomize questions, 'initial' to keep them in the same order or 'default' to use the Survey questionsOrder property
    */
  def questionsOrder: String = js.native
  def questionsOrder_=(`val`: String): Unit = js.native
  
  var questionsValue: Any = js.native
  
  def randomizeElements(isRandom: Boolean): Unit = js.native
  
  /*
    * Remove an element (Panel or Question) from the elements list.
    */
  def removeElement(element: IElement): Boolean = js.native
  
  def removeElementCallback(element: IElement): Unit = js.native
  
  /*
    * Remove question  from the elements list.
    */
  def removeQuestion(question: Question): Unit = js.native
  
  /*
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  def requiredErrorText: String = js.native
  def requiredErrorText_=(`val`: String): Unit = js.native
  
  /*
    * An expression that returns true or false. If it returns true the Panel/Page becomes required.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then isRequired property is used.
    */
  def requiredIf: String = js.native
  def requiredIf_=(`val`: String): Unit = js.native
  
  /*
    * Returns the char/string for a required panel.
    */
  def requiredText: String = js.native
  @JSName("requiredText")
  var requiredText_FPanelModelBase: String = js.native
  
  /* protected */ def root: PanelModelBase = js.native
  
  def rows: Any = js.native
  
  /* CompleteClass */
  override def runCondition(values: Any, properties: Any): Any = js.native
  
  var showDescription: Boolean = js.native
  
  var showTitle: Boolean = js.native
  
  /* protected */ def titlePattern: String = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  def updateElementVisibility(): Unit = js.native
  
  def updateRows(): Unit = js.native
  
  /* protected */ def updateRowsRemoveElementFromRow(element: IElement, row: QuestionRowModel): Unit = js.native
  
  /*
    * Use it to get/set the object visibility.
    */
  def visible: Boolean = js.native
  
  /*
    * An expression that returns true or false. If it returns true the Panel becomes visible and if it returns false the Panel becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
    */
  def visibleIf: String = js.native
  def visibleIf_=(`val`: String): Unit = js.native
  
  def visible_=(`val`: Boolean): Unit = js.native
}
/* static members */
object PanelModelBase {
  
  @JSImport("survey-knockout", "PanelModelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "PanelModelBase.panelCounter")
  @js.native
  def panelCounter: Double = js.native
  inline def panelCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("panelCounter")(x.asInstanceOf[js.Any])
}
