package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  var boolean: scala.Double = js.native
  var guid: scala.Double = js.native
  var none: scala.Double = js.native
  var number: scala.Double = js.native
  var string: scala.Double = js.native
  var uri: scala.Double = js.native
}

object Number {
  @scala.inline
  def apply(
    boolean: scala.Double,
    guid: scala.Double,
    none: scala.Double,
    number: scala.Double,
    string: scala.Double,
    uri: scala.Double
  ): Number = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
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
    def setBoolean(value: scala.Double): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuid(value: scala.Double): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: scala.Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: scala.Double): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

