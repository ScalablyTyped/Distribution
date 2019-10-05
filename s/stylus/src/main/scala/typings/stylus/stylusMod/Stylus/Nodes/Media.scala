package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilenameLinenoTypeValNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends Node {
  var `val`: java.lang.String
}

object Media {
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
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilenameLinenoTypeValNumber,
    `val`: java.lang.String
  ): Media = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Media]
  }
}

