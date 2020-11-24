package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 触摸事件 */
@js.native
trait Touch[Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] extends CustomEvent[Detail, Mark, CurrentTargetDataset, TargetDataset] {
  
  /** 触摸事件，当前变化的触摸点信息的数组 */
  var changedTouches: js.Array[T] = js.native
  
  /** 触摸事件，当前停留在屏幕中的触摸点信息的数组 */
  var touches: js.Array[T] = js.native
}
object Touch {
  
  @scala.inline
  def apply[Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    changedTouches: js.Array[T],
    currentTarget: Target[CurrentTargetDataset],
    detail: Detail,
    target: Target[TargetDataset],
    timeStamp: Double,
    touches: js.Array[T],
    `type`: String
  ): Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset]]
  }
  
  @scala.inline
  implicit class TouchOps[Self <: Touch[_, _, _, _, _], Detail /* <: IAnyObject */, T /* <: TouchDetail | TouchCanvasDetail */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] (val x: Self with (Touch[Detail, T, Mark, CurrentTargetDataset, TargetDataset])) extends AnyVal {
    
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
    def setChangedTouchesVarargs(value: T*): Self = this.set("changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setChangedTouches(value: js.Array[T]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: T*): Self = this.set("touches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[T]): Self = this.set("touches", value.asInstanceOf[js.Any])
  }
}
