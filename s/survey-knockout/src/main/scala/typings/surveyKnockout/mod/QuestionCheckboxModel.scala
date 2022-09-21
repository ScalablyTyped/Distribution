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
  
  /*
    * Set this property to true, to show the "Select All" item on the top. If end-user checks this item, then all items are checked.
    */
  def hasSelectAll: Boolean = js.native
  def hasSelectAll_=(`val`: Boolean): Unit = js.native
  
  var invisibleOldValues: Any = js.native
  
  /*
    * Returns true if all items are selected
    */
  def isAllSelected: Boolean = js.native
  def isAllSelected_=(`val`: Boolean): Unit = js.native
  
  var isChangingValueOnClearIncorrect: Boolean = js.native
  
  def locSelectAllText: LocalizableString = js.native
  
  /*
    * Set this property different to 0 to limit the number of selected choices in the checkbox.
    */
  def maxSelectedChoices: Double = js.native
  def maxSelectedChoices_=(`val`: Double): Unit = js.native
  
  /*
    * Select all items, except other and none.
    */
  def selectAll(): Unit = js.native
  
  /*
    * Returns the select all item. By using this property, you may change programmatically it's value and text.
    */
  def selectAllItem: ItemValue = js.native
  
  var selectAllItemValue: ItemValue = js.native
  
  /*
    * Use this property to set the different text for Select All item.
    */
  def selectAllText: String = js.native
  def selectAllText_=(`val`: String): Unit = js.native
  
  /*
    * Return the selected items in the checkbox. Returns empty array if the value is empty
    */
  def selectedItems: Any = js.native
  
  /* protected */ def setDefaultValueWithOthers(): Unit = js.native
  
  /* protected */ def supportSelectAll(): Boolean = js.native
  
  /*
    * It will select all items, except other and none. If all items have been already selected then it will clear the value
    */
  def toggleSelectAll(): Unit = js.native
  
  /*
    * Set this property if you want to store the checkbox value as array of objects instead of array of values
    * For example: if "valuePropertyName" equals car, then instead of having ["Ford", "Tesla"], you will have [{car: "Ford"}, {car: "Tesla"}]
    */
  def valuePropertyName: String = js.native
  def valuePropertyName_=(`val`: String): Unit = js.native
}
