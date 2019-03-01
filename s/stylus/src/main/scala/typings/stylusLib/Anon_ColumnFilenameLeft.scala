package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLeft extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var left: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var lineno: scala.Double
  var op: java.lang.String
  var right: stylusLib.stylusMod.StylusNs.NodesNs.Expression
}

object Anon_ColumnFilenameLeft {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    left: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    lineno: scala.Double,
    op: java.lang.String,
    right: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  ): Anon_ColumnFilenameLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_ColumnFilenameLeft]
  }
}

