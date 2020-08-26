package typings.timezoneSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimeZoneOptions extends js.Object {
  var useUTC: Boolean = js.native
}

object SetTimeZoneOptions {
  @scala.inline
  def apply(useUTC: Boolean): SetTimeZoneOptions = {
    val __obj = js.Dynamic.literal(useUTC = useUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimeZoneOptions]
  }
  @scala.inline
  implicit class SetTimeZoneOptionsOps[Self <: SetTimeZoneOptions] (val x: Self) extends AnyVal {
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
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
  }
  
}

