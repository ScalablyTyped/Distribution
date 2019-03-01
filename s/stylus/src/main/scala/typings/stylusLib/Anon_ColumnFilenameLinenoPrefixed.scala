package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPrefixed extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var prefixed: scala.Boolean
  var string: java.lang.String
  var `val`: java.lang.String
}

object Anon_ColumnFilenameLinenoPrefixed {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    prefixed: scala.Boolean,
    string: java.lang.String,
    `val`: java.lang.String
  ): Anon_ColumnFilenameLinenoPrefixed = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("prefixed")(prefixed)
    __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPrefixed]
  }
}

