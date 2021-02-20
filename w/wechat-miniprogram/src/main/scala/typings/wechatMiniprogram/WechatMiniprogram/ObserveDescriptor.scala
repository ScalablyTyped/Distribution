package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** media query 描述符 */
@js.native
trait ObserveDescriptor extends StObject {
  
  /** 页面高度（ px 为单位） */
  var height: Double = js.native
  
  /** 页面最大高度（ px 为单位） */
  var maxHeight: Double = js.native
  
  /** 页面最大宽度（ px 为单位） */
  var maxWidth: Double = js.native
  
  /** 页面最小高度（ px 为单位） */
  var minHeight: Double = js.native
  
  /** 页面最小宽度（ px 为单位） */
  var minWidth: Double = js.native
  
  /** 屏幕方向（ `landscape` 或 `portrait` ） */
  var orientation: String = js.native
  
  /** 页面宽度（ px 为单位） */
  var width: Double = js.native
}
object ObserveDescriptor {
  
  @scala.inline
  def apply(
    height: Double,
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    orientation: String,
    width: Double
  ): ObserveDescriptor = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveDescriptor]
  }
  
  @scala.inline
  implicit class ObserveDescriptorMutableBuilder[Self <: ObserveDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
