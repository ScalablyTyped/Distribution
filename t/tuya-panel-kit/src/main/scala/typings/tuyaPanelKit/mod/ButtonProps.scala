package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.BgColor
import typings.tuyaPanelKit.themeMod.BackgroundProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.noSet
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.primary
import typings.tuyaPanelKit.tuyaPanelKitStrings.right
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps
  extends StObject
     with TouchableOpacityProps {
  
  /**
    * @language zh-CN
    * @description 按钮背景，可为颜色值或渐变值
    * @types string | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L6">LinearGradientBackground</a> | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L14">RadialGradientBackground</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Button background, can be color value or gradient value
    * @types string | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L6">LinearGradientBackground</a> | <a target="_blank" href="https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/theme.d.ts#L14">RadialGradientBackground</a>
    * @defaultValue null
    */
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue 'Button_Badge'
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue 'Button_Badge'
    */
  var badgeAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内徽标容器的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the logo container inside the button
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 徽标字体内容，即按钮右上角徽标
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Logo font content, that is, the logo in the upper right corner of the button
    * @defaultValue ''
    */
  var badgeText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue 'Button_Badge_Text'
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue 'Button_Badge_Text'
    */
  var badgeTextAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内徽标字体的样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the logo font within the button
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  var badgeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮背景的边框值，安卓有瑕疵，暂时不用
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description The border value of the button background is defective on Android. It is not used for the time being
    * @defaultValue true
    */
  var border: js.UndefOr[String | Boolean | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内容的禁用透明度比例
    * @defaultValue 0.2
    */
  /**
    * @language en-US
    * @description Disable transparency scale for button content
    * @defaultValue 0.2
    */
  var disabledOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图标名称
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Icon name inside the button
    * @defaultValue undefined
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图标颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The color of the icon within the button
    * @defaultValue null
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图标路径
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon path within the button
    * @defaultValue null
    */
  var iconPath: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图标尺寸
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon size in button
    * @defaultValue null
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图片资源路径
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The path of image resources in the button
    * @defaultValue null
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图片颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The color of the image inside the button
    * @defaultValue null
    */
  var imageColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的图片样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The image style inside the button
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮背景尺寸，默认为 noSet。large: 48, normal: 40, small: 32。
    * @defaultValue 'noSet'
    */
  /**
    * @language en-US
    * @description Button background size, the default is `noset`. large: 48, normal: 40, small: 32.
    * @defaultValue 'noSet'
    */
  var size: js.UndefOr[large | normal | small | noSet | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮是否跟随父容器拉伸
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Does the button follow the parent container stretch?
    * @defaultValue false
    */
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的文字内容
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Text content in the button
    * @defaultValue ''
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue 'Button_Text'
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue 'Button_Text'
    */
  var textAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的文字排列方向，默认放置文字位于按钮底部
    * @defaultValue 'bottom'
    */
  /**
    * @language en-US
    * @description The text arrangement direction within the button. The default placement text is at the bottom of the button
    * @defaultValue 'bottom'
    */
  var textDirection: js.UndefOr[left | top | right | bottom | center] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内的文字是否只显示一行，即超出显示省略号
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Does the text in the button display only one line, that is, beyond the ellipsis
    * @defaultValue true
    */
  var textSingleLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮内字体样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Font style in button
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
  var theme: js.UndefOr[BgColor] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮背景类型。normal：背景色为transparent；若为primary：则跟随主色
    * @defaultValue 'normal'
    */
  /**
    * @language en-US
    * @description Button background type. normal: the background color is transparent; primary: it follows the main color
    * @defaultValue 'normal'
    */
  var `type`: js.UndefOr[primary | normal] = js.undefined
  
  /**
    * @language zh-CN
    * @description
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最外层容器的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the outermost container
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBadgeAccessibilityLabel(value: String): Self = StObject.set(x, "badgeAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setBadgeAccessibilityLabelUndefined: Self = StObject.set(x, "badgeAccessibilityLabel", js.undefined)
    
    inline def setBadgeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    inline def setBadgeStyleNull: Self = StObject.set(x, "badgeStyle", null)
    
    inline def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    inline def setBadgeText(value: String): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
    
    inline def setBadgeTextAccessibilityLabel(value: String): Self = StObject.set(x, "badgeTextAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setBadgeTextAccessibilityLabelUndefined: Self = StObject.set(x, "badgeTextAccessibilityLabel", js.undefined)
    
    inline def setBadgeTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "badgeTextStyle", value.asInstanceOf[js.Any])
    
    inline def setBadgeTextStyleNull: Self = StObject.set(x, "badgeTextStyle", null)
    
    inline def setBadgeTextStyleUndefined: Self = StObject.set(x, "badgeTextStyle", js.undefined)
    
    inline def setBadgeTextUndefined: Self = StObject.set(x, "badgeText", js.undefined)
    
    inline def setBorder(value: String | Boolean | Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
    
    inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageColor(value: String): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
    
    inline def setImageColorUndefined: Self = StObject.set(x, "imageColor", js.undefined)
    
    inline def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSize(value: large | normal | small | noSet | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAccessibilityLabel(value: String): Self = StObject.set(x, "textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setTextAccessibilityLabelUndefined: Self = StObject.set(x, "textAccessibilityLabel", js.undefined)
    
    inline def setTextDirection(value: left | top | right | bottom | center): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setTextSingleLine(value: Boolean): Self = StObject.set(x, "textSingleLine", value.asInstanceOf[js.Any])
    
    inline def setTextSingleLineUndefined: Self = StObject.set(x, "textSingleLine", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: BgColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: primary | normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
