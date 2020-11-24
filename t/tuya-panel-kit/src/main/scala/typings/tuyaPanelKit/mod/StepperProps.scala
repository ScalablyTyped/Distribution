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
import typings.reactNative.mod.ViewStyle
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
import typings.tuyaPanelKit.tuyaPanelKitStrings.ellipse
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
import typings.tuyaPanelKit.tuyaPanelKitStrings.triangle
import typings.tuyaPanelKit.tuyaPanelKitStrings.username
import typings.tuyaPanelKit.tuyaPanelKitStrings.words
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import typings.tuyaPanelKit.tuyaPanelKitStrings.yesExcludeDescendants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-native.react-native.TextInputProps, 'value'> */
@js.native
trait StepperProps extends js.Object {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none_ | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  var autoCapitalize: js.UndefOr[none_ | sentences | words | characters] = js.native
  
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.native
  
  var autoCorrect: js.UndefOr[Boolean] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var blurOnSubmit: js.UndefOr[Boolean] = js.native
  
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var buttonType: js.UndefOr[ellipse | triangle] = js.native
  
  var caretHidden: js.UndefOr[Boolean] = js.native
  
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
  
  var collapsable: js.UndefOr[Boolean] = js.native
  
  var contextMenuHidden: js.UndefOr[Boolean] = js.native
  
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var disableFullscreenUI: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var ellipseIconColor: js.UndefOr[String] = js.native
  
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var getTextInputRef: js.UndefOr[js.Function1[/* TextInputRef */ js.Object, Unit]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var iconMinusPath: js.UndefOr[String] = js.native
  
  var iconPlusPath: js.UndefOr[String] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.native
  
  var inlineImageLeft: js.UndefOr[String] = js.native
  
  var inlineImagePadding: js.UndefOr[Double] = js.native
  
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.native
  
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  var nativeID: js.UndefOr[String] = js.native
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  
  var numberOfLines: js.UndefOr[Double] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], Unit]] = js.native
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  
  var onContentSizeChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], Unit]
  ] = js.native
  
  var onEndEditing: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
  
  var onKeyPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  
  var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]] = js.native
  
  var onSelectionChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
  ] = js.native
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  
  var onSubmitEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
  ] = js.native
  
  var onTextInput: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputTextInputEventData], Unit]] = js.native
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var passwordRules: js.UndefOr[String | Null] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var placeholderTextColor: js.UndefOr[ColorValue] = js.native
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.native
  
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  
  var returnKeyLabel: js.UndefOr[String] = js.native
  
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  
  var selection: js.UndefOr[Start] = js.native
  
  var selectionColor: js.UndefOr[String] = js.native
  
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  
  var showSoftInputOnFocus: js.UndefOr[Boolean] = js.native
  
  var spellCheck: js.UndefOr[Boolean] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  
  var textContentType: js.UndefOr[
    none_ | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.native
  
  var triangleIconColor: js.UndefOr[String] = js.native
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  
  var underlineColorAndroid: js.UndefOr[ColorValue] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object StepperProps {
  
  @scala.inline
  def apply(): StepperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperProps]
  }
  
  @scala.inline
  implicit class StepperPropsOps[Self <: StepperProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: none_ | sentences | words | characters): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): Self = this.set("autoCompleteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCompleteType: Self = this.set("autoCompleteType", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBlurOnSubmit(value: Boolean): Self = this.set("blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnSubmit: Self = this.set("blurOnSubmit", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    
    @scala.inline
    def setButtonType(value: ellipse | triangle): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    
    @scala.inline
    def setCaretHidden(value: Boolean): Self = this.set("caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretHidden: Self = this.set("caretHidden", js.undefined)
    
    @scala.inline
    def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = this.set("clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonMode: Self = this.set("clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: Boolean): Self = this.set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTextOnFocus: Self = this.set("clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setContextMenuHidden(value: Boolean): Self = this.set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuHidden: Self = this.set("contextMenuHidden", js.undefined)
    
    @scala.inline
    def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = this.set("dataDetectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = this.set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDetectorTypes: Self = this.set("dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisableFullscreenUI(value: Boolean): Self = this.set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFullscreenUI: Self = this.set("disableFullscreenUI", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEllipseIconColor(value: String): Self = this.set("ellipseIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipseIconColor: Self = this.set("ellipseIconColor", js.undefined)
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: Boolean): Self = this.set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablesReturnKeyAutomatically: Self = this.set("enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setGetTextInputRef(value: /* TextInputRef */ js.Object => Unit): Self = this.set("getTextInputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTextInputRef: Self = this.set("getTextInputRef", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setIconMinusPath(value: String): Self = this.set("iconMinusPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconMinusPath: Self = this.set("iconMinusPath", js.undefined)
    
    @scala.inline
    def setIconPlusPath(value: String): Self = this.set("iconPlusPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPlusPath: Self = this.set("iconPlusPath", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = this.set("importantForAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAutofill: Self = this.set("importantForAutofill", js.undefined)
    
    @scala.inline
    def setInlineImageLeft(value: String): Self = this.set("inlineImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImageLeft: Self = this.set("inlineImageLeft", js.undefined)
    
    @scala.inline
    def setInlineImagePadding(value: Double): Self = this.set("inlineImagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImagePadding: Self = this.set("inlineImagePadding", js.undefined)
    
    @scala.inline
    def setInputAccessoryViewID(value: String): Self = this.set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAccessoryViewID: Self = this.set("inputAccessoryViewID", js.undefined)
    
    @scala.inline
    def setInputStyle(value: StyleProp[ViewStyle]): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setInputStyleNull: Self = this.set("inputStyle", null)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: default | light | dark): Self = this.set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardAppearance: Self = this.set("keyboardAppearance", js.undefined)
    
    @scala.inline
    def setKeyboardType(value: KeyboardTypeOptions): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = this.set("maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ NativeSyntheticEvent[TextInputChangeEventData] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = this.set("onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndEditing(value: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Unit): Self = this.set("onEndEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndEditing: Self = this.set("onEndEditing", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    
    @scala.inline
    def setOnTextInput(value: /* e */ NativeSyntheticEvent[TextInputTextInputEventData] => Unit): Self = this.set("onTextInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTextInput: Self = this.set("onTextInput", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: String): Self = this.set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRules: Self = this.set("passwordRules", js.undefined)
    
    @scala.inline
    def setPasswordRulesNull: Self = this.set("passwordRules", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderTextColor(value: ColorValue): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setRejectResponderTermination(value: Boolean): Self = this.set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectResponderTermination: Self = this.set("rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setRejectResponderTerminationNull: Self = this.set("rejectResponderTermination", null)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setReturnKeyLabel(value: String): Self = this.set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyLabel: Self = this.set("returnKeyLabel", js.undefined)
    
    @scala.inline
    def setReturnKeyType(value: ReturnKeyTypeOptions): Self = this.set("returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyType: Self = this.set("returnKeyType", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setSecureTextEntry(value: Boolean): Self = this.set("secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureTextEntry: Self = this.set("secureTextEntry", js.undefined)
    
    @scala.inline
    def setSelectTextOnFocus(value: Boolean): Self = this.set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectTextOnFocus: Self = this.set("selectTextOnFocus", js.undefined)
    
    @scala.inline
    def setSelection(value: Start): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionState(value: DocumentSelectionState): Self = this.set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionState: Self = this.set("selectionState", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowSoftInputOnFocus(value: Boolean): Self = this.set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSoftInputOnFocus: Self = this.set("showSoftInputOnFocus", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignVertical: Self = this.set("textAlignVertical", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: none_ | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = this.set("textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentType: Self = this.set("textContentType", js.undefined)
    
    @scala.inline
    def setTriangleIconColor(value: String): Self = this.set("triangleIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleIconColor: Self = this.set("triangleIconColor", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUnderlineColorAndroid(value: ColorValue): Self = this.set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineColorAndroid: Self = this.set("underlineColorAndroid", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
