package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IPanel because var conflicts: isPage, isReadOnly, isVisible, name. Inlined getChildrenLayoutType, getQuestionTitleLocation, parent, elementWidthChanged, indexOf */ @JSImport("survey-knockout", "PanelModelBase")
@js.native
class PanelModelBase ()
  extends SurveyElement
     with IConditionRunner
     with ISurveyErrorOwner {
  def this(name: java.lang.String) = this()
  val cssClasses: js.Any = js.native
  val depth: scala.Double = js.native
  /**
    * PanelModel or PageModel description property. It renders under title by using smaller font. Unlike the title, description can be empty.
    * @see title
    */
  var description: java.lang.String = js.native
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
  var enableIf: java.lang.String = js.native
  /**
    * A unique element identificator. It is generated automatically.
    */
  var id: java.lang.String = js.native
  /**
    * Returns true if the current object is Page and it is the current page.
    */
  val isActive: scala.Boolean = js.native
  /**
    * Returns true if the current object is Panel. Returns false if the current object is Page (a root Panel).
    */
  val isPanel: scala.Boolean = js.native
  /**
    * Set this property to true, to require the answer at least in one question in the panel.
    */
  var isRequired: scala.Boolean = js.native
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
  val processedTitle: java.lang.String = js.native
  /**
    * Set this property different from "default" to set the specific question title location for this panel/page.
    * @see SurveyModel.questionTitleLocation
    */
  var questionTitleLocation: java.lang.String = js.native
  /**
    * Returns the list of all questions located in the Panel/Page, including in the nested Panels.
    * @see Question
    * @see elements
    */
  val questions: js.Array[Question] = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: java.lang.String = js.native
  val root: PanelModelBase = js.native
  val rows: js.Array[QuestionRowModel] = js.native
  /**
    * PanelModel or PageModel title property.
    * @description
    */
  var title: java.lang.String = js.native
  /**
    * Use it to get/set the object visibility.
    * @see visibleIf
    */
  var visible: scala.Boolean = js.native
  /**
    * An expression that returns true or false. If it returns true the Panel becomes visible and if it returns false the Panel becomes invisible. The library runs the expression on survey start and on changing a question value. If the property is empty then visible property is used.
    * @see visible
    */
  var visibleIf: java.lang.String = js.native
  /**
    * Add an element into Panel or Page. Returns true if the element added successfully. Otherwise returns false.
    * @param element
    * @param index element index in the elements array
    */
  def addElement(element: IElement): scala.Boolean = js.native
  def addElement(element: IElement, index: scala.Double): scala.Boolean = js.native
  def addElementCallback(element: IElement): scala.Unit = js.native
  /**
    * Creates a new panel and adds it into the end of the elements list. Returns null, if the panel could not be created or could not be added into page or panel.
    * @param name a panel name
    */
  def addNewPanel(): PanelModel = js.native
  def addNewPanel(name: java.lang.String): PanelModel = js.native
  /**
    * Creates a new question and adds it at location of index, by default the end of the elements list. Returns null, if the question could not be created or could not be added into page or panel.
    * @param questionType the possible values are: "text", "checkbox", "dropdown", "matrix", "html", "matrixdynamic", "matrixdropdown" and so on.
    * @param name a question name
    * @param index element index in the elements array
    */
  def addNewQuestion(questionType: java.lang.String): Question = js.native
  def addNewQuestion(questionType: java.lang.String, name: java.lang.String): Question = js.native
  def addNewQuestion(questionType: java.lang.String, name: java.lang.String, index: scala.Double): Question = js.native
  /**
    * Add a panel into Panel or Page.  Returns true if the panel added successfully. Otherwise returns false.
    * @param panel
    * @param index element index in the elements array
    */
  def addPanel(panel: PanelModel): scala.Boolean = js.native
  def addPanel(panel: PanelModel, index: scala.Double): scala.Boolean = js.native
  /**
    * Fill list array with the panels.
    * @param list
    */
  def addPanelsIntoList(list: js.Array[IPanel]): scala.Unit = js.native
  def addPanelsIntoList(list: js.Array[IPanel], visibleOnly: scala.Boolean): scala.Unit = js.native
  def addPanelsIntoList(list: js.Array[IPanel], visibleOnly: scala.Boolean, includingDesignTime: scala.Boolean): scala.Unit = js.native
  /**
    * Add a question into Panel or Page. Returns true if the question added successfully. Otherwise returns false.
    * @param question
    * @param index element index in the elements array
    */
  def addQuestion(question: Question): scala.Boolean = js.native
  def addQuestion(question: Question, index: scala.Double): scala.Boolean = js.native
  /**
    * Fill list array with the questions.
    * @param list
    * @param visibleOnly set it to true to get visible questions only
    */
  def addQuestionsToList(list: js.Array[IQuestion]): scala.Unit = js.native
  def addQuestionsToList(list: js.Array[IQuestion], visibleOnly: scala.Boolean): scala.Unit = js.native
  def addQuestionsToList(list: js.Array[IQuestion], visibleOnly: scala.Boolean, includingDesignTime: scala.Boolean): scala.Unit = js.native
  /* protected */ def canAddElement(element: IElement): scala.Boolean = js.native
  /* protected */ def childVisibilityChanged(): scala.Unit = js.native
  /**
    * Call this function to clear all errors in the panel / page and all its child elements (panels and questions)
    */
  def clearErrors(): scala.Unit = js.native
  /**
    * Call this function to remove all question values from the current page/panel, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    * @see Question.clearIncorrectValues
    */
  def clearIncorrectValues(): scala.Unit = js.native
  /**
    * Returns true if the current element belongs to the Panel/Page. It looks in nested Panels as well.
    * @param element
    * @see PanelModel
    */
  def containsElement(element: IElement): scala.Boolean = js.native
  /* protected */ def createNewPanel(name: java.lang.String): PanelModel = js.native
  /* protected */ def createRow(): QuestionRowModel = js.native
  /* protected */ def dragDropAddTarget(dragDropInfo: DragDropInfo): scala.Unit = js.native
  /* protected */ def dragDropFindRow(findElement: ISurveyElement): QuestionRowModel = js.native
  def dragDropMoveElement(src: IElement, target: IElement, targetIndex: scala.Double): scala.Unit = js.native
  def elementWidthChanged(el: IElement): scala.Unit = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Any(el: IElement): js.Any = js.native
  def getChildrenLayoutType(): java.lang.String = js.native
  /**
    * Returns question comments on the current page
    */
  def getComments(): js.Any = js.native
  /**
    * Retuns the element by its name. It works recursively.
    * @param name the element name
    */
  def getElementByName(name: java.lang.String): IElement = js.native
  /* CompleteClass */
  override def getErrorCustomText(text: java.lang.String, error: SurveyError): java.lang.String = js.native
  def getFirstQuestionToFocus(): Question = js.native
  def getFirstQuestionToFocus(withError: scala.Boolean): Question = js.native
  def getIsPageVisible(exceptionQuestion: IQuestion): scala.Boolean = js.native
  def getLayoutType(): java.lang.String = js.native
  /* CompleteClass */
  override def getLocale(): java.lang.String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  def getPanel(): IPanel = js.native
  /* CompleteClass */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  /**
    * Returns the question by its name
    * @param name the question name
    */
  def getQuestionByName(name: java.lang.String): Question = js.native
  def getQuestionByValueName(valueName: java.lang.String): Question = js.native
  def getQuestionTitleLocation(): java.lang.String = js.native
  /* protected */ def getRenderedTitle(str: java.lang.String): java.lang.String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): java.lang.String = js.native
  /**
    * Returns question values on the current page
    */
  def getValue(): js.Any = js.native
  /**
    * Returns true, if there is an error on this Page or inside the current Panel
    * @param fireCallback set it to true, to show errors in UI
    * @param focuseOnFirstError set it to true to focuse on the first question that doesn't pass the validation
    */
  def hasErrors(): scala.Boolean = js.native
  def hasErrors(fireCallback: scala.Boolean): scala.Boolean = js.native
  def hasErrors(fireCallback: scala.Boolean, focuseOnFirstError: scala.Boolean): scala.Boolean = js.native
  /* protected */ def hasErrorsCore(rec: js.Any): scala.Unit = js.native
  /**
    * Returns the index of element parameter in the elements list.
    * @param element question or panel
    */
  def indexOf(element: IElement): scala.Double = js.native
  def isLayoutTypeSupported(layoutType: java.lang.String): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): scala.Unit with js.Any = js.native
  /* protected */ def onAddElement(element: IElement, index: scala.Double): scala.Unit = js.native
  def onAnyValueChanged(name: java.lang.String): scala.Unit = js.native
  def onGetQuestionTitleLocation(): java.lang.String = js.native
  /* protected */ def onRemoveElement(element: IElement): scala.Unit = js.native
  /* protected */ def onRowsChanged(): scala.Unit = js.native
  /* protected */ def onVisibleChanged(): scala.Unit = js.native
  /**
    * Remove an element (Panel or Question) from the elements list.
    * @param element
    * @see elements
    */
  def removeElement(element: IElement): scala.Boolean = js.native
  def removeElementCallback(element: IElement): scala.Unit = js.native
  /**
    * Remove question  from the elements list.
    * @param question
    * @see elements
    * @see removeElement
    */
  def removeQuestion(question: Question): scala.Unit = js.native
  /* CompleteClass */
  override def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
  def updateElementVisibility(): scala.Unit = js.native
  /* protected */ def updateRowsRemoveElementFromRow(element: IElement, row: QuestionRowModel): scala.Unit = js.native
}

