package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atrule extends Node {
  var hasOnlyProperties: scala.Boolean
  var `type`: java.lang.String
}

object Atrule {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hasOnlyProperties: scala.Boolean,
    hash: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_BlockColumnFilenameLinenoSegments],
    `type`: java.lang.String
  ): Atrule = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hasOnlyProperties = hasOnlyProperties, hash = hash, lineno = lineno, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Atrule]
  }
}

