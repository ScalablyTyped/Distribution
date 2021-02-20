package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContextStopRecordOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StopRecordCompleteCallback] = js.native
  
  /** 启动视频压缩，压缩效果同`chooseVideo` */
  var compressed: js.UndefOr[Boolean] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StopRecordFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CameraContextStopRecordSuccessCallback] = js.native
}
object CameraContextStopRecordOption {
  
  @scala.inline
  def apply(): CameraContextStopRecordOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStopRecordOption]
  }
  
  @scala.inline
  implicit class CameraContextStopRecordOptionMutableBuilder[Self <: CameraContextStopRecordOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ StopRecordSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
