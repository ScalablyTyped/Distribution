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
    val __obj = js.Dynamic.literal(`type` = `type`, `val` = `val`)
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeVal]
  }
}

