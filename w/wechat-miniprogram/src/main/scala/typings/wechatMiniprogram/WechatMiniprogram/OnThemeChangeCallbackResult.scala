package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.dark
import typings.wechatMiniprogram.wechatMiniprogramStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnThemeChangeCallbackResult extends js.Object {
  /** 系统当前的主题，取值为`light`或`dark`
    *
    * 可选值：
    * - 'dark': 深色主题;
    * - 'light': 浅色主题; */
  var theme: dark | light = js.native
}

object OnThemeChangeCallbackResult {
  @scala.inline
  def apply(theme: dark | light): OnThemeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnThemeChangeCallbackResult]
  }
  @scala.inline
  implicit class OnThemeChangeCallbackResultOps[Self <: OnThemeChangeCallbackResult] (val x: Self) extends AnyVal {
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
    def setTheme(value: dark | light): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

