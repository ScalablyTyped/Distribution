package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameIsList extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var isList: Boolean
  var lineno: Double
  var nodes: js.Array[Node]
}

object Anon_ColumnFilenameIsList {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    isList: Boolean,
    lineno: Double,
    nodes: js.Array[Node]
  ): Anon_ColumnFilenameIsList = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, isList = isList, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_ColumnFilenameIsList]
  }
}

