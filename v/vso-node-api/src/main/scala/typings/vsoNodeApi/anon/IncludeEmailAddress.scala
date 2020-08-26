package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeEmailAddress extends js.Object {
  var includeEmailAddress: scala.Double = js.native
  var includeExtensions: scala.Double = js.native
  var none: scala.Double = js.native
}

object IncludeEmailAddress {
  @scala.inline
  def apply(includeEmailAddress: scala.Double, includeExtensions: scala.Double, none: scala.Double): IncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmailAddress]
  }
  @scala.inline
  implicit class IncludeEmailAddressOps[Self <: IncludeEmailAddress] (val x: Self) extends AnyVal {
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
    def setIncludeEmailAddress(value: scala.Double): Self = this.set("includeEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeExtensions(value: scala.Double): Self = this.set("includeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

