package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeFilter
  extends Filter
     with ConcreteFilter {
  /** Gets the maximum value as specified in the domain. */
  def getDomainMax(): DataValue
  /** Gets the minimum value as specified in the domain. */
  def getDomainMin(): DataValue
  /** Indicates whether null values are included in the filter. */
  def getIncludeNullValues(): Boolean
  /** Gets the maximum value, inclusive, applied to the filter. */
  def getMax(): DataValue
  /** Gets the minimum value, inclusive, applied to the filter. */
  def getMin(): DataValue
}

object QuantitativeFilter {
  @scala.inline
  def apply(
    getDomainMax: () => DataValue,
    getDomainMin: () => DataValue,
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getIncludeNullValues: () => Boolean,
    getMax: () => DataValue,
    getMin: () => DataValue,
    getWorksheet: () => Worksheet
  ): QuantitativeFilter = {
    val __obj = js.Dynamic.literal(getDomainMax = js.Any.fromFunction0(getDomainMax), getDomainMin = js.Any.fromFunction0(getDomainMin), getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getIncludeNullValues = js.Any.fromFunction0(getIncludeNullValues), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[QuantitativeFilter]
  }
}

