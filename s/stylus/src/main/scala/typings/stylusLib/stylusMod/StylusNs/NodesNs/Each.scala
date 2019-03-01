package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Each extends Node {
  var block: Block
  var expr: Expression
  var key: java.lang.String
  var `val`: java.lang.String
}

object Each {
  @scala.inline
  def apply(
    block: Block,
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    expr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    key: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_BlockColumn],
    `val`: java.lang.String
  ): Each = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("expr")(expr)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Each]
  }
}

