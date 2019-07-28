package typings.stylus

import typings.stylus.stylusMod.StylusNs.Dictionary
import typings.stylus.stylusMod.StylusNs.NodesNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameIsListLineno extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var isList: Boolean
  var lineno: Double
  var map: Dictionary[Node]
  var nodes: js.Array[Node]
  var preserve: Boolean
}

object Anon_ColumnFilenameIsListLineno {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    isList: Boolean,
    lineno: Double,
    map: Dictionary[Node],
    nodes: js.Array[Node],
    preserve: Boolean
  ): Anon_ColumnFilenameIsListLineno = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, isList = isList, lineno = lineno, map = map, nodes = nodes, preserve = preserve)
  
    __obj.asInstanceOf[Anon_ColumnFilenameIsListLineno]
  }
}

