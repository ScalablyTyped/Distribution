package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPrefix extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var prefix: String
  var `val`: String
}

object Anon_ColumnFilenameLinenoPrefix {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, prefix: String, `val`: String): Anon_ColumnFilenameLinenoPrefix = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, prefix = prefix)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPrefix]
  }
}

