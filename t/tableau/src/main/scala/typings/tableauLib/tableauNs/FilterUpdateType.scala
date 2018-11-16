package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterUpdateType extends js.Object

@JSGlobal("tableau.FilterUpdateType")
@js.native
object FilterUpdateType extends js.Object {
  /** Adds the filter values as specified in the call to the current filter values. Equivalent to checking a value in a quick filter. */
  @js.native
  sealed trait ADD
    extends tableauLib.tableauNs.FilterUpdateType
  
  /** Adds all values to the filter. Equivalent to checking the (All) value in a quick filter. */
  @js.native
  sealed trait ALL
    extends tableauLib.tableauNs.FilterUpdateType
  
  /** Removes the filter values as specified in the call from the current filter values. Equivalent to unchecking a value in a quick filter. */
  @js.native
  sealed trait REMOVE
    extends tableauLib.tableauNs.FilterUpdateType
  
  /** Replaces the current filter values with new ones specified in the call */
  @js.native
  sealed trait REPLACE
    extends tableauLib.tableauNs.FilterUpdateType
  
  /* "add" */ val ADD: ADD with java.lang.String = js.native
  /* "all" */ val ALL: ALL with java.lang.String = js.native
  /* "remove" */ val REMOVE: REMOVE with java.lang.String = js.native
  /* "replace" */ val REPLACE: REPLACE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.FilterUpdateType with java.lang.String] = js.native
}

