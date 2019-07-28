package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCheckboxModel")
@js.native
class QuestionCheckboxModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
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
    * Returns the none item. By using this property, you may change programmatically it's value and text.
    * @see hasNone
    */
  val noneItem: ItemValue = js.native
  /**
    * Use this property to set the different text for none item.
    */
  var noneText: String = js.native
  /**
    * Returns the select all item. By using this property, you may change programmatically it's value and text.
    * @see hasSelectAll
    */
  val selectAllItem: ItemValue = js.native
  /**
    * Use this property to set the different text for Select All item.
    */
  var selectAllText: String = js.native
  /**
    * Returns true if item is checked
    * @param item checkbox item value
    */
  def isItemSelected(item: ItemValue): Boolean = js.native
  /**
    * Select all items, except other and none.
    */
  def selectAll(): Unit = js.native
  /* protected */ def setDefaultValueWithOthers(): Unit = js.native
  /**
    * It will select all items, except other and none. If all items have been already selected then it will clear the value
    * @see isAllSelected
    * @see selectAll
    */
  def toggleSelectAll(): Unit = js.native
}

