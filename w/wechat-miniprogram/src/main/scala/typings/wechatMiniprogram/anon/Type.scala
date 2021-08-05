package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.drag
import typings.wechatMiniprogram.wechatMiniprogramStrings.end
import typings.wechatMiniprogram.wechatMiniprogramStrings.scale
import typings.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * 导致视野变化的原因
    *
    * - drag: 拖动地图导致
    * - scale: 缩放导致
    * - update: 调用接口导致
    */
  var causedBy: drag | scale | update
  
  /**
    * 视野变化结束时触发
    *
    * 视野变化结束为 `end`
    */
  var `type`: end
}
object Type {
  
  inline def apply(causedBy: drag | scale | update): Type = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setCausedBy(value: drag | scale | update): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
