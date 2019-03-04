package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector extends Node {
  var inherits: scala.Boolean
  var segments: js.Array[Node]
}

object Selector {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inherits: scala.Boolean,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    segments: js.Array[Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameInherits]
  ): Selector = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, inherits = inherits, lineno = lineno, nodeName = nodeName, operate = operate, segments = segments, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[Selector]
  }
}

