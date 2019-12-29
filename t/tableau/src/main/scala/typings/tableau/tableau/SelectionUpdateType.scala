package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionUpdateType with String] = js.native
  /* "add" */ @js.native
  object ADD extends TopLevel[ADD with String]
  
  /* "remove" */ @js.native
  object REMOVE extends TopLevel[REMOVE with String]
  
  /* "replace" */ @js.native
  object REPLACE extends TopLevel[REPLACE with String]
  
}

