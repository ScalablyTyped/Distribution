package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.wechatMiniprogram.wechatMiniprogramStrings.accumulate
import typings.wechatMiniprogram.wechatMiniprogramStrings.add
import typings.wechatMiniprogram.wechatMiniprogramStrings.auto
import typings.wechatMiniprogram.wechatMiniprogramStrings.replace
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
  implicit class ScrollTimelineKeyframeOps[Self <: ScrollTimelineKeyframe] (val x: Self) extends AnyVal {
    
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
    def setComposite(value: replace | add | accumulate | auto): Self = this.set("composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
  }
}
