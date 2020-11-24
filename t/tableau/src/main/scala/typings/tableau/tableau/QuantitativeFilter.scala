package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantitativeFilter
  extends Filter
     with ConcreteFilter {
  
  /** Gets the maximum value as specified in the domain. */
  def getDomainMax(): DataValue = js.native
  
  /** Gets the minimum value as specified in the domain. */
  def getDomainMin(): DataValue = js.native
  
  /** Indicates whether null values are included in the filter. */
  def getIncludeNullValues(): Boolean = js.native
  
  /** Gets the maximum value, inclusive, applied to the filter. */
  def getMax(): DataValue = js.native
  
  /** Gets the minimum value, inclusive, applied to the filter. */
  def getMin(): DataValue = js.native
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
  
  @scala.inline
  implicit class QuantitativeFilterOps[Self <: QuantitativeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDomainMax(value: () => DataValue): Self = this.set("getDomainMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDomainMin(value: () => DataValue): Self = this.set("getDomainMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIncludeNullValues(value: () => Boolean): Self = this.set("getIncludeNullValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMax(value: () => DataValue): Self = this.set("getMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMin(value: () => DataValue): Self = this.set("getMin", js.Any.fromFunction0(value))
  }
}
