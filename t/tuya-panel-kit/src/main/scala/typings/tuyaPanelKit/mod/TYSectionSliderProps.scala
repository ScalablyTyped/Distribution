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
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.parcel
import typings.tuyaPanelKit.tuyaPanelKitStrings.spring
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import typings.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.SliderProps, 'theme'> */
trait TYSectionSliderProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 右侧 Action 具体值，当类型为 string时，默认使用 TYText
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Specific value of action on the right. When the type is string, TYText is used by default
    * @defaultValue null
    */
  var Action: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 左侧 Icon 具体值，当类型为 string时，默认使用 IconFont
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon specific value on the left. When the type is string, Iconfont is used by default
    * @defaultValue null
    */
  var Icon: js.UndefOr[Any] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 右侧 Action 类型
    * @defaultValue 'auto'
    */
  /**
    * @language en-US
    * @description Right action type
    * @defaultValue 'auto'
    */
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var animateTransitions: js.UndefOr[Boolean] = js.undefined
  
  var animationConfig: js.UndefOr[Duration] = js.undefined
  
  var animationType: js.UndefOr[spring | timing] = js.undefined
  
  var canTouchTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Content Style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var debugTouchArea: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The Color of icon
    * @defaultValue null
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The size of icon
    * @defaultValue null
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 左侧 Icon 类型
    * @defaultValue 'auto'
    */
  /**
    * @language en-US
    * @description Icon type on the left
    * @defaultValue 'auto'
    */
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片的 tintColor 是否跟随iconColor，默认为 true
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether the image's tintcolor follows icolor or not, the default is true
    * @defaultValue true
    */
  var imageFollowIconColor: js.UndefOr[Boolean] = js.undefined
  
  var maxNounStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minNounStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.undefined
  
  var onScrollEvent: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  var onSlidingStart: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  var onlyMaximumTrack: js.UndefOr[Boolean] = js.undefined
  
  var renderMaximumTrack: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  var renderMinimumTrack: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  var renderThumb: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  var reverseValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Style of slider
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var sliderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var stepValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var styles: js.UndefOr[DebugThumbTouchArea] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文字样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Style of text
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: CellRadius
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  var thumbTouchSize: js.UndefOr[Height] = js.undefined
  
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var `type`: js.UndefOr[normal | parcel] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 实现版本
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is art used to implement the version
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var useNoun: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object TYSectionSliderProps {
  
  inline def apply(theme: CellRadius): TYSectionSliderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionSliderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TYSectionSliderProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAction(value: Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    inline def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    inline def setAnimationConfig(value: Duration): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setCanTouchTrack(value: Boolean): Self = StObject.set(x, "canTouchTrack", value.asInstanceOf[js.Any])
    
    inline def setCanTouchTrackUndefined: Self = StObject.set(x, "canTouchTrack", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    inline def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
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
    
    inline def setMaxNounStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maxNounStyle", value.asInstanceOf[js.Any])
    
    inline def setMaxNounStyleNull: Self = StObject.set(x, "maxNounStyle", null)
    
    inline def setMaxNounStyleUndefined: Self = StObject.set(x, "maxNounStyle", js.undefined)
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinNounStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "minNounStyle", value.asInstanceOf[js.Any])
    
    inline def setMinNounStyleNull: Self = StObject.set(x, "minNounStyle", null)
    
    inline def setMinNounStyleUndefined: Self = StObject.set(x, "minNounStyle", js.undefined)
    
    inline def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setOnLayout(value: /* x */ Double => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnScrollEvent(value: /* value */ Double => Unit): Self = StObject.set(x, "onScrollEvent", js.Any.fromFunction1(value))
    
    inline def setOnScrollEventUndefined: Self = StObject.set(x, "onScrollEvent", js.undefined)
    
    inline def setOnSlidingComplete(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnSlidingStart(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
    
    inline def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
    
    inline def setOnValueChange(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setOnlyMaximumTrack(value: Boolean): Self = StObject.set(x, "onlyMaximumTrack", value.asInstanceOf[js.Any])
    
    inline def setOnlyMaximumTrackUndefined: Self = StObject.set(x, "onlyMaximumTrack", js.undefined)
    
    inline def setRenderMaximumTrack(value: () => ReactNode): Self = StObject.set(x, "renderMaximumTrack", js.Any.fromFunction0(value))
    
    inline def setRenderMaximumTrackUndefined: Self = StObject.set(x, "renderMaximumTrack", js.undefined)
    
    inline def setRenderMinimumTrack(value: () => ReactNode): Self = StObject.set(x, "renderMinimumTrack", js.Any.fromFunction0(value))
    
    inline def setRenderMinimumTrackUndefined: Self = StObject.set(x, "renderMinimumTrack", js.undefined)
    
    inline def setRenderThumb(value: () => ReactNode): Self = StObject.set(x, "renderThumb", js.Any.fromFunction0(value))
    
    inline def setRenderThumbUndefined: Self = StObject.set(x, "renderThumb", js.undefined)
    
    inline def setReverseValue(value: Boolean): Self = StObject.set(x, "reverseValue", value.asInstanceOf[js.Any])
    
    inline def setReverseValueUndefined: Self = StObject.set(x, "reverseValue", js.undefined)
    
    inline def setSliderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sliderStyle", value.asInstanceOf[js.Any])
    
    inline def setSliderStyleNull: Self = StObject.set(x, "sliderStyle", null)
    
    inline def setSliderStyleUndefined: Self = StObject.set(x, "sliderStyle", js.undefined)
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: DebugThumbTouchArea): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTheme(value: CellRadius): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    inline def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setThumbTouchSize(value: Height): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
    
    inline def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
    
    inline def setTrackStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
    
    inline def setTrackStyleNull: Self = StObject.set(x, "trackStyle", null)
    
    inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    
    inline def setType(value: normal | parcel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setUseNoun(value: Boolean): Self = StObject.set(x, "useNoun", value.asInstanceOf[js.Any])
    
    inline def setUseNounUndefined: Self = StObject.set(x, "useNoun", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
