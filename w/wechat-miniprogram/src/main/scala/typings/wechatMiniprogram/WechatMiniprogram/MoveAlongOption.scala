package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveAlongOption extends js.Object {
  
  /** 根据路径方向自动改变 marker 的旋转角度 */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[MoveAlongCompleteCallback] = js.native
  
  /** 平滑移动的时间 */
  var duration: Double = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[MoveAlongFailCallback] = js.native
  
  /** 指定 marker */
  var markerId: Double = js.native
  
  /** 移动路径的坐标串，坐标点格式 `{longitude, latitude}` */
  var path: js.Array[_] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[MoveAlongSuccessCallback] = js.native
}
object MoveAlongOption {
  
  @scala.inline
  def apply(duration: Double, markerId: Double, path: js.Array[_]): MoveAlongOption = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAlongOption]
  }
  
  @scala.inline
  implicit class MoveAlongOptionOps[Self <: MoveAlongOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerId(value: Double): Self = this.set("markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[_]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
