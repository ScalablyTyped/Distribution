package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSGlobal("tableau.FilterType")
@js.native
object FilterType extends js.Object {
  /** Categorical filters are used to filter to a set of values within the domain. */
  @js.native
  sealed trait CATEGORICAL
    extends tableauLib.tableauNs.FilterType
  
  /** Hierarchical filters are used to filter to a set of values organized into a hierarchy within the domain. */
  @js.native
  sealed trait HIERARCHICAL
    extends tableauLib.tableauNs.FilterType
  
  /** Quantitative filters are used to filter to a range of values from a continuous domain. */
  @js.native
  sealed trait QUANTITATIVE
    extends tableauLib.tableauNs.FilterType
  
  /** Relative date filters are used to filter a date/time domain to a range of values relative to a fixed point in time. */
  @js.native
  sealed trait RELATIVE_DATE
    extends tableauLib.tableauNs.FilterType
  
  /* "categorical" */ val CATEGORICAL: CATEGORICAL with java.lang.String = js.native
  /* "hierarchical" */ val HIERARCHICAL: HIERARCHICAL with java.lang.String = js.native
  /* "quantitative" */ val QUANTITATIVE: QUANTITATIVE with java.lang.String = js.native
  /* "relativedate" */ val RELATIVE_DATE: RELATIVE_DATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.FilterType with java.lang.String] = js.native
}

