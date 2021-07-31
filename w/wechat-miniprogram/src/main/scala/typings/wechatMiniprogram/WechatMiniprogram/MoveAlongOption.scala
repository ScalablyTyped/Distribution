package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAlongOption extends StObject {
  
  /** 根据路径方向自动改变 marker 的旋转角度 */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[MoveAlongCompleteCallback] = js.undefined
  
  /** 平滑移动的时间 */
  var duration: Double
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[MoveAlongFailCallback] = js.undefined
  
  /** 指定 marker */
  var markerId: Double
  
  /** 移动路径的坐标串，坐标点格式 `{longitude, latitude}` */
  var path: js.Array[js.Any]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[MoveAlongSuccessCallback] = js.undefined
}
object MoveAlongOption {
  
  @scala.inline
  def apply(duration: Double, markerId: Double, path: js.Array[js.Any]): MoveAlongOption = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAlongOption]
  }
  
  @scala.inline
  implicit class MoveAlongOptionMutableBuilder[Self <: MoveAlongOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[js.Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
