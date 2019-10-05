package typings.tableau.tableau

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
  sealed trait ADD extends FilterUpdateType
  
  /** Adds all values to the filter. Equivalent to checking the (All) value in a quick filter. */
  @js.native
  sealed trait ALL extends FilterUpdateType
  
  /** Removes the filter values as specified in the call from the current filter values. Equivalent to unchecking a value in a quick filter. */
  @js.native
  sealed trait REMOVE extends FilterUpdateType
  
  /** Replaces the current filter values with new ones specified in the call */
  @js.native
  sealed trait REPLACE extends FilterUpdateType
  
  /* "add" */ val ADD: typings.tableau.tableau.FilterUpdateType.ADD with String = js.native
  /* "all" */ val ALL: typings.tableau.tableau.FilterUpdateType.ALL with String = js.native
  /* "remove" */ val REMOVE: typings.tableau.tableau.FilterUpdateType.REMOVE with String = js.native
  /* "replace" */ val REPLACE: typings.tableau.tableau.FilterUpdateType.REPLACE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterUpdateType with String] = js.native
}

