package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoTypeVals extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var vals: stylusLib.stylusMod.StylusNs.Dictionary[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnFilenameLinenoTypeVals {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    vals: stylusLib.stylusMod.StylusNs.Dictionary[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_ColumnFilenameLinenoTypeVals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("vals")(vals)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeVals]
  }
}

