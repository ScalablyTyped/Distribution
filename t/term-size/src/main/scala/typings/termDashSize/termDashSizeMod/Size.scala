package typings.termDashSize.termDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var columns: Double
  var rows: Double
}

object Size {
  @scala.inline
  def apply(columns: Double, rows: Double): Size = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

