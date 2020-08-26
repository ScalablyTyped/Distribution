package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.native
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号 JS 安全域名一致
    */
  var link: String = js.native
  /**
    * 分享标题
    */
  var title: String = js.native
}

object ShareTimelineConfig {
  @scala.inline
  def apply(link: String, title: String): ShareTimelineConfig = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTimelineConfig]
  }
  @scala.inline
  implicit class ShareTimelineConfigOps[Self <: ShareTimelineConfig] (val x: Self) extends AnyVal {
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgUrl(value: String): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgUrl: Self = this.set("imgUrl", js.undefined)
  }
  
}

