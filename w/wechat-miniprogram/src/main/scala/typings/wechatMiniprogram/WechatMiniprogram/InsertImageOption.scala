package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertImageOption extends StObject {
  
  /** 图像无法显示时的替代文本 */
  var alt: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[InsertImageCompleteCallback] = js.undefined
  
  /** data 被序列化为 name=value;name1=value2 的格式挂在属性 data-custom 上 */
  var data: js.UndefOr[IAnyObject] = js.undefined
  
  /** 添加到图片 img 标签上的类名 */
  var extClass: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[InsertImageFailCallback] = js.undefined
  
  /** 图片高度 (pixels/百分比) */
  var height: js.UndefOr[String] = js.undefined
  
  /** 图片地址，仅支持 http(s)、base64、云图片(2.8.0)、临时文件(2.8.3)。 */
  var src: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[InsertImageSuccessCallback] = js.undefined
  
  /** 图片宽度（pixels/百分比) */
  var width: js.UndefOr[String] = js.undefined
}
object InsertImageOption {
  
  @scala.inline
  def apply(src: String): InsertImageOption = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertImageOption]
  }
  
  @scala.inline
  implicit class InsertImageOptionMutableBuilder[Self <: InsertImageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExtClass(value: String): Self = StObject.set(x, "extClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtClassUndefined: Self = StObject.set(x, "extClass", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
