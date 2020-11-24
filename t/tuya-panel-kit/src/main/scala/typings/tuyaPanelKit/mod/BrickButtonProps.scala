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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrickButtonProps extends js.Object {
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var background: js.UndefOr[BackgroundProps] = js.native
  
  var backgroundColorTouched: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var loadingBackground: js.UndefOr[String] = js.native
  
  var loadingColor: js.UndefOr[String] = js.native
  
  var loadingSize: js.UndefOr[small | large | Double] = js.native
  
  var loadingStrokeWidth: js.UndefOr[Double] = js.native
  
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* eventName */ String, /* args */ js.Any, Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var showUnderlay: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var theme: js.UndefOr[BgBorder] = js.native
  
  var `type`: js.UndefOr[primary | primaryGradient | primaryBorder | normal | small] = js.native
  
  var underlayColor: js.UndefOr[String] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object BrickButtonProps {
  
  @scala.inline
  def apply(): BrickButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickButtonProps]
  }
  
  @scala.inline
  implicit class BrickButtonPropsOps[Self <: BrickButtonProps] (val x: Self) extends AnyVal {
    
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundColorTouched(value: String): Self = this.set("backgroundColorTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorTouched: Self = this.set("backgroundColorTouched", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoadingBackground(value: String): Self = this.set("loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingBackground: Self = this.set("loadingBackground", js.undefined)
    
    @scala.inline
    def setLoadingColor(value: String): Self = this.set("loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingColor: Self = this.set("loadingColor", js.undefined)
    
    @scala.inline
    def setLoadingSize(value: small | large | Double): Self = this.set("loadingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingSize: Self = this.set("loadingSize", js.undefined)
    
    @scala.inline
    def setLoadingStrokeWidth(value: Double): Self = this.set("loadingStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingStrokeWidth: Self = this.set("loadingStrokeWidth", js.undefined)
    
    @scala.inline
    def setLoadingStyle(value: StyleProp[ViewStyle]): Self = this.set("loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingStyle: Self = this.set("loadingStyle", js.undefined)
    
    @scala.inline
    def setLoadingStyleNull: Self = this.set("loadingStyle", null)
    
    @scala.inline
    def setOnChange(value: (/* eventName */ String, /* args */ js.Any) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setShowUnderlay(value: Boolean): Self = this.set("showUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUnderlay: Self = this.set("showUnderlay", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setTheme(value: BgBorder): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: primary | primaryGradient | primaryBorder | normal | small): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
