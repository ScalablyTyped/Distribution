package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends Node {
  var isEmpty: scala.Boolean
  var isList: scala.Boolean
  var nodes: js.Array[Node]
  /**
    * Push the given node.
    */
  def push(node: Node): scala.Unit
}

