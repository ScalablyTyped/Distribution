package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.ActiveSize
import typings.tuyaPanelKit.anon.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchButtonProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "SwitchButton"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "SwitchButton"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 false 时边框颜色 当 SwitchButton 的 value 为 true 时边框颜色等于 onTintColor
    * @defaultValue "#e5e5e5"
    */
  /**
    * @language en-US
    * @description Set the color of the border when the value of the sliding button is false.
    * @defaultValue "#e5e5e5"
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 默认选中的值
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description The value selected by default
    * @defaultValue true
    */
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to disable the SwitchButton.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 true 时右侧显示的字符，超过 3 个字符则显示显示 2 个字符，其余显示…
    * @defaultValue "OFF"
    */
  /**
    * @language en-US
    * @description When the value of SwitchButton is true, the characters displayed on the right side are displayed. If the value exceeds 3 characters, 2 characters are displayed, and the rest are displayed ...
    * @defaultValue "OFF"
    */
  var offText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 true 时右侧显示的字符样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The character style displayed on the right when the value of SwitchButton is true
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var offTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 false 时左侧显示的字符，超过 3 个字符则显示显示 2 个字符，其余显示…
    * @defaultValue "ON"
    */
  /**
    * @language en-US
    * @description When the value of SwitchButton is false, the characters displayed on the left side are displayed. If the value exceeds 3 characters, 2 characters are displayed, and the rest are displayed ...
    * @defaultValue "ON"
    */
  var onText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 false 时左侧显示的字符样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The character style displayed on the left when the value of SwitchButton is false
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 true 时 thumb 颜色，若没有设置则为 thumbTintColor 的值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the color of the sliding button when the value of the SwitchButton is true. It is the value of thumbTintColor if it is not set.
    * @defaultValue undefined
    */
  var onThumbTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton的 value 为 true 时颜色
    * @defaultValue '#44DB5E'
    */
  /**
    * @language en-US
    * @description Set the color when the value of the SwitchButton is true.
    * @defaultValue '#44DB5E'
    */
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 改变 SwitchButton 值时执行此回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description This callback is executed when the switch combination value is changed.
    * @defaultValue undefined
    */
  def onValueChange(value: Boolean): Unit
  
  /**
    * @language zh-CN
    * @description 设置 SwitchButton 的大小
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the size of the development component
    * @defaultValue undefined
    */
  var size: js.UndefOr[ActiveSize] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Specify the style of the container that wraps the SwitchButton
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue null
    */
  var theme: js.UndefOr[Margin] = js.undefined
  
  /**
    * @language zh-CN
    * @description 指定 thumb 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Specify the style of the icon used for dragging in the switch.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 false 时 thumb 颜色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Set the color of the sliding button when the value of the SwitchButton is false.
    * @defaultValue "#fff"
    */
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton的 value 为 false 时背景颜色
    * @defaultValue '#e5e5e5'
    */
  /**
    * @language en-US
    * @description Set the background color when the value of the SwitchButton is false.
    * @defaultValue '#e5e5e5'
    */
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 Native Driver
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to use Native Driver.
    * @defaultValue true
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前选中的值，设置了该属性即为受控组件
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The currently selected value. After this property is set, it is a controlled component.
    * @defaultValue undefined
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object SwitchButtonProps {
  
  inline def apply(onValueChange: Boolean => Unit): SwitchButtonProps = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    __obj.asInstanceOf[SwitchButtonProps]
  }
  
  extension [Self <: SwitchButtonProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
    
    inline def setOffTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "offTextStyle", value.asInstanceOf[js.Any])
    
    inline def setOffTextStyleNull: Self = StObject.set(x, "offTextStyle", null)
    
    inline def setOffTextStyleUndefined: Self = StObject.set(x, "offTextStyle", js.undefined)
    
    inline def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
    
    inline def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
    
    inline def setOnTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "onTextStyle", value.asInstanceOf[js.Any])
    
    inline def setOnTextStyleNull: Self = StObject.set(x, "onTextStyle", null)
    
    inline def setOnTextStyleUndefined: Self = StObject.set(x, "onTextStyle", js.undefined)
    
    inline def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
    
    inline def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnThumbTintColorUndefined: Self = StObject.set(x, "onThumbTintColor", js.undefined)
    
    inline def setOnTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    inline def setOnValueChange(value: Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setSize(value: ActiveSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: Margin): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    inline def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
