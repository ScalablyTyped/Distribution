package typings.xterm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cols extends js.Object {
  var cols: Double
  var rows: Double
}

object Cols {
  @scala.inline
  def apply(cols: Double, rows: Double): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
}

