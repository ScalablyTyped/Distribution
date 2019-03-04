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

object Object {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    get: js.Function1[java.lang.String, Node],
    has: js.Function1[java.lang.String, scala.Boolean],
    hash: java.lang.String,
    length: scala.Double,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    set: js.Function2[java.lang.String, Node, Object],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBlock: js.Function0[java.lang.String],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoTypeVals],
    vals: stylusLib.stylusMod.StylusNs.Dictionary[Node]
  ): Object = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, get = get, has = has, hash = hash, length = length, lineno = lineno, nodeName = nodeName, operate = operate, set = set, shouldCoerce = shouldCoerce, toBlock = toBlock, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON, vals = vals)
  
    __obj.asInstanceOf[Object]
  }
}

