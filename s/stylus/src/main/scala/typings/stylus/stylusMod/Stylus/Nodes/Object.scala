package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_Column
import typings.stylus.stylusMod.Stylus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends Node {
  var length: Double
  var vals: Dictionary[Node]
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
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    get: java.lang.String => Node,
    has: java.lang.String => scala.Boolean,
    hash: java.lang.String,
    length: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    set: (java.lang.String, Node) => Object,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBlock: () => java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_Column,
    vals: Dictionary[Node]
  ): Object = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), set = js.Any.fromFunction2(set), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBlock = js.Any.fromFunction0(toBlock), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), vals = vals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Object]
  }
}

