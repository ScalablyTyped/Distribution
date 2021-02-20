package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateMarkerOption extends StObject {
  
  /** 动画结束回调函数 */
  var animationEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  /** 移动过程中是否自动旋转 marker */
  var autoRotate: Boolean = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TranslateMarkerCompleteCallback] = js.native
  
  /** 指定 marker 移动到的目标点 */
  var destination: DestinationOption = js.native
  
  /** 动画持续时长，平移与旋转分别计算 */
  var duration: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TranslateMarkerFailCallback] = js.native
  
  /** 指定 marker */
  var markerId: Double = js.native
  
  /** 平移和旋转同时进行
    *
    * 最低基础库： `2.13.0` */
  var moveWithRotate: js.UndefOr[Boolean] = js.native
  
  /** marker 的旋转角度 */
  var rotate: Double = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TranslateMarkerSuccessCallback] = js.native
}
object TranslateMarkerOption {
  
  @scala.inline
  def apply(autoRotate: Boolean, destination: DestinationOption, markerId: Double, rotate: Double): TranslateMarkerOption = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOption]
  }
  
  @scala.inline
  implicit class TranslateMarkerOptionMutableBuilder[Self <: TranslateMarkerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: /* repeated */ js.Any => _): Self = StObject.set(x, "animationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDestination(value: DestinationOption): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveWithRotate(value: Boolean): Self = StObject.set(x, "moveWithRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveWithRotateUndefined: Self = StObject.set(x, "moveWithRotate", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
