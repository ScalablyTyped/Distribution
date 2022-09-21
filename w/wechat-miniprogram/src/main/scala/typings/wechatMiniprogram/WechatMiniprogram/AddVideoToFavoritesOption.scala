package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddVideoToFavoritesOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddVideoToFavoritesCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddVideoToFavoritesFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddVideoToFavoritesSuccessCallback] = js.undefined
  
  /** 缩略图路径，若留空则使用视频首帧 */
  var thumbPath: js.UndefOr[String] = js.undefined
  
  /** 要收藏的视频地址，必须为本地路径或临时路径 */
  var videoPath: String
}
object AddVideoToFavoritesOption {
  
  inline def apply(videoPath: String): AddVideoToFavoritesOption = {
    val __obj = js.Dynamic.literal(videoPath = videoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddVideoToFavoritesOption]
  }
  
  extension [Self <: AddVideoToFavoritesOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setThumbPath(value: String): Self = StObject.set(x, "thumbPath", value.asInstanceOf[js.Any])
    
    inline def setThumbPathUndefined: Self = StObject.set(x, "thumbPath", js.undefined)
    
    inline def setVideoPath(value: String): Self = StObject.set(x, "videoPath", value.asInstanceOf[js.Any])
  }
}
