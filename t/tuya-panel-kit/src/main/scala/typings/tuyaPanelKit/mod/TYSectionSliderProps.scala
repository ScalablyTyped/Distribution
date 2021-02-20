package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.CellRadius
import typings.tuyaPanelKit.anon.DebugThumbTouchArea
import typings.tuyaPanelKit.anon.Duration
import typings.tuyaPanelKit.anon.Height
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typings.tuyaPanelKit.tuyaPanelKitStrings.image
import typings.tuyaPanelKit.tuyaPanelKitStrings.spring
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import typings.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.SliderProps, 'theme'> */
@js.native
trait TYSectionSliderProps extends StObject {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Icon: js.UndefOr[js.Any] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var animateTransitions: js.UndefOr[Boolean] = js.native
  
  var animationConfig: js.UndefOr[Duration] = js.native
  
  var animationType: js.UndefOr[spring | timing] = js.native
  
  var canTouchTrack: js.UndefOr[Boolean] = js.native
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var maximumValue: js.UndefOr[Double] = js.native
  
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  
  var minimumValue: js.UndefOr[Double] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.native
  
  var onScrollEvent: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onSlidingStart: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onlyMaximumTrack: js.UndefOr[Boolean] = js.native
  
  var renderMaximumTrack: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var renderMinimumTrack: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var renderThumb: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var reverseValue: js.UndefOr[Boolean] = js.native
  
  var sliderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[DebugThumbTouchArea] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var theme: CellRadius = js.native
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var thumbTouchSize: js.UndefOr[Height] = js.native
  
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object TYSectionSliderProps {
  
  @scala.inline
  def apply(theme: CellRadius): TYSectionSliderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionSliderProps]
  }
  
  @scala.inline
  implicit class TYSectionSliderPropsMutableBuilder[Self <: TYSectionSliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Duration): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setCanTouchTrack(value: Boolean): Self = StObject.set(x, "canTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTouchTrackUndefined: Self = StObject.set(x, "canTouchTrack", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = StObject.set(x, "imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFollowIconColorUndefined: Self = StObject.set(x, "imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* x */ Double => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnScrollEvent(value: /* value */ Double => Unit): Self = StObject.set(x, "onScrollEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollEventUndefined: Self = StObject.set(x, "onScrollEvent", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setOnlyMaximumTrack(value: Boolean): Self = StObject.set(x, "onlyMaximumTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyMaximumTrackUndefined: Self = StObject.set(x, "onlyMaximumTrack", js.undefined)
    
    @scala.inline
    def setRenderMaximumTrack(value: () => ReactNode): Self = StObject.set(x, "renderMaximumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderMaximumTrackUndefined: Self = StObject.set(x, "renderMaximumTrack", js.undefined)
    
    @scala.inline
    def setRenderMinimumTrack(value: () => ReactNode): Self = StObject.set(x, "renderMinimumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderMinimumTrackUndefined: Self = StObject.set(x, "renderMinimumTrack", js.undefined)
    
    @scala.inline
    def setRenderThumb(value: () => ReactNode): Self = StObject.set(x, "renderThumb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderThumbUndefined: Self = StObject.set(x, "renderThumb", js.undefined)
    
    @scala.inline
    def setReverseValue(value: Boolean): Self = StObject.set(x, "reverseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseValueUndefined: Self = StObject.set(x, "reverseValue", js.undefined)
    
    @scala.inline
    def setSliderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sliderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliderStyleNull: Self = StObject.set(x, "sliderStyle", null)
    
    @scala.inline
    def setSliderStyleUndefined: Self = StObject.set(x, "sliderStyle", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: DebugThumbTouchArea): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTheme(value: CellRadius): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    @scala.inline
    def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setThumbTouchSize(value: Height): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
    
    @scala.inline
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStyleNull: Self = StObject.set(x, "trackStyle", null)
    
    @scala.inline
    def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
