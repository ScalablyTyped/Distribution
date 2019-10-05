package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilenameLineno
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
    quote: java.lang.String,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilenameLineno,
    `val`: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), prefixed = prefixed, quote = quote, shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string, toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[String]
  }
}

