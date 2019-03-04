package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilename extends js.Object {
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnFilename {
  @scala.inline
  def apply(
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_ColumnFilename = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_ColumnFilename]
  }
}

