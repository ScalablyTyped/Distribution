package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodesType extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnFilenameLinenoNodesType {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_ColumnFilenameLinenoNodesType = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodesType]
  }
}

