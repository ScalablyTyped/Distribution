package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameIsList extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var isList: scala.Boolean
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnFilenameIsList {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    isList: scala.Boolean,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_ColumnFilenameIsList = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, isList = isList, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_ColumnFilenameIsList]
  }
}

