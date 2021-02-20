package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
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
  implicit class ShareToUserConfigMutableBuilder[Self <: ShareToUserConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
