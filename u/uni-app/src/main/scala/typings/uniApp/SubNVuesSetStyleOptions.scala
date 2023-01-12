package typings.uniApp

import typings.uniApp.uniAppStrings.absolute
import typings.uniApp.uniAppStrings.bottom
import typings.uniApp.uniAppStrings.dock
import typings.uniApp.uniAppStrings.left
import typings.uniApp.uniAppStrings.navigationBar
import typings.uniApp.uniAppStrings.popup
import typings.uniApp.uniAppStrings.right
import typings.uniApp.uniAppStrings.static
import typings.uniApp.uniAppStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubNVuesSetStyleOptions extends StObject {
  
  /**
    * 原生子窗体垂直向上的偏移量
    */
  var bottom: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体的停靠方式,仅当原生子窗体 "position" 属性值设置为 "dock" 时才生效
    * - top: 原生子窗体停靠则页面顶部
    * - bottom: 原生子窗体停靠在页面底部
    * - left: 原生子窗体停靠在页面左侧
    * - right: 原生子窗体停靠在页面右侧
    */
  var dock: js.UndefOr[top | bottom | left | right] = js.undefined
  
  /**
    * 原生子窗体的高度
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体水平向左的偏移量
    */
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体的边距
    */
  var margin: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体的遮罩层,仅当原生子窗体 "type" 属性值设置为 "popup" 时才生效
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var mask: js.UndefOr[popup | navigationBar] = js.undefined
  
  /**
    * 原生子窗体的排版位置
    * - static: 原生子窗体在页面中正常定位
    * - absolute: 原生子窗体在页面中绝对定位
    * - dock: 原生子窗体在页面中停靠
    */
  var position: js.UndefOr[static | absolute | dock] = js.undefined
  
  /**
    * 原生子窗体水平向右的偏移量
    */
  var right: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体垂直向下的偏移量
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * 原生子窗体的内置样式
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var `type`: js.UndefOr[popup | navigationBar] = js.undefined
  
  /**
    * 原生子窗体的宽度
    */
  var width: js.UndefOr[String] = js.undefined
}
object SubNVuesSetStyleOptions {
  
  inline def apply(): SubNVuesSetStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubNVuesSetStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubNVuesSetStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDock(value: top | bottom | left | right): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    
    inline def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMask(value: popup | navigationBar): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setPosition(value: static | absolute | dock): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: popup | navigationBar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
