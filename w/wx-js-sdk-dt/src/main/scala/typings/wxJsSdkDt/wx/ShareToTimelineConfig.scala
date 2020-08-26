package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * “分享到朋友圈”及“分享到QQ空间”按钮的分享内容
  */
@js.native
trait ShareToTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.native
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.native
  @JSName("success")
  var success_ShareToTimelineConfig: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.native
}

object ShareToTimelineConfig {
  @scala.inline
  def apply(): ShareToTimelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareToTimelineConfig]
  }
  @scala.inline
  implicit class ShareToTimelineConfigOps[Self <: ShareToTimelineConfig] (val x: Self) extends AnyVal {
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
    def setImgUrl(value: String): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgUrl: Self = this.set("imgUrl", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

