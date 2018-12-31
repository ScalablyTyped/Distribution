package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends Node {
  var hasMedia: scala.Boolean
  var hasProperties: scala.Boolean
  var isEmpty: scala.Boolean
  var node: Node
  var nodes: js.Array[Node]
  var parent: Block
  var scope: scala.Boolean
  /**
    * Push a `node` to this block.
    */
  def push(node: Node): scala.Unit
}

