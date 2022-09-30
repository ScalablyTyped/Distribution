package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.`false`
import typings.surveyKnockout.surveyKnockoutStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionSelectBase")
@js.native
open class QuestionSelectBase protected () extends Question {
  def this(name: String) = this()
  
  /* protected */ def activeChoices: Any = js.native
  
  /* protected */ def addToVisibleChoices(items: Any, isAddAll: Boolean): Unit = js.native
  
  def ariaItemChecked(item: ItemValue): `true` | `false` = js.native
  
  def autoOtherMode: Boolean = js.native
  def autoOtherMode_=(`val`: Boolean): Unit = js.native
  
  def blockedRow: Boolean = js.native
  
  def bodyItems: Any = js.native
  
  var cachedValueForUrlRequests: Any = js.native
  
  /* protected */ def canClearValueAnUnknow(`val`: Any): Boolean = js.native
  
  /* protected */ def canShowOptionItem(item: ItemValue, isAddAll: Boolean, hasItem: Boolean): Boolean = js.native
  
  def canShowOptionItemCallback(item: ItemValue): Boolean = js.native
  
  /* protected */ def canUseFilteredChoices(): Boolean = js.native
  
  def changeItemVisisbility(): js.Function2[/* item */ ItemValue, /* val */ Boolean, Boolean] = js.native
  
  /*
    * The list of items. Every item has value and text. If text is empty, the value is rendered. The item text supports markdown.
    */
  def choices: Any = js.native
  
  /*
    * Use this property to fill the choices from a RESTful service.
    */
  def choicesByUrl: ChoicesRestful = js.native
  def choicesByUrl_=(`val`: ChoicesRestful): Unit = js.native
  
  /*
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is enabled otherwise the item becomes disabled. Please use {item} to get the current item value in the expression.
    */
  def choicesEnableIf: String = js.native
  def choicesEnableIf_=(`val`: String): Unit = js.native
  
  /*
    * Set this property to get choices from the specified question instead of defining them in the current question. This avoids duplication of choices declaration in your survey definition.
    * By setting this property, the "choices", "choicesVisibleIf", "choicesEnableIf" and "choicesOrder" properties become invisible, because these question characteristics depend on actions in another (specified) question.
    * Use the `choicesFromQuestionMode` property to filter choices obtained from the specified question.
    */
  def choicesFromQuestion: String = js.native
  
  /*
    * This property becomes visible when the `choicesFromQuestion` property is selected. The default value is "all" (all visible choices from another question are displayed as they are).
    * You can set this property to "selected" or "unselected" to display only selected or unselected choices from the specified question.
    */
  def choicesFromQuestionMode: String = js.native
  def choicesFromQuestionMode_=(`val`: String): Unit = js.native
  
  def choicesFromQuestion_=(`val`: String): Unit = js.native
  
  var choicesFromUrl: Any = js.native
  
  /*
    * Use this property to render items in a specific order: "asc", "desc", "random". Default value is "none".
    */
  def choicesOrder: String = js.native
  def choicesOrder_=(`val`: String): Unit = js.native
  
  /*
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    */
  def choicesVisibleIf: String = js.native
  def choicesVisibleIf_=(`val`: String): Unit = js.native
  
  def choices_=(`val`: Any): Unit = js.native
  
  /* protected */ def clearDisabledValuesCore(): Unit = js.native
  
  /*
    * If the clearIncorrectValuesCallback is set, it is used to clear incorrect values instead of default behaviour.
    */
  var clearIncorrectValuesCallback: Any = js.native
  
  /* protected */ def clearIncorrectValuesCore(): Unit = js.native
  
  def columns: Any = js.native
  
  var commentValue: String = js.native
  
  var conditionChoicesEnableIfRunner: ConditionRunner = js.native
  
  var conditionChoicesVisibleIfRunner: ConditionRunner = js.native
  
  def createItemValue(value: Any): ItemValue = js.native
  
  /* protected */ def createRestful(): ChoicesRestful = js.native
  
  def dataChoices: Any = js.native
  
  var dependedQuestions: Any = js.native
  
  var enableOnLoadingChoices: Boolean = js.native
  
  /*
    * The list of enabled items as they will be rendered. The disabled items are not included
    */
  def enabledChoices: Any = js.native
  
  /* protected */ def filterItems(): Boolean = js.native
  
  var filteredChoicesValue: Any = js.native
  
  def footItems: Any = js.native
  
