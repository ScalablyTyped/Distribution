package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tableau.tableau.CategoricalFilter
  - typings.tableau.tableau.QuantitativeFilter
  - typings.tableau.tableau.RelativeDateFilter
*/
trait ConcreteFilter extends StObject
object ConcreteFilter {
  
  @scala.inline
  def CategoricalFilter(
    getAppliedValues: () => js.Array[DataValue],
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getIsExcludeMode: () => Boolean,
    getWorksheet: () => Worksheet
  ): typings.tableau.tableau.CategoricalFilter = {
    val __obj = js.Dynamic.literal(getAppliedValues = js.Any.fromFunction0(getAppliedValues), getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getIsExcludeMode = js.Any.fromFunction0(getIsExcludeMode), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[typings.tableau.tableau.CategoricalFilter]
  }
  
  @scala.inline
  def QuantitativeFilter(
    getDomainMax: () => DataValue,
    getDomainMin: () => DataValue,
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getIncludeNullValues: () => Boolean,
    getMax: () => DataValue,
    getMin: () => DataValue,
    getWorksheet: () => Worksheet
  ): typings.tableau.tableau.QuantitativeFilter = {
    val __obj = js.Dynamic.literal(getDomainMax = js.Any.fromFunction0(getDomainMax), getDomainMin = js.Any.fromFunction0(getDomainMin), getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getIncludeNullValues = js.Any.fromFunction0(getIncludeNullValues), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[typings.tableau.tableau.QuantitativeFilter]
  }
  
  @scala.inline
  def RelativeDateFilter(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getPeriod: () => PeriodType,
    getRange: () => DateRangeType,
    getRangeN: () => Double,
    getWorksheet: () => Worksheet
  ): typings.tableau.tableau.RelativeDateFilter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getPeriod = js.Any.fromFunction0(getPeriod), getRange = js.Any.fromFunction0(getRange), getRangeN = js.Any.fromFunction0(getRangeN), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[typings.tableau.tableau.RelativeDateFilter]
  }
}
