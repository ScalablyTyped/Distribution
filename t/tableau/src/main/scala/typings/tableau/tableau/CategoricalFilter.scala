package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalFilter
  extends StObject
     with Filter
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoricalFilter] (val x: Self) extends AnyVal {
    
    inline def setGetAppliedValues(value: () => js.Array[DataValue]): Self = StObject.set(x, "getAppliedValues", js.Any.fromFunction0(value))
    
    inline def setGetIsExcludeMode(value: () => Boolean): Self = StObject.set(x, "getIsExcludeMode", js.Any.fromFunction0(value))
  }
}
