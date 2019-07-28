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
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Anon_ColumnLine]
  }
}

