package typings.weixinApp.wx

import typings.weixinApp.anon.AuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenSettingOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.native
}

object OpenSettingOptions {
  @scala.inline
  def apply(): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSettingOptions]
  }
  @scala.inline
  implicit class OpenSettingOptionsOps[Self <: OpenSettingOptions] (val x: Self) extends AnyVal {
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

