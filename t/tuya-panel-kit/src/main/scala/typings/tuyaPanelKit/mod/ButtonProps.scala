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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps extends TouchableOpacityProps {
  
  var background: js.UndefOr[BackgroundProps] = js.native
  
  var badgeAccessibilityLabel: js.UndefOr[String] = js.native
  
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var badgeText: js.UndefOr[String] = js.native
  
  var badgeTextAccessibilityLabel: js.UndefOr[String] = js.native
  
  var badgeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var border: js.UndefOr[String | Boolean | Double] = js.native
  
  var disabledOpacity: js.UndefOr[Double] = js.native
  
  @JSName("disabled")
  var disabled_ButtonProps: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconPath: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var imageColor: js.UndefOr[String] = js.native
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var size: js.UndefOr[large | normal | small | noSet | Double] = js.native
  
  var stretch: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textAccessibilityLabel: js.UndefOr[String] = js.native
  
  var textDirection: js.UndefOr[left | top | right | bottom | center] = js.native
  
  var textSingleLine: js.UndefOr[Boolean] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var theme: js.UndefOr[BgColor] = js.native
  
  var `type`: js.UndefOr[primary | normal] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBadgeAccessibilityLabel(value: String): Self = StObject.set(x, "badgeAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeAccessibilityLabelUndefined: Self = StObject.set(x, "badgeAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setBadgeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeStyleNull: Self = StObject.set(x, "badgeStyle", null)
    
    @scala.inline
    def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    @scala.inline
    def setBadgeText(value: String): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeTextAccessibilityLabel(value: String): Self = StObject.set(x, "badgeTextAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeTextAccessibilityLabelUndefined: Self = StObject.set(x, "badgeTextAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setBadgeTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "badgeTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeTextStyleNull: Self = StObject.set(x, "badgeTextStyle", null)
    
    @scala.inline
    def setBadgeTextStyleUndefined: Self = StObject.set(x, "badgeTextStyle", js.undefined)
    
    @scala.inline
    def setBadgeTextUndefined: Self = StObject.set(x, "badgeText", js.undefined)
    
    @scala.inline
    def setBorder(value: String | Boolean | Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageColor(value: String): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageColorUndefined: Self = StObject.set(x, "imageColor", js.undefined)
    
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    @scala.inline
    def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | noSet | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAccessibilityLabel(value: String): Self = StObject.set(x, "textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAccessibilityLabelUndefined: Self = StObject.set(x, "textAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTextDirection(value: left | top | right | bottom | center): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    @scala.inline
    def setTextSingleLine(value: Boolean): Self = StObject.set(x, "textSingleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSingleLineUndefined: Self = StObject.set(x, "textSingleLine", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: BgColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setType(value: primary | normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
