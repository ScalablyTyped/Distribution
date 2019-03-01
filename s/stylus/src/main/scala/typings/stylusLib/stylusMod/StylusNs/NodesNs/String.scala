package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends Node {
  var prefixed: scala.Boolean
  var quote: java.lang.String
  var string: java.lang.String
  var `val`: java.lang.String
}

object String {
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
    operate: js.Function2[java.lang.String, Node, Node],
    prefixed: scala.Boolean,
    quote: java.lang.String,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    string: java.lang.String,
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLineno],
    `val`: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("prefixed")(prefixed)
    __obj.updateDynamic("quote")(quote)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[String]
  }
}

