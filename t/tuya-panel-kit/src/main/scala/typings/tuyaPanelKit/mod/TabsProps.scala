package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "Tabs"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "Tabs"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tabs 和下划线激活时的颜色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The color when activated.
    * @defaultValue undefined
    */
  var activeColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活值，如果给定了则成为受控组件，需搭配 onChange 使用
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Activation value. If the parameter value is set, it becomes a controlled component. It needs to be used with onChange.
    * @defaultValue undefined
    */
  var activeKey: js.UndefOr[Double | String] = js.undefined
  
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
    * @description Tabs 的背景色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description The background color of Tab page.
    * @defaultValue '#fff'
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 的子元素，一般为 TabContent
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The child element of Tab, generally TabContent.
    * @defaultValue undefined
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L7699">TabDataSource</a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Data source
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L7699">TabDataSource</a>
    * @defaultValue undefined
    */
  var dataSource: js.Array[TabDataSource]
  
  /**
    * @language zh-CN
    * @description 默认的激活值，想成为非受控组件时使用
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The default activation value. It is used when it is set to uncontrolled components
    * @defaultValue 0
    */
  var defaultActiveKey: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用 Tabs 标签页（注意只针对 Tabs，不针对 TabContent）
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to disable the Tabs page.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 右边额外的留白距离
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The extra white space on the right, in px.
    * @defaultValue 0
    */
  var extraSpace: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 一屏下最多可存在的 tab 数量
    * @defaultValue 4
    */
  /**
    * @language en-US
    * @description The maximum number of Tab labels supported on a screen.
    * @defaultValue 4
    */
  var maxItem: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 变更回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback for tab change.
    * @defaultValue undefined
    */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabDataSource, /* idx */ Double, Unit]] = js.undefined
  
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
    * @description Tabs 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of Tabs.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab Content 是否可滚动
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is tab content scrollEnable
    * @defaultValue true
    */
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单个激活 Tab 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of a single active tab
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The selected text style.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 存在 TabContent 时才有效，TabContent 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of TabContent. It only takes effect when TabContent is configured.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 与 TabContent 同时存在时，Tab 的排列位置
    * @defaultValue 'top'
    */
  /**
    * @language en-US
    * @description When Tab and TabContent exist at the same time, the arrangement position of Tab
    * @defaultValue 'top'
    */
  var tabPosition: js.UndefOr[top | bottom] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单个 Tab 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of a single tab
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description he text style of the unselected Tab.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下划线的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Style of the underline.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下环线的宽度，不设置则默认跟随文字大小
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The width of the underline. If not set, it will follow the text width by default.
    * @defaultValue undefined
    */
  var underlineWidth: js.UndefOr[Double] = js.undefined
  
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
  
  /**
    * @language zh-CN
    * @description 存在 TabContent 时，包裹着 Tabs 以及 TabContent 的容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The container style that wraps Tabs and TabContent. It only takes effect when TabContent is configured.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object TabsProps {
  
  inline def apply(dataSource: js.Array[TabDataSource]): TabsProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setActiveKey(value: Double | String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setAnimationConfig(value: Easing): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataSource(value: js.Array[TabDataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceVarargs(value: TabDataSource*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDefaultActiveKey(value: Double | String): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtraSpace(value: Double): Self = StObject.set(x, "extraSpace", value.asInstanceOf[js.Any])
    
    inline def setExtraSpaceUndefined: Self = StObject.set(x, "extraSpace", js.undefined)
    
    inline def setMaxItem(value: Double): Self = StObject.set(x, "maxItem", value.asInstanceOf[js.Any])
    
    inline def setMaxItemUndefined: Self = StObject.set(x, "maxItem", js.undefined)
    
    inline def setOnChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeout(value: Double): Self = StObject.set(x, "preloadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeoutUndefined: Self = StObject.set(x, "preloadTimeout", js.undefined)
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setRenderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactNode) => ReactNode): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction2(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setTabActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabActiveStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveStyleNull: Self = StObject.set(x, "tabActiveStyle", null)
    
    inline def setTabActiveStyleUndefined: Self = StObject.set(x, "tabActiveStyle", js.undefined)
    
    inline def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    inline def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    inline def setTabContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabContentStyle", value.asInstanceOf[js.Any])
    
    inline def setTabContentStyleNull: Self = StObject.set(x, "tabContentStyle", null)
    
    inline def setTabContentStyleUndefined: Self = StObject.set(x, "tabContentStyle", js.undefined)
    
    inline def setTabPosition(value: top | bottom): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    inline def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    inline def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    inline def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyleNull: Self = StObject.set(x, "underlineStyle", null)
    
    inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    inline def setUnderlineWidth(value: Double): Self = StObject.set(x, "underlineWidth", value.asInstanceOf[js.Any])
    
    inline def setUnderlineWidthUndefined: Self = StObject.set(x, "underlineWidth", js.undefined)
    
    inline def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    inline def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
