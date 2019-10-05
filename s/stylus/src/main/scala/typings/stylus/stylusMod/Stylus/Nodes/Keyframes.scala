package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_BlockColumnFilename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes extends Node {
  var prefix: java.lang.String
  var segments: js.Array[Node]
}

object Keyframes {
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
    prefix: java.lang.String,
    segments: js.Array[Node],
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_BlockColumnFilename
  ): Keyframes = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), prefix = prefix, segments = segments, shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Keyframes]
  }
}

