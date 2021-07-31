package typings.tuyaPanelKit

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typings.tuyaPanelKit.tuyaPanelKitStrings.all
import typings.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.balanced
import typings.tuyaPanelKit.tuyaPanelKitStrings.button
import typings.tuyaPanelKit.tuyaPanelKitStrings.clip
import typings.tuyaPanelKit.tuyaPanelKitStrings.email
import typings.tuyaPanelKit.tuyaPanelKitStrings.head
import typings.tuyaPanelKit.tuyaPanelKitStrings.highQuality
import typings.tuyaPanelKit.tuyaPanelKitStrings.link
import typings.tuyaPanelKit.tuyaPanelKitStrings.middle
import typings.tuyaPanelKit.tuyaPanelKitStrings.no
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.phoneNumber
import typings.tuyaPanelKit.tuyaPanelKitStrings.polite
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typings.tuyaPanelKit.tuyaPanelKitStrings.simple
import typings.tuyaPanelKit.tuyaPanelKitStrings.tail
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerTitleMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/views/Header/HeaderTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasTintColorStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTintColorStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Inlined std.Omit<react-native.react-native.TextProps, 'style'> & {  tintColor :string | undefined,   children :string | undefined,   style :react-native.react-native.Animated.WithAnimatedValue<react-native.react-native.StyleProp<react-native.react-native.TextStyle>> | undefined} */
  trait Props extends StObject {
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityComponentType: js.UndefOr[none_ | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
    
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none_ | all] = js.undefined
    
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var minimumFontScale: js.UndefOr[Double] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var numberOfLines: js.UndefOr[Double] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTextLayout: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selectionColor: js.UndefOr[ColorValue] = js.undefined
    
    var style: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.undefined
    
    var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
      
      @scala.inline
      def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDataDetectorType(value: phoneNumber | link | email | none_ | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
      
      @scala.inline
      def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
      
      @scala.inline
      def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
      
      @scala.inline
      def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      @scala.inline
      def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      @scala.inline
      def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
}
