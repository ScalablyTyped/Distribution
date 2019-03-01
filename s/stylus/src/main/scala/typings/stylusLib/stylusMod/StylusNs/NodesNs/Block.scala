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

object Block {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hasMedia: scala.Boolean,
    hasProperties: scala.Boolean,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: scala.Double,
    node: Node,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: js.Function2[java.lang.String, Node, Node],
    parent: Block,
    push: js.Function1[Node, scala.Unit],
    scope: scala.Boolean,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoNodes]
  ): Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hasMedia")(hasMedia)
    __obj.updateDynamic("hasProperties")(hasProperties)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Block]
  }
}

