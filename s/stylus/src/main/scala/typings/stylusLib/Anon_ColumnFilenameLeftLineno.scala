package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLeftLineno extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var left: stylusLib.stylusMod.StylusNs.NodesNs.Node
  var lineno: scala.Double
  var right: stylusLib.stylusMod.StylusNs.NodesNs.Node
  var `val`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColumnFilenameLeftLineno {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    left: stylusLib.stylusMod.StylusNs.NodesNs.Node,
    lineno: scala.Double,
    right: stylusLib.stylusMod.StylusNs.NodesNs.Node,
    `val`: java.lang.String = null
  ): Anon_ColumnFilenameLeftLineno = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, left = left, lineno = lineno, right = right)
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLeftLineno]
  }
}

