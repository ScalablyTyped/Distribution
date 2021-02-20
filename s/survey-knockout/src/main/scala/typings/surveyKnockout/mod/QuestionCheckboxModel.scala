package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckboxModel")
@js.native
class QuestionCheckboxModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
  
  def getItemClass(item: js.Any): js.Any = js.native
  
  /**
    * Set this property to true, to show the "None" item on the bottom. If end-user checks this item, all other items would be unchecked.
    */
  var hasNone: Boolean = js.native
  
  /**
    * Set this property to true, to show the "Select All" item on the top. If end-user checks this item, then all items are checked.
    */
  var hasSelectAll: Boolean = js.native
  
  /**
    * Returns true if all items are selected
    * @see toggleSelectAll
    */
  var isAllSelected: Boolean = js.native
  
  val locNoneText: LocalizableString = js.native
  
  val locSelectAllText: LocalizableString = js.native
  
  /**
    * Set this property different to 0 to limit the number of selected choices in the checkbox.
    */
  var maxSelectedChoices: Double = js.native
  
  /**
    * Returns the none item. By using this property, you may change programmatically it's value and text.
    * @see hasNone
    */
  val noneItem: ItemValue = js.native
  
  /**
    * Use this property to set the different text for none item.
    */
  var noneText: String = js.native
  
  /**
    * Select all items, except other and none.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Returns the select all item. By using this property, you may change programmatically it's value and text.
    * @see hasSelectAll
    */
  val selectAllItem: ItemValue = js.native
  
  /**
    * Use this property to set the different text for Select All item.
    */
  var selectAllText: String = js.native
  
  /* protected */ def setDefaultValueWithOthers(): Unit = js.native
  
  /**
    * It will select all items, except other and none. If all items have been already selected then it will clear the value
    * @see isAllSelected
    * @see selectAll
    */
  def toggleSelectAll(): Unit = js.native
}
