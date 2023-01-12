package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabProps extends StObject {
  
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
  var activeKey: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 切换视图是否有动画
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether the switching view has animation.
    * @defaultValue true
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
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
  var children: js.UndefOr[ReactNode] = js.undefined
  
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
  var defaultActiveKey: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 切换 tab 的距离
    * @defaultValue 0.3
    */
  /**
    * @language en-US
    * @description Distance of switching tab
    * @defaultValue 0.3
    */
  var distanceToChangeTab: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 切换视图的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description The callback of switching the view.
    * @defaultValue () => {}
    */
  var onChange: js.UndefOr[js.Function1[/* activeKey */ js.UndefOr[Double | String], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 包裹 tab 的容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Specify the style of the container that wraps the tab bar.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否可滑动视图
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to slide the view.
    * @defaultValue true
    */
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The selected text style.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 TabBar 的背景颜色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the background color of the TabBar
    * @defaultValue undefined
    */
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description tabBar 的位置
    * @defaultValue 'top'
    */
  /**
    * @language en-US
    * @description The position of the tabBar.
    * @defaultValue 'top'
    */
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 TabBar 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the style of the TabBar
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 TabBar 的下划线样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the underline style of the TabBar.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 TabContent 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the style of the content area of the TabBar.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description tab 默认颜色
    * @defaultValue "#333"
    */
  /**
    * @language en-US
    * @description Default color in tab
    * @defaultValue "#333"
    */
  var tabDefaultColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "TabNav"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "TabNav"
    */
  var tabNavAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单个 Tab 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The style of a single tab
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description he text style of the unselected Tab.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置包裹 TabBar 的容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the style of the container that wraps the TabBar
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var tabsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否在安卓上使用 viewPager
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to use viewPager on Android
    * @defaultValue true
    */
  var useViewPagerOnAndroid: js.UndefOr[Boolean] = js.undefined
}
object TabProps {
  
  inline def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
    
    inline def setActiveKey(value: String | Double): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultActiveKey(value: String | Double): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    inline def setDistanceToChangeTab(value: Double): Self = StObject.set(x, "distanceToChangeTab", value.asInstanceOf[js.Any])
    
    inline def setDistanceToChangeTabUndefined: Self = StObject.set(x, "distanceToChangeTab", js.undefined)
    
    inline def setOnChange(value: /* activeKey */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    inline def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
    
    inline def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    inline def setTabBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
    
    inline def setTabBarStyleNull: Self = StObject.set(x, "tabBarStyle", null)
    
    inline def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
    
    inline def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
    
    inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    
    inline def setTabContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabContentStyle", value.asInstanceOf[js.Any])
    
    inline def setTabContentStyleNull: Self = StObject.set(x, "tabContentStyle", null)
    
    inline def setTabContentStyleUndefined: Self = StObject.set(x, "tabContentStyle", js.undefined)
    
    inline def setTabDefaultColor(value: String): Self = StObject.set(x, "tabDefaultColor", value.asInstanceOf[js.Any])
    
    inline def setTabDefaultColorUndefined: Self = StObject.set(x, "tabDefaultColor", js.undefined)
    
    inline def setTabNavAccessibilityLabel(value: String): Self = StObject.set(x, "tabNavAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setTabNavAccessibilityLabelUndefined: Self = StObject.set(x, "tabNavAccessibilityLabel", js.undefined)
    
    inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    inline def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    inline def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    inline def setTabsContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setTabsContainerStyleNull: Self = StObject.set(x, "tabsContainerStyle", null)
    
    inline def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    
    inline def setUseViewPagerOnAndroid(value: Boolean): Self = StObject.set(x, "useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    inline def setUseViewPagerOnAndroidUndefined: Self = StObject.set(x, "useViewPagerOnAndroid", js.undefined)
  }
}
