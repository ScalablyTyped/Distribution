package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoTypeVal extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var `type`: java.lang.String
  var `val`: scala.Double
}

object Anon_ColumnFilenameLinenoTypeVal {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    `type`: java.lang.String,
    `val`: scala.Double
  ): Anon_ColumnFilenameLinenoTypeVal = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeVal]
  }
}

