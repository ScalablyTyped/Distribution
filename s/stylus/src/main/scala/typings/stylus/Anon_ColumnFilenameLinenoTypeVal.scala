package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoTypeVal extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var `type`: String
  var `val`: Double
}

object Anon_ColumnFilenameLinenoTypeVal {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, `type`: String, `val`: Double): Anon_ColumnFilenameLinenoTypeVal = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeVal]
  }
}

