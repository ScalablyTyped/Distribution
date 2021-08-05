package typings.tuyaPanelKit.mod

import typings.reactNative.anon.Start
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.DataDetectorTypes
import typings.reactNative.mod.DocumentSelectionState
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.KeyboardTypeOptions
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ReturnKeyTypeOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextInputChangeEventData
import typings.reactNative.mod.TextInputContentSizeChangeEventData
import typings.reactNative.mod.TextInputEndEditingEventData
import typings.reactNative.mod.TextInputFocusEventData
import typings.reactNative.mod.TextInputKeyPressEventData
import typings.reactNative.mod.TextInputScrollEventData
import typings.reactNative.mod.TextInputSelectionChangeEventData
import typings.reactNative.mod.TextInputSubmitEditingEventData
import typings.reactNative.mod.TextInputTextInputEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.URL
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`cc-csc`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp-month`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp-year`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`cc-number`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`postal-code`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`street-address`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`unless-editing`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`while-editing`
import typings.tuyaPanelKit.tuyaPanelKitStrings.addressCity
import typings.tuyaPanelKit.tuyaPanelKitStrings.addressCityAndState
import typings.tuyaPanelKit.tuyaPanelKitStrings.addressState
import typings.tuyaPanelKit.tuyaPanelKitStrings.always
import typings.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.balanced
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.button
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.characters
import typings.tuyaPanelKit.tuyaPanelKitStrings.countryName
import typings.tuyaPanelKit.tuyaPanelKitStrings.creditCardNumber
import typings.tuyaPanelKit.tuyaPanelKitStrings.dark
import typings.tuyaPanelKit.tuyaPanelKitStrings.default
import typings.tuyaPanelKit.tuyaPanelKitStrings.email
import typings.tuyaPanelKit.tuyaPanelKitStrings.emailAddress
import typings.tuyaPanelKit.tuyaPanelKitStrings.familyName
import typings.tuyaPanelKit.tuyaPanelKitStrings.fullStreetAddress
import typings.tuyaPanelKit.tuyaPanelKitStrings.givenName
import typings.tuyaPanelKit.tuyaPanelKitStrings.highQuality
import typings.tuyaPanelKit.tuyaPanelKitStrings.jobTitle
import typings.tuyaPanelKit.tuyaPanelKitStrings.light
import typings.tuyaPanelKit.tuyaPanelKitStrings.location
import typings.tuyaPanelKit.tuyaPanelKitStrings.middleName
import typings.tuyaPanelKit.tuyaPanelKitStrings.name
import typings.tuyaPanelKit.tuyaPanelKitStrings.namePrefix
import typings.tuyaPanelKit.tuyaPanelKitStrings.nameSuffix
import typings.tuyaPanelKit.tuyaPanelKitStrings.never
import typings.tuyaPanelKit.tuyaPanelKitStrings.newPassword
import typings.tuyaPanelKit.tuyaPanelKitStrings.nickname
import typings.tuyaPanelKit.tuyaPanelKitStrings.no
import typings.tuyaPanelKit.tuyaPanelKitStrings.noExcludeDescendants
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.off
import typings.tuyaPanelKit.tuyaPanelKitStrings.oneTimeCode
import typings.tuyaPanelKit.tuyaPanelKitStrings.organizationName
import typings.tuyaPanelKit.tuyaPanelKitStrings.password
import typings.tuyaPanelKit.tuyaPanelKitStrings.polite
import typings.tuyaPanelKit.tuyaPanelKitStrings.postalCode
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typings.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typings.tuyaPanelKit.tuyaPanelKitStrings.sentences
import typings.tuyaPanelKit.tuyaPanelKitStrings.simple
import typings.tuyaPanelKit.tuyaPanelKitStrings.streetAddressLine1
import typings.tuyaPanelKit.tuyaPanelKitStrings.streetAddressLine2
import typings.tuyaPanelKit.tuyaPanelKitStrings.sublocality
import typings.tuyaPanelKit.tuyaPanelKitStrings.tel
import typings.tuyaPanelKit.tuyaPanelKitStrings.telephoneNumber
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import typings.tuyaPanelKit.tuyaPanelKitStrings.username
import typings.tuyaPanelKit.tuyaPanelKitStrings.words
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import typings.tuyaPanelKit.tuyaPanelKitStrings.yesExcludeDescendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-native.react-native.TextInputProps, 'style'> */
/* Inlined parent tuya-panel-kit.tuya-panel-kit.DialogProps */
trait DialogPromptProps extends StObject {
  
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
  
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var autoCapitalize: js.UndefOr[none_ | sentences | words | characters] = js.undefined
  
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.undefined
  
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  
  var cancelAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var cancelText: String
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var caretHidden: js.UndefOr[Boolean] = js.undefined
  
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.undefined
  
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var confirmText: String
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contextMenuHidden: js.UndefOr[Boolean] = js.undefined
  
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.undefined
  
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  
  var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var inputWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.undefined
  
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var motionConfig: js.UndefOr[
    MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.undefined
  
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown] = js.undefined
  
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], Unit]] = js.undefined
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.undefined
  
  var onContentSizeChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], Unit]
  ] = js.undefined
  
  var onEndEditing: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
  
  var onHelpPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onKeyPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]] = js.undefined
  
  var onSelectionChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
  ] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onSubmitEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
  ] = js.undefined
  
  var onTextInput: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputTextInputEventData], Unit]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var passwordRules: js.UndefOr[String | Null] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var placeholderTextColor: js.UndefOr[ColorValue] = js.undefined
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.undefined
  
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var secureTextEntry: js.UndefOr[Boolean] = js.undefined
  
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var selection: js.UndefOr[Start] = js.undefined
  
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var showHelp: js.UndefOr[Boolean] = js.undefined
  
  var showSoftInputOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var subTitleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  
  var textContentType: js.UndefOr[
    none_ | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.undefined
  
  var title: String
  
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  var underlineColorAndroid: js.UndefOr[ColorValue] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object DialogPromptProps {
  
  inline def apply(cancelText: String, confirmText: String, title: String): DialogPromptProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogPromptProps]
  }
  
  extension [Self <: DialogPromptProps](x: Self) {
    
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
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAutoCapitalize(value: none_ | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): Self = StObject.set(x, "autoCompleteType", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteTypeUndefined: Self = StObject.set(x, "autoCompleteType", js.undefined)
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBlurOnSubmit(value: Boolean): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
    
    inline def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
    
    inline def setCancelAccessibilityLabel(value: String): Self = StObject.set(x, "cancelAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelAccessibilityLabelUndefined: Self = StObject.set(x, "cancelAccessibilityLabel", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    inline def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    inline def setCaretHidden(value: Boolean): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
    
    inline def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
    
    inline def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
    
    inline def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
    
    inline def setClearTextOnFocus(value: Boolean): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setConfirmAccessibilityLabel(value: String): Self = StObject.set(x, "confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmAccessibilityLabelUndefined: Self = StObject.set(x, "confirmAccessibilityLabel", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    inline def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContextMenuHidden(value: Boolean): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
    
    inline def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
    
    inline def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
    
    inline def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = StObject.set(x, "dataDetectorTypes", js.Array(value :_*))
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableFullscreenUI(value: Boolean): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnablesReturnKeyAutomatically(value: Boolean): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    inline def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    inline def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
    
    inline def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
    
    inline def setInlineImageLeft(value: String): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
    
    inline def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
    
    inline def setInlineImagePadding(value: Double): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
    
    inline def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
    
    inline def setInputAccessoryViewID(value: String): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    inline def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
    
    inline def setInputStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setInputWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setInputWrapperStyleNull: Self = StObject.set(x, "inputWrapperStyle", null)
    
    inline def setInputWrapperStyleUndefined: Self = StObject.set(x, "inputWrapperStyle", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKeyboardAppearance(value: default | light | dark): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
    
    inline def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
    
    inline def setKeyboardType(value: KeyboardTypeOptions): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
    
    inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMotionConfig(
      value: MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeSyntheticEvent[TextInputChangeEventData] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setOnContentSizeChange(value: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnEndEditing(value: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction1(value))
    
    inline def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
    
    inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnHelpPress(value: () => Unit): Self = StObject.set(x, "onHelpPress", js.Any.fromFunction0(value))
    
    inline def setOnHelpPressUndefined: Self = StObject.set(x, "onHelpPress", js.undefined)
    
    inline def setOnKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnSubmitEditing(value: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
    
    inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    inline def setOnTextInput(value: /* e */ NativeSyntheticEvent[TextInputTextInputEventData] => Unit): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
    
    inline def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setPasswordRules(value: String): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
    
    inline def setPasswordRulesNull: Self = StObject.set(x, "passwordRules", null)
    
    inline def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColor(value: ColorValue): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRejectResponderTermination(value: Boolean): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def setRejectResponderTerminationNull: Self = StObject.set(x, "rejectResponderTermination", null)
    
    inline def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setReturnKeyLabel(value: String): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
    
    inline def setReturnKeyType(value: ReturnKeyTypeOptions): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setSecureTextEntry(value: Boolean): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
    
    inline def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
    
    inline def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
    
    inline def setSelection(value: Start): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSelectionState(value: DocumentSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    
    inline def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowHelp(value: Boolean): Self = StObject.set(x, "showHelp", value.asInstanceOf[js.Any])
    
    inline def setShowHelpUndefined: Self = StObject.set(x, "showHelp", js.undefined)
    
    inline def setShowSoftInputOnFocus(value: Boolean): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
    
    inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    inline def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setTextContentType(
      value: none_ | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
    
    inline def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setUnderlineColorAndroid(value: ColorValue): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
