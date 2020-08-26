package typings.wechatMiniprogram.WechatMiniprogram.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddToFavoritesOption extends js.Object {
  /** 页面中包含web-view组件时，返回当前web-view的url */
  var webviewUrl: js.UndefOr[String] = js.native
}

object IAddToFavoritesOption {
  @scala.inline
  def apply(): IAddToFavoritesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddToFavoritesOption]
  }
  @scala.inline
  implicit class IAddToFavoritesOptionOps[Self <: IAddToFavoritesOption] (val x: Self) extends AnyVal {
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
    def setWebviewUrl(value: String): Self = this.set("webviewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebviewUrl: Self = this.set("webviewUrl", js.undefined)
  }
  
}

