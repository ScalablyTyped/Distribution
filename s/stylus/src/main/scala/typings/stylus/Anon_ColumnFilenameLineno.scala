package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLineno extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
  var quote: String
  var `val`: String
}

object Anon_ColumnFilenameLineno {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double, quote: String, `val`: String): Anon_ColumnFilenameLineno = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, lineno = lineno, quote = quote)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLineno]
  }
}

