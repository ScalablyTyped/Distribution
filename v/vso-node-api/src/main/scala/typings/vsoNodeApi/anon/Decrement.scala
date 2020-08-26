package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decrement extends js.Object {
  var decrement: scala.Double = js.native
  var delete: scala.Double = js.native
  var increment: scala.Double = js.native
  var none: scala.Double = js.native
  var set: scala.Double = js.native
}

object Decrement {
  @scala.inline
  def apply(
    decrement: scala.Double,
    delete: scala.Double,
    increment: scala.Double,
    none: scala.Double,
    set: scala.Double
  ): Decrement = {
    val __obj = js.Dynamic.literal(decrement = decrement.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decrement]
  }
  @scala.inline
  implicit class DecrementOps[Self <: Decrement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecrement(value: scala.Double): Self = this.set("decrement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: scala.Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncrement(value: scala.Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: scala.Double): Self = this.set("set", value.asInstanceOf[js.Any])
  }
  
}

