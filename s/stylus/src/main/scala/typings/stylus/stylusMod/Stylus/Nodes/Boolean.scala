package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends Node {
  var isFalse: scala.Boolean
  var isTrue: scala.Boolean
  var `val`: scala.Boolean
  /**
    * Return 'Boolean'.
    */
  def inspect(): java.lang.String
  /**
    * Negate the value.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def negate(): Boolean
}

object Boolean {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inspect: () => java.lang.String,
    isFalse: scala.Boolean,
    isTrue: scala.Boolean,
    lineno: Double,
    negate: () => Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_Column,
    `val`: scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), isFalse = isFalse.asInstanceOf[js.Any], isTrue = isTrue.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = js.Any.fromFunction0(negate), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
}

