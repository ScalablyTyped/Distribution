package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
}

object Filename {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double, nodes: js.Array[Node]): Filename = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

