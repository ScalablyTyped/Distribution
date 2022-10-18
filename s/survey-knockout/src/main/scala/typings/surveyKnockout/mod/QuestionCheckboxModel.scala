package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckboxModel")
@js.native
open class QuestionCheckboxModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
  
  def checkBoxSvgPath: String = js.native
  
  /* protected */ def convertValueFromObject(`val`: Any): Any = js.native
  
  /* protected */ def convertValueToObject(`val`: Any): Any = js.native
  
  def hasSelectAll: Boolean = js.native
  def hasSelectAll_=(`val`: Boolean): Unit = js.native
  
  var invisibleOldValues: Any = js.native
  
  /*
    * Returns `true` if all choice items, except "Other" and "None", are selected.
    */
  def isAllSelected: Boolean = js.native
  def isAllSelected_=(`val`: Boolean): Unit = js.native
  
  var isChangingValueOnClearIncorrect: Boolean = js.native
  
  def locSelectAllText: LocalizableString = js.native
  
  /*
    * Sets a limit on the number of selected choices.
    * 
    * Default value: 0 (unlimited)
    * 
    * > NOTE: This property only limits the number of choice items that can be selected by users. You can select any number of choice items in code, regardless of the `maxSelectedChoices` value.
    */
  def maxSelectedChoices: Double = js.native
  def maxSelectedChoices_=(`val`: Double): Unit = js.native
  
  /*
    * Selects all choice items, except "Other" and "None".
    * 
    * To clear selection, call the `clearValue()` method.
    */
  def selectAll(): Unit = js.native
  
  /*
    * Returns the "Select All" choice item. Use this property to change the item's `value` or `text`.
    */
  def selectAllItem: ItemValue = js.native
  
  var selectAllItemValue: ItemValue = js.native
  
  /*
    * Gets or sets a caption for the "Select All" choice item.
    */
  def selectAllText: String = js.native
  def selectAllText_=(`val`: String): Unit = js.native
  
  /*
    * An array of selected choice items. Includes the "Other" and "None" choice items if they are selected, but not "Select All". Items are sorted in the order they were selected.
    */
  def selectedChoices: Any = js.native
  
  def selectedItems: Any = js.native
  
  /* protected */ def setDefaultValueWithOthers(): Unit = js.native
  
  /*
    * Enable this property to display a "Select All" item. When users select it, all other choice items, except "Other" and "None", also become selected.
    */
  def showSelectAllItem: Boolean = js.native
  def showSelectAllItem_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def supportSelectAll(): Boolean = js.native
  
  def toggleSelectAll(): Unit = js.native
  
  /*
    * Specifies a property name used to store selected values.
    * 
    * Set this property if you want to store selected values in an array of objects instead of an array of primitive values. For example, if you set `valuePropertyName` to `"car"`, the `value` property will contain an array of objects `[{ car: "Ford" }, { car: "Tesla" }]`, not an array of string values `[ "Ford", "Tesla" ]`.
    */
  def valuePropertyName: String = js.native
  def valuePropertyName_=(`val`: String): Unit = js.native
}
