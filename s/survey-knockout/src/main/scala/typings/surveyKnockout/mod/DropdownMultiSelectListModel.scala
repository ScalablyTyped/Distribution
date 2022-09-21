package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DropdownMultiSelectListModel")
@js.native
open class DropdownMultiSelectListModel protected () extends DropdownListModel {
  def this(question: Question) = this()
  def this(question: Question, onSelectionChanged: js.Function2[/* item */ IAction, /* params */ Any, Unit]) = this()
  
  var closeOnSelect: Boolean = js.native
  
  def deselectItem(id: String): Unit = js.native
  
  var filterStringPlaceholder: String = js.native
  
  def inputKeyHandler(event: Any): Unit = js.native
  
  /* protected */ var `override`: Any = js.native
  
  def removeLastSelectedItem(): Unit = js.native
  
  def selectAllItems(): Unit = js.native
  
  def selectItem(id: String): Unit = js.native
  
  def selectNoneItem(): Unit = js.native
  
  def setHideSelectedItems(newValue: Boolean): Unit = js.native
}
