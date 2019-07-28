package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionPanelDynamicModel")
@js.native
class QuestionPanelDynamicModel protected ()
  extends Question
     with IQuestionPanelDynamicData {
  def this(name: String) = this()
  /**
    * Set this property to false to hide the 'Add New' button
    * @see allowRemovePanel
    */
  var allowAddPanel: Boolean = js.native
  /**
    * Set this property to false to hide the 'Remove' button
    * @see allowAddPanel
    */
  var allowRemovePanel: Boolean = js.native
  /**
    * Returns true when an end user may add a new panel. The question is not read only and panelCount less than maxPanelCount
    * @see isReadOnly
    * @see panelCount
    * @see maxPanelCount
    */
  val canAddPanel: Boolean = js.native
  /**
    * Returns true when an end user may remove a panel. The question is not read only and panelCount is more than minPanelCount
    * @see isReadOnly
    * @see panelCount
    * @see minPanelCount
    */
  val canRemovePanel: Boolean = js.native
  /**
    * Set it to true, to show a confirmation dialog on removing a panel
    * @see ConfirmDeleteText
    */
  var confirmDelete: Boolean = js.native
  /**
    * Use this property to change the default text showing in the confirmation delete dialog on removing a panel.
    */
  var confirmDeleteText: String = js.native
  /**
    * The index of current active dynamical panel when the renderMode is not "list". If there is no dymamic panel (panelCount = 0) or renderMode equals "list" it returns -1, otherwise it returns a value from 0 to panelCount - 1.
    * @see currentPanel
    * @see panels
    * @see panelCount
    * @see renderMode
    */
  var currentIndex: Double = js.native
  /**
    * The current active dynamical panel when the renderMode is not "list". If there is no dymamic panel (panelCount = 0) or renderMode equals "list" it returns null.
    * @see currenIndex
    * @see panels
    * @see panelCount
    * @see renderMode
    */
  val currentPanel: PanelModel = js.native
  /**
    * If it is not empty, then this value is set to every new panel, including panels created initially, unless the defaultValue is not empty
    * @see defaultValue
    * @see defaultValueFromLastRow
    */
  var defaultPanelValue: js.Any = js.native
  /**
    * Set it to true to copy the value into new added panel from the last panel. If defaultPanelValue is set and this property equals to true,
    * then the value for new added panel is merging.
    * @see defaultValue
    * @see defaultPanelValue
    */
  var defaultValueFromLastPanel: Boolean = js.native
  /**
    * Returns true when currentIndex is more than or equal 0 and less then panelCount - 1.
    * @see currenIndex
    * @see currenPanel
    * @see panelCount
    */
  val isNextButtonShowing: Boolean = js.native
  /**
    * Returns true when currentIndex is more than 0.
    * @see currenIndex
    * @see currenPanel
    */
  val isPrevButtonShowing: Boolean = js.native
  /**
    * Returns true when the renderMode equals to "progressBottom" or "progressTopBottom"
    */
  val isProgressBottomShowing: Boolean = js.native
  /**
    * Returns true when the renderMode equals to "progressTop" or "progressTopBottom"
    */
  val isProgressTopShowing: Boolean = js.native
  /**
    * Returns true when showRangeInProgress equals to true, renderMode doesn't equal to "list" and panelCount is >= 2.
    */
  val isRangeShowing: Boolean = js.native
  /**
    * Returns true when renderMode equals to "list".
    * @see renderMode
    */
  val isRenderModeList: Boolean = js.native
  val items: js.Array[ISurveyData] = js.native
  /**
    * The duplication value error text. Set it to show the text different from the default.
    * @see keyName
    */
  var keyDuplicationError: String = js.native
  /**
    * Set it to a question name used in the template panel and the library shows duplication error, if there are same values in different panels of this question.
    * @see keyDuplicationError
    */
  var keyName: String = js.native
  val locConfirmDeleteText: LocalizableString = js.native
  val locKeyDuplicationError: LocalizableString = js.native
  val locPanelAddText: LocalizableString = js.native
  val locPanelNextText: LocalizableString = js.native
  val locPanelPrevText: LocalizableString = js.native
  val locPanelRemoveText: LocalizableString = js.native
  val locTemplateDescription: LocalizableString = js.native
  val locTemplateTitle: LocalizableString = js.native
  /**
    * The maximum panel count. A user could not add a panel if the panelCount equals to maxPanelCount
    * @see panelCount
    * @see minPanelCount
    */
  var maxPanelCount: Double = js.native
  /**
    * The minimum panel count. A user could not delete a panel if the panelCount equals to minPanelCount
    * @see panelCount
    * @see maxPanelCount
    */
  var minPanelCount: Double = js.native
  /**
    * Use this property to change the default value of add panel button text.
    */
  var panelAddText: String = js.native
  /**
    * Use this property to get/set the number of dynamic panels.
    * @see template
    * @see minPanelCount
    * @see maxPanelCount
    * @see addPanel
    * @see removePanel
    * @see removePanelUI
    */
  var panelCount: Double = js.native
  /**
    * Use this property to change the default next button text. Next button shows the next panel, change the currentPanel, when the renderMode doesn't equal to "list".
    * @see currentPanel
    * @see currentIndex
    * @see renderMode
    */
  var panelNextText: String = js.native
  /**
    * Use this property to change the default previous button text. Previous button shows the previous panel, change the currentPanel, when the renderMode doesn't equal to "list".
    * @see currentPanel
    * @see currentIndex
    * @see renderMode
    */
  var panelPrevText: String = js.native
  /**
    * Use this property to change the default value of remove panel button text.
    */
  var panelRemoveText: String = js.native
  /**
    * The array of dynamic panels created based on panel template
    * @see template
    * @see panelCount
    */
  val panels: js.Array[PanelModel] = js.native
  /**
    * Use this property to allow the end-user to collapse/expand the panels. It works only if the renderMode property equals to "list" and templateTitle property is not empty. The following values are available:
    * <br/> default - the default value. User can't collpase/expand panels
    * <br/> expanded - User can collpase/expand panels and all panels are expanded by default
    * <br/> collapsed - User can collpase/expand panels and all panels are collapsed by default
    * <br/> firstExpanded - User can collpase/expand panels. The first panel is expanded and others are collapsed
    * @see renderMode
    * @see templateTitle
    */
  var panelsState: String = js.native
  /**
    * By default the property equals to "list" and all dynamic panels are rendered one by one on the page. You may change it to: "progressTop", "progressBottom" or "progressTopBottom" to render only one dynamic panel at once. The progress and navigation elements can be rendred on top, bottom or both.
    */
  var renderMode: String = js.native
  /**
    * Use this property to show/hide the numbers in titles in questions inside a dynamic panel.
    * By default the value is "off". You may set it to "onPanel" and the first question inside a dynamic panel will start with 1 or "onSurvey" to include nested questions in dymamic panels into global survey question numbering.
    */
  var showQuestionNumbers: String = js.native
  /**
    * Shows the range from 1 to panelCount when renderMode doesn't equal to "list". Set to false to hide this element.
    * @see panelCount
    * @see renderMode
    */
  var showRangeInProgress: Boolean = js.native
  /**
    * The template Panel. This panel is used as a template on creatign dynamic panels
    * @see  templateElements
    * @see templateTitle
    * @see panelCount
    */
  val template: PanelModel = js.native
  /**
    * The template Panel description property.
    * @see  templateElements
    * @see template
    * @see panelCount
    * @see templateTitle
    */
  var templateDescription: String = js.native
  /**
    * The template Panel elements, questions and panels.
    * @see  templateElements
    * @see template
    * @see panelCount
    */
  val templateElements: js.Array[IElement] = js.native
  /**
    * The template Panel title property.
    * @see  templateElements
    * @see template
    * @see panelCount
    */
  var templateTitle: String = js.native
  /**
    * Set this property different from "default" to set the specific question title location for the template questions.
    * @see SurveyModel.questionTitleLocation
    * @see PanelModelBase.questionTitleLocation
    */
  var templateTitleLocation: String = js.native
  /**
    * Add a new dynamic panel based on the template Panel.
    * @see template
    * @see panelCount
    * @see panels
    */
  def addPanel(): PanelModel = js.native
  /**
    * Add a new dynamic panel based on the template Panel. It checks if canAddPanel returns true and then calls addPanel method.
    * @see template
    * @see panelCount
    * @see panels
    * @see canAddPanel
    */
  def addPanelUI(): PanelModel = js.native
  /* protected */ def createAndSetupNewPanelObject(): PanelModel = js.native
  /* protected */ def createNewPanel(): PanelModel = js.native
  /* protected */ def createNewPanelObject(): PanelModel = js.native
  def currentIndexChangedCallback(): Unit = js.native
  /* CompleteClass */
  override def getItemIndex(item: ISurveyData): Double = js.native
  /* CompleteClass */
  override def getPanelItemData(item: ISurveyData): js.Any = js.native
  /* CompleteClass */
  override def getRootData(): ISurveyData = js.native
  /* CompleteClass */
  override def getSharedQuestionFromArray(name: String, panelIndex: Double): Question = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* InferMemberOverrides */
  override def getType(): String = js.native
  /**
    * Goes to the next panel in the PanelDynamic
    *
    */
  def goToNextPanel(): Unit = js.native
  /**
    * Goes to the previous panel in the PanelDynamic
    *
    */
  def goToPrevPanel(): Unit = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): js.Any with Unit = js.native
  def panelCountChangedCallback(): Unit = js.native
  /* protected */ def rebuildPanels(): Unit = js.native
  /**
    * Removes a dynamic panel from the panels array.
    * @param value a panel or panel index
    * @see panels
    * @see template
    */
  def removePanel(value: js.Any): Unit = js.native
  /**
    * Call removePanel function. Do nothing is canRemovePanel returns false. If confirmDelete set to true, it shows the confirmation dialog first.
    * @param value a panel or panel index
    * @see removePanel
    * @see confirmDelete
    * @see confirmDeleteText
    * @see canRemovePanel
    *
    */
  def removePanelUI(value: js.Any): Unit = js.native
  def renderModeChangedCallback(): Unit = js.native
  /* protected */ def runPanelsCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  /* CompleteClass */
  override def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any = js.native
}

