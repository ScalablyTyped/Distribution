package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoType extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var `val`: scala.Boolean
}

object Anon_ColumnFilenameLinenoType {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    `val`: scala.Boolean
  ): Anon_ColumnFilenameLinenoType = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoType]
  }
}

