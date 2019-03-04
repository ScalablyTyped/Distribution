package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOptions extends js.Object {
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: scala.Double | stdLib.Date
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: scala.Double | stdLib.Date
  /** The null values to include */
  var nullOption: NullOption
}

object RangeFilterOptions {
  @scala.inline
  def apply(max: scala.Double | stdLib.Date, min: scala.Double | stdLib.Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption)
  
    __obj.asInstanceOf[RangeFilterOptions]
  }
}

