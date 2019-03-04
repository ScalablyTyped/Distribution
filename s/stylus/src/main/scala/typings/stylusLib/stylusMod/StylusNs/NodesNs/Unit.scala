package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends Node {
  var `type`: java.lang.String
  var `val`: scala.Double
}

object Unit {
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
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoTypeVal],
    `type`: java.lang.String,
    `val`: scala.Double
  ): Unit = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Unit]
  }
}

