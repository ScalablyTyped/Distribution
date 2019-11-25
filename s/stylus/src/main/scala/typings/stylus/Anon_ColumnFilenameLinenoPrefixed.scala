package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPrefixed extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var prefixed: Boolean
  var string: String
  var `val`: String
}

object Anon_ColumnFilenameLinenoPrefixed {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    prefixed: Boolean,
    string: String,
    `val`: String
  ): Anon_ColumnFilenameLinenoPrefixed = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPrefixed]
  }
}

