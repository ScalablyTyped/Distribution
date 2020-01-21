package typings.xterm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCols extends js.Object {
  var cols: Double
  var rows: Double
}

object AnonCols {
  @scala.inline
  def apply(cols: Double, rows: Double): AnonCols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCols]
  }
}

