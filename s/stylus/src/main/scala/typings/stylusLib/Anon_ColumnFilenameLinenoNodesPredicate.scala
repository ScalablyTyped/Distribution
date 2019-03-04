package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodesPredicate extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.QueryExpr]
  var predicate: java.lang.String
  var `type`: java.lang.String
}

object Anon_ColumnFilenameLinenoNodesPredicate {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.QueryExpr],
    predicate: java.lang.String,
    `type`: java.lang.String
  ): Anon_ColumnFilenameLinenoNodesPredicate = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, nodes = nodes, predicate = predicate)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodesPredicate]
  }
}

