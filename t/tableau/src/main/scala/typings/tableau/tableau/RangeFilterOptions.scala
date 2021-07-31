package typings.tableau.tableau

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeFilterOptions extends StObject {
  
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: Double | Date
  
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: Double | Date
  
  /** The null values to include */
  var nullOption: NullOption
}
object RangeFilterOptions {
  
  @scala.inline
  def apply(max: Double | Date, min: Double | Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOptions]
  }
  
  @scala.inline
  implicit class RangeFilterOptionsMutableBuilder[Self <: RangeFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double | Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double | Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullOption(value: NullOption): Self = StObject.set(x, "nullOption", value.asInstanceOf[js.Any])
  }
}
