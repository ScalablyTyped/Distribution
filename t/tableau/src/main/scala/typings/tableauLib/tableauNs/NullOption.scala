package typings
package tableauLib.tableauNs

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
  sealed trait ALL_VALUES
    extends tableauLib.tableauNs.NullOption
  
  /** Only include non-null values in the filter. */
  @js.native
  sealed trait NON_NULL_VALUES
    extends tableauLib.tableauNs.NullOption
  
  /** Only include null values in the filter. */
  @js.native
  sealed trait NULL_VALUES
    extends tableauLib.tableauNs.NullOption
  
  /* "allValues" */ val ALL_VALUES: ALL_VALUES with java.lang.String = js.native
  /* "nonNullValues" */ val NON_NULL_VALUES: NON_NULL_VALUES with java.lang.String = js.native
  /* "nullValues" */ val NULL_VALUES: NULL_VALUES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.NullOption with java.lang.String] = js.native
}

