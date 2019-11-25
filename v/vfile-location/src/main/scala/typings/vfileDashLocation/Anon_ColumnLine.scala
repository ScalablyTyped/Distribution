package typings.vfileDashLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnLine extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object Anon_ColumnLine {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Anon_ColumnLine = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnLine]
  }
}

