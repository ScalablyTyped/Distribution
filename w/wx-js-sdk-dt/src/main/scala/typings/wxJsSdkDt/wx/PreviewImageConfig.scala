package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 显示照片预览用的配置对象
  */
trait PreviewImageConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 当前显示图片的 http 链接
    */
  var current: String
  
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[String]
}
object PreviewImageConfig {
  
  inline def apply(current: String, urls: js.Array[String]): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageConfig]
  }
  
  extension [Self <: PreviewImageConfig](x: Self) {
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
