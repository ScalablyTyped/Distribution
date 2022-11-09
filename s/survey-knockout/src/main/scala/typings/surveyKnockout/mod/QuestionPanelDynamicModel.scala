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
    * Specifies whether users are allowed to add new panels.
    * 
    * Default value: `true`
    */
  def allowAddPanel: Boolean = js.native
  def allowAddPanel_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether users are allowed to delete panels.
    * 
    * Default value: `true`
    */
  def allowRemovePanel: Boolean = js.native
  def allowRemovePanel_=(`val`: Boolean): Unit = js.native
  
  /*
    * Indicates whether it is possible to add a new panel.
    * 
    * This property returns `true` when all of the following conditions apply:
    * 
    * - Users are allowed to add new panels (`allowAddPanel` is `true`).
    * - Dynamic Panel or its parent survey is not in read-only state.
    * - `panelCount` is less than `maxPanelCount`.
    */
  def canAddPanel: Boolean = js.native
  
  /*
    * Indicates whether it is possible to delete panels.
    * 
    * This property returns `true` when all of the following conditions apply:
    * 
    * - Users are allowed to delete panels (`allowRemovePanel` is `true`).
    * - Dynamic Panel or its parent survey is not in read-only state.
    * - `panelCount` exceeds `minPanelCount`.
    */
  def canRemovePanel: Boolean = js.native
  
  var changingValueQuestion: Question = js.native
  
  /*
    * Specifies whether to display a confirmation dialog when a respondent wants to delete a panel.
    */
  def confirmDelete: Boolean = js.native
  
  /*
    * A message displayed in a confirmation dialog that appears when a respondent wants to delete a panel.
    */
  def confirmDeleteText: String = js.native
  def confirmDeleteText_=(`val`: String): Unit = js.native
  
  def confirmDelete_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def createAndSetupNewPanelObject(): PanelModel = js.native
  
  /* protected */ def createNewPanel(): PanelModel = js.native
  
  /* protected */ def createNewPanelObject(): PanelModel = js.native
  
  /*
    * A zero-based index of the currently displayed panel.
    * 
    * When `renderMode` is `"list"` or Dynamic Panel is empty (`panelCount` is 0), this property contains -1.
    */
  def currentIndex: Double = js.native
  
  var currentIndexChangedCallback: Any = js.native
  
  var currentIndexValue: Double = js.native
  
  def currentIndex_=(`val`: Double): Unit = js.native
  
  /*
    * A `PanelModel` object that is the currently displayed panel.
    * 
    * When `renderMode` is `"list"` or Dynamic Panel is empty (`panelCount` is 0), this property contains `null`.
    */
  def currentPanel: PanelModel = js.native
  
  /*
    * If it is not empty, then this value is set to every new panel, including panels created initially, unless the defaultValue is not empty
    */
  def defaultPanelValue: Any = js.native
  def defaultPanelValue_=(`val`: Any): Unit = js.native
  
  /*
    * Specifies whether default values for a new panel should be copied from the last panel.
    * 
    * If you also specify `defaultValue`, it will be merged with the copied values.
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
    * Switches Dynamic Panel to the next panel. Returns `true` in case of success, or `false` if `renderMode` is `"list"` or the current panel contains validation errors.
    */
  def goToNextPanel(): Boolean = js.native
  
  /*
    * Switches Dynamic Panel to the previous panel.
    */
  def goToPrevPanel(): Unit = js.native
  
  var isAddingNewPanels: Boolean = js.native
  
  var isNewPanelsValueChanged: Boolean = js.native
  
  /*
    * Indicates whether the Next button is visible.
    */
  def isNextButtonShowing: Boolean = js.native
  
  /*
    * Indicates whether the Previous button is visible.
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
  
  def isRenderModeList: Boolean = js.native
  
  var isSetPanelItemData: Any = js.native
  
  var isValueChangingInternally: Boolean = js.native
  
  /* protected */ def items: Any = js.native
  
  /*
    * An error message displayed when users enter a duplicate value into a question that accepts only unique values (`isUnique` is set to `true` or `keyName` is specified).
    * 
    * A default value for this property is taken from a [localization dictionary](https://github.com/surveyjs/survey-library/tree/master/src/localization). Refer to the following help topic for more information: [Localization & Globalization](https://surveyjs.io/form-library/documentation/localization).
    */
  def keyDuplicationError: String = js.native
  def keyDuplicationError_=(`val`: String): Unit = js.native
  
  /*
    * Specifies a key question. Set this property to the name of a question used in the template, and Dynamic Panel will display `keyDuplicationError` if a user tries to enter a duplicate value in this question.
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
    * A maximum number of panels in Dynamic Panel. Users cannot add new panels if `panelCount` equals `maxPanelCount`.
    * 
    * Default value: 100 (inherited from [`settings.panelMaximumPanelCount`](https://surveyjs.io/form-library/documentation/settings#panelMaximumPanelCount))
    */
  def maxPanelCount: Double = js.native
  def maxPanelCount_=(`val`: Double): Unit = js.native
  
  /*
    * A minimum number of panels in Dynamic Panel. Users cannot delete panels if `panelCount` equals `minPanelCount`.
    * 
    * Default value: 0
    */
  def minPanelCount: Double = js.native
  def minPanelCount_=(`val`: Double): Unit = js.native
  
  /*
    * A text displayed when Dynamic Panel contains no entries. Applies only in the Default V2 theme.
    */
  def noEntriesText: String = js.native
  def noEntriesText_=(`val`: String): Unit = js.native
  
  var onReadyChangedCallback: Any = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  /*
    * A caption for the Add Panel button.
    */
  def panelAddText: String = js.native
  def panelAddText_=(`val`: String): Unit = js.native
  
  /*
    * The number of panels in Dynamic Panel.
    */
  def panelCount: Double = js.native
  
  var panelCountChangedCallback: Any = js.native
  
  def panelCount_=(`val`: Double): Unit = js.native
  
  /*
    * A caption for the Next button. Applies only if `renderMode` is different from `"list"`.
    */
  def panelNextText: String = js.native
  def panelNextText_=(`val`: String): Unit = js.native
  
  /*
    * A caption for the Previous button. Applies only if `renderMode` is different from `"list"`.
    */
  def panelPrevText: String = js.native
  def panelPrevText_=(`val`: String): Unit = js.native
  
  /*
    * Specifies the location of the Delete Panel button relative to panel content.
    * 
    * Possible values:
    * 
    * - `"bottom"` (default) - Displays the Delete Panel button below panel content.
    * - `"right"` - Displays the Delete Panel button to the right of panel content.
    */
  def panelRemoveButtonLocation: String = js.native
  def panelRemoveButtonLocation_=(`val`: String): Unit = js.native
  
  /*
    * A caption for the Delete Panel button.
    */
  def panelRemoveText: String = js.native
  def panelRemoveText_=(`val`: String): Unit = js.native
  
  /*
    * An array of `PanelModel` objects created based on the template panel.
    */
  def panels: Any = js.native
  
  /*
    * Specifies whether users can expand and collapse panels. Applies if `renderMode` is `"list"` and the `templateTitle` property is specified.
    * 
    * Possible values:
    * 
    * - `"default"` (default) - All panels are displayed in full and cannot be collapsed.
    * - `"expanded"` - All panels are displayed in full and can be collapsed in the UI.
    * - `"collapsed"` - All panels display only their titles and descriptions and can be expanded in the UI.
    * - `"firstExpanded"` - Only the first panel is displayed in full; other panels are collapsed and can be expanded in the UI.
    */
  def panelsState: String = js.native
  def panelsState_=(`val`: String): Unit = js.native
  
  def progress: String = js.native
  
  def progressText: String = js.native
  
  /* protected */ def rebuildPanels(): Unit = js.native
  
  def recalculateIsReadyValue(): Unit = js.native
  
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
    * A `PanelModel` object used as a template to create dynamic panels.
    */
  def template: PanelModel = js.native
  
  /*
    * A description for the template panel.
    */
  def templateDescription: String = js.native
  def templateDescription_=(`val`: String): Unit = js.native
  
  /*
    * An array of questions and panels included in the template panel.
    */
  def templateElements: Any = js.native
  
  /*
    * A title for the template panel.
    */
  def templateTitle: String = js.native
  
  /*
    * Gets or sets the location of question titles within the template panel relative to their input fields.
    * 
    * - `"default"` (default) - Inherits the setting from the Dynamic Panel's `titleLocation` property, which in turn inherits the [`questionTitleLocation`](https://surveyjs.io/form-library/documentation/surveymodel#questionTitleLocation) property value specified for the Dynamic Panel's container (page or survey).
    * - `"top"` - Displays question titles above input fields.
    * - `"bottom"` - Displays question titles below input fields.
    * - `"left"` - Displays question titles to the left of input fields.
    * - `"hidden"` - Hides question titles.
    */
  def templateTitleLocation: String = js.native
  def templateTitleLocation_=(`val`: String): Unit = js.native
  
  def templateTitle_=(`val`: String): Unit = js.native
  
  var templateValue: PanelModel = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
  
  var updateFooterActionsCallback: Any = js.native
}
