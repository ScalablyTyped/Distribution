package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPath extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var path: stylusLib.stylusMod.StylusNs.NodesNs.Expression
}

object Anon_ColumnFilenameLinenoPath {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    path: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  ): Anon_ColumnFilenameLinenoPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPath]
  }
}

