package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.wechatMiniprogram.wechatMiniprogramStrings.accumulate
import typings.wechatMiniprogram.wechatMiniprogramStrings.add
import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTimelineKeyframe
  extends StObject
     with /* property */ StringDictionary[js.UndefOr[String | Double | Null]] {
  
  var composite: js.UndefOr[replace | add | accumulate | auto] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double | Null] = js.undefined
}
object ScrollTimelineKeyframe {
  
  inline def apply(): ScrollTimelineKeyframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollTimelineKeyframe]
  }
  
  extension [Self <: ScrollTimelineKeyframe](x: Self) {
    
    inline def setComposite(value: replace | add | accumulate | auto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
