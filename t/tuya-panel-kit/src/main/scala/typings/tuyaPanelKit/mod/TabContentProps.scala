package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabContentProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "TabContent"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "TabContent"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前激活所处的索引
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Current activation index
    * @defaultValue undefined
    */
  var activeIndex: Double
  
  /**
    * @language zh-CN
    * @description 动画配置
    * @defaultValue { duration: 200, easing: Easing.linear, delay: 0, isInteraction: true, useNativeDriver: true }
    */
  /**
    * @language en-US
    * @description Animation configuration
    * @defaultValue { duration: 200, easing: Easing.linear, delay: 0, isInteraction: true, useNativeDriver: true }
    */
  var animationConfig: js.UndefOr[Easing] = js.undefined
  
  /**
    * @language zh-CN
    * @description 嵌套子元素
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Nested sub elements
    * @defaultValue undefined
    */
  var children: ReactNode
  
  /**
    * @language zh-CN
    * @description 是否禁用 TabContent
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to disable TabContent.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description TabContent 滑动回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description TabContent sliding callback.
    * @defaultValue undefined
    */
  var onMove: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description TabContent 滑动结束时回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback of TabContent sliding end.
    * @defaultValue undefined
    */
  var onRelease: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description TabContent 是否需要预加载
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether TabContent needs to be preloaded.
    * @defaultValue true
    */
  var preload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description TabContent 预加载延时时间
    * @defaultValue 375
    */
  /**
    * @language en-US
    * @description The preload delay time of TabContent.
    * @defaultValue 375
    */
  var preloadTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义渲染预加载中的占位容器
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom rendering of the placeholder container in the preload.
    * @defaultValue undefined
    */
  var renderPlaceholder: js.UndefOr[js.Function2[/* activeIndex */ Double, /* child */ ReactNode, ReactNode]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加速度阈值，滑动速率超过该阈值直接判断为下一页
    * @defaultValue 0.5
    */
  /**
    * @language en-US
    * @description The acceleration threshold of TabContent in px. If the sliding rate exceeds the threshold, it is directly judged as the next page.
    * @defaultValue 0.5
    */
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}
object TabContentProps {
  
  inline def apply(activeIndex: Double): TabContentProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabContentProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfig(value: Easing): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnMove(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction3(value))
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    inline def setOnRelease(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction3(value))
    
    inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeout(value: Double): Self = StObject.set(x, "preloadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeoutUndefined: Self = StObject.set(x, "preloadTimeout", js.undefined)
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setRenderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactNode) => ReactNode): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction2(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    inline def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
  }
}
