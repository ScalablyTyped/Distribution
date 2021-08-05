package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionSelectBase")
@js.native
class QuestionSelectBase protected () extends Question {
  def this(name: String) = this()
  
  /* protected */ val activeChoices: js.Array[ItemValue] = js.native
  
  /* protected */ def addToVisibleChoices(items: js.Array[ItemValue]): Unit = js.native
  
  /* protected */ def canClearValueAnUnknow(`val`: js.Any): Boolean = js.native
  
  /* protected */ def canUseFilteredChoices(): Boolean = js.native
  
  /**
    * The list of items. Every item has value and text. If text is empty, the value is rendered. The item text supports markdown.
    * @see choicesByUrl
    */
  var choices: js.Array[js.Any] = js.native
  
  /**
    * Use this property to fill the choices from a restful service.
    * @see choices
    */
  var choicesByUrl: ChoicesRestfull = js.native
  
  /**
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is enabled otherwise the item becomes disabled. Please use {item} to get the current item value in the expression.
    * @see choicesVisibleIf
    */
  var choicesEnableIf: String = js.native
  
  /**
    * Use this property to render items in a specific order: "asc", "desc", "random". Default value is "none".
    */
  var choicesOrder: String = js.native
  
  /**
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see visibleIf
    * @see choicesEnableIf
    */
  var choicesVisibleIf: String = js.native
  
  /* protected */ def clearDisabledValuesCore(): Unit = js.native
  
  /**
    * If the clearIncorrectValuesCallback is set, it is used to clear incorrect values instead of default behaviour.
    */
  def clearIncorrectValuesCallback(): Unit = js.native
  
  /* protected */ def clearIncorrectValuesCore(): Unit = js.native
  
  val columns: js.Array[js.Array[ItemValue]] = js.native
  
  /* protected */ def createRestfull(): ChoicesRestfull = js.native
  
  /**
    * The list of enabled items as they will be rendered. The disabled items are not included
    * @see hasOther
    * @see choicesOrder
    * @see visibleChoices
    */
  val enabledChoices: js.Array[ItemValue] = js.native
  
  /* protected */ def filterItems(): Boolean = js.native
  
  /* protected */ def getChoices(): js.Array[ItemValue] = js.native
  
  /* protected */ def getChoicesDisplayValue(items: js.Array[ItemValue], `val`: js.Any): js.Any = js.native
  
  def getColumnClass(): js.Any = js.native
  
  /* protected */ def getCommentFromValue(newValue: js.Any): String = js.native
  
  def getControlLabelClass(item: ItemValue): js.Any = js.native
  
  /* protected */ def getHasOther(`val`: js.Any): Boolean = js.native
  
  /* protected */ def getIsMultipleValue(): Boolean = js.native
  
  def getLabelClass(item: ItemValue): js.Any = js.native
  
  /* protected */ def getStoreOthersAsComment(): Boolean = js.native
  
  val hasColumns: Boolean = js.native
  
  /* protected */ def hasUnknownValue(`val`: js.Any): Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: js.Any, includeOther: Boolean): Boolean = js.native
  
  /**
    * Set this property to true to hide the question if there is no visible choices.
    */
  var hideIfChoicesEmpty: Boolean = js.native
  
  /**
    * Returns true if item is selected
    * @param item checkbox or radio item value
    */
  def isItemSelected(item: ItemValue): Boolean = js.native
  
  /**
    * Returns true if a user select the 'other' item.
    */
  val isOtherSelected: Boolean = js.native
  
  /* protected */ def isValueDisabled(`val`: js.Any): Boolean = js.native
  
  var keepIncorrectValues: Boolean = js.native
  
  val locOtherErrorText: LocalizableString = js.native
  
  val locOtherPlaceHolder: LocalizableString = js.native
  
  val locOtherText: LocalizableString = js.native
  
  /* protected */ def onAfterRunItemsEnableCondition(): Unit = js.native
  
  /* protected */ def onBeforeSendRequest(): Unit = js.native
  
  /* protected */ def onEnableItemCallBack(item: ItemValue): Boolean = js.native
  
  /* protected */ def onLoadChoicesFromUrl(array: js.Array[ItemValue]): Unit = js.native
  
  /* protected */ def onVisibleChoicesChanged(): Unit = js.native
  
  /**
    * The text that shows when the other item is choosed by the other input is empty.
    */
  var otherErrorText: String = js.native
  
  /**
    * Returns the other item. By using this property, you may change programmatically it's value and text.
    * @see hasOther
    */
  val otherItem: ItemValue = js.native
  
  /**
    *  Use this property to set the place holder text for other or comment field  .
    */
  var otherPlaceHolder: String = js.native
  
  /**
    * Use this property to set the different text for other item.
    */
  var otherText: String = js.native
  
  var renderedValue: js.Any = js.native
  
  /* protected */ def renderedValueFromDataCore(`val`: js.Any): js.Any = js.native
  
  /* protected */ def rendredValueFromData(`val`: js.Any): js.Any = js.native
  
  /* protected */ def rendredValueToData(`val`: js.Any): js.Any = js.native
  
  /* protected */ def rendredValueToDataCore(`val`: js.Any): js.Any = js.native
  
  /* protected */ def runItemsCondition(values: HashTable[js.Any], properties: HashTable[js.Any]): Boolean = js.native
  
  /* protected */ def runItemsEnableCondition(values: HashTable[js.Any], properties: HashTable[js.Any]): js.Any = js.native
  
  /* protected */ def setOtherValueIntoValue(newValue: js.Any): js.Any = js.native
  
  /**
    * Please use survey.storeOthersAsComment to change the behavior on the survey level. This property is depricated and invisible in Survey Creator.
    * By default the entered text in the others input in the checkbox/radiogroup/dropdown are stored as "question name " + "-Comment". The value itself is "question name": "others". Set this property to false, to store the entered text directly in the "question name" key.
    * Possible values are: "default", true, false
    * @see SurveyModel.storeOthersAsComment
    */
  var storeOthersAsComment: js.Any = js.native
  
  /* protected */ def updateVisibleChoices(): Unit = js.native
  
  /**
    * The list of items as they will be rendered. If needed items are sorted and the other item is added.
    * @see hasOther
    * @see choicesOrder
    * @see enabledChoices
    */
  val visibleChoices: js.Array[ItemValue] = js.native
  
  def visibleChoicesChangedCallback(): Unit = js.native
}
