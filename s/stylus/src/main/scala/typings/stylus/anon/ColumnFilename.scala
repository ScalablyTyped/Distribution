package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilename extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
}

object ColumnFilename {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double): ColumnFilename = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilename]
  }
}

