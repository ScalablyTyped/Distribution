package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DropdownListModel")
@js.native
open class DropdownListModel protected () extends Base {
  def this(question: Question) = this()
  def this(question: Question, onSelectionChanged: js.Function2[/* item */ IAction, /* params */ Any, Unit]) = this()
  
  var _popupModel: Any = js.native
  
  /* protected */ def createListModel(): ListModel = js.native
  
  var filterString: String = js.native
  
  var focusFirstInputSelector: String = js.native
  
  /* protected */ def getAvailableItems(): js.Array[Action] = js.native
  
  def getSelectedAction(): Action = js.native
  
  def inputReadOnly: Boolean = js.native
  
  def keyHandler(event: Any): Unit = js.native
  
  /* protected */ var listModel: ListModel = js.native
  
  def onBlur(event: Any): Unit = js.native
  
  def onClear(event: Any): Unit = js.native
  
  def onClick(event: Any): Unit = js.native
  
  /* protected */ def onHidePopup(): Unit = js.native
  
  /* protected */ def onSetFilterString(): Unit = js.native
  
  /* protected */ var popupCssClasses: String = js.native
  
  def popupModel: Any = js.native
  
  /* protected */ def resetFilterString(): Unit = js.native
  
  def scrollToFocusedItem(): Unit = js.native
  
  var searchEnabled: Boolean = js.native
  
  def setInputHasValue(newValue: Boolean): Unit = js.native
  
  def setSearchEnabled(newValue: Boolean): Unit = js.native
  
  def updateItems(): Unit = js.native
}