  def getAriaItemLabel(item: ItemValue): String = js.native
  
  /* protected */ def getChoices(): js.Array[ItemValue] = js.native
  
  /* protected */ def getChoicesDisplayValue(items: Any, `val`: Any): Any = js.native
  
  /* protected */ def getChoicesFromQuestion(question: QuestionSelectBase): js.Array[ItemValue] = js.native
  
  def getColumnClass(): String = js.native
  
  /* protected */ def getCommentFromValue(newValue: Any): String = js.native
  
  def getControlLabelClass(item: ItemValue): String = js.native
  
  /* protected */ def getCurrentColCount(): Double = js.native
  
  /* protected */ def getDisplayArrayValue(keysAsText: Boolean, value: Any): String = js.native
  /* protected */ def getDisplayArrayValue(keysAsText: Boolean, value: Any, onGetValueCallback: js.Function1[/* index */ Double, Any]): String = js.native
  
  /* protected */ def getHasOther(`val`: Any): Boolean = js.native
  
  /* protected */ def getIsMultipleValue(): Boolean = js.native
  
  def getItemClass(item: Any): String = js.native
  
  /* protected */ def getItemClassCore(item: Any, options: Any): String = js.native
  
  def getItemEnabled(item: ItemValue): Any = js.native
  
  def getItemId(item: ItemValue): String = js.native
  
  def getItemIndex(item: Any): Double = js.native
  
  def getItemValueWrapperComponentData(item: ItemValue): Any = js.native
  
  def getItemValueWrapperComponentName(item: ItemValue): String = js.native
  
  def getLabelClass(item: ItemValue): String = js.native
  
  def getSelectBaseRootCss(): String = js.native
  
  def getStoreOthersAsComment(): Boolean = js.native
  
  /* protected */ def hasActiveChoices: Boolean = js.native
  
  def hasColumns: Boolean = js.native
  
  def hasFootItems: Boolean = js.native
  
  def hasHeadItems: Boolean = js.native
  
