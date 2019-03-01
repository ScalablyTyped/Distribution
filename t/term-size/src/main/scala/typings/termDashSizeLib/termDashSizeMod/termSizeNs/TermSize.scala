package typings
package termDashSizeLib.termDashSizeMod.termSizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermSize extends js.Object {
  var columns: scala.Double
  var rows: scala.Double
}

object TermSize {
  @scala.inline
  def apply(columns: scala.Double, rows: scala.Double): TermSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[TermSize]
  }
}

