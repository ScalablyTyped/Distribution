package typings.tuyaPanelKit.mod

import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.BgBorder
import typings.tuyaPanelKit.themeMod.BackgroundProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.primary
import typings.tuyaPanelKit.tuyaPanelKitStrings.primaryBorder
import typings.tuyaPanelKit.tuyaPanelKitStrings.primaryGradient
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickButtonProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 按钮按下时的按钮透明度
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Button transparency when the button is pressed
    * @defaultValue 1
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变背景
    * @types string | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L6">LinearGradientBackground</a> | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L14">RadialGradientBackground</a>
    * @defaultValue { x1: '0%', y1: '0%', x2: '0%', y2: '100%', stops: { '0%': 'red', '30%': 'blue', '100%': 'yellow' }}
    */
  /**
    * @language en-US
    * @description Gradient background
    * @types string | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L6">LinearGradientBackground</a> | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L14">RadialGradientBackground</a>
    * @defaultValue { x1: '0%', y1: '0%', x2: '0%', y2: '100%', stops: { '0%': 'red', '30%': 'blue', '100%': 'yellow' }}
    */
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮按下时的背景色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The background color when the button is pressed
    * @defaultValue null
    */
  var backgroundColorTouched: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用点击
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Disable click?
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载状态
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Loading status
    * @defaultValue false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载组件的背景主颜色
    * @defaultValue 'rgba(0,0,0,.1)'
    */
  /**
    * @language en-US
    * @description The main background color of the loading component
    * @defaultValue 'rgba(0,0,0,.1)'
    */
  var loadingBackground: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载组件主颜色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description Loading main component colors
    * @defaultValue '#fff'
    */
  var loadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载组件的大小
    * @defaultValue 'small'
    */
  /**
    * @language en-US
    * @description The size of the loading component
    * @defaultValue 'small'
    */
  var loadingSize: js.UndefOr[small | large | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载组件的外边框粗细
    * @defaultValue cx(2)
    */
  /**
    * @language en-US
    * @description The outer border thickness of the loading component
    * @defaultValue cx(2)
    */
  var loadingStrokeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载组件的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the loading component
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 事件监听
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Event listeners
    * @defaultValue () => {}
    */
  var onChange: js.UndefOr[js.Function2[/* eventName */ String, /* args */ Any, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 点击事件
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Click event
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示按钮点击时的颜色
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to display the color button when clicking
    * @defaultValue false
    */
  var showUnderlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮文字
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Button text
    * @defaultValue ''
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮文字样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The text style of the button
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: js.UndefOr[BgBorder] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮类型
    * @defaultValue 'primary'
    */
  /**
    * @language en-US
    * @description Type of button
    * @defaultValue 'primary'
    */
  var `type`: js.UndefOr[primary | primaryGradient | primaryBorder | normal | small] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮按下时的按钮颜色
    * @defaultValue 'transparent'
    */
  /**
    * @language en-US
    * @description The color of the button when it is pressed
    * @defaultValue 'transparent'
    */
  var underlayColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内部包裹内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The content style of the package inside the button
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object BrickButtonProps {
  
  inline def apply(): BrickButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickButtonProps]
  }
  
  extension [Self <: BrickButtonProps](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorTouched(value: String): Self = StObject.set(x, "backgroundColorTouched", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorTouchedUndefined: Self = StObject.set(x, "backgroundColorTouched", js.undefined)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackground(value: String): Self = StObject.set(x, "loadingBackground", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackgroundUndefined: Self = StObject.set(x, "loadingBackground", js.undefined)
    
    inline def setLoadingColor(value: String): Self = StObject.set(x, "loadingColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingColorUndefined: Self = StObject.set(x, "loadingColor", js.undefined)
    
    inline def setLoadingSize(value: small | large | Double): Self = StObject.set(x, "loadingSize", value.asInstanceOf[js.Any])
    
    inline def setLoadingSizeUndefined: Self = StObject.set(x, "loadingSize", js.undefined)
    
    inline def setLoadingStrokeWidth(value: Double): Self = StObject.set(x, "loadingStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setLoadingStrokeWidthUndefined: Self = StObject.set(x, "loadingStrokeWidth", js.undefined)
    
    inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setOnChange(value: (/* eventName */ String, /* args */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setShowUnderlay(value: Boolean): Self = StObject.set(x, "showUnderlay", value.asInstanceOf[js.Any])
    
    inline def setShowUnderlayUndefined: Self = StObject.set(x, "showUnderlay", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: BgBorder): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: primary | primaryGradient | primaryBorder | normal | small): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
