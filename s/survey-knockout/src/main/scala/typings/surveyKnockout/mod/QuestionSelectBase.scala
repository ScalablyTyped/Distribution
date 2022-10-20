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
    * Gets or sets choice items. This property accepts an array of objects with the following structure:
    * 
    * ```js
    * {
    *   "value": any, // A value to be saved in the survey results
    *   "text": String, // A display text. This property supports Markdown. When `text` is undefined, `value` is used.
    *   "imageLink": String // A link to the image or video that represents this choice value. Applies only to Image Picker questions.
    *   "customProperty": any // Any property that you find useful
    * }
    * ```
    * 
    * Refer to the following help topic for information on how to add custom properties so that they are serialized into JSON: [Add Custom Properties to Property Grid](https://surveyjs.io/survey-creator/documentation/property-grid#add-custom-properties-to-the-property-grid).
    * 
    * If you need to specify only the `value` property, you can set the `choices` property to an array of primitive values, for example, `[ "item1", "item2", "item3" ]`. These values are both saved in survey results and used as display text.
    */
  def choices: Any = js.native
  
  /*
    * Configures access to a RESTful service that returns choice items. Refer to the [ChoicesRestful](https://surveyjs.io/form-library/documentation/choicesrestful) class description for more information.
    * 
    * [View "Dropdown + RESTful" demo](https://surveyjs.io/form-library/examples/questiontype-dropdownrestfull/ (linkStyle))
    */
  def choicesByUrl: ChoicesRestful = js.native
  def choicesByUrl_=(`val`: ChoicesRestful): Unit = js.native
  
  /*
    * A Boolean expression that is evaluated against each choice item. If the expression evaluates to `false`, the choice item becomes read-only.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Use the `{item}` placeholder to reference the current choice item in the expression.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  def choicesEnableIf: String = js.native
  def choicesEnableIf_=(`val`: String): Unit = js.native
  
  /*
    * Inherits choice items from a specified question. Accepts a question name.
    * 
    * If you specify this property, the `choices`, `choicesVisibleIf`, `choicesEnableIf`, and `choicesOrder` properties do not apply because their values are inherited.
    * 
    * In addition, you can specify the `choicesFromQuestionMode` property if you do not want to inherit all choice items.
    */
  def choicesFromQuestion: String = js.native
  
  /*
    * Specifies which choice items to inherit from another question. Applies only when the `choicesFromQuestion` property is specified.
    * 
    * Possible values:
    * 
    * - `"all"` (default) - Inherits all choice items.
    * - `"selected"` - Inherits only selected choice items.
    * - `"unselected"` - Inherits only unselected choice items.
    * 
    * Use the `visibleChoices` property to access inherited choice items.
    */
  def choicesFromQuestionMode: String = js.native
  def choicesFromQuestionMode_=(`val`: String): Unit = js.native
  
  def choicesFromQuestion_=(`val`: String): Unit = js.native
  
  var choicesFromUrl: Any = js.native
  
  /*
    * Specifies the sort order of choice items.
    * 
    * Possible values:
    * 
    * - `"none"` (default) - Preserves the original order of choice items.
    * - `"asc"`- Sorts choice items in ascending order.
    * - `"desc"`- Sorts choice items in ascending order.
    * - `"random"` - Displays choice items in random order.
    */
  def choicesOrder: String = js.native
  def choicesOrder_=(`val`: String): Unit = js.native
  
  /*
    * A Boolean expression that is evaluated against each choice item. If the expression evaluates to `false`, the choice item becomes hidden.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Use the `{item}` placeholder to reference the current choice item in the expression.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
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
    * An array of choice items with which users can interact. Includes the "Select All", "Other", and "None" choice items if they are not disabled. Items are sorted according to the `choicesOrder` value.
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
  
  /* protected */ def getDefaultItemComponent(): String = js.native
  
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
    * Specifies whether to hide the question if no choice items are visible.
    * 
    * This property is useful if you show or hide choice items at runtime based on a [condition](https://surveyjs.io/form-library/documentation/questionselectbase#choicesVisibleIf).
    */
  def hideIfChoicesEmpty: Boolean = js.native
  def hideIfChoicesEmpty_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def isAddDefaultItems: Boolean = js.native
  
  /* protected */ def isBuiltInChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  var isChoicesLoaded: Boolean = js.native
  
  var isFirstLoadChoicesFromUrl: Boolean = js.native
  
  /* protected */ def isFootChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  /* protected */ def isHeadChoice(item: ItemValue, question: QuestionSelectBase): Boolean = js.native
  
  def isItemInList(item: ItemValue): Boolean = js.native
  
  /*
    * Returns `true` if a passed choice item is selected.
    * 
    * To obtain a choice item to check, use the `noneItem` or `otherItem` property or the `choices` array.
    */
  def isItemSelected(item: ItemValue): Boolean = js.native
  
  /* protected */ def isItemSelectedCore(item: ItemValue): Boolean = js.native
  
  def isOtherItem(item: ItemValue): Boolean = js.native
  
  /*
    * Returns `true` if the "Other" choice item is selected.
    */
  def isOtherSelected: Boolean = js.native
  
  var isRunningChoices: Boolean = js.native
  
  var isSettingComment: Boolean = js.native
  
  var isSettingDefaultValue: Boolean = js.native
  
  /* protected */ def isSupportProperty(propName: String): Boolean = js.native
  
  var isUpdatingChoicesDependedQuestions: Boolean = js.native
  
  /* protected */ def isValueDisabled(`val`: Any): Boolean = js.native
  
  /*
    * The name of a component used to render items.
    */
  def itemComponent: String = js.native
  def itemComponent_=(`val`: String): Unit = js.native
  
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
    * Returns the "None" choice item. Use this property to change the item's `value` or `text`.
    */
  def noneItem: ItemValue = js.native
  
  var noneItemValue: ItemValue = js.native
  
  /*
    * Gets or sets a caption for the "None" choice item.
    */
  def noneText: String = js.native
  def noneText_=(`val`: String): Unit = js.native
  
  /* protected */ def onAfterRunItemsEnableCondition(): Unit = js.native
  
  /* protected */ def onBeforeSendRequest(): Unit = js.native
  
  /* protected */ def onEnableItemCallBack(item: ItemValue): Boolean = js.native
  
  /* protected */ def onLoadChoicesFromUrl(array: Any): Unit = js.native
  
  /* protected */ def onVisibleChoicesChanged(): Unit = js.native
  
  /*
    * Get or sets an error message displayed when users select the "Other" choice item but leave the comment area empty.
    */
  def otherErrorText: String = js.native
  def otherErrorText_=(`val`: String): Unit = js.native
  
  /*
    * Returns the "Other" choice item. Use this property to change the item's `value` or `text`.
    */
  def otherItem: ItemValue = js.native
  
  var otherItemValue: ItemValue = js.native
  
  def otherPlaceHolder: String = js.native
  def otherPlaceHolder_=(`val`: String): Unit = js.native
  
  /*
    * A placeholder for the comment area. Applies when the `showOtherItem` or `showCommentArea` property is `true`.
    */
  def otherPlaceholder: String = js.native
  def otherPlaceholder_=(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a caption for the "Other" choice item.
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
    * Specifies whether to display the "None" choice item.
    * 
    * When users select the "None" item in multi-select questions, all other items become unselected.
    */
  def showNoneItem: Boolean = js.native
  def showNoneItem_=(`val`: Boolean): Unit = js.native
  
  def storeOthersAsComment: Any = js.native
  def storeOthersAsComment_=(`val`: Any): Unit = js.native
  
  def supportNone(): Boolean = js.native
  
  /* protected */ def updateChoicesDependedQuestions(): Unit = js.native
  
  /* protected */ def updateVisibleChoices(): Unit = js.native
  
  @JSName("validatedValue")
  def validatedValue_MQuestionSelectBase: Any = js.native
  
  /*
    * An array of visible choice items. Includes the "Select All", "Other", and "None" choice items if they are visible. Items are sorted according to the `choicesOrder` value.
    */
  def visibleChoices: Any = js.native
  
  var visibleChoicesChangedCallback: Any = js.native
}
