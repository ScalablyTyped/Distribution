package typings.tuyaPanelKit.mod

import typings.reactNative.mod.AccessibilityProps
import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.ModalPropsAndroid
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.ViewPropsAndroid
import typings.reactNative.mod.ViewPropsIOS
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`landscape-left`
import typings.reactNative.reactNativeStrings.`landscape-right`
import typings.reactNative.reactNativeStrings.`portrait-upside-down`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.formSheet
import typings.reactNative.reactNativeStrings.fullScreen
import typings.reactNative.reactNativeStrings.landscape
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.overFullScreen
import typings.reactNative.reactNativeStrings.pageSheet
import typings.reactNative.reactNativeStrings.portrait
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- typings.reactNative.mod.ViewProps because Inheritance from two classes. Inlined pointerEvents, hitSlop, style, onLayout, removeClippedSubviews, nativeID, testID
- typings.reactNative.mod.ModalPropsIOS because var conflicts: onDismiss. Inlined onOrientationChange, supportedOrientations, presentationStyle
- typings.reactNative.mod.ModalBaseProps because var conflicts: animationType, visible. Inlined onShow, transparent, onRequestClose, animated
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.reactNative.mod.ModalProps because Inheritance from two classes. Inlined 
- typings.tuyaPanelKit.mod.ModalProps because Inheritance from two classes. Inlined animationType, alignContainer, onMaskPress, modalChildStyle, mask, maskStyle, onlyLastModalVisible, useKeyboardView, visible, activeIdx, onDismiss */ trait PopupTipsProps
  extends StObject
     with TipsProps
     with ModalPropsAndroid
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable
     with AccessibilityProps {
  
  var activeIdx: js.UndefOr[Double] = js.undefined
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.undefined
  
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animationType: js.UndefOr[fade_ | none_] = js.undefined
  
  /**
    * This defines how far a touch event can start away from the view.
    * Typical interface guidelines recommend touch targets that are at least
    * 30 - 40 points/density-independent pixels. If a Touchable view has
    * a height of 20 the touchable height can be extended to 40 with
    * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch
    * hits two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var mask: js.UndefOr[Boolean] = js.undefined
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMaskPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
    * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
    */
  var onOrientationChange: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Any], Unit]] = js.undefined
  
  /**
    * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
    * _On the Android platform, this is a required function._
    */
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Any], Unit]] = js.undefined
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  /**
    * The `presentationStyle` determines the style of modal to show
    */
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
    * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
    */
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var useKeyboardView: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PopupTipsProps {
  
  @scala.inline
  def apply(): PopupTipsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupTipsProps]
  }
  
  @scala.inline
  implicit class PopupTipsPropsMutableBuilder[Self <: PopupTipsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    @scala.inline
    def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimationType(value: fade_ | none_): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    @scala.inline
    def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    @scala.inline
    def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnMaskPress(value: () => Unit): Self = StObject.set(x, "onMaskPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    @scala.inline
    def setOnOrientationChange(value: /* event */ NativeSyntheticEvent[js.Any] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* event */ NativeSyntheticEvent[js.Any] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    @scala.inline
    def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
