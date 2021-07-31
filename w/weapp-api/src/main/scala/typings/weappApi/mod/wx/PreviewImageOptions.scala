package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewImageOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
  var current: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 需要预览的图片链接列表 */
  var urls: js.Array[String]
}
object PreviewImageOptions {
  
  @scala.inline
  def apply(urls: js.Array[String]): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOptions]
  }
  
  @scala.inline
  implicit class PreviewImageOptionsMutableBuilder[Self <: PreviewImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
