package typings.tableau.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOptions extends js.Object {
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
}

