package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.CategoricalFilter")
@js.native
class CategoricalFilter ()
  extends Filter
     with ConcreteFilter {
  /**
    * Gets the collection of values that are currently set on the filter.
    * This is a native JavaScript array and not a keyed collection.
    * Note that only the first 200 values are returned.
    */
  def getAppliedValues(): js.Array[DataValue] = js.native
  /** Gets a value indicating whether the filter is exclude or include (default). */
  def getIsExcludeMode(): Boolean = js.native
}

