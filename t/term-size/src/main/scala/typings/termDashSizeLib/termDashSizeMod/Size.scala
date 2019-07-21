package typings
package termDashSizeLib.termDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var columns: scala.Double
  var rows: scala.Double
}

object Size {
  @scala.inline
  def apply(columns: scala.Double, rows: scala.Double): Size = {
    val __obj = js.Dynamic.literal(columns = columns, rows = rows)
  
    __obj.asInstanceOf[Size]
  }
}

