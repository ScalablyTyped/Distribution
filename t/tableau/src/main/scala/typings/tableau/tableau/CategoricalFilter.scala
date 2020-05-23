package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalFilter
  extends Filter
     with ConcreteFilter {
  /**
    * Gets the collection of values that are currently set on the filter.
    * This is a native JavaScript array and not a keyed collection.
    * Note that only the first 200 values are returned.
    */
  def getAppliedValues(): js.Array[DataValue]
  /** Gets a value indicating whether the filter is exclude or include (default). */
  def getIsExcludeMode(): Boolean
}

object CategoricalFilter {
  @scala.inline
  def apply(
    getAppliedValues: () => js.Array[DataValue],
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getIsExcludeMode: () => Boolean,
    getWorksheet: () => Worksheet
  ): CategoricalFilter = {
    val __obj = js.Dynamic.literal(getAppliedValues = js.Any.fromFunction0(getAppliedValues), getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getIsExcludeMode = js.Any.fromFunction0(getIsExcludeMode), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[CategoricalFilter]
  }
}

