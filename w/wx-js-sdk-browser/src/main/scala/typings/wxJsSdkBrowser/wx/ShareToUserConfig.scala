package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * “分享给朋友”及“分享到QQ”按钮的分享内容
  */
trait ShareToUserConfig
  extends StObject
     with WxBaseMenuRequestConfig {
  
  /**
    * 分享描述
    */
  var desc: js.UndefOr[String] = js.undefined
  
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.undefined
  
  @JSName("success")
  var success_ShareToUserConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.undefined
}
object ShareToUserConfig {
  
  inline def apply(): ShareToUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareToUserConfig]
  }
  
  extension [Self <: ShareToUserConfig](x: Self) {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    inline def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
