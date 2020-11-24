package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * “分享给朋友”及“分享到QQ”按钮的分享内容
  */
@js.native
trait ShareToUserConfig extends WxBaseMenuRequestConfig {
  
  /**
    * 分享描述
    */
  var desc: js.UndefOr[String] = js.native
  
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.native
  
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.native
  
  @JSName("success")
  var success_ShareToUserConfig: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.native
}
object ShareToUserConfig {
  
  @scala.inline
  def apply(): ShareToUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareToUserConfig]
  }
  
  @scala.inline
  implicit class ShareToUserConfigOps[Self <: ShareToUserConfig] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
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
