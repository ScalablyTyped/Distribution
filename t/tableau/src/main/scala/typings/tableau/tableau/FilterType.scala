package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import typings.tableau.tableau.FilterType.CATEGORICAL
import typings.tableau.tableau.FilterType.HIERARCHICAL
import typings.tableau.tableau.FilterType.QUANTITATIVE
import typings.tableau.tableau.FilterType.RELATIVE_DATE
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType with String] = js.native
  /* "categorical" */ @js.native
  object CATEGORICAL extends TopLevel[CATEGORICAL with String]
  
  /* "hierarchical" */ @js.native
  object HIERARCHICAL extends TopLevel[HIERARCHICAL with String]
  
  /* "quantitative" */ @js.native
  object QUANTITATIVE extends TopLevel[QUANTITATIVE with String]
  
  /* "relativedate" */ @js.native
  object RELATIVE_DATE extends TopLevel[RELATIVE_DATE with String]
  
}

