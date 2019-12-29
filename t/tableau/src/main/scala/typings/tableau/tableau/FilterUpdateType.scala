package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterUpdateType with String] = js.native
  /* "add" */ @js.native
  object ADD extends TopLevel[ADD with String]
  
  /* "all" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "remove" */ @js.native
  object REMOVE extends TopLevel[REMOVE with String]
  
  /* "replace" */ @js.native
  object REPLACE extends TopLevel[REPLACE with String]
  
}

