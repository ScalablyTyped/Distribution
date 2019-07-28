package typings.tableau.tableauNs

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
  sealed trait CATEGORICAL extends FilterType
  
  /** Hierarchical filters are used to filter to a set of values organized into a hierarchy within the domain. */
  @js.native
  sealed trait HIERARCHICAL extends FilterType
  
  /** Quantitative filters are used to filter to a range of values from a continuous domain. */
  @js.native
  sealed trait QUANTITATIVE extends FilterType
  
  /** Relative date filters are used to filter a date/time domain to a range of values relative to a fixed point in time. */
  @js.native
  sealed trait RELATIVE_DATE extends FilterType
  
  /* "categorical" */ val CATEGORICAL: typings.tableau.tableauNs.FilterType.CATEGORICAL with String = js.native
  /* "hierarchical" */ val HIERARCHICAL: typings.tableau.tableauNs.FilterType.HIERARCHICAL with String = js.native
  /* "quantitative" */ val QUANTITATIVE: typings.tableau.tableauNs.FilterType.QUANTITATIVE with String = js.native
  /* "relativedate" */ val RELATIVE_DATE: typings.tableau.tableauNs.FilterType.RELATIVE_DATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType with String] = js.native
}

