package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings._empty
import typings.wechatMiniprogram.wechatMiniprogramStrings.autoplay
import typings.wechatMiniprogram.wechatMiniprogramStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: Double
  
  /** 该 swiper-item 的标识符 */
  var currentItemId: String
  
  /**
    * 表示导致变更的原因
    *
    * - `autoplay` 自动播放导致 swiper 变化；
    * - `touch` 用户划动引起 swiper 变化；
    * - 其它原因将用空字符串表示。
    *
    * 最低基础库: 1.4.0
    */
  var source: _empty | autoplay | touch
}
object Current {
  
  inline def apply(current: Double, currentItemId: String, source: _empty | autoplay | touch): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], currentItemId = currentItemId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentItemId(value: String): Self = StObject.set(x, "currentItemId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: _empty | autoplay | touch): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
