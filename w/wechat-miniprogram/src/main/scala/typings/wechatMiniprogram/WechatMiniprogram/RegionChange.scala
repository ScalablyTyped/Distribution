package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.anon.Rotate
import typings.wechatMiniprogram.wechatMiniprogramStrings.drag
import typings.wechatMiniprogram.wechatMiniprogramStrings.gesture
import typings.wechatMiniprogram.wechatMiniprogramStrings.scale
import typings.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 在地图渲染更新完成时触发
  *
  * 最低基础库: 1.6.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.anon.typebegincausedBygestureu
  - typings.wechatMiniprogram.anon.typeendcausedBydragscaleu
*/
trait RegionChange extends StObject
object RegionChange {
  
  inline def typebegincausedBygestureu(
    causedBy: gesture | update,
    currentTarget: Target[IAnyObject],
    detail: Rotate,
    target: Target[IAnyObject],
    timeStamp: Double
  ): typings.wechatMiniprogram.anon.typebegincausedBygestureu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("begin")
    __obj.asInstanceOf[typings.wechatMiniprogram.anon.typebegincausedBygestureu]
  }
  
  inline def typeendcausedBydragscaleu(
    causedBy: drag | scale | update,
    currentTarget: Target[IAnyObject],
    detail: Rotate,
    target: Target[IAnyObject],
    timeStamp: Double
  ): typings.wechatMiniprogram.anon.typeendcausedBydragscaleu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[typings.wechatMiniprogram.anon.typeendcausedBydragscaleu]
  }
}
