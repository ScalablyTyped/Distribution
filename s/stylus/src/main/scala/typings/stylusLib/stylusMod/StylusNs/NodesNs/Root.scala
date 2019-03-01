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

object Root {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: js.Function2[java.lang.String, Node, Node],
    push: js.Function1[Node, scala.Unit],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilename],
    unshift: js.Function1[Node, scala.Unit]
  ): Root = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("unshift")(unshift)
    __obj.asInstanceOf[Root]
  }
}

