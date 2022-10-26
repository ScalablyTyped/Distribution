package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTagboxModel")
@js.native
open class QuestionTagboxModel protected () extends QuestionCheckboxModel {
  def this(name: String) = this()
  
  /*
    * Specifies whether to display a button that clears the selected value.
    */
  var allowClear: Boolean = js.native
  
  var choicesLazyLoadEnabled: Boolean = js.native
  
  var choicesLazyLoadPageSize: Double = js.native
  
  def clearCaption: String = js.native
  def clearCaption_=(`val`: String): Unit = js.native
  
  var dropdownListModel: DropdownMultiSelectListModel = js.native
  
  def getControlClass(): String = js.native
  
  def getInputId(): String = js.native
  
  /*
    * Specifies whether to remove selected items from the drop-down list.
    */
  var hideSelectedItems: Boolean = js.native
  
  def locClearCaption: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  var onOpened: EventBase[QuestionTagboxModel] = js.native
  
  def onOpenedCallBack(): Unit = js.native
  
  /*
    * A text displayed in the input field when it doesn't have a value.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def popupModel: Any = js.native
  
  def readOnlyText: Any = js.native
  
  /*
    * Specifies whether users can enter a value into the input field to filter the drop-down list.
    */
  var searchEnabled: Boolean = js.native
}
