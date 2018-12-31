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

