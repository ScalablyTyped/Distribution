package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * “分享到朋友圈”及“分享到QQ空间”按钮的分享内容
  */
trait ShareToTimelineConfig
  extends StObject
     with WxBaseMenuRequestConfig {
  
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.undefined
  
  @JSName("success")
  var success_ShareToTimelineConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.undefined
}
object ShareToTimelineConfig {
  
  inline def apply(): ShareToTimelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareToTimelineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareToTimelineConfig] (val x: Self) extends AnyVal {
    
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
