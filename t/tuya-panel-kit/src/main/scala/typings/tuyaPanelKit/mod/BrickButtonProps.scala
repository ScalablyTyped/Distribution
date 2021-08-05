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
    
    inline def setOnChange(value: (/* eventName */ String, /* args */ js.Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
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
