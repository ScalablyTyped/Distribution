package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue 'Checkbox'
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue 'Checkbox'
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否选中状态
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is it selected
    * @defaultValue false
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选中状态图标路径
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Select status icon path
    * @defaultValue null
    */
  var checkedIcon: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 子元素，一般为 Text
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Child element, usually text
    * @defaultValue null
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标的颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The color of the icon
    * @defaultValue null
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用按钮
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Disable button
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未选中时的图标颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon color when not selected
    * @defaultValue null
    */
  var disabledColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否在非选中状态下隐藏图标
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Hide icon when not selected
    * @defaultValue false
    */
  var hideOnUnselect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 变更事件回调
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Callback of change events
    * @defaultValue null
    */
  var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否翻转图标和子元素位置
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Do you want to flip the positions of icons and child elements
    * @defaultValue false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标大小
    * @defaultValue 17
    */
  /**
    * @language en-US
    * @description The size of icon
    * @defaultValue 17
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未选中状态图标路径
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The status icon path is not selected
    * @defaultValue null
    */
  var unCheckedIcon: js.UndefOr[String] = js.undefined
}
object CheckboxProps {
  
  inline def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHideOnUnselect(value: Boolean): Self = StObject.set(x, "hideOnUnselect", value.asInstanceOf[js.Any])
    
    inline def setHideOnUnselectUndefined: Self = StObject.set(x, "hideOnUnselect", js.undefined)
    
    inline def setOnChange(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnCheckedIcon(value: String): Self = StObject.set(x, "unCheckedIcon", value.asInstanceOf[js.Any])
    
    inline def setUnCheckedIconUndefined: Self = StObject.set(x, "unCheckedIcon", js.undefined)
  }
}
