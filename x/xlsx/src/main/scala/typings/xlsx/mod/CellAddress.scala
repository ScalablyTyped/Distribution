package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAddress extends _RangeSpec {
  /** Column number */
  var c: Double
  /** Row number */
  var r: Double
}

object CellAddress {
  @scala.inline
  def apply(c: Double, r: Double): CellAddress = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellAddress]
  }
}

