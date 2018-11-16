package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Group extends Node {
  var block: Block
  var hasOnlyPlaceholders: scala.Boolean
  var nodes: js.Array[Node]
  /**
               * Push the given `selector` node.
               */
  def push(node: Node): scala.Unit
}

