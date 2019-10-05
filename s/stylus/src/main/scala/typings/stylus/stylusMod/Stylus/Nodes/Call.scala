package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Call extends Node {
  var args: Expression
  var name: java.lang.String
}

object Call {
  @scala.inline
  def apply(
    args: Expression,
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    name: java.lang.String,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_Args
  ): Call = {
    val __obj = js.Dynamic.literal(args = args, clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, name = name, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Call]
  }
}

