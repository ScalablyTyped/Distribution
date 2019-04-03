package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionSelectBase")
@js.native
class QuestionSelectBase protected () extends Question {
  def this(name: java.lang.String) = this()
  /**
    * The list of items. Every item has value and text. If text is empty, the value is rendered. The item text supports markdown.
    * @see choicesByUrl
    */
  var choices: js.Array[_] = js.native
  /**
    * Use this property to fill the choices from a restful service.
    * @see choices
    */
  var choicesByUrl: ChoicesRestfull = js.native
  /**
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is enabled otherwise the item becomes disabled. Please use {item} to get the current item value in the expression.
    * @see choicesVisibleIf
    */
  var choicesEnableIf: java.lang.String = js.native
  /**
    * Use this property to render items in a specific order: "asc", "desc", "random". Default value is "none".
    */
  var choicesOrder: java.lang.String = js.native
  /**
    * An expression that returns true or false. It runs against each choices item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see visibleIf
    * @see choicesEnableIf
    */
  var choicesVisibleIf: java.lang.String = js.native
  /**
    * The list of enabled items as they will be rendered. The disabled items are not included
    * @see hasOther
    * @see choicesOrder
    * @see visibleChoices
    */
  val enabledChoices: js.Array[ItemValue] = js.native
  var hideIfChoicesEmpty: scala.Boolean = js.native
  /**
    * Returns true if a user select the 'other' item.
    */
  val isOtherSelected: scala.Boolean = js.native
  var isSettingDefaultValue: scala.Boolean = js.native
  val locOtherErrorText: LocalizableString = js.native
  val locOtherText: LocalizableString = js.native
  /**
    * The text that shows when the other item is choosed by the other input is empty.
    */
  var otherErrorText: java.lang.String = js.native
  /**
    * Returns the other item. By using this property, you may change programmatically it's value and text.
    * @see hasOther
    */
  val otherItem: ItemValue = js.native
  /**
    * Use this property to set the different text for other item.
    */
  var otherText: java.lang.String = js.native
  var renderedValue: js.Any = js.native
  /**
    * By default the entered text in the others input in the checkbox/radiogroup/dropdown are stored as "question name " + "-Comment". The value itself is "question name": "others". Set this property to false, to store the entered text directly in the "question name" key.
    * @see SurveyModel.storeOthersAsComment
    */
  var storeOthersAsComment: scala.Boolean = js.native
  /**
    * The list of items as they will be rendered. If needed items are sorted and the other item is added.
    * @see hasOther
    * @see choicesOrder
    * @see enabledChoices
    */
  val visibleChoices: js.Array[ItemValue] = js.native
  /* protected */ def addToVisibleChoices(items: js.Array[ItemValue]): scala.Unit = js.native
  /* protected */ def canUseFilteredChoices(): scala.Boolean = js.native
  /* protected */ def clearDisabledValuesCore(): scala.Unit = js.native
  /* protected */ def clearIncorrectValuesCore(): scala.Unit = js.native
  /* protected */ def createRestfull(): ChoicesRestfull = js.native
  /* protected */ def filterItems(): scala.Boolean = js.native
  /* protected */ def getChoicesDisplayValue(items: js.Array[ItemValue], `val`: js.Any): js.Any = js.native
  /* protected */ def getHasOther(`val`: js.Any): scala.Boolean = js.native
  /* protected */ def getStoreOthersAsComment(): scala.Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: js.Any): scala.Boolean = js.native
  /* protected */ def hasUnknownValue(`val`: js.Any, includeOther: scala.Boolean): scala.Boolean = js.native
  /* protected */ def isValueDisabled(`val`: js.Any): scala.Boolean = js.native
  /* protected */ def onVisibleChoicesChanged(): scala.Unit = js.native
  /* protected */ def renderedValueFromDataCore(`val`: js.Any): js.Any = js.native
  /* protected */ def rendredValueFromData(`val`: js.Any): js.Any = js.native
  /* protected */ def rendredValueToData(`val`: js.Any): js.Any = js.native
  /* protected */ def rendredValueToDataCore(`val`: js.Any): js.Any = js.native
  /* protected */ def runItemsCondition(values: HashTable[_], properties: HashTable[_]): scala.Boolean = js.native
  /* protected */ def runItemsEnableCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
  /* protected */ def updateVisibleChoices(): scala.Unit = js.native
}

