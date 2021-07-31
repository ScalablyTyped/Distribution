package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends StObject
@JSGlobal("tableau.FilterType")
@js.native
object FilterType extends StObject {
  
  /** Categorical filters are used to filter to a set of values within the domain. */
  @js.native
  sealed trait CATEGORICAL
    extends StObject
       with FilterType
  
  /** Hierarchical filters are used to filter to a set of values organized into a hierarchy within the domain. */
  @js.native
  sealed trait HIERARCHICAL
    extends StObject
       with FilterType
  
  /** Quantitative filters are used to filter to a range of values from a continuous domain. */
  @js.native
  sealed trait QUANTITATIVE
    extends StObject
       with FilterType
  
  /** Relative date filters are used to filter a date/time domain to a range of values relative to a fixed point in time. */
  @js.native
  sealed trait RELATIVE_DATE
    extends StObject
       with FilterType
}
