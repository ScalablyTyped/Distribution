package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabProps extends StObject {
  
  var activeKey: js.UndefOr[String | Double] = js.native
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var defaultActiveKey: js.UndefOr[String | Double] = js.native
  
  var distanceToChangeTab: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* activeKey */ js.UndefOr[Double | String], Unit]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  
  var tabBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabDefaultColor: js.UndefOr[String] = js.native
  
  var tabNavAccessibilityLabel: js.UndefOr[String] = js.native
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var tabsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var useViewPagerOnAndroid: js.UndefOr[Boolean] = js.native
}
object TabProps {
  
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  @scala.inline
  implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: String | Double): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: String | Double): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDistanceToChangeTab(value: Double): Self = StObject.set(x, "distanceToChangeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceToChangeTabUndefined: Self = StObject.set(x, "distanceToChangeTab", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* activeKey */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    @scala.inline
    def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    @scala.inline
    def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarStyleNull: Self = StObject.set(x, "tabBarStyle", null)
    
    @scala.inline
    def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabContentStyleNull: Self = StObject.set(x, "tabContentStyle", null)
    
    @scala.inline
    def setTabContentStyleUndefined: Self = StObject.set(x, "tabContentStyle", js.undefined)
    
    @scala.inline
    def setTabDefaultColor(value: String): Self = StObject.set(x, "tabDefaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabDefaultColorUndefined: Self = StObject.set(x, "tabDefaultColor", js.undefined)
    
    @scala.inline
    def setTabNavAccessibilityLabel(value: String): Self = StObject.set(x, "tabNavAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabNavAccessibilityLabelUndefined: Self = StObject.set(x, "tabNavAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    @scala.inline
    def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    @scala.inline
    def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    @scala.inline
    def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    @scala.inline
    def setTabsContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsContainerStyleNull: Self = StObject.set(x, "tabsContainerStyle", null)
    
    @scala.inline
    def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    
    @scala.inline
    def setUseViewPagerOnAndroid(value: Boolean): Self = StObject.set(x, "useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseViewPagerOnAndroidUndefined: Self = StObject.set(x, "useViewPagerOnAndroid", js.undefined)
  }
}
