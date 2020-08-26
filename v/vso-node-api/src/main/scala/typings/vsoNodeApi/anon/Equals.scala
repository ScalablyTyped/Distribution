package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Equals extends js.Object {
  @JSName("equals")
  var equals_FEquals: scala.Double = js.native
  var notEquals: scala.Double = js.native
}

object Equals {
  @scala.inline
  def apply(equals: scala.Double, notEquals: scala.Double): Equals = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any], notEquals = notEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equals]
  }
  @scala.inline
  implicit class EqualsOps[Self <: Equals] (val x: Self) extends AnyVal {
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
    def setEquals(value: scala.Double): Self = this.set("equals", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotEquals(value: scala.Double): Self = this.set("notEquals", value.asInstanceOf[js.Any])
  }
  
}

