package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameIsListLineno extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var isList: scala.Boolean
  var lineno: scala.Double
  var map: stylusLib.stylusMod.StylusNs.Dictionary[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var preserve: scala.Boolean
}

object Anon_ColumnFilenameIsListLineno {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    isList: scala.Boolean,
    lineno: scala.Double,
    map: stylusLib.stylusMod.StylusNs.Dictionary[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    preserve: scala.Boolean
  ): Anon_ColumnFilenameIsListLineno = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, isList = isList, lineno = lineno, map = map, nodes = nodes, preserve = preserve)
  
    __obj.asInstanceOf[Anon_ColumnFilenameIsListLineno]
  }
}

