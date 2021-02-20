package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastOptions extends CommonCallbackOptions {
  
  //  提示的延迟时间，默认值1500ms
  var duration: js.UndefOr[Double] = js.native
  
  // 图标，默认值'success'
  var icon: js.UndefOr[typings.weappApi.mod.wx.icon] = js.native
  
  //  自定义图标的本地路径，image 的优先级高于 icon
  var imgage: js.UndefOr[String] = js.native
  
  //  是否显示透明蒙层，防止触摸穿透，默认值false
  var mask: Boolean = js.native
  
  // 提示的内容
  var title: String = js.native
}
object ToastOptions {
  
  @scala.inline
  def apply(mask: Boolean, title: String): ToastOptions = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setIcon(value: icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImgage(value: String): Self = StObject.set(x, "imgage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgageUndefined: Self = StObject.set(x, "imgage", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
