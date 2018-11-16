package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Root extends Node {
  var nodes: js.Array[Node]
  /**
               * Push a `node` to this block.
               */
  def push(node: Node): scala.Unit
  /**
               * Unshift a `node` to this block.
               */
  def unshift(node: Node): scala.Unit
}

