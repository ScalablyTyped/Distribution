package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 自定义事件 */
trait CustomEvent[Detail /* <: IAnyObject */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */]
  extends StObject
     with BaseEvent[Mark, CurrentTargetDataset, TargetDataset] {
  
  /** 额外的信息 */
  var detail: Detail
}
object CustomEvent {
  
  @scala.inline
  def apply[Detail /* <: IAnyObject */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    currentTarget: Target[CurrentTargetDataset],
    detail: Detail,
    target: Target[TargetDataset],
    timeStamp: Double,
    `type`: String
  ): CustomEvent[Detail, Mark, CurrentTargetDataset, TargetDataset] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEvent[Detail, Mark, CurrentTargetDataset, TargetDataset]]
  }
  
  @scala.inline
  implicit class CustomEventMutableBuilder[Self <: CustomEvent[?, ?, ?, ?], Detail /* <: IAnyObject */, Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] (val x: Self & (CustomEvent[Detail, Mark, CurrentTargetDataset, TargetDataset])) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Detail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
  }
}
