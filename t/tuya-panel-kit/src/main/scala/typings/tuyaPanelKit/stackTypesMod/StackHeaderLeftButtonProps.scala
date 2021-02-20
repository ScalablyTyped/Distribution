package typings.tuyaPanelKit.stackTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.TintColorString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderLeftButtonProps extends StObject {
  
  /**
    * Accessibility label for the button for screen readers.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether label font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Function which returns a React Element to display custom image in header's back button.
    */
  var backImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.native
  
  /**
    * Whether it's possible to navigate back in stack.
    */
  var canGoBack: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the button is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Label text for the button. Usually the title of the previous screen.
    * By default, this is only shown on iOS.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Style object for the label.
    */
  var labelStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  
  /**
    * Whether the label text is visible.
    * Defaults to `true` on iOS and `false` on Android.
    */
  var labelVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback to trigger when the size of the label changes.
    */
  var onLabelLayout: js.UndefOr[js.Function1[/* e */ LayoutChangeEvent, Unit]] = js.native
  
  /**
    * Callback to call when the button is pressed.
    * By default, this triggers `goBack`.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var pressColorAndroid: js.UndefOr[String] = js.native
  
  /**
    * Layout of the screen.
    */
  var screenLayout: js.UndefOr[Layout] = js.native
  
  /**
    * Style object for the button.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.native
  
  /**
    * Layout of the title element in the header.
    */
  var titleLayout: js.UndefOr[Layout] = js.native
  
  /**
    * Label text to show when there isn't enough space for the full label.
    */
  var truncatedLabel: js.UndefOr[String] = js.native
}
object StackHeaderLeftButtonProps {
  
  @scala.inline
  def apply(): StackHeaderLeftButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderLeftButtonProps]
  }
  
  @scala.inline
  implicit class StackHeaderLeftButtonPropsMutableBuilder[Self <: StackHeaderLeftButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackImage(value: /* props */ TintColorString => ReactNode): Self = StObject.set(x, "backImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackImageUndefined: Self = StObject.set(x, "backImage", js.undefined)
    
    @scala.inline
    def setCanGoBack(value: Boolean): Self = StObject.set(x, "canGoBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanGoBackUndefined: Self = StObject.set(x, "canGoBack", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVisible(value: Boolean): Self = StObject.set(x, "labelVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVisibleUndefined: Self = StObject.set(x, "labelVisible", js.undefined)
    
    @scala.inline
    def setOnLabelLayout(value: /* e */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLabelLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLabelLayoutUndefined: Self = StObject.set(x, "onLabelLayout", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPressColorAndroid(value: String): Self = StObject.set(x, "pressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressColorAndroidUndefined: Self = StObject.set(x, "pressColorAndroid", js.undefined)
    
    @scala.inline
    def setScreenLayout(value: Layout): Self = StObject.set(x, "screenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenLayoutUndefined: Self = StObject.set(x, "screenLayout", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTitleLayout(value: Layout): Self = StObject.set(x, "titleLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLayoutUndefined: Self = StObject.set(x, "titleLayout", js.undefined)
    
    @scala.inline
    def setTruncatedLabel(value: String): Self = StObject.set(x, "truncatedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedLabelUndefined: Self = StObject.set(x, "truncatedLabel", js.undefined)
  }
}
