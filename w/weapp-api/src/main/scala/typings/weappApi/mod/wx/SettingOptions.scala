package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设置
@js.native
trait SettingOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.native
}

object SettingOptions {
  @scala.inline
  def apply(): SettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingOptions]
  }
  @scala.inline
  implicit class SettingOptionsOps[Self <: SettingOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ AuthSetting => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

