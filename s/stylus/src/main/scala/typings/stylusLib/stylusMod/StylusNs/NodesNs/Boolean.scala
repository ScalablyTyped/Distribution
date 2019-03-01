package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends Node {
  var isFalse: scala.Boolean
  var isTrue: scala.Boolean
  var `val`: scala.Boolean
  /**
    * Return 'Boolean'.
    */
  def inspect(): java.lang.String
  /**
    * Negate the value.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def negate(): Boolean
}

object Boolean {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inspect: js.Function0[java.lang.String],
    isFalse: scala.Boolean,
    isTrue: scala.Boolean,
    lineno: scala.Double,
    negate: js.Function0[Boolean],
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoType],
    `val`: scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("inspect")(inspect)
    __obj.updateDynamic("isFalse")(isFalse)
    __obj.updateDynamic("isTrue")(isTrue)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("negate")(negate)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Boolean]
  }
}