  /*
    * Set this property to true, to show the "None" item on the bottom. If end-user checks this item, all other items would be unchecked.
    */
  def hasNone: Boolean = js.native
  def hasNone_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def hasUnknownValue(`val`: Any): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Boolean, isFilteredChoices: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Boolean, isFilteredChoices: Boolean, checkEmptyValue: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Boolean, isFilteredChoices: Unit, checkEmptyValue: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Unit, isFilteredChoices: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Unit, isFilteredChoices: Boolean, checkEmptyValue: Boolean): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: Any, includeOther: Unit, isFilteredChoices: Unit, checkEmptyValue: Boolean): Boolean = js.native
  
  /* protected */ def hasValueToClearIncorrectValues(): Boolean = js.native
  
  def headItems: Any = js.native
  
  /*
    * Set this property to true to hide the question if there is no visible choices.
    */
  def hideIfChoicesEmpty: Boolean = js.native
  def hideIfChoicesEmpty_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def isAddDefaultItems: Boolean = js.native
  
  /* protected */ def isBuiltInChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  var isChoicesLoaded: Boolean = js.native
  
  var isFirstLoadChoicesFromUrl: Boolean = js.native
  
  /* protected */ def isFootChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  /* protected */ def isHeadChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  /*
    * For internal use in SurveyJS Creator V2.
    */
  def isItemInList(item: ItemValue): Boolean = js.native
  
  /*
    * Returns true if item is selected
    */
  def isItemSelected(item: ItemValue): Boolean = js.native
  
  /* protected */ def isItemSelectedCore(item: ItemValue): Boolean = js.native
  
  def isOtherItem(item: ItemValue): Boolean = js.native
  
  /*
    * Returns true if a user select the 'other' item.
    */
  def isOtherSelected: Boolean = js.native
  
  var isRunningChoices: Boolean = js.native
  
  var isSettingComment: Boolean = js.native
  
  var isSettingDefaultValue: Boolean = js.native
  
  /* protected */ def isSupportProperty(propName: String): Boolean = js.native
  
  var isUpdatingChoicesDependedQuestions: Boolean = js.native
  
  /* protected */ def isValueDisabled(`val`: Any): Boolean = js.native
  
  def itemSvgIcon: String = js.native
  
  def keepIncorrectValues: Boolean = js.native
  def keepIncorrectValues_=(`val`: Boolean): Unit = js.native
  
  var loadedChoicesFromServerCallback: Any = js.native
  
  def locNoneText: LocalizableString = js.native
  
  def locOtherErrorText: LocalizableString = js.native
  
  def locOtherPlaceholder: LocalizableString = js.native
  
  def locOtherText: LocalizableString = js.native
  
  def newItem: ItemValue = js.native
  
  var newItemValue: ItemValue = js.native
  
  /*
    * Returns the none item. By using this property, you may change programmatically it's value and text.
    */
  def noneItem: ItemValue = js.native
  
  var noneItemValue: ItemValue = js.native
  
  /*
    * Use this property to set the different text for none item.
    */
  def noneText: String = js.native
  def noneText_=(`val`: String): Unit = js.native
  
  /* protected */ def onAfterRunItemsEnableCondition(): Unit = js.native
  
  /* protected */ def onBeforeSendRequest(): Unit = js.native
  
  /* protected */ def onEnableItemCallBack(item: ItemValue): Boolean = js.native
  
  /* protected */ def onLoadChoicesFromUrl(array: Any): Unit = js.native
  
  /* protected */ def onVisibleChoicesChanged(): Unit = js.native
  
  /*
    * The text that shows when the other item is choosed by the other input is empty.
    */
  def otherErrorText: String = js.native
  def otherErrorText_=(`val`: String): Unit = js.native
  
  /*
    * Returns the other item. By using this property, you may change programmatically it's value and text.
    */
  def otherItem: ItemValue = js.native
  
  var otherItemValue: ItemValue = js.native
  
  def otherPlaceHolder: String = js.native
  def otherPlaceHolder_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to set the place holder text for other or comment field  .
    */
  def otherPlaceholder: String = js.native
  def otherPlaceholder_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to set the different text for other item.
    */
  def otherText: String = js.native
  def otherText_=(`val`: String): Unit = js.native
  
  var prevCommentValue: String = js.native
  
  var prevIsOtherSelected: Boolean = js.native
  
  def questionName: String = js.native
  
  def renderedValue: Any = js.native
  
  /* protected */ def renderedValueFromDataCore(`val`: Any): Any = js.native
  
  def renderedValue_=(`val`: Any): Unit = js.native
  
  /* protected */ def rendredValueFromData(`val`: Any): Any = js.native
  
  /* protected */ def rendredValueToData(`val`: Any): Any = js.native
  
  /* protected */ def rendredValueToDataCore(`val`: Any): Any = js.native
  
  /* protected */ var rootElement: Any = js.native
  
  def rowLayout: Boolean = js.native
  
  /* protected */ def runItemsCondition(values: Any, properties: Any): Boolean = js.native
  
  /* protected */ def runItemsEnableCondition(values: Any, properties: Any): Any = js.native
  
  /* protected */ def selectOtherValueFromComment(`val`: Boolean): Unit = js.native
  
  /*
    * Displays the "Select All", "None", and "Other" choices on individual rows.
    */
  var separateSpecialChoices: Boolean = js.native
  
  def setCanShowOptionItemCallback(func: js.Function1[/* item */ ItemValue, Boolean]): Unit = js.native
  
  /* protected */ def setOtherValueIntoValue(newValue: Any): Any = js.native
  
  /* protected */ def setQuestionValue(newValue: Any, updateIsAnswered: Boolean, updateComment: Boolean): Unit = js.native
  /* protected */ def setQuestionValue(newValue: Any, updateIsAnswered: Unit, updateComment: Boolean): Unit = js.native
  
  /*
    * Please use survey.storeOthersAsComment to change the behavior on the survey level. This property is depricated and invisible in Survey Creator.
    * By default the entered text in the others input in the checkbox/radiogroup/dropdown are stored as "question name " + "-Comment". The value itself is "question name": "others". Set this property to false, to store the entered text directly in the "question name" key.
    * Possible values are: "default", true, false
    */
  def storeOthersAsComment: Any = js.native
  def storeOthersAsComment_=(`val`: Any): Unit = js.native
  
  def supportNone(): Boolean = js.native
  
  /* protected */ def updateChoicesDependedQuestions(): Unit = js.native
  
  /* protected */ def updateVisibleChoices(): Unit = js.native
  
  @JSName("validatedValue")
  def validatedValue_MQuestionSelectBase: Any = js.native
  
  /*
    * The list of items as they will be rendered. If needed items are sorted and the other item is added.
    */
  def visibleChoices: Any = js.native
  
  var visibleChoicesChangedCallback: Any = js.native
}
