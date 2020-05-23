package typings.tokenizr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: Double
  var len: Double
  var line: Double
  var pos: Double
}

object Column {
  @scala.inline
  def apply(column: Double, len: Double, line: Double, pos: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

