package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorOptions extends CommonCallbackOptions {
  // 窗口的背景色，必须为十六进制颜色值
  var backgroundColor: js.UndefOr[String] = js.native
  //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorBottom: js.UndefOr[String] = js.native
  // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorTop: js.UndefOr[String] = js.native
}

object BackgroundColorOptions {
  @scala.inline
  def apply(): BackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorOptions]
  }
  @scala.inline
  implicit class BackgroundColorOptionsOps[Self <: BackgroundColorOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = this.set("backgroundColorBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorBottom: Self = this.set("backgroundColorBottom", js.undefined)
    @scala.inline
    def setBackgroundColorTop(value: String): Self = this.set("backgroundColorTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorTop: Self = this.set("backgroundColorTop", js.undefined)
  }
  
}

