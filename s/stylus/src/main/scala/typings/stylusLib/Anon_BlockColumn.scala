package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumn extends js.Object {
  var __type: java.lang.String
  var block: stylusLib.stylusMod.StylusNs.NodesNs.Block
  var column: scala.Double
  var expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var filename: java.lang.String
  var key: java.lang.String
  var lineno: scala.Double
  var `val`: java.lang.String
}

object Anon_BlockColumn {
  @scala.inline
  def apply(
    __type: java.lang.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block,
    column: scala.Double,
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    filename: java.lang.String,
    key: java.lang.String,
    lineno: scala.Double,
    `val`: java.lang.String
  ): Anon_BlockColumn = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, expr = expr, filename = filename, key = key, lineno = lineno)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_BlockColumn]
  }
}

