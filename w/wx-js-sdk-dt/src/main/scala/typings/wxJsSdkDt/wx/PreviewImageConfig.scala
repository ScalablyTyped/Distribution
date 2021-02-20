package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 显示照片预览用的配置对象
  */
@js.native
trait PreviewImageConfig extends WxBaseRequestConfig {
  
  /**
    * 当前显示图片的 http 链接
    */
  var current: String = js.native
  
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[String] = js.native
}
object PreviewImageConfig {
  
  @scala.inline
  def apply(current: String, urls: js.Array[String]): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageConfig]
  }
  
  @scala.inline
  implicit class PreviewImageConfigMutableBuilder[Self <: PreviewImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
