package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareTimelineConfig
  extends StObject
     with WxBaseMenuRequestConfig {
  
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号 JS 安全域名一致
    */
  var link: String
  
  /**
    * 分享标题
    */
  var title: String
}
object ShareTimelineConfig {
  
  inline def apply(link: String, title: String): ShareTimelineConfig = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTimelineConfig]
  }
  
  extension [Self <: ShareTimelineConfig](x: Self) {
    
    inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    inline def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
