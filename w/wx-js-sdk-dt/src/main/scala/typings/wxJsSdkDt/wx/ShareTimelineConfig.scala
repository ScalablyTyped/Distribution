package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ShareTimelineConfigMutableBuilder[Self <: ShareTimelineConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
