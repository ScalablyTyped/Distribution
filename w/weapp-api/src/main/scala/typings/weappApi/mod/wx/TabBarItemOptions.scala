package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  Tab Bar
@js.native
trait TabBarItemOptions extends CommonCallbackOptions {
  
  //  图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效，不支持网络图片
  var iconPath: js.UndefOr[String] = js.native
  
  //  tabBar 的哪一项，从左边算起
  var index: Double = js.native
  
  //  选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效
  var selectedIconPath: js.UndefOr[String] = js.native
  
  //  tab 上的按钮文字
  var text: js.UndefOr[String] = js.native
}
object TabBarItemOptions {
  
  @scala.inline
  def apply(index: Double): TabBarItemOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemOptions]
  }
  
  @scala.inline
  implicit class TabBarItemOptionsMutableBuilder[Self <: TabBarItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPath(value: String): Self = StObject.set(x, "selectedIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPathUndefined: Self = StObject.set(x, "selectedIconPath", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
