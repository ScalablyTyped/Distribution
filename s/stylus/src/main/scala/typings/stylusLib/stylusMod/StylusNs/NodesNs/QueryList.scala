package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryList extends Node {
  var nodes: js.Array[Node]
  /**
               * Merges this query list with the `other`.
               */
  def merge(other: QueryList): QueryList
  /**
               * Push the given `node`.
               */
  def push(node: Node): scala.Unit
}

