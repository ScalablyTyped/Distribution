package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodesType extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
}

object Anon_ColumnFilenameLinenoNodesType {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, nodes: js.Array[Node]): Anon_ColumnFilenameLinenoNodesType = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodesType]
  }
}

