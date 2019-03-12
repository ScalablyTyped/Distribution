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
    clone: () => Node,
    coerce: Node => Node,
    column: scala.Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: scala.Double,
    mixin: scala.Boolean,
    name: java.lang.String,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => stylusLib.Anon_ColumnFilenameLinenoMixin,
    `val`: Node
  ): Ident = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, isEmpty = isEmpty, lineno = lineno, mixin = mixin, name = name, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string, toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Ident]
  }
}

