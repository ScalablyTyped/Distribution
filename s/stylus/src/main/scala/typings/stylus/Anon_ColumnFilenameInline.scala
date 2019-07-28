package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameInline extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var `inline`: Boolean
  var lineno: Double
  var str: String
  var suppress: Boolean
}

object Anon_ColumnFilenameInline {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    `inline`: Boolean,
    lineno: Double,
    str: String,
    suppress: Boolean
  ): Anon_ColumnFilenameInline = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, str = str, suppress = suppress)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_ColumnFilenameInline]
  }
}

