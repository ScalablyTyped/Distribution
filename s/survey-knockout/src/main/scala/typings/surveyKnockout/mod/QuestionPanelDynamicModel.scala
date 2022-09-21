package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionPanelDynamicModel")
@js.native
open class QuestionPanelDynamicModel protected ()
  extends Question
     with IQuestionPanelDynamicData {
  def this(name: String) = this()
  
  /*
    * Add a new dynamic panel based on the template Panel.
    */
  def addPanel(): PanelModel = js.native
  
  /*
    * Add a new dynamic panel based on the template Panel. It checks if canAddPanel returns true and then calls addPanel method.
    * If a renderMode is different from "list" and the current panel has erros, then
    */
  def addPanelUI(): PanelModel = js.native
  
  var addingNewPanelsValue: Any = js.native
  
  /*
    * Set this property to false to hide the 'Add New' button
    */
  def allowAddPanel: Boolean = js.native
  def allowAddPanel_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set this property to false to hide the 'Remove' button
    */
  def allowRemovePanel: Boolean = js.native
  def allowRemovePanel_=(`val`: Boolean): Unit = js.native
  
  /*
    * Returns true when an end user may add a new panel. The question is not read only and panelCount less than maxPanelCount
    * and renderMode is "list" or the current panel doesn't have any errors
    */
  def canAddPanel: Boolean = js.native
  
  /*
    * Returns true when an end user may remove a panel. The question is not read only and panelCount is more than minPanelCount
    */
  def canRemovePanel: Boolean = js.native
  
  var changingValueQuestion: Question = js.native
  
  /*
    * Set it to true, to show a confirmation dialog on removing a panel
    */
  def confirmDelete: Boolean = js.native
  
  /*
    * Use this property to change the default text showing in the confirmation delete dialog on removing a panel.
    */
  def confirmDeleteText: String = js.native
  def confirmDeleteText_=(`val`: String): Unit = js.native
  
  def confirmDelete_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def createAndSetupNewPanelObject(): PanelModel = js.native
  
  /* protected */ def createNewPanel(): PanelModel = js.native
  
  /* protected */ def createNewPanelObject(): PanelModel = js.native
  
  /*
    * The index of current active dynamical panel when the renderMode is not "list". If there is no dymamic panel (panelCount = 0) or renderMode equals "list" it returns -1, otherwise it returns a value from 0 to panelCount - 1.
    */
  def currentIndex: Double = js.native
  
  var currentIndexChangedCallback: Any = js.native
  
  var currentIndexValue: Double = js.native
  
  def currentIndex_=(`val`: Double): Unit = js.native
  
  /*
    * The current active dynamical panel when the renderMode is not "list". If there is no dymamic panel (panelCount = 0) or renderMode equals "list" it returns null.
    */
  def currentPanel: PanelModel = js.native
  
  /*
    * If it is not empty, then this value is set to every new panel, including panels created initially, unless the defaultValue is not empty
    */
  def defaultPanelValue: Any = js.native
  def defaultPanelValue_=(`val`: Any): Unit = js.native
  
  /*
    * Set it to true to copy the value into new added panel from the last panel. If defaultPanelValue is set and this property equals to true,
    * then the value for new added panel is merging.
    */
  def defaultValueFromLastPanel: Boolean = js.native
  def defaultValueFromLastPanel_=(`val`: Boolean): Unit = js.native
  
  def footerToolbar: Any = js.native
  
  var footerToolbarValue: Any = js.native
  
  def getAddButtonCss(): String = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredProperties(): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredValues(): Any = js.native
  
  /* CompleteClass */
  override def getItemIndex(item: ISurveyData): Double = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  def getNextButtonCss(): String = js.native
  
  /* CompleteClass */
  override def getPanelItemData(item: ISurveyData): Any = js.native
  
  def getPanelRemoveButtonCss(): String = js.native
  
  def getPanelWrapperCss(): String = js.native
  
  def getPrevButtonCss(): String = js.native
  
  /* CompleteClass */
  override def getRootData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getSharedQuestionFromArray(name: String, panelIndex: Double): Question = js.native
  
  def getShowNoEntriesPlaceholder(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getSurvey(): ISurvey = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  /*
    * Goes to the next panel in the PanelDynamic
    * Returns true, if it can move to the next panel. It can return false if the renderMode is "list" or the current panel has errors.
    */
  def goToNextPanel(): Boolean = js.native
  
  /*
    * Goes to the previous panel in the PanelDynamic
    */
  def goToPrevPanel(): Unit = js.native
  
  var isAddingNewPanels: Boolean = js.native
  
  var isNewPanelsValueChanged: Boolean = js.native
  
  /*
    * Returns true when currentIndex is more than or equal 0 and less than panelCount - 1.
    */
  def isNextButtonShowing: Boolean = js.native
  
  /*
    * Returns true when currentIndex is more than 0.
    */
  def isPrevButtonShowing: Boolean = js.native
  
  /*
    * Returns true when the renderMode equals to "progressBottom" or "progressTopBottom"
    */
  def isProgressBottomShowing: Boolean = js.native
  
  /*
    * Returns true when the renderMode equals to "progressTop" or "progressTopBottom"
    */
  def isProgressTopShowing: Boolean = js.native
  
  /*
    * Returns true when showRangeInProgress equals to true, renderMode doesn't equal to "list" and panelCount is >= 2.
    */
  def isRangeShowing: Boolean = js.native
  
  /*
    * Returns true when renderMode equals to "list".
    */
  def isRenderModeList: Boolean = js.native
  
  var isSetPanelItemData: Any = js.native
  
  var isValueChangingInternally: Boolean = js.native
  
  /* protected */ def items: Any = js.native
  
  /*
    * The duplication value error text. Set it to show the text different from the default.
    */
  def keyDuplicationError: String = js.native
  def keyDuplicationError_=(`val`: String): Unit = js.native
  
  /*
    * Set it to a question name used in the template panel and the library shows duplication error, if there are same values in different panels of this question.
    */
  def keyName: String = js.native
  def keyName_=(`val`: String): Unit = js.native
  
  var legacyNavigation: Boolean = js.native
  
  var loadingPanelCount: Double = js.native
  
  def locConfirmDeleteText: LocalizableString = js.native
  
  def locKeyDuplicationError: LocalizableString = js.native
  
  def locNoEntriesText: LocalizableString = js.native
  
  def locPanelAddText: LocalizableString = js.native
  
  def locPanelNextText: LocalizableString = js.native
  
  def locPanelPrevText: LocalizableString = js.native
  
  def locPanelRemoveText: LocalizableString = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  def locTemplateDescription: LocalizableString = js.native
  
  def locTemplateTitle: LocalizableString = js.native
  
  /*
    * The maximum panel count. A user could not add a panel if the panelCount equals to maxPanelCount
    */
  def maxPanelCount: Double = js.native
  def maxPanelCount_=(`val`: Double): Unit = js.native
  
  /*
    * The minimum panel count. A user could not delete a panel if the panelCount equals to minPanelCount
    */
  def minPanelCount: Double = js.native
  def minPanelCount_=(`val`: Double): Unit = js.native
  
  /*
    * A text displayed when the dynamic panel contains no entries. Applies only in the Default V2 theme.
    */
  def noEntriesText: String = js.native
  def noEntriesText_=(`val`: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  /*
    * Use this property to change the default value of add panel button text.
    */
  def panelAddText: String = js.native
  def panelAddText_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to get/set the number of dynamic panels.
    */
  def panelCount: Double = js.native
  
  var panelCountChangedCallback: Any = js.native
  
  def panelCount_=(`val`: Double): Unit = js.native
  
  /*
    * Use this property to change the default next button text. Next button shows the next panel, change the currentPanel, when the renderMode doesn't equal to "list".
    */
  def panelNextText: String = js.native
  def panelNextText_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to change the default previous button text. Previous button shows the previous panel, change the currentPanel, when the renderMode doesn't equal to "list".
    */
  def panelPrevText: String = js.native
  def panelPrevText_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to change the location of the remove button relative to the panel.
    * By default the value is "bottom". You may set it to "right" and remove button will appear to the right of the panel.
    */
  def panelRemoveButtonLocation: String = js.native
  def panelRemoveButtonLocation_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to change the default value of remove panel button text.
    */
  def panelRemoveText: String = js.native
  def panelRemoveText_=(`val`: String): Unit = js.native
  
  /*
    * The array of dynamic panels created based on panel template
    */
  def panels: Any = js.native
  
  /*
    * Use this property to allow the end-user to collapse/expand the panels. It works only if the renderMode property equals to "list" and templateTitle property is not empty. The following values are available:
    * default - the default value. User can't collapse/expand panels
    * expanded - User can collapse/expand panels and all panels are expanded by default
    * collapsed - User can collapse/expand panels and all panels are collapsed by default
    * firstExpanded - User can collapse/expand panels. The first panel is expanded and others are collapsed
    */
  def panelsState: String = js.native
  def panelsState_=(`val`: String): Unit = js.native
  
  def progress: String = js.native
  
  def progressText: String = js.native
  
  /* protected */ def rebuildPanels(): Unit = js.native
  
  /*
    * Removes a dynamic panel from the panels array.
    */
  def removePanel(value: Any): Unit = js.native
  
  /*
    * Call removePanel function. Do nothing is canRemovePanel returns false. If confirmDelete set to true, it shows the confirmation dialog first.
    */
  def removePanelUI(value: Any): Unit = js.native
  
  /*
    * By default the property equals to "list" and all dynamic panels are rendered one by one on the page. You may change it to: "progressTop", "progressBottom" or "progressTopBottom" to render only one dynamic panel at once. The progress and navigation elements can be rendred on top, bottom or both.
    */
  def renderMode: String = js.native
  
  var renderModeChangedCallback: Any = js.native
  
  def renderMode_=(`val`: String): Unit = js.native
  
  /* protected */ def runPanelsCondition(values: Any, properties: Any): Unit = js.native
  
  /* CompleteClass */
  override def setPanelItemData(item: ISurveyData, name: String, `val`: Any): Any = js.native
  
  /*
    * Use this property to show/hide the numbers in titles in questions inside a dynamic panel.
    * By default the value is "off". You may set it to "onPanel" and the first question inside a dynamic panel will start with 1 or "onSurvey" to include nested questions in dymamic panels into global survey question numbering.
    */
  def showQuestionNumbers: String = js.native
  def showQuestionNumbers_=(`val`: String): Unit = js.native
  
  /*
    * Shows the range from 1 to panelCount when renderMode doesn't equal to "list". Set to false to hide this element.
    */
  def showRangeInProgress: Boolean = js.native
  def showRangeInProgress_=(`val`: Boolean): Unit = js.native
  
  /*
    * The template Panel. This panel is used as a template on creatign dynamic panels
    */
  def template: PanelModel = js.native
  
  /*
    * The template Panel description property.
    */
  def templateDescription: String = js.native
  def templateDescription_=(`val`: String): Unit = js.native
  
  /*
    * The template Panel elements, questions and panels.
    */
  def templateElements: Any = js.native
  
  /*
    * The template Panel title property.
    */
  def templateTitle: String = js.native
  
  /*
    * Set this property different from "default" to set the specific question title location for the template questions.
    */
  def templateTitleLocation: String = js.native
  def templateTitleLocation_=(`val`: String): Unit = js.native
  
  def templateTitle_=(`val`: String): Unit = js.native
  
  var templateValue: PanelModel = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  var updateFooterActionsCallback: Any = js.native
}
