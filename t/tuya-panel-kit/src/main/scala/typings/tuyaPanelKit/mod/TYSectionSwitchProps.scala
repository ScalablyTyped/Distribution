package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.ActiveSize
import typings.tuyaPanelKit.anon.Content
import typings.tuyaPanelKit.anon.Margin
import typings.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typings.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.button
import typings.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typings.tuyaPanelKit.tuyaPanelKitStrings.image
import typings.tuyaPanelKit.tuyaPanelKitStrings.no
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.polite
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.TYListItemProps, 'theme'> */
/* Inlined parent tuya-panel-kit.tuya-panel-kit.SwitchButtonProps */
trait TYSectionSwitchProps extends StObject {
  
  var Action: js.UndefOr[js.Any] = js.undefined
  
  var Icon: js.UndefOr[js.Any] = js.undefined
  
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
  
  var actionDisabled: js.UndefOr[Boolean] = js.undefined
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  var arrowColor: js.UndefOr[String] = js.undefined
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var needUpdate: js.UndefOr[Boolean] = js.undefined
  
  var offText: js.UndefOr[String] = js.undefined
  
  var offTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onText: js.UndefOr[String] = js.undefined
  
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onThumbTintColor: js.UndefOr[String] = js.undefined
  
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  def onValueChange(value: Boolean): Unit
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  
  var size: js.UndefOr[ActiveSize] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var styles: js.UndefOr[Content] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Margin] = js.undefined
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Boolean] = js.undefined
}
object TYSectionSwitchProps {
  
  inline def apply(onValueChange: Boolean => Unit): TYSectionSwitchProps = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    __obj.asInstanceOf[TYSectionSwitchProps]
  }
  
  extension [Self <: TYSectionSwitchProps](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    inline def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    inline def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionDisabled(value: Boolean): Self = StObject.set(x, "actionDisabled", value.asInstanceOf[js.Any])
    
    inline def setActionDisabledUndefined: Self = StObject.set(x, "actionDisabled", js.undefined)
    
    inline def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
    
    inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setArrowUseIcon(value: Boolean): Self = StObject.set(x, "arrowUseIcon", value.asInstanceOf[js.Any])
    
    inline def setArrowUseIconUndefined: Self = StObject.set(x, "arrowUseIcon", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setIcon(value: js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconType(value: auto | image | iconfont | text): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImageFollowIconColor(value: Boolean): Self = StObject.set(x, "imageFollowIconColor", value.asInstanceOf[js.Any])
    
    inline def setImageFollowIconColorUndefined: Self = StObject.set(x, "imageFollowIconColor", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    inline def setNeedUpdateUndefined: Self = StObject.set(x, "needUpdate", js.undefined)
    
    inline def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
    
    inline def setOffTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "offTextStyle", value.asInstanceOf[js.Any])
    
    inline def setOffTextStyleNull: Self = StObject.set(x, "offTextStyle", null)
    
    inline def setOffTextStyleUndefined: Self = StObject.set(x, "offTextStyle", js.undefined)
    
    inline def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    inline def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
    
    inline def setOnTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "onTextStyle", value.asInstanceOf[js.Any])
    
    inline def setOnTextStyleNull: Self = StObject.set(x, "onTextStyle", null)
    
    inline def setOnTextStyleUndefined: Self = StObject.set(x, "onTextStyle", js.undefined)
    
    inline def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
    
    inline def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnThumbTintColorUndefined: Self = StObject.set(x, "onThumbTintColor", js.undefined)
    
    inline def setOnTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    inline def setOnValueChange(value: Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    inline def setSize(value: ActiveSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: Margin): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    inline def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
