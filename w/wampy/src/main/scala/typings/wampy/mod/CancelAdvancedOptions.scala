package typings.wampy.mod

import typings.wampy.wampyStrings.kill
import typings.wampy.wampyStrings.killnowait
import typings.wampy.wampyStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAdvancedOptions extends js.Object {
  var mode: js.UndefOr[skip | kill | killnowait] = js.native
}

object CancelAdvancedOptions {
  @scala.inline
  def apply(): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
  @scala.inline
  implicit class CancelAdvancedOptionsOps[Self <: CancelAdvancedOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: skip | kill | killnowait): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

