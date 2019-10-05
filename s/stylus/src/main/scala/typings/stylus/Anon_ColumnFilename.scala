package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilename extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
}

object Anon_ColumnFilename {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double, nodes: js.Array[Node]): Anon_ColumnFilename = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_ColumnFilename]
  }
}

