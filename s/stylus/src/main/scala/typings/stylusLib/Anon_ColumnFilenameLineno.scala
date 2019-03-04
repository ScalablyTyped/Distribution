package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLineno extends js.Object {
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var quote: java.lang.String
  var `val`: java.lang.String
}

object Anon_ColumnFilenameLineno {
  @scala.inline
  def apply(
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    quote: java.lang.String,
    `val`: java.lang.String
  ): Anon_ColumnFilenameLineno = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, lineno = lineno, quote = quote)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLineno]
  }
}

