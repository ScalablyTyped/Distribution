package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.WechatMiniprogram.RegionChange
import typings.wechatMiniprogram.wechatMiniprogramStrings.begin
import typings.wechatMiniprogram.wechatMiniprogramStrings.gesture
import typings.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'begin',   causedBy :'gesture' | 'update'} & wechat-miniprogram.WechatMiniprogram.CustomEvent<{  rotate :number,   skew :number}, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject> */
trait typebegincausedBygestureu
  extends StObject
     with RegionChange {
  
  /**
    * 导致视野变化的原因
    *
    * - gesture: 用户手势
    * - update: 调用接口导致
    */
  var causedBy: gesture | update
  
  /** 事件绑定的当前组件 */
  var currentTarget: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
  
  /** 额外的信息 */
  var detail: Rotate
  
  /** 事件冒泡路径上所有由 `mark:` 开头的自定义属性组成的集合 */
  var mark: js.UndefOr[IAnyObject] = js.undefined
  
  /** 触发事件的源组件 */
  var target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
  
  /** 页面打开到触发事件所经过的毫秒数 */
  var timeStamp: Double
  
  /**
    * 视野变化开始、结束时触发
    *
    * 视野变化开始为 `begin`
    */
  /** 事件类型 */
  var `type`: begin
}
object typebegincausedBygestureu {
  
  inline def apply(
    causedBy: gesture | update,
    currentTarget: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject],
    detail: Rotate,
    target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject],
    timeStamp: Double
  ): typebegincausedBygestureu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("begin")
    __obj.asInstanceOf[typebegincausedBygestureu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typebegincausedBygestureu] (val x: Self) extends AnyVal {
    
    inline def setCausedBy(value: gesture | update): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Rotate): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setMark(value: IAnyObject): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: begin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
