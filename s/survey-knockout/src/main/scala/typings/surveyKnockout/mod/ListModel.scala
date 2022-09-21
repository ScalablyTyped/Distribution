package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ListModel")
@js.native
open class ListModel protected () extends ActionContainer[Action] {
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* params */ Any, Unit],
    allowSelection: Boolean
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* params */ Any, Unit],
    allowSelection: Boolean,
    selectedItem: IAction
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* params */ Any, Unit],
    allowSelection: Boolean,
    selectedItem: Unit,
    onFilterStringChangedCallback: js.Function1[/* text */ String, Unit]
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* params */ Any, Unit],
    allowSelection: Boolean,
    selectedItem: IAction,
    onFilterStringChangedCallback: js.Function1[/* text */ String, Unit]
  ) = this()
  
  var allowSelection: Boolean = js.native
  
  def emptyMessage: String = js.native
  
  var filterString: String = js.native
  
  def filterStringPlaceholder: String = js.native
  
  def focusFirstVisibleItem(): Unit = js.native
  
  def focusLastVisibleItem(): Unit = js.native
  
  def focusNextVisibleItem(): Unit = js.native
  
  def focusPrevVisibleItem(): Unit = js.native
  
  var focusedItem: Action = js.native
  
  def getItemClass(itemValue: Action): String = js.native
  
  def getItemIndent(itemValue: Any): String = js.native
  
  def goToItems(event: Any): Unit = js.native
  
  def initFocusedItem(): Unit = js.native
  
  var isExpanded: Boolean = js.native
  
  def isItemDisabled(itemValue: Action): Boolean = js.native
  
  def isItemFocused(itemValue: Action): Boolean = js.native
  
  def isItemSelected(itemValue: Action): Boolean = js.native
  
  def isItemVisible(item: Action): Boolean = js.native
  
  def onItemClick(itemValue: Action): Unit = js.native
  
  def onKeyDown(event: Any): Unit = js.native
  
  def onMouseMove(event: Any): Unit = js.native
  
  def onPointerDown(event: Any, item: Any): Unit = js.native
  
  def onSelectionChanged(
    item: Action,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type any is not an array type */ params: Any
  ): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def resetFocusedItem(): Unit = js.native
  
  var searchEnabled: Boolean = js.native
  
  def selectFocusedItem(): Unit = js.native
  
  var selectedItem: IAction = js.native
  
  var showFilter: Boolean = js.native
  
  /* protected */ def updateItemActiveState(): Unit = js.native
  
  def visibleItems: Any = js.native
}
/* static members */
object ListModel {
  
  @JSImport("survey-knockout", "ListModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ListModel.INDENT")
  @js.native
  def INDENT: Double = js.native
  inline def INDENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDENT")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "ListModel.MINELEMENTCOUNT")
  @js.native
  def MINELEMENTCOUNT: Double = js.native
  inline def MINELEMENTCOUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINELEMENTCOUNT")(x.asInstanceOf[js.Any])
}
