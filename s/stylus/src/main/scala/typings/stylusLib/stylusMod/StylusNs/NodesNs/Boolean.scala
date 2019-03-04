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
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, inspect = inspect, isFalse = isFalse, isTrue = isTrue, lineno = lineno, negate = negate, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Boolean]
  }
}

