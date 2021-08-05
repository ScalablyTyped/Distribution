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
  
  var activeKey: js.UndefOr[String | Double] = js.undefined
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var defaultActiveKey: js.UndefOr[String | Double] = js.undefined
  
  var distanceToChangeTab: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* activeKey */ js.UndefOr[Double | String], Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  
  var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabDefaultColor: js.UndefOr[String] = js.undefined
  
  var tabNavAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var tabsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var useViewPagerOnAndroid: js.UndefOr[Boolean] = js.undefined
}
object TabProps {
  
  inline def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  extension [Self <: TabProps](x: Self) {
    
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
