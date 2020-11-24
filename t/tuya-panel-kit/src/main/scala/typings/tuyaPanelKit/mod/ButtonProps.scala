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
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBadgeAccessibilityLabel(value: String): Self = this.set("badgeAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeAccessibilityLabel: Self = this.set("badgeAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setBadgeStyle(value: StyleProp[ViewStyle]): Self = this.set("badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeStyle: Self = this.set("badgeStyle", js.undefined)
    
    @scala.inline
    def setBadgeStyleNull: Self = this.set("badgeStyle", null)
    
    @scala.inline
    def setBadgeText(value: String): Self = this.set("badgeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeText: Self = this.set("badgeText", js.undefined)
    
    @scala.inline
    def setBadgeTextAccessibilityLabel(value: String): Self = this.set("badgeTextAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeTextAccessibilityLabel: Self = this.set("badgeTextAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setBadgeTextStyle(value: StyleProp[TextStyle]): Self = this.set("badgeTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeTextStyle: Self = this.set("badgeTextStyle", js.undefined)
    
    @scala.inline
    def setBadgeTextStyleNull: Self = this.set("badgeTextStyle", null)
    
    @scala.inline
    def setBorder(value: String | Boolean | Double): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledOpacity(value: Double): Self = this.set("disabledOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledOpacity: Self = this.set("disabledOpacity", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageColor(value: String): Self = this.set("imageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageColor: Self = this.set("imageColor", js.undefined)
    
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    
    @scala.inline
    def setImageStyleNull: Self = this.set("imageStyle", null)
    
    @scala.inline
    def setSize(value: large | normal | small | noSet | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAccessibilityLabel(value: String): Self = this.set("textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAccessibilityLabel: Self = this.set("textAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTextDirection(value: left | top | right | bottom | center): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
    
    @scala.inline
    def setTextSingleLine(value: Boolean): Self = this.set("textSingleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSingleLine: Self = this.set("textSingleLine", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setTheme(value: BgColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: primary | normal): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
