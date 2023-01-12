package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.DebugThumbTouchArea
import typings.tuyaPanelKit.anon.Duration
import typings.tuyaPanelKit.anon.Height
import typings.tuyaPanelKit.anon.MaximumTrackTintColor
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.parcel
import typings.tuyaPanelKit.tuyaPanelKitStrings.spring
import typings.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "Slider"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "Slider"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否添加动画滑动效果
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Add animation slide effect
    * @defaultValue false
    */
  var animateTransitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画配置
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Animation configuration
    * @defaultValue undefined
    */
  var animationConfig: js.UndefOr[Duration] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画类型，spring 弹性动画或 timing 线性动画
    * @defaultValue 'timing'
    */
  /**
    * @language en-US
    * @description Animation type, spring elastic animation or timing linear animation
    * @defaultValue 'timing'
    */
  var animationType: js.UndefOr[spring | timing] = js.undefined
  
  /**
    * @language zh-CN
    * @description 触摸轨道是否可以更改值
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether the value can be changed by touching the track.
    * @defaultValue false
    */
  var canTouchTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否开启调试区域
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Do you want to open the debugging area
    * @defaultValue false
    */
  var debugTouchArea: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Whether to disable or not.
    * @defaultValue undefined
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否为水平方向
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is it horizontal
    * @defaultValue true
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 大于当前值的刻度样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Scale style greater than the current value
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var maxNounStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 大于当前值的轨道颜色
    * @defaultValue '#b3b3b3'
    */
  /**
    * @language en-US
    * @description Track color that is greater than the current value.
    * @defaultValue '#b3b3b3'
    */
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大值
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description The maximum value.
    * @defaultValue 1
    */
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小于当前值的刻度样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Scale style less than current value
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var minNounStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小于当前值的轨道颜色
    * @defaultValue '#3f3f3f'
    */
  /**
    * @language en-US
    * @description Track color that is less than the current value.
    * @defaultValue '#3f3f3f'
    */
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The minimum value.
    * @defaultValue 0
    */
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description onLayout 回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description onLayout callback
    * @defaultValue undefined
    */
  var onLayout: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动事件
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Sliding events
    * @defaultValue undefined
    */
  var onScrollEvent: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动结束回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of ending the slide.
    * @defaultValue () => {}
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动开始回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback of starting the slide.
    * @defaultValue undefined
    */
  var onSlidingStart: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动值变更回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback of changing the sliding value.
    * @defaultValue undefined
    */
  var onValueChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只显示大于当前值的轨道颜色
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to display only track colors that are greater than the current value.
    * @defaultValue false
    */
  var onlyMaximumTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 定制渲染大于当前值的轨道
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom rendering of the tracks greater than the current value.
    * @defaultValue undefined
    */
  var renderMaximumTrack: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 定制渲染小于当前值的轨道
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom rendering of the tracks less than the current value.
    * @defaultValue undefined
    */
  var renderMinimumTrack: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 定制渲染滑块
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom rendering of the thumb.
    * @defaultValue undefined
    */
  var renderThumb: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否翻转数值
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to flip the value
    * @defaultValue false
    */
  var reverseValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 步长，取值必须大于 0，并且可被 (max - min) 整除
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Step length. Must be exactly divisible by minimumValue and maximumValue.
    * @defaultValue 0
    */
  var stepValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动条样式集合
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Slide bar styles collection
    * @defaultValue {}
    */
  var styles: js.UndefOr[DebugThumbTouchArea] = js.undefined
  
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
  var theme: js.UndefOr[MaximumTrackTintColor] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Style of the thumb.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块颜色
    * @defaultValue '#343434'
    */
  /**
    * @language en-US
    * @description The color used to tint the default thumb images on iOS, or the color of the foreground switch grip on Android.
    * @defaultValue '#343434'
    */
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块大小
    * @defaultValue { width: 40, height: 40 }
    */
  /**
    * @language en-US
    * @description Thumb size
    * @defaultValue { width: 40, height: 40 }
    */
  var thumbTouchSize: js.UndefOr[Height] = js.undefined
  
  /**
    * @language zh-CN
    * @description 通用的轨道样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description General track style.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块的类型，parcel：包裹类型
    * @addVersion 4.4.0
    * @defaultValue normal
    */
  /**
    * @language en-US
    * @description The type of slider, parcel: package type
    * @addVersion 4.4.0
    * @defaultValue normal
    */
  var `type`: js.UndefOr[normal | parcel] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用刻度
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to use the scale
    * @defaultValue false
    */
  var useNoun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description value
    * @defaultValue 0
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SliderProps {
  
  inline def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    inline def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    inline def setAnimationConfig(value: Duration): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setCanTouchTrack(value: Boolean): Self = StObject.set(x, "canTouchTrack", value.asInstanceOf[js.Any])
    
    inline def setCanTouchTrackUndefined: Self = StObject.set(x, "canTouchTrack", js.undefined)
    
    inline def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    inline def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
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
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: DebugThumbTouchArea): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: MaximumTrackTintColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
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
    
    inline def setUseNoun(value: Boolean): Self = StObject.set(x, "useNoun", value.asInstanceOf[js.Any])
    
    inline def setUseNounUndefined: Self = StObject.set(x, "useNoun", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
