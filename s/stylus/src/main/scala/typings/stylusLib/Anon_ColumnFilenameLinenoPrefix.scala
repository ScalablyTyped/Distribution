package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPrefix extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var prefix: java.lang.String
  var `val`: java.lang.String
}

object Anon_ColumnFilenameLinenoPrefix {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    prefix: java.lang.String,
    `val`: java.lang.String
  ): Anon_ColumnFilenameLinenoPrefix = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPrefix]
  }
}

