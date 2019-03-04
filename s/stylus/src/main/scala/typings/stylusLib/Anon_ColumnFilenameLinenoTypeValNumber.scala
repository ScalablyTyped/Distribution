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
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeValNumber]
  }
}

