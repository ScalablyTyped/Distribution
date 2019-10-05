package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilenameLinenoPrefixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal extends Node {
  var prefixed: scala.Boolean
  var string: java.lang.String
  var `val`: java.lang.String
}

object Literal {
  @scala.inline
  def apply(
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    prefixed: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilenameLinenoPrefixed,
    `val`: java.lang.String
  ): Literal = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), prefixed = prefixed, shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string, toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Literal]
  }
}

