package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeFilterOptions extends StObject {
  
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: Double | js.Date
  
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: Double | js.Date
  
  /** The null values to include */
  var nullOption: NullOption
}
object RangeFilterOptions {
  
  inline def apply(max: Double | js.Date, min: Double | js.Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOptions]
  }
  
  extension [Self <: RangeFilterOptions](x: Self) {
    
    inline def setMax(value: Double | js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double | js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setNullOption(value: NullOption): Self = StObject.set(x, "nullOption", value.asInstanceOf[js.Any])
  }
}
