package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** Ending cell */
  var e: CellAddress
  /** Starting cell */
  var s: CellAddress
}

object Range {
  @scala.inline
  def apply(e: CellAddress, s: CellAddress): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[Range]
  }
}

