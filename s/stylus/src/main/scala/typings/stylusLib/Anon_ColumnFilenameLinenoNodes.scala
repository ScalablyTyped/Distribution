package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodes extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var scope: scala.Boolean
}

object Anon_ColumnFilenameLinenoNodes {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    scope: scala.Boolean
  ): Anon_ColumnFilenameLinenoNodes = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, nodes = nodes, scope = scope)
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodes]
  }
}

