package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  Tab Bar
trait TabBarItemOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效，不支持网络图片
  var iconPath: js.UndefOr[String] = js.undefined
  
  //  tabBar 的哪一项，从左边算起
  var index: Double
  
  //  选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效
  var selectedIconPath: js.UndefOr[String] = js.undefined
  
  //  tab 上的按钮文字
  var text: js.UndefOr[String] = js.undefined
}
object TabBarItemOptions {
  
  inline def apply(index: Double): TabBarItemOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemOptions]
  }
  
  extension [Self <: TabBarItemOptions](x: Self) {
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconPath(value: String): Self = StObject.set(x, "selectedIconPath", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconPathUndefined: Self = StObject.set(x, "selectedIconPath", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
