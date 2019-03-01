package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoTypeValNumber extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var `val`: java.lang.String
}

object Anon_ColumnFilenameLinenoTypeValNumber {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    `val`: java.lang.String
  ): Anon_ColumnFilenameLinenoTypeValNumber = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeValNumber]
  }
}

