package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 基础事件参数 */
@js.native
trait BaseEvent[Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] extends js.Object {
  
  /** 事件绑定的当前组件 */
  var currentTarget: Target[CurrentTargetDataset] = js.native
  
  /** 事件冒泡路径上所有由 `mark:` 开头的自定义属性组成的集合 */
  var mark: js.UndefOr[Mark] = js.native
  
  /** 触发事件的源组件 */
  var target: Target[TargetDataset] = js.native
  
  /** 页面打开到触发事件所经过的毫秒数 */
  var timeStamp: Double = js.native
  
  /** 事件类型 */
  var `type`: String = js.native
}
object BaseEvent {
  
  @scala.inline
  def apply[Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    currentTarget: Target[CurrentTargetDataset],
    target: Target[TargetDataset],
    timeStamp: Double,
    `type`: String
  ): BaseEvent[Mark, CurrentTargetDataset, TargetDataset] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[Mark, CurrentTargetDataset, TargetDataset]]
  }
  
  @scala.inline
  implicit class BaseEventOps[Self <: BaseEvent[_, _, _], Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] (val x: Self with (BaseEvent[Mark, CurrentTargetDataset, TargetDataset])) extends AnyVal {
    
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
    def setCurrentTarget(value: Target[CurrentTargetDataset]): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Target[TargetDataset]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark(value: Mark): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
  }
}
