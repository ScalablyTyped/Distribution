package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Object extends Node {
  var length: scala.Double
  var vals: stylusLib.stylusMod.StylusNs.Dictionary[Node]
  /**
               * Get `key`.
               */
  def get(key: java.lang.String): Node
  /**
               * Has `key`?
               */
  def has(key: java.lang.String): scala.Boolean
  /**
               * Set `key` to `val`.
               */
  def set(key: java.lang.String, value: Node): this.type
  /**
               * Convert object to string with properties.
               */
  def toBlock(): java.lang.String
}

