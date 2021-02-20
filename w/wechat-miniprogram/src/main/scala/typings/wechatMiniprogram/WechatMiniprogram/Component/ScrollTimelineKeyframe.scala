package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.wechatMiniprogram.wechatMiniprogramStrings.accumulate
import typings.wechatMiniprogram.wechatMiniprogramStrings.add
import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTimelineKeyframe
  extends /* property */ StringDictionary[js.UndefOr[String | Double | Null]] {
  
  var composite: js.UndefOr[replace | add | accumulate | auto] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double | Null] = js.native
}
object ScrollTimelineKeyframe {
  
  @scala.inline
  def apply(): ScrollTimelineKeyframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollTimelineKeyframe]
  }
  
  @scala.inline
  implicit class ScrollTimelineKeyframeMutableBuilder[Self <: ScrollTimelineKeyframe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: replace | add | accumulate | auto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
