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
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  var backgroundColorTouched: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var loadingBackground: js.UndefOr[String] = js.undefined
  
  var loadingColor: js.UndefOr[String] = js.undefined
  
  var loadingSize: js.UndefOr[small | large | Double] = js.undefined
  
  var loadingStrokeWidth: js.UndefOr[Double] = js.undefined
  
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onChange: js.UndefOr[js.Function2[/* eventName */ String, /* args */ js.Any, Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var showUnderlay: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var theme: js.UndefOr[BgBorder] = js.undefined
  
  var `type`: js.UndefOr[primary | primaryGradient | primaryBorder | normal | small] = js.undefined
  
  var underlayColor: js.UndefOr[String] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object BrickButtonProps {
  
  @scala.inline
  def apply(): BrickButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickButtonProps]
  }
  
  @scala.inline
  implicit class BrickButtonPropsMutableBuilder[Self <: BrickButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTouched(value: String): Self = StObject.set(x, "backgroundColorTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTouchedUndefined: Self = StObject.set(x, "backgroundColorTouched", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackground(value: String): Self = StObject.set(x, "loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackgroundUndefined: Self = StObject.set(x, "loadingBackground", js.undefined)
    
    @scala.inline
    def setLoadingColor(value: String): Self = StObject.set(x, "loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingColorUndefined: Self = StObject.set(x, "loadingColor", js.undefined)
    
    @scala.inline
    def setLoadingSize(value: small | large | Double): Self = StObject.set(x, "loadingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingSizeUndefined: Self = StObject.set(x, "loadingSize", js.undefined)
    
    @scala.inline
    def setLoadingStrokeWidth(value: Double): Self = StObject.set(x, "loadingStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStrokeWidthUndefined: Self = StObject.set(x, "loadingStrokeWidth", js.undefined)
    
    @scala.inline
    def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    @scala.inline
    def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* eventName */ String, /* args */ js.Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setShowUnderlay(value: Boolean): Self = StObject.set(x, "showUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnderlayUndefined: Self = StObject.set(x, "showUnderlay", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: BgBorder): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setType(value: primary | primaryGradient | primaryBorder | normal | small): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
