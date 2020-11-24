package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabProps extends js.Object {
  
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
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
    
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
    def setActiveKey(value: String | Double): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: String | Double): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDistanceToChangeTab(value: Double): Self = this.set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceToChangeTab: Self = this.set("distanceToChangeTab", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* activeKey */ js.UndefOr[Double | String] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabActiveTextStyle: Self = this.set("tabActiveTextStyle", js.undefined)
    
    @scala.inline
    def setTabActiveTextStyleNull: Self = this.set("tabActiveTextStyle", null)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarStyle: Self = this.set("tabBarStyle", js.undefined)
    
    @scala.inline
    def setTabBarStyleNull: Self = this.set("tabBarStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = this.set("tabBarUnderlineStyle", null)
    
    @scala.inline
    def setTabContentStyle(value: StyleProp[ViewStyle]): Self = this.set("tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabContentStyle: Self = this.set("tabContentStyle", js.undefined)
    
    @scala.inline
    def setTabContentStyleNull: Self = this.set("tabContentStyle", null)
    
    @scala.inline
    def setTabDefaultColor(value: String): Self = this.set("tabDefaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDefaultColor: Self = this.set("tabDefaultColor", js.undefined)
    
    @scala.inline
    def setTabNavAccessibilityLabel(value: String): Self = this.set("tabNavAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabNavAccessibilityLabel: Self = this.set("tabNavAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    
    @scala.inline
    def setTabStyleNull: Self = this.set("tabStyle", null)
    
    @scala.inline
    def setTabTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTextStyle: Self = this.set("tabTextStyle", js.undefined)
    
    @scala.inline
    def setTabTextStyleNull: Self = this.set("tabTextStyle", null)
    
    @scala.inline
    def setTabsContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("tabsContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsContainerStyle: Self = this.set("tabsContainerStyle", js.undefined)
    
    @scala.inline
    def setTabsContainerStyleNull: Self = this.set("tabsContainerStyle", null)
    
    @scala.inline
    def setUseViewPagerOnAndroid(value: Boolean): Self = this.set("useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseViewPagerOnAndroid: Self = this.set("useViewPagerOnAndroid", js.undefined)
  }
}
