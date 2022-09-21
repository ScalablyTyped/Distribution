package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.column
import typings.tuyaPanelKit.tuyaPanelKitStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DividerProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 分隔线颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Divider color
    * @defaultValue null
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主轴方向
    * @defaultValue 'row'
    */
  /**
    * @language en-US
    * @description The direction of main axis
    * @defaultValue 'row'
    */
  var flexDirection: js.UndefOr[row | column] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分隔线高
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Divider height
    * @defaultValue null
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分割线样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Split line style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether it is visible or not
    * @defaultValue true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分隔线宽
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Divider width
    * @defaultValue null
    */
  var width: js.UndefOr[Double] = js.undefined
}
object DividerProps {
  
  inline def apply(): DividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerProps]
  }
  
  extension [Self <: DividerProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFlexDirection(value: row | column): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
