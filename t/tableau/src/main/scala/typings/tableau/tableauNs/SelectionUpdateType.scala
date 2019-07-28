package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionUpdateType extends js.Object

@JSGlobal("tableau.SelectionUpdateType")
@js.native
object SelectionUpdateType extends js.Object {
  /** Adds the values as specified in the call to the current selection. Equivalent to control-clicking in desktop. */
  @js.native
  sealed trait ADD extends SelectionUpdateType
  
  /** Removes the values as specified in the call from the current selection. Equivalent to control-clicking an already selected mark in desktop. */
  @js.native
  sealed trait REMOVE extends SelectionUpdateType
  
  /** Replaces the current marks values with new ones specified in the call. */
  @js.native
  sealed trait REPLACE extends SelectionUpdateType
  
  /* "add" */ val ADD: typings.tableau.tableauNs.SelectionUpdateType.ADD with String = js.native
  /* "remove" */ val REMOVE: typings.tableau.tableauNs.SelectionUpdateType.REMOVE with String = js.native
  /* "replace" */ val REPLACE: typings.tableau.tableauNs.SelectionUpdateType.REPLACE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionUpdateType with String] = js.native
}

