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
  
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  var badgeAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var badgeText: js.UndefOr[String] = js.undefined
  
  var badgeTextAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var badgeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var border: js.UndefOr[String | Boolean | Double] = js.undefined
  
  var disabledOpacity: js.UndefOr[Double] = js.undefined
  
  @JSName("disabled")
  var disabled_ButtonProps: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconPath: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var imageColor: js.UndefOr[String] = js.undefined
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  var size: js.UndefOr[large | normal | small | noSet | Double] = js.undefined
  
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var textDirection: js.UndefOr[left | top | right | bottom | center] = js.undefined
  
  var textSingleLine: js.UndefOr[Boolean] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var theme: js.UndefOr[BgColor] = js.undefined
  
  var `type`: js.UndefOr[primary | normal] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
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
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
    
    inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
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
