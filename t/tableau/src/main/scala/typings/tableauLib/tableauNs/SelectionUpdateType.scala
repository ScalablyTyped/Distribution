package typings
package tableauLib.tableauNs

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
  sealed trait ADD
    extends tableauLib.tableauNs.SelectionUpdateType
  
  /** Removes the values as specified in the call from the current selection. Equivalent to control-clicking an already selected mark in desktop. */
  @js.native
  sealed trait REMOVE
    extends tableauLib.tableauNs.SelectionUpdateType
  
  /** Replaces the current marks values with new ones specified in the call. */
  @js.native
  sealed trait REPLACE
    extends tableauLib.tableauNs.SelectionUpdateType
  
  /* "add" */ val ADD: ADD with java.lang.String = js.native
  /* "remove" */ val REMOVE: REMOVE with java.lang.String = js.native
  /* "replace" */ val REPLACE: REPLACE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.SelectionUpdateType with java.lang.String] = js.native
}

