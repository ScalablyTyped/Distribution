package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ident extends Node {
  var isEmpty: scala.Boolean
  var mixin: scala.Boolean
  var name: java.lang.String
  var string: java.lang.String
  var `val`: Node
}

object Ident {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: scala.Double,
    mixin: scala.Boolean,
    name: java.lang.String,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    string: java.lang.String,
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoMixin],
    `val`: Node
  ): Ident = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, isEmpty = isEmpty, lineno = lineno, mixin = mixin, name = name, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, string = string, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Ident]
  }
}

