package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, parent, elementWidthChanged, indexOf, elements */ @JSImport("survey-knockout", "PanelModelBase")
@js.native
class PanelModelBase ()
  extends SurveyElement
     with IConditionRunner
     with ISurveyErrorOwner {
  def this(name: String) = this()
  val _showDescription: Boolean = js.native
  val _showTitle: Boolean = js.native
  val css: js.Any = js.native
  val cssClasses: js.Any = js.native
  val depth: Double = js.native
  /**
    * PanelModel or PageModel description property. It renders under title by using smaller font. Unlike the title, description can be empty.
    * @see title
    */
  var description: String = js.native
  /**
    * Returns the list of the elements in the object, Panel/Page. Elements can be questions or panels. The function doesn't return elements in the nested Panels.
    */
  val elements: js.Array[IElement] = js.native
  /**
    * An expression that returns true or false. If it returns false the Panel/Page becomes read only and an end-user will not able to answer on qustions inside it.
    * The library runs the expression on survey start and on changing a question value. If the property is empty then readOnly property is used.
    * @see readOnly
    * @see isReadOnly
    */
  var enableIf: String = js.native
  /**
    * A unique element identificator. It is generated automatically.
    */
  var id: String = js.native
  /**
    * Returns true if the current object is Page and it is the current page.
    */
  val isActive: Boolean = js.native
  /**
    * Set this property to true, to require the answer at least in one question in the panel.
    */
  var isRequired: Boolean = js.native
  val locDescription: LocalizableString = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * A parent element. It is always null for the Page object and always not null for the Panel object. Panel object may contain Questions and other Panels.
    */
  var parent: IPanel | PanelModelBase = js.native
  /**
    * Returns rendered title text or html.
    */
  val processedTitle: String = js.native
  /**
    * Set this property different from "default" to set the specific question title location for this panel/page.
    * @see SurveyModel.questionTitleLocation
    */
  var questionTitleLocation: String = js.native
  /**
    * Returns the list of all questions located in the Panel/Page, including in the nested Panels.
    * @see Question
    * @see elements
    */
  val questions: js.Array[Question] = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: String = js.native
  val root: PanelModelBase = js.native
  val rows: js.Array[QuestionRowModel] = js.native
  /**
    * PanelModel or PageModel title property.
    * @description
    */
  var title: String = js.native
  /**
    * Use it to get/set the object visibility.
    * @see visibleIf
    */
  var visible: Boolean = js.native
  /**
    * An expression that returns true or false. If it returns true the Panel becomes visible and if it returns false the Panel becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
    * @see visible
    */
  var visibleIf: String = js.native
  /**
    * Add an element into Panel or Page. Returns true if the element added successfully. Otherwise returns false.
    * @param element
    * @param index element index in the elements array
    */
  def addElement(element: IElement): Boolean = js.native
  def addElement(element: IElement, index: Double): js.Any = js.native
  def addElementCallback(element: IElement): Unit = js.native
  @JSName("addElement")
  def addElement_Boolean(element: IElement, index: Double): Boolean = js.native
  /**
    * Creates a new panel and adds it into the end of the elements list. Returns null, if the panel could not be created or could not be added into page or panel.
    * @param name a panel name
    */
  def addNewPanel(): PanelModel = js.native
  def addNewPanel(name: String): PanelModel = js.native
  /**
    * Creates a new question and adds it at location of index, by default the end of the elements list. Returns null, if the question could not be created or could not be added into page or panel.
    * @param questionType the possible values are: "text", "checkbox", "dropdown", "matrix", "html", "matrixdynamic", "matrixdropdown" and so on.
    * @param name a question name
    * @param index element index in the elements array
    */
  def addNewQuestion(questionType: String): Question = js.native
  def addNewQuestion(questionType: String, name: String): Question = js.native
  def addNewQuestion(questionType: String, name: String, index: Double): Question = js.native
  /**
    * Add a panel into Panel or Page.  Returns true if the panel added successfully. Otherwise returns false.
    * @param panel
    * @param index element index in the elements array
    */
  def addPanel(panel: PanelModel): Boolean = js.native
  def addPanel(panel: PanelModel, index: Double): Boolean = js.native
  /**
    * Fill list array with the panels.
    * @param list
    */
  def addPanelsIntoList(list: js.Array[IPanel]): Unit = js.native
  def addPanelsIntoList(list: js.Array[IPanel], visibleOnly: Boolean): Unit = js.native
  def addPanelsIntoList(list: js.Array[IPanel], visibleOnly: Boolean, includingDesignTime: Boolean): Unit = js.native
  /**
    * Add a question into Panel or Page. Returns true if the question added successfully. Otherwise returns false.
    * @param question
    * @param index element index in the elements array
    */
  def addQuestion(question: Question): Boolean = js.native
  def addQuestion(question: Question, index: Double): Boolean = js.native
  /**
    * Fill list array with the questions.
    * @param list
    * @param visibleOnly set it to true to get visible questions only
    */
  def addQuestionsToList(list: js.Array[IQuestion]): Unit = js.native
  def addQuestionsToList(list: js.Array[IQuestion], visibleOnly: Boolean): Unit = js.native
  def addQuestionsToList(list: js.Array[IQuestion], visibleOnly: Boolean, includingDesignTime: Boolean): Unit = js.native
  /* protected */ def beforeSetVisibleIndex(index: Double): Double = js.native
  /* protected */ def canAddElement(element: IElement): Boolean = js.native
  /* protected */ def childVisibilityChanged(): Unit = js.native
  /**
    * Call this function to clear all errors in the panel / page and all its child elements (panels and questions)
    */
  def clearErrors(): Unit = js.native
  /**
    * Call this function to remove all question values from the current page/panel, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    * @see Question.clearIncorrectValues
    */
  def clearIncorrectValues(): Unit = js.native
  /**
    * Returns true if the current element belongs to the Panel/Page. It looks in nested Panels as well.
    * @param element
    * @see PanelModel
    */
  def containsElement(element: IElement): Boolean = js.native
  /* protected */ def createNewPanel(name: String): PanelModel = js.native
  /* protected */ def createRow(): QuestionRowModel = js.native
  /* protected */ def dragDropAddTarget(dragDropInfo: DragDropInfo): Unit = js.native
  /* protected */ def dragDropFindRow(findElement: ISurveyElement): QuestionRowModel = js.native
  def dragDropMoveElement(src: IElement, target: IElement, targetIndex: Double): Unit = js.native
  def elementWidthChanged(el: IElement): js.Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  /**
    * Call it to focus the input of the first question that has an error.
    */
  def focusFirstErrorQuestion(): Unit = js.native
  /**
    * Call it to focus the input on the first question
    */
  def focusFirstQuestion(): Unit = js.native
  def getChildrenLayoutType(): String = js.native
  /**
    * Returns question comments on the current page
    */
  def getComments(): js.Any = js.native
  /**
    * Retuns the element by its name. It works recursively.
    * @param name the element name
    */
  def getElementByName(name: String): IElement = js.native
  /* CompleteClass */
  override def getErrorCustomText(text: String, error: SurveyError): String = js.native
  def getFirstQuestionToFocus(): Question = js.native
  def getFirstQuestionToFocus(withError: Boolean): Question = js.native
  def getIsPageVisible(exceptionQuestion: IQuestion): Boolean = js.native
  def getLayoutType(): String = js.native
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  def getPanel(): IPanel = js.native
  /* protected */ def getPanelStartIndex(index: Double): Double = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  /**
    * Returns the question by its name
    * @param name the question name
    */
  def getQuestionByName(name: String): Question = js.native
  def getQuestionByValueName(valueName: String): Question = js.native
  def getQuestionStartIndex(): String = js.native
  def getQuestionTitleLocation(): String = js.native
  /* protected */ def getRenderedTitle(str: String): String = js.native
  /* protected */ def getStartIndex(): String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  /**
    * Returns question values on the current page
    */
  def getValue(): js.Any = js.native
  /**
    * Returns true, if there is an error on this Page or inside the current Panel
    * @param fireCallback set it to true, to show errors in UI
    * @param focusOnFirstError set it to true to focus on the first question that doesn't pass the validation
    */
  def hasErrors(): Boolean = js.native
  def hasErrors(fireCallback: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean): Boolean = js.native
  def hasErrors(fireCallback: Boolean, focusOnFirstError: Boolean, rec: js.Any): Boolean = js.native
  /* protected */ def hasErrorsCore(rec: js.Any): Unit = js.native
  /**
    * Returns the index of element parameter in the elements list.
    * @param element question or panel
    */
  def indexOf(element: IElement): Double = js.native
  /* protected */ def isContinueNumbering(): Boolean = js.native
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit with js.Any = js.native
  /* protected */ def onAddElement(element: IElement, index: Double): Unit = js.native
  def onAnyValueChanged(name: String): Unit = js.native
  def onGetQuestionTitleLocation(): String = js.native
  /* protected */ def onRemoveElement(element: IElement): Unit = js.native
  /* protected */ def onRowsChanged(): Unit = js.native
  /* protected */ def onVisibleChanged(): Unit = js.native
  /**
    * Remove an element (Panel or Question) from the elements list.
    * @param element
    * @see elements
    */
  def removeElement(element: IElement): Boolean = js.native
  def removeElementCallback(element: IElement): Unit = js.native
  /**
    * Remove question  from the elements list.
    * @param question
    * @see elements
    * @see removeElement
    */
  def removeQuestion(question: Question): Unit = js.native
  /* CompleteClass */
  override def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
  def updateElementVisibility(): Unit = js.native
  /* protected */ def updateRowsRemoveElementFromRow(element: IElement, row: QuestionRowModel): Unit = js.native
}

