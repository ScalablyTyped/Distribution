package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MultiSelectListModel")
@js.native
open class MultiSelectListModel protected () extends ListModel {
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* status */ String, Unit],
    allowSelection: Boolean
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* status */ String, Unit],
    allowSelection: Boolean,
    selectedItems: Any
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* status */ String, Unit],
    allowSelection: Boolean,
    selectedItems: Any,
    onFilterStringChangedCallback: js.Function1[/* text */ String, Unit]
  ) = this()
  def this(
    items: Any,
    onSelectionChanged: js.Function2[/* item */ Action, /* status */ String, Unit],
    allowSelection: Boolean,
    selectedItems: Unit,
    onFilterStringChangedCallback: js.Function1[/* text */ String, Unit]
  ) = this()
  
  var hideSelectedItems: Boolean = js.native
  
  var selectedItems: Any = js.native
  
  def setSelectedItems(newItems: Any): Unit = js.native
}
