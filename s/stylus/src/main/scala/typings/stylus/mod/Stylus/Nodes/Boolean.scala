package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends Node {
  var isFalse: scala.Boolean = js.native
  var isTrue: scala.Boolean = js.native
  var `val`: scala.Boolean = js.native
  /**
    * Return 'Boolean'.
    */
  def inspect(): java.lang.String = js.native
  /**
    * Negate the value.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def negate(): Boolean = js.native
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
    toJSON: () => Column,
    `val`: scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), isFalse = isFalse.asInstanceOf[js.Any], isTrue = isTrue.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = js.Any.fromFunction0(negate), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInspect(value: () => java.lang.String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFalse(value: scala.Boolean): Self = this.set("isFalse", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTrue(value: scala.Boolean): Self = this.set("isTrue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: () => Boolean): Self = this.set("negate", js.Any.fromFunction0(value))
    @scala.inline
    def setVal(value: scala.Boolean): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}

