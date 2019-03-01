package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAddress extends js.Object {
  /** Column number */
  var c: scala.Double
  /** Row number */
  var r: scala.Double
}

object CellAddress {
  @scala.inline
  def apply(c: scala.Double, r: scala.Double): CellAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[CellAddress]
  }
}

