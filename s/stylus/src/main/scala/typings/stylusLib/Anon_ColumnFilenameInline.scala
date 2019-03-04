package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameInline extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var `inline`: scala.Boolean
  var lineno: scala.Double
  var str: java.lang.String
  var suppress: scala.Boolean
}

object Anon_ColumnFilenameInline {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    `inline`: scala.Boolean,
    lineno: scala.Double,
    str: java.lang.String,
    suppress: scala.Boolean
  ): Anon_ColumnFilenameInline = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, str = str, suppress = suppress)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_ColumnFilenameInline]
  }
}

