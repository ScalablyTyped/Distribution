package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullOption extends js.Object

/** An enumeration that indicates what to do with null values for a given filter or mark selection call. */
@JSGlobal("tableau.NullOption")
@js.native
object NullOption extends js.Object {
  /** Include null and non-null values in the filter. */
  @js.native
  sealed trait ALL_VALUES extends NullOption
  
  /** Only include non-null values in the filter. */
  @js.native
  sealed trait NON_NULL_VALUES extends NullOption
  
  /** Only include null values in the filter. */
  @js.native
  sealed trait NULL_VALUES extends NullOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NullOption with String] = js.native
  /* "allValues" */ @js.native
  object ALL_VALUES extends TopLevel[ALL_VALUES with String]
  
  /* "nonNullValues" */ @js.native
  object NON_NULL_VALUES extends TopLevel[NON_NULL_VALUES with String]
  
  /* "nullValues" */ @js.native
  object NULL_VALUES extends TopLevel[NULL_VALUES with String]
  
}

