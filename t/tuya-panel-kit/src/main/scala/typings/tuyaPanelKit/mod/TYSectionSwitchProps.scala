package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
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
import typings.tuyaPanelKit.anon.Container
import typings.tuyaPanelKit.anon.Margin
import typings.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typings.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typings.tuyaPanelKit.tuyaPanelKitStrings.image
import typings.tuyaPanelKit.tuyaPanelKitStrings.no
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.polite
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.TYListItemProps, 'theme'> */
/* Inlined parent tuya-panel-kit.tuya-panel-kit.SwitchButtonProps */
trait TYSectionSwitchProps extends StObject {
  
  var Action: js.UndefOr[Any] = js.undefined
  
  var Icon: js.UndefOr[Any] = js.undefined
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "SwitchButton"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "SwitchButton"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var actionDisabled: js.UndefOr[Boolean] = js.undefined
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  var arrowColor: js.UndefOr[String] = js.undefined
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 false 时边框颜色 当 SwitchButton 的 value 为 true 时边框颜色等于 onTintColor
    * @defaultValue "#e5e5e5"
    */
  /**
    * @language en-US
    * @description Set the color of the border when the value of the sliding button is false.
    * @defaultValue "#e5e5e5"
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 默认选中的值
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description The value selected by default
    * @defaultValue true
    */
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to disable the SwitchButton.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var needUpdate: js.UndefOr[Boolean] = js.undefined
  
  var nextFocusDown: js.UndefOr[Double] = js.undefined
  
  var nextFocusForward: js.UndefOr[Double] = js.undefined
  
  var nextFocusLeft: js.UndefOr[Double] = js.undefined
  
  var nextFocusRight: js.UndefOr[Double] = js.undefined
  
  var nextFocusUp: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 true 时右侧显示的字符，超过 3 个字符则显示显示 2 个字符，其余显示…
    * @defaultValue "OFF"
    */
  /**
    * @language en-US
    * @description When the value of SwitchButton is true, the characters displayed on the right side are displayed. If the value exceeds 3 characters, 2 characters are displayed, and the rest are displayed ...
    * @defaultValue "OFF"
    */
  var offText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 true 时右侧显示的字符样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The character style displayed on the right when the value of SwitchButton is true
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
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
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 false 时左侧显示的字符，超过 3 个字符则显示显示 2 个字符，其余显示…
    * @defaultValue "ON"
    */
  /**
    * @language en-US
    * @description When the value of SwitchButton is false, the characters displayed on the left side are displayed. If the value exceeds 3 characters, 2 characters are displayed, and the rest are displayed ...
    * @defaultValue "ON"
    */
  var onText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description SwitchButton 的 value 值为 false 时左侧显示的字符样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The character style displayed on the left when the value of SwitchButton is false
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 true 时 thumb 颜色，若没有设置则为 thumbTintColor 的值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the color of the sliding button when the value of the SwitchButton is true. It is the value of thumbTintColor if it is not set.
    * @defaultValue undefined
    */
  var onThumbTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton的 value 为 true 时颜色
    * @defaultValue '#44DB5E'
    */
  /**
    * @language en-US
    * @description Set the color when the value of the SwitchButton is true.
    * @defaultValue '#44DB5E'
    */
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 改变 SwitchButton 值时执行此回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description This callback is executed when the switch combination value is changed.
    * @defaultValue undefined
    */
  def onValueChange(value: Boolean): Unit
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 SwitchButton 的大小
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the size of the development component
    * @defaultValue undefined
    */
  var size: js.UndefOr[ActiveSize] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Specify the style of the container that wraps the SwitchButton
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var styles: js.UndefOr[Container] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue null
    */
  var theme: js.UndefOr[Margin] = js.undefined
  
  /**
    * @language zh-CN
    * @description 指定 thumb 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Specify the style of the icon used for dragging in the switch.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton 的 value 为 false 时 thumb 颜色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Set the color of the sliding button when the value of the SwitchButton is false.
    * @defaultValue "#fff"
    */
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置当 SwitchButton的 value 为 false 时背景颜色
    * @defaultValue '#e5e5e5'
    */
  /**
    * @language en-US
    * @description Set the background color when the value of the SwitchButton is false.
    * @defaultValue '#e5e5e5'
    */
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 Native Driver
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to use Native Driver.
    * @defaultValue true
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前选中的值，设置了该属性即为受控组件
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The currently selected value. After this property is set, it is a controlled component.
    * @defaultValue undefined
    */
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
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAction(value: Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
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
    
    inline def setIcon(value: Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
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
    
    inline def setNextFocusDown(value: Double): Self = StObject.set(x, "nextFocusDown", value.asInstanceOf[js.Any])
    
    inline def setNextFocusDownUndefined: Self = StObject.set(x, "nextFocusDown", js.undefined)
    
    inline def setNextFocusForward(value: Double): Self = StObject.set(x, "nextFocusForward", value.asInstanceOf[js.Any])
    
    inline def setNextFocusForwardUndefined: Self = StObject.set(x, "nextFocusForward", js.undefined)
    
    inline def setNextFocusLeft(value: Double): Self = StObject.set(x, "nextFocusLeft", value.asInstanceOf[js.Any])
    
    inline def setNextFocusLeftUndefined: Self = StObject.set(x, "nextFocusLeft", js.undefined)
    
    inline def setNextFocusRight(value: Double): Self = StObject.set(x, "nextFocusRight", value.asInstanceOf[js.Any])
    
    inline def setNextFocusRightUndefined: Self = StObject.set(x, "nextFocusRight", js.undefined)
    
    inline def setNextFocusUp(value: Double): Self = StObject.set(x, "nextFocusUp", value.asInstanceOf[js.Any])
    
    inline def setNextFocusUpUndefined: Self = StObject.set(x, "nextFocusUp", js.undefined)
    
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
    
    inline def setStyles(value: Container): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
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
